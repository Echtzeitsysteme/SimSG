package org.simsg.core.pm.democles;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.gervarro.democles.common.runtime.CategoryBasedQueueFactory;
import org.gervarro.democles.common.runtime.ListOperationBuilder;
import org.gervarro.democles.common.runtime.OperationBuilder;
import org.gervarro.democles.interpreter.incremental.rete.RetePattern;
import org.gervarro.democles.interpreter.incremental.rete.RetePatternMatcherModule;
import org.gervarro.democles.notification.emf.BidirectionalReferenceFilter;
import org.gervarro.democles.notification.emf.EdgeDeltaFeeder;
import org.gervarro.democles.notification.emf.ReferenceToEdgeConverter;
import org.gervarro.democles.notification.emf.UndirectedEdgeToDirectedEdgeConverter;
import org.gervarro.democles.operation.RelationalOperationBuilder;
import org.gervarro.democles.operation.emf.DefaultEMFBatchAdornmentStrategy;
import org.gervarro.democles.operation.emf.DefaultEMFIncrementalAdornmentStrategy;
import org.gervarro.democles.operation.emf.EMFBatchOperationBuilder;
import org.gervarro.democles.operation.emf.EMFIdentifierProviderBuilder;
import org.gervarro.democles.operation.emf.EMFInterpretableIncrementalOperationBuilder;
import org.gervarro.democles.plan.incremental.builder.AdornedNativeOperationDrivenComponentBuilder;
import org.gervarro.democles.plan.incremental.builder.FilterComponentBuilder;
import org.gervarro.democles.plan.incremental.leaf.Component;
import org.gervarro.democles.plan.incremental.leaf.ReteSearchPlanAlgorithm;
import org.gervarro.democles.runtime.AdornedNativeOperationBuilder;
import org.gervarro.democles.runtime.IncrementalTaskCategorizer;
import org.gervarro.democles.runtime.InterpretableAdornedOperation;
import org.gervarro.democles.runtime.JavaIdentifierProvider;
import org.gervarro.democles.specification.emf.EMFPatternBuilder;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.constraint.EMFTypeModule;
import org.gervarro.democles.specification.emf.constraint.PatternInvocationTypeModule;
import org.gervarro.democles.specification.emf.constraint.RelationalTypeModule;
import org.gervarro.democles.specification.impl.DefaultPattern;
import org.gervarro.democles.specification.impl.DefaultPatternBody;
import org.gervarro.democles.specification.impl.DefaultPatternFactory;
import org.gervarro.democles.specification.impl.PatternInvocationConstraintModule;
import org.gervarro.notification.model.ModelDelta;
import org.simsg.core.pm.match.IMatch;
import org.gervarro.democles.common.runtime.Task;
import org.gervarro.democles.common.runtime.VariableRuntime;
import org.gervarro.democles.constraint.CoreConstraintModule;
import org.gervarro.democles.constraint.emf.EMFConstraintModule;
import org.gervarro.democles.event.MatchEvent;
import org.gervarro.democles.event.MatchEventListener;
import org.gervarro.democles.incremental.emf.ModelDeltaCategorizer;
import org.gervarro.democles.incremental.emf.NotificationProcessor;
import org.gervarro.democles.common.DataFrame;
import org.gervarro.democles.common.IDataFrame;
import org.gervarro.democles.common.PatternMatcherPlugin;

public class DemoclesEngine implements MatchEventListener {

	private ResourceSet rs;

	// EMF-Modules
	private EMFConstraintModule emfTypeModule;
	private EMFTypeModule internalEMFTypeModule;
	private RelationalTypeModule internalRelationalTypeModule;

	// Additional EMF-Modules
	private EMFBatchOperationBuilder<VariableRuntime> emfBatchOperationModule;
	private EMFIdentifierProviderBuilder<VariableRuntime> emfIdentifierProviderModule;
	private ListOperationBuilder<InterpretableAdornedOperation, VariableRuntime> relationalOperationModule;
	private AdornedNativeOperationBuilder<VariableRuntime> emfIncrementalOperationModule;

	// Additional EMF-Modules: This is kind of important ?
	private EMFInterpretableIncrementalOperationBuilder<VariableRuntime> emfNativeOperationModule;

	// Patterns
	EMFPatternBuilder<DefaultPattern, DefaultPatternBody> patternBuilder;
	private Map<String, Pattern> patterns;

	// Pattern Matching
	private RetePatternMatcherModule retePatternMatcherModule;
	private Collection<RetePattern> patternMatchers;
	private Map<IDataFrame, Map<String, IMatch>> matches;
	private Map<String, Map<IDataFrame, IMatch>> matchToPatternMap;
	// Notifications
	protected NotificationProcessor observer;

	public DemoclesEngine(Resource model) {
		patterns = new HashMap<String, Pattern>();
		patternMatchers = new ArrayList<>();
		matches = new HashMap<IDataFrame, Map<String, IMatch>>();
		matchToPatternMap = new HashMap<String, Map<IDataFrame, IMatch>>();

		rs = model.getResourceSet();
		
		initReteModule();
	}

	public void initPatterns(Collection<Pattern> patterns) {
		for (Pattern p : patterns) {
			this.patterns.put(getPatternID(p), p);
		}
		createAndRegisterPatterns();
		updateMatches();
	}
	
	public void updateMatches() {
		retePatternMatcherModule.performIncrementalUpdates();
	}

	public Collection<IMatch> getMatches(String patternName, boolean doUpdate) {
		if (doUpdate) {
			updateMatches();
		}
		if (matchToPatternMap.containsKey(patternName)) {
			return matchToPatternMap.get(patternName).values();
		}

		return null;
	}

	public void disposeEngine() {
		patternMatchers.forEach(pm -> {
			pm.removeEventListener(this);
			pm.clearListeners();
		});
		observer.unsetTarget(null);
		matches.clear();
	}
	
	public void savePatternsToFile() {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		reg.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		ResourceSet rSet = new ResourceSetImpl();
		URI uri = URI.createFileURI("models/democles_pattern.xmi");
		XMIResource res = (XMIResource) rSet.createResource(uri);
		res.getContents().addAll(patterns.values());
		
		Map<Object, Object> saveOptions = res.getDefaultSaveOptions();
		saveOptions.put(XMIResource.OPTION_ENCODING,"UTF-8");
		saveOptions.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SAVE_TYPE_INFORMATION,Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SCHEMA_LOCATION_IMPLEMENTATION, Boolean.TRUE);
		
		try {
			res.save(saveOptions);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void initReteModule() {
		// create rete module
		retePatternMatcherModule = new RetePatternMatcherModule();
		retePatternMatcherModule
				.setTaskQueueFactory(new CategoryBasedQueueFactory<Task>(IncrementalTaskCategorizer.INSTANCE));

		initEMFModules();
		initSearchPlanAlgorithm();
		initPatternBuilder();

	}

	// EMF hacks...
	private void initEMFModules() {
		emfTypeModule = new EMFConstraintModule(rs.getPackageRegistry());
		internalEMFTypeModule = new EMFTypeModule(emfTypeModule);
		internalRelationalTypeModule = new RelationalTypeModule(CoreConstraintModule.INSTANCE);

		// Additional EMF-Modules:

		// EMF NativeOperation
		emfNativeOperationModule = new EMFInterpretableIncrementalOperationBuilder<VariableRuntime>(
				retePatternMatcherModule, emfTypeModule);
		// EMF batch
		emfBatchOperationModule = new EMFBatchOperationBuilder<VariableRuntime>(emfNativeOperationModule,
				DefaultEMFBatchAdornmentStrategy.INSTANCE);
		emfIdentifierProviderModule = new EMFIdentifierProviderBuilder<VariableRuntime>(
				JavaIdentifierProvider.INSTANCE);
		// Relational
		relationalOperationModule = new ListOperationBuilder<InterpretableAdornedOperation, VariableRuntime>(
				new RelationalOperationBuilder<VariableRuntime>());
		// EMF incremental
		emfIncrementalOperationModule = new AdornedNativeOperationBuilder<VariableRuntime>(emfNativeOperationModule,
				DefaultEMFIncrementalAdornmentStrategy.INSTANCE);

		// add everything to rete module
		retePatternMatcherModule.addOperationBuilder(emfBatchOperationModule);
		retePatternMatcherModule.addOperationBuilder(relationalOperationModule);
		retePatternMatcherModule.addIdentifierProviderBuilder(emfIdentifierProviderModule);
	}

	// create pattern builder
	private void initPatternBuilder() {

		patternBuilder = new EMFPatternBuilder<DefaultPattern, DefaultPatternBody>(new DefaultPatternFactory());

		PatternInvocationConstraintModule<DefaultPattern, DefaultPatternBody> patternInvocationTypeModule = new PatternInvocationConstraintModule<DefaultPattern, DefaultPatternBody>(
				patternBuilder);

		PatternInvocationTypeModule<DefaultPattern, DefaultPatternBody> internalPatternInvocationTypeModule = new PatternInvocationTypeModule<DefaultPattern, DefaultPatternBody>(
				patternInvocationTypeModule);

		patternBuilder.addConstraintTypeSwitch(internalPatternInvocationTypeModule.getConstraintTypeSwitch());
		patternBuilder.addConstraintTypeSwitch(internalRelationalTypeModule.getConstraintTypeSwitch());
		patternBuilder.addConstraintTypeSwitch(internalEMFTypeModule.getConstraintTypeSwitch());
		patternBuilder.addVariableTypeSwitch(internalEMFTypeModule.getVariableTypeSwitch());
	}

	private void initSearchPlanAlgorithm() {
		// search plan
		ReteSearchPlanAlgorithm algorithm = initReteSearchPlanAlgorithm(Arrays.asList(
				// EMF component
				new AdornedNativeOperationDrivenComponentBuilder<VariableRuntime>(emfIncrementalOperationModule),
				// Relational component
				new FilterComponentBuilder<VariableRuntime>(relationalOperationModule)));

		retePatternMatcherModule.setSearchPlanAlgorithm(algorithm);
	}

	private void createAndRegisterPatterns() {
		// Build the pattern matchers in 2 phases
		// 1) EMF-based to EMF-independent transformation
		Collection<DefaultPattern> internalPatterns = patternBuilder.build(patterns.values());

		// 2) EMF-independent to pattern matcher runtime (i.e., Rete network)
		// transformation
		retePatternMatcherModule.build(internalPatterns.toArray(new DefaultPattern[internalPatterns.size()]));
		retePatternMatcherModule.getSession().setAutoCommitMode(false);

		// Attach match listener to pattern matchers
		patterns.entrySet().forEach(pattern -> {
			this.patternMatchers.add(retePatternMatcherModule.getPatternMatcher(pattern.getKey()));
		});
		patternMatchers.forEach(pm -> pm.addEventListener(this));

		// Install model event listeners on the resource set
		EdgeDeltaFeeder edgeDeltaFeeder = new EdgeDeltaFeeder(emfNativeOperationModule);
		UndirectedEdgeToDirectedEdgeConverter undirectedEdgeToDirectedEdgeConverter = new UndirectedEdgeToDirectedEdgeConverter(
				edgeDeltaFeeder);
		ReferenceToEdgeConverter referenceToEdgeConverter = new ReferenceToEdgeConverter(
				undirectedEdgeToDirectedEdgeConverter);
		BidirectionalReferenceFilter bidirectionalReferenceFilter = new BidirectionalReferenceFilter(
				referenceToEdgeConverter);
		this.observer = new NotificationProcessor(bidirectionalReferenceFilter,
				new CategoryBasedQueueFactory<ModelDelta>(ModelDeltaCategorizer.INSTANCE));
		observer.install(rs);
	}

	@Override
	public void handleEvent(MatchEvent event) {
		String type = event.getEventType();
		DataFrame frame = event.getMatching();
		Pattern pattern = patterns.get(event.getSource().toString());
		if (pattern == null) {
			return;
		}
		switch (type) {
		case MatchEvent.INSERT:
			handleInsertEvent(frame, pattern);
			break;
		case MatchEvent.DELETE:
			handleDeleteEvent(frame, pattern);
			break;
		}
	}

	private void handleInsertEvent(DataFrame frame, Pattern pattern) {
		String patternName = pattern.getName();
		Map<String, IMatch> patternCollection = matches.get(frame);
		if (patternCollection == null) {
			patternCollection = new HashMap<String, IMatch>();
			matches.put(frame, patternCollection);
		}
		if (patternCollection.containsKey(patternName)) {
			return;
		}
		IMatch match = this.createMatch(frame, pattern);
		patternCollection.put(patternName, match);

		// pattern to match mapping -> update insertions
		Map<IDataFrame, IMatch> frameMatchMap = matchToPatternMap.get(patternName);
		if (frameMatchMap == null) {
			frameMatchMap = new HashMap<IDataFrame, IMatch>();
			matchToPatternMap.put(patternName, frameMatchMap);
		}
		frameMatchMap.put(frame, match);
	}

	private void handleDeleteEvent(DataFrame frame, Pattern pattern) {
		String patternName = pattern.getName();
		Map<String, IMatch> matchList = matches.get(frame);
		if (matchList == null) {
			return;
		}
		IMatch match = matchList.get(patternName);
		if (match != null) {
			removeMatch(frame, match);
		}
	}

	private IMatch createMatch(final DataFrame frame, final Pattern pattern) {
		return new DemoclesMatch(frame, pattern);
	}

	private void removeMatch(IDataFrame iDataFrame, IMatch match) {
		Map<String, IMatch> matchList = matches.get(iDataFrame);
		if (matchList == null) {
			return;
		}
		matchList.remove(match.patternName());
		if (matchList.isEmpty()) {
			matches.remove(iDataFrame);
		}

		// pattern to match mapping -> update deletions
		Map<IDataFrame, IMatch> frameMatchMap = matchToPatternMap.get(match.patternName());
		if (frameMatchMap == null) {
			return;
		}
		frameMatchMap.remove(iDataFrame);
	}

	private static String getPatternID(final Pattern pattern) {
		return PatternMatcherPlugin.getIdentifier(pattern.getName(), pattern.getSymbolicParameters().size());
	}

	private static ReteSearchPlanAlgorithm initReteSearchPlanAlgorithm(
			Collection<OperationBuilder<Component, Component, VariableRuntime>> builders) {
		ReteSearchPlanAlgorithm algorithm = new ReteSearchPlanAlgorithm();
		builders.forEach(builder -> algorithm.addComponentBuilder(builder));
		return algorithm;
	}

}
