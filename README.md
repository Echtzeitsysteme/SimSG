# SimSG - Simulation Framework
### *Rule-based Simulation with Stochastic Graph Transformation*

## Setup instructions

* Install eMoflon::IBeX as given [here](https://github.com/eMoflon/emoflon-ibex) and follow the "How to Develop" or "How to Install" instructions based on what you want to do (ATTENTION: Do not get the newest version of Eclipse Modeling Tools but [Version 2019-09R](https://www.eclipse.org/downloads/packages/release/2019-09/r/eclipse-modeling-tools))
* Get the latest version of sirius from this update-site: http://download.eclipse.org/sirius/updates/releases/6.3.0/2019-06
    * Check Sirius and Uncategorized
* In a fresh Eclipse workspace, check out: https://github.com/eMoflon/SimSG (Branch: origin) and import all projects.
* Get rid of all errors:
   * Set your text file encoding to `UTF-8` in `Window->Preferences->General->Workspace`
   * Open `org.simsg.simulationdefinition -> model -> simulationdefinition.genmodel` click the top-level item and choose "Generate Model Code"
   * Eventually rebuild
   * Make sure you have JDK 8 or above.

You are now able to start a dynamic workspace from any of the projects in your workspace by running it as eclipse application. In this dynamic workspace you can use SimSG e.g. by creating new projects with the SimSG-Wizard.
