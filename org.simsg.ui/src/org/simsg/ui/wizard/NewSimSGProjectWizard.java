package org.simsg.ui.wizard;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.eclipse.xtext.ui.wizard.DefaultProjectInfo;
import org.eclipse.xtext.ui.wizard.IExtendedProjectInfo;

/**
 * This wizard creates a new SimSG EMF project
 *
 * @see #doFinish(IProgressMonitor)
 */
public class NewSimSGProjectWizard extends BasicNewProjectResourceWizard {

	public static final String PROJECT_WIZARD_ID2 = "org.simsg.ui.wizard.NewSimSGProjectWizard";
	public static final String PROJECT_WIZARD_TITLE2 = "New SimSG Project";
	public static final String PROJECT_WIZARD_DESCRIPTION2 = "Create a new SimSG Project.";
	public WizardNewProjectCreationPage mainPage;

	public NewSimSGProjectWizard() {
		super();
		this.setWindowTitle(PROJECT_WIZARD_TITLE2);
	}

	@Override
	public void addPages() {
		// A page containing a form with project name and location.
		mainPage = new NewProjectPage("basicNewProjectPage");
		mainPage.setTitle(PROJECT_WIZARD_TITLE2);
		mainPage.setDescription(PROJECT_WIZARD_DESCRIPTION2);
		this.addPage(mainPage);
	}

	@Override
	public boolean performFinish() {
		SimSGProjectCreator creator = new SimSGProjectCreator();
		creator.setProjectInfo(getProjectInfo());
		creator.createProject(new NullProgressMonitor());
		return true;
	}

	protected IExtendedProjectInfo getProjectInfo() {
		DefaultProjectInfo projectInfo = new DefaultProjectInfo();
		projectInfo.setProjectName(mainPage.getProjectName());
		if (!mainPage.useDefaults()) {
			projectInfo.setLocationPath(mainPage.getLocationPath());
		}
		return projectInfo;
	}

}

class NewProjectPage extends WizardNewProjectCreationPage {

	public NewProjectPage(String pageName) {
		super(pageName);
	}

}
