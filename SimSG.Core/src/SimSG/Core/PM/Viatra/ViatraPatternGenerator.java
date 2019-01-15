package SimSG.Core.PM.Viatra;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
import org.eclipse.viatra.query.patternlanguage.emf.vql.*;
import SimSG.Container.ContainerPackage;
import SimSG.Core.PM.Pattern.GenericPattern;
import SimSG.Core.Utils.PersistenceUtils;

public class ViatraPatternGenerator {
	
	final public static String MODEL_FOLDER_NAME = "data";
	final public static String PATTERN_MODEL_FOLDER_NAME = "ViatraPatternModels";
	final public static String SYSTEM_OS_PROPERTY = "os.name";
	final public static String SYSTEM_OS_WIN = "Windows";
	final public static String SYSTEM_OS_OSX = "Mac OS X";
	
	private String os;
	private boolean isInitialized;
	EPackage dynamicMetaModel;
	private Map<String, GenericPattern> genericPatterns;
	@SuppressWarnings("restriction")
	private PatternModel patternModel;
	private String patternModelFolder;
	private EMFPatternLanguageStandaloneSetup setup;
	
	private void setOSspecificSeparators() {
		os = System.getProperty(SYSTEM_OS_PROPERTY);
		if(os.contains(SYSTEM_OS_WIN)) {
			os = SYSTEM_OS_WIN;
		}
	}
	
	private void init() {
		setOSspecificSeparators();
		patternModelFolder = this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
		patternModelFolder = patternModelFolder.replaceFirst("/bin", "");
		if(os.equalsIgnoreCase(SYSTEM_OS_WIN)) {
			patternModelFolder = patternModelFolder.replaceFirst("^/", "");
		}
		patternModelFolder = patternModelFolder.replaceFirst("%20", " ");
		patternModelFolder += MODEL_FOLDER_NAME+"/"+PATTERN_MODEL_FOLDER_NAME;
		
		// create model folder if absent
		PersistenceUtils.createFolderIfNotExist(patternModelFolder);
		
		patternModelFolder += "/";
		
		isInitialized = false;
		setup = new EMFPatternLanguageStandaloneSetup();
		setup.createInjectorAndDoEMFRegistration();
	}
	
	public ViatraPatternGenerator(EPackage dynamicMetaModel, Map<String, GenericPattern> genericPatterns) {
		init();
		isInitialized = genericPatterns != null;
		this.genericPatterns = genericPatterns;
		this.dynamicMetaModel = dynamicMetaModel;
	}
	
	@SuppressWarnings("restriction")
	public PatternModel doGenerate() throws Exception{
		if(!isInitialized) {
			throw new RuntimeException("ViatraPatternGenerator is uninitialized because the given resource containing the ReactionRules model could not be loaded.");
		}
		
		LinkedHashMap<EPackage, String> imports = new LinkedHashMap<EPackage, String>();
		imports.put(ContainerPackage.eINSTANCE, "reactionContainer");
		imports.put(dynamicMetaModel, dynamicMetaModel.getNsPrefix());
		
		ViatraCodeGenerator pt = new ViatraCodeGenerator(imports, genericPatterns);
			
		String output = pt.generatePatternCode();
		
		saveModelToVqlFile(patternModelFolder+"temp.vql", output);
		
		ResourceSet resourceSet = new ResourceSetImpl();
		URI fileURI = URI.createFileURI(patternModelFolder+"temp.vql");
		Resource patternResource = resourceSet.getResource(fileURI, true);

		if (patternResource != null) {
			if (patternResource.getErrors().size() == 0 && patternResource.getContents().size() >= 1) {
				patternModel = (PatternModel) patternResource.getContents().get(0);
			}
		}
		// dirty trick to prevent the VIATRA Plugin from detecting a *.vql-file and stop it from screwing with xtend generation 
		deleteAndRenameVqlFile(patternModelFolder+"temp.vql", patternModelFolder+"temp.pvql");
		return patternModel;
	}
	
	private void saveModelToVqlFile(String path, String output) throws Exception {
		Path file = Paths.get(path);
		List<String> lines = Arrays.asList(output);
		Files.write(file, lines, Charset.forName("UTF-8"));
	}
	
	private void deleteAndRenameVqlFile(String oldPath, String newPath) throws Exception {
		Path oldFile = Paths.get(oldPath);
		Path newFile = Paths.get(newPath);
		Files.move(oldFile, newFile, StandardCopyOption.REPLACE_EXISTING);
	}

}
