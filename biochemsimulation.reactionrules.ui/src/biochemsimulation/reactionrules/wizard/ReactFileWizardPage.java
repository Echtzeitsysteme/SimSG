package biochemsimulation.reactionrules.wizard;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
//import org.eclipse.xtext.ui.shared.internal.Activator;

public class ReactFileWizardPage extends WizardNewFileCreationPage {

	public ReactFileWizardPage(IStructuredSelection selection) {
        super("NewReactFileWizardPage", selection);
        setTitle("Reaction Rule File");
        setDescription("Creates a new Reaction Rule File");
        setFileExtension("react");
    }

} 