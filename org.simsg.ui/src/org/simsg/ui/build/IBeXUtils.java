package org.simsg.ui.build;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.emoflon.ibex.gt.codegen.EClassifiersManager;
import org.emoflon.ibex.gt.codegen.GTEngineExtension;
import org.emoflon.ibex.gt.codegen.JavaFileGenerator;
import org.emoflon.ibex.gt.editor.ui.builder.GTBuilderExtension;
import org.emoflon.ibex.gt.transformations.EditorToIBeXPatternHelper;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXModel;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXNode;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXPattern;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXRule;
import org.moflon.core.utilities.ExtensionsUtil;

public final class IBeXUtils {
	
	public static void generateAPI(final IProject project, final IFolder apiPackage, final IBeXModel ibexModel,
			final Registry packageRegistry) throws CoreException {
		JavaFileGenerator generator = new JavaFileGenerator(getClassNamePrefix(project), project.getName(), createEClassifierManager(packageRegistry));
		IFolder matchesPackage = ensureFolderExists(apiPackage.getFolder("matches"));
		IFolder rulesPackage = ensureFolderExists(apiPackage.getFolder("rules"));
		IFolder probabilitiesPackage = ensureFolderExists(apiPackage.getFolder("probabilities"));
		
		Set<IBeXPattern> ruleContextPatterns = new HashSet<>();
		ibexModel.getRuleSet().getRules().forEach(gtRule -> {
			generator.generateMatchClass(matchesPackage, gtRule);
			generator.generateRuleClass(rulesPackage, gtRule);
			generator.generateProbabilityClass(probabilitiesPackage, gtRule);
			ruleContextPatterns.add(gtRule.getLhs());
		});
		
		ibexModel.getPatternSet().getContextPatterns().stream()
			.filter(pattern -> !ruleContextPatterns.contains(pattern))
			.filter(pattern -> !pattern.getName().contains("CONDITION"))
			.forEach(pattern -> {
				generator.generateMatchClass(matchesPackage, pattern);
				generator.generatePatternClass(rulesPackage, pattern);
		});

		generator.generateAPIClass(apiPackage, ibexModel,
				String.format("%s/%s/%s/api/ibex-patterns.xmi", project.getName(), "src-gen", project.getName().replace(".", "/")));
		generator.generateAppClass(apiPackage);
		collectEngineExtensions().forEach(e -> generator.generateAppClassForEngine(apiPackage, e));
	}
	
	/**
	 * Returns the list of .gt files.
	 * 
	 * @return the list of files
	 * @throws CoreException 
	 */
	public static List<IFile> getGTFiles(IFolder srcFolder) throws CoreException {
		IResource[] allFiles = null;
		allFiles = srcFolder.members();
		
		List<IFile> nestedFiles = Arrays.stream(allFiles)
			.filter(f -> f instanceof IFolder)
			.map(f -> (IFolder)f)
			.map(f -> {
				try {
					return getGTFiles(f);
				} catch (CoreException e) {
					e.printStackTrace();
					return new LinkedList<IFile>();
				}
			})
			.flatMap(list -> list.stream())
			.collect(Collectors.toList());

		nestedFiles.addAll(Arrays.stream(allFiles) //
				.filter(f -> f instanceof IFile).map(f -> (IFile) f) //
				.filter(f -> "gt".equals(f.getFileExtension()) && f.exists()) //
				.collect(Collectors.toList()));
		
		return nestedFiles;
	}
	
	/**
	 * Determines the folders in the given container which contain .gt files.
	 * 
	 * @param container the container to check for folders
	 * @return the package paths in the container which contain .gt files
	 * @throws CoreException 
	 */
	public static Set<IPath> findGTFolders(final IContainer container, IFolder srcFolder) throws CoreException {
		final Set<IPath> set = new HashSet<>();
		IResource[] members;
		members = container.members();
		Arrays.stream(members) //
				.filter(m -> m instanceof IContainer).map(m -> (IContainer) m) //
				.forEach(m -> {
					try {
						set.addAll(findGTFolders(m, srcFolder));
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
		if (isRulePackage(members)) {
			set.add(container.getLocation().makeRelativeTo(srcFolder.getLocation()));
		}
		return set;
	}

	/**
	 * Checks whether the given resources contain at least one gt file.
	 * 
	 * @param members the resources to search
	 * @return true if a gt file is found
	 */
	private static boolean isRulePackage(final IResource[] members) {
		return Arrays.stream(members) //
				.filter(m -> m instanceof IFile).map(m -> (IFile) m) // find a file
				.anyMatch(f -> "gt".equals(f.getFileExtension())); // with extension gt
	}
	
	public static void findAllEPackages(final IBeXModel ibexModel, final Registry packageRegistry) {
		for(IBeXRule rule : ibexModel.getRuleSet().getRules()) {
			for(IBeXNode node : EditorToIBeXPatternHelper.getAllRuleNodes(rule)) {
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
		packageRegistry.values().stream().filter(x -> (x instanceof EPackage)).forEach(obj -> {
			EPackage epackage = (EPackage) obj;
			eClassifiersManager.loadMetaModelClasses(epackage.eResource());
		});
		return eClassifiersManager;
	}
}
