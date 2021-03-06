package org.simsg.ui.wizard;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.eclipse.core.filesystem.URIUtil;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.ui.IWorkingSet;
import org.moflon.core.plugins.PluginProducerWorkspaceRunnable;
import org.moflon.core.plugins.PluginProperties;
import org.moflon.core.ui.WorkingSetUtilities;
import org.moflon.core.utilities.LogUtils;
import org.simsg.ui.AbstractSimSGProjectCreator;
import org.simsg.ui.AbstractSimSGProjectInfoPage;
import org.simsg.ui.AbstractSimSGWizard;
import org.simsg.ui.SimSGNature;

/**
 * This wizard creates a new SimSG EMF project
 *
 * @see #doFinish(IProgressMonitor)
 */
public class NewSimSGProjectWizard extends AbstractSimSGWizard
{
   private static final Logger logger = Logger.getLogger(NewSimSGProjectWizard.class);

   /**
    * This is the ID that is also used in plugin.xml
    */
   public static final String NEW_REPOSITORY_PROJECT_WIZARD_ID = "org.simsg.ui.wizard.NewSimSGProjectWizard";

   protected AbstractSimSGProjectInfoPage projectInfo;

   /**
    * Configures this wizard to use the {@link NewSimSGProjectInfoPage}
    */
   @Override
   public void addPages()
   {
      projectInfo = new NewSimSGProjectInfoPage();
      addPage(projectInfo);
   }

   @Override
   protected void doFinish(final IProgressMonitor monitor) throws CoreException
   {
      try
      {
         final SubMonitor subMon = SubMonitor.convert(monitor, "Creating SimSG project", 8);

         final String projectName = projectInfo.getProjectName();
         final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
         
         final PluginProperties pluginProperties = new PluginProperties();
         pluginProperties.put(PluginProperties.NAME_KEY, projectName);
         pluginProperties.put(PluginProperties.PLUGIN_ID_KEY, projectName);
         createProject(subMon, project, pluginProperties);
         subMon.worked(3);

//         generateDefaultFiles(subMon, project);
         subMon.worked(3);

         ResourcesPlugin.getWorkspace().run(new PluginProducerWorkspaceRunnable(project, pluginProperties), subMon.split(1));
         subMon.worked(2);

         addToWorkingSet(project);

      } catch (final Exception e)
      {
         LogUtils.error(logger, e);
      }
   }

   /**
    * Initializes and runs the {@link SimSGProjectCreator} for the current project
    * @param monitor the progress monitor
    * @param project the project being created
    * @param pluginProperties the metadata of the project
    * @throws CoreException if setting up the project fails
    */
   protected void createProject(final IProgressMonitor monitor, final IProject project, final PluginProperties pluginProperties) throws CoreException
   {
      final SubMonitor subMon = SubMonitor.convert(monitor, "Creating project", 1);
      
      IPath rawProjectPath = projectInfo.getProjectLocation();
      URI locationURI = null;
      if(rawProjectPath != null) { 
          locationURI = URI.create(rawProjectPath.toString());
      }
      final AbstractSimSGProjectCreator createSimSGProject = new SimSGProjectCreator(project, locationURI, pluginProperties, new SimSGNature());
      ResourcesPlugin.getWorkspace().run(createSimSGProject, subMon.split(1));
   }

   /**
    * Stores the default Ecore file in the proper location
    * @param monitor the progress monitor
    * @param project the project being created currently
    * @throws CoreException if storing the file fails
    */
   //TODO: Do i need this?
   
//   protected void generateDefaultFiles(final IProgressMonitor monitor, final IProject project) throws CoreException
//   {
//      final SubMonitor subMon = SubMonitor.convert(monitor, "Creating default files", 1);
//      final String projectName = project.getName();
//      final String packageName = MoflonUtil.lastSegmentOf(projectName);
//      final URI projectUri = MoflonGenModelBuilder.determineProjectUriBasedOnPreferences(project);
//      final URI packageUri = URI.createURI(projectUri.toString() + MoflonConventions.getDefaultPathToEcoreFileInProject(projectName));
//      
//      if(projectInfo.generateDefaultEmfaticFile()) {
//    	  final String defaultEmfaticFile = DefaultContentGenerator.generateDefaultEmfaticFileForProject(projectName, packageName, packageUri.toString());
//    	  WorkspaceHelper.addFile(project, MoflonConventions.getDefaultPathToFileInProject(projectName, ".emf"), defaultEmfaticFile, subMon.split(1));
//      } else {
//    	  final String defaultEcoreFile = DefaultContentGenerator.generateDefaultEPackageForProject(projectName, packageName, packageUri.toString());
//    	  WorkspaceHelper.addFile(project, MoflonConventions.getDefaultPathToEcoreFileInProject(projectName), defaultEcoreFile, subMon.split(1));
//      }
//   }

   /**
    * Adds the given project to the selected working set (if exists)
    * @param project the project being creatd
    */
   private void addToWorkingSet(final IProject project)
   {
      final IWorkingSet[] recentWorkingSet = WorkingSetUtilities.getSelectedWorkingSet(getSelection(), getActivePart());
      if (recentWorkingSet.length != 0)
      {
         WorkingSetUtilities.addProjectToWorkingSet(project, recentWorkingSet[0]);
      }
   }
}
