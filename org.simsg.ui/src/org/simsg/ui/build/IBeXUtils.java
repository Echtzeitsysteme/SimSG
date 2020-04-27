package org.simsg.ui.build;

import java.util.Collection;
import java.util.HashMap;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.emoflon.ibex.gt.codegen.EClassifiersManager;
import org.emoflon.ibex.gt.codegen.GTEngineExtension;
import org.emoflon.ibex.gt.codegen.JavaFileGenerator;
import org.emoflon.ibex.gt.editor.ui.builder.GTBuilderExtension;
import org.moflon.core.utilities.ExtensionsUtil;

import GTLanguage.GTNode;
import GTLanguage.GTRule;
import GTLanguage.GTRuleSet;

public final class IBeXUtils {
	
	public static void generateAPI(final IProject project, final IFolder apiPackage, final GTRuleSet gtRuleSet,
			final Registry packageRegistry) throws CoreException {
		JavaFileGenerator generator = new JavaFileGenerator(getClassNamePrefix(project), project.getName(), createEClassifierManager(packageRegistry));
		IFolder matchesPackage = ensureFolderExists(apiPackage.getFolder("matches"));
		IFolder rulesPackage = ensureFolderExists(apiPackage.getFolder("rules"));
		gtRuleSet.getRules().forEach(gtRule -> {
			generator.generateMatchClass(matchesPackage, gtRule);
			generator.generateRuleClass(rulesPackage, gtRule);
		});

		generator.generateAPIClass(apiPackage, gtRuleSet,
				String.format("%s/%s/%s/api/ibex-patterns.xmi", project.getName(), "src-gen", project.getName().replace(".", "/")));
		generator.generateAppClass(apiPackage);
		collectEngineExtensions().forEach(e -> generator.generateAppClassForEngine(apiPackage, e));
	}
	
	public static void findAllEPackages(final GTRuleSet gtRules, final Registry packageRegistry) {
		for(GTRule rule : gtRules.getRules()) {
			for(GTNode node : rule.getNodes()) {
				EPackage foreign = node.getType().getEPackage();
				if(!packageRegistry.containsKey(foreign.getNsURI())) {
					packageRegistry.put(foreign.getNsURI(), foreign);
				}
			}
			for(GTNode node : rule.getRuleNodes()) {
				EPackage foreign = node.getType().getEPackage();
				if(!packageRegistry.containsKey(foreign.getNsURI())) {
					packageRegistry.put(foreign.getNsURI(), foreign);
				}
			}
		}
	}
	
	public static IFolder ensureFolderExists(final IFolder folder) throws CoreException{
		if (!folder.exists()) {
			folder.create(true, true, null);
		}
		return folder;
	}
	
	public static Collection<ModelBuilderExtension> collectModelBuilderExtensions() {
		return ExtensionsUtil.collectExtensions(ModelBuilderExtension.BUILDER_EXTENSON_ID, "class",
				ModelBuilderExtension.class);
	}
	
	public static Collection<GTEngineExtension> collectEngineExtensions() {
		return ExtensionsUtil.collectExtensions(GTEngineExtension.BUILDER_EXTENSON_ID, "class",
				GTEngineExtension.class);
	}
	
	public static Collection<GTBuilderExtension> collectEngineBuilderExtensions() {
		return ExtensionsUtil.collectExtensions(GTBuilderExtension.BUILDER_EXTENSON_ID, "class", GTBuilderExtension.class)
				.stream()
				.filter(ext -> ext.getClass().getCanonicalName().contains("HiPE"))
				.collect(Collectors.toList());
	}
	
	public static String getClassNamePrefix(final IProject project) {
		URI projectNameAsURI = URI.createFileURI(project.getName().replace(".", "/"));
		String prefix = projectNameAsURI.lastSegment();
		return Character.toUpperCase(prefix.charAt(0)) + prefix.substring(1);
	}

	public static EClassifiersManager createEClassifierManager(final Registry packageRegistry) {
		EClassifiersManager eClassifiersManager = new EClassifiersManager(new HashMap<>());
		packageRegistry.values().forEach(obj -> {
			EPackage epackage = (EPackage) obj;
			eClassifiersManager.loadMetaModelClasses(epackage.eResource());
		});
		return eClassifiersManager;
	}
}
