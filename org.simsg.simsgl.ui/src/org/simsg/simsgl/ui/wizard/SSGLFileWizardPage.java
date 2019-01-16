package org.simsg.simsgl.ui.wizard;

import java.io.InputStream;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.xtext.util.StringInputStream;

public class SSGLFileWizardPage extends WizardNewFileCreationPage {

	public SSGLFileWizardPage(IStructuredSelection selection) {
        super("NewSSGLFileWizardPage", selection);
        setTitle("SimSGL File");
        setDescription("Creates a new SimSGL File");
        setFileExtension("ssgl");
    }
	
	@Override
	protected InputStream getInitialContents() {
		String name = this.getFileName();
		name = name.replace(".ssgl", "");
		StringBuilder sb = new StringBuilder();
		sb.append("ModelID ");
		sb.append(name);
		sb.append("\n");
		InputStream s = new StringInputStream(sb.toString());
		
		return s;
		
	}

} 