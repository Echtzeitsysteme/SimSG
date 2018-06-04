package biochemsimulation.reactionrules.wizard;

import java.io.InputStream;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.xtext.util.StringInputStream;
//import org.eclipse.xtext.ui.shared.internal.Activator;

public class ReactFileWizardPage extends WizardNewFileCreationPage {

	public ReactFileWizardPage(IStructuredSelection selection) {
        super("NewReactFileWizardPage", selection);
        setTitle("Reaction Rule File");
        setDescription("Creates a new Reaction Rule File");
        setFileExtension("react");
    }
	
	@Override
	protected InputStream getInitialContents() {
		String name = this.getFileName();
		name = name.replace(".react", "");
		StringBuilder sb = new StringBuilder();
		sb.append("ModelID ");
		sb.append(name);
		sb.append("\n");
		InputStream s = new StringInputStream(sb.toString());
		
		return s;
		
	}

} 