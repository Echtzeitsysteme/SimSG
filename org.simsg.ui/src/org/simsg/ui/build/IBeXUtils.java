package org.simsg.ui.build;

import java.util.Collection;
import java.util.HashMap;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.emoflon.ibex.gt.codegen.EClassifiersManager;
import org.emoflon.ibex.gt.transformations.EditorToIBeXPatternHelper;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXModel;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXNode;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXRule;
import org.moflon.core.utilities.ExtensionsUtil;

public final class IBeXUtils {

	public static void findAllEPackages(final IBeXModel ibexModel, final Registry packageRegistry) {
		for (IBeXRule rule : ibexModel.getRuleSet().getRules()) {
			for (IBeXNode node : EditorToIBeXPatternHelper.getAllRuleNodes(rule)) {
				EPackage foreign = node.getType().getEPackage();
				if (!packageRegistry.containsKey(foreign.getNsURI())) {
					packageRegistry.put(foreign.getNsURI(), foreign);
				}
			}
		}
	}

	public static IFolder ensureFolderExists(final IFolder folder) throws CoreException {
		if (!folder.exists()) {
			folder.create(true, true, null);
		}
		return folder;
	}

	public static Collection<ModelBuilderExtension> collectModelBuilderExtensions() {
		return ExtensionsUtil.collectExtensions(ModelBuilderExtension.BUILDER_EXTENSON_ID, "class",
				ModelBuilderExtension.class);
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
