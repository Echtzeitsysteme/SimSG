# SimSG - Simulation Framework
### *Rule-based Simulation with Stochastic Graph Transformation*
Stochastic models can be found in various domains. For example, biochemical processes such as molecular interactions or the dynamics of wireless network topologies, where changes occur with certain probabilities. 
Having the ability to simulate scenarios in these domains can be crucial when real-life observations of certain processes are infeasible, e.g., protein-protein interactions in biochemistry, or expensive, e.g., building large wireless networks for research purposes.
Stochastic graph transformation systems provide the means to describe the structure and simulate the behavior of such probability-driven environments in an adequate way, by modelling the state transitions using graph transformation rules, whose application depends on the current state and their application probabilities.
To the best of our knowledge, there is currently no general-purpose simulation tool available anymore that performs rule-based simulations using stochastic graph transformation.
Therefore, we developed SimSG a modular stochastic simulation tool that addresses the needs of a wide range of application domains - in contrast to most specialized simulation tools that are limited to one domain only. 
To facilitate the versatility of the tool, SimSG can be configured to employ different general-purpose tools for incremental graph pattern matching (currently: Democles and [HiPE]https://github.com/HiPE-DevOps/HiPE-Updatesite).

## Requirements
* Java SE 8 or higher
 * Eclipse Modeling Tools (do NOT get the latest version but make sure to use [version 2019-12R](https://www.eclipse.org/downloads/packages/release/2019-12/r/eclipse-modeling-tools) instead)
* Working [eMoflon](https://github.com/eMoflon/emoflon-ibex) setup

If you don't already have a working setup of eMoflon it is recommended to start with a fresh and clean install of eclipse as provided by the [Eclipse Modeling Tools](https://www.eclipse.org/downloads/packages/release/2019-12/r/eclipse-modeling-tools).

## Setup instructions
* Install eMoflon::IBeX as given [here](https://github.com/eMoflon/emoflon-ibex) and follow the "How to Develop" or "How to Install" instructions based on what you want to do (ATTENTION: Do not get the newest version of Eclipse Modeling Tools but [Version 2019-12R](https://www.eclipse.org/downloads/packages/release/2019-12/r/eclipse-modeling-tools))
* In the workspace containing eMoflon, check out: https://github.com/eMoflon/SimSG (Branch: origin) and import all projects.
* Get rid of all errors:
   * Set your text file encoding to `UTF-8` in `Window->Preferences->General->Workspace`
   * Open `org.simsg.simulationdefinition -> model -> simulationdefinition.genmodel` click the top-level item and choose "Generate Model Code"
   * Eventually rebuild
   * Make sure you have JDK 8 or above.

You are now able to start a dynamic workspace from any of the projects in your workspace by running it as eclipse application. In this dynamic workspace you can use SimSG e.g. by creating new projects with the SimSG-Wizard.

### Running example
We provide two working examples of the biochmistry domain, simulating the *Goldbeter-Koshland-Loop (GKL)*.
1. The [SimSG-test repository](https://github.com/Echtzeitsysteme/SimSG-tests) provides an implementation of the GKL simulation, using an Ecore metamodel, a set of eMoflon::GT rules and an initial EMF-based model. You can find it in the `org.simsg.applications.gklsimulation`-project. To see it in action, follow the instructions on the repository's readme.
2. The [Re.action test repository](https://github.com/Echtzeitsysteme/Re.actionFramework-tests) contains a working example model of the GKL simulation, which was specified using the [Re.action](https://github.com/Echtzeitsysteme/Re.actionFramework) domain specific language. From this specification all the necessary components mentioned in (1) are generated automatically. You can find it in the `org.reaction.gklExample`-folder. To see it in action, follow the instructions on the repository's readme.
