package biochemsimulation.reactionrules.wizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class ReactFileWizard extends Wizard implements INewWizard {

    private IStructuredSelection selection;
    private ReactFileWizardPage newFileWizardPage;
    @SuppressWarnings("unused")
	private IWorkbench workbench;
 

    public ReactFileWizard() {

        setWindowTitle("New Reaction Rule File");

    } 

    @Override
    public void addPages() {

        newFileWizardPage = new ReactFileWizardPage(selection);
        addPage(newFileWizardPage);
    }
    
    @Override
    public boolean performFinish() {
        
        IFile file = newFileWizardPage.createNewFile();
        if (file != null)
            return true;
        else
            return false;
    }

    public void init(IWorkbench workbench, IStructuredSelection selection) {
        this.workbench = workbench;
        this.selection = selection;
    }
}
