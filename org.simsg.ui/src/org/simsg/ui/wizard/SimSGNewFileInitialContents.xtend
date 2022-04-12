package org.simsg.ui.wizard

import org.emoflon.ibex.gt.editor.ui.wizard.GTNewFileInitialContents
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.core.resources.IProject
import java.nio.file.Files
import java.io.File

class SimSGNewFileInitialContents extends GTNewFileInitialContents {
	
	override generateInitialContents(IFileSystemAccess2 fsa, IProject project) {
		val packagePath = project.name.replace(".", "/")
		// Add a file with an example rule.
		val projectFile = new File(project.location.toPortableString)
		projectFile.mkdirs;
		val pkgFile = new File(project.location.toPortableString + "/src/" + packagePath + "/");
		pkgFile.mkdirs;
		
		val path = project.location.toPortableString + "/src/" + packagePath + "/Rules." + "gt";
		val file = new File(path);
		Files.write(file.toPath(), this.getFileContent("examplePattern").getBytes());

		val path2 = project.location.toPortableString + "/.gitignore";
		val file2 = new File(path2);
		val content = '''
				/bin/
				/src-gen/
			'''
		// Add a .gitignore
		Files.write(file2.toPath(), content.getBytes());
	}
}