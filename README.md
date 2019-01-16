SimSG

## Setup instructions

* Get Eclipse 2018-12 with Modeling Components
* Install Democles http://gervarro.org/democles/advanced/integration-0.5.0/
* Install XText Complete SDK 2.16.0: https://download.eclipse.org/modeling/tmf/xtext/updates/releases/
* Install Viatra via 'Install' button from here: https://www.eclipse.org/viatra/downloads.html

* In a fresh Eclipse workspace, check out: https://github.com/arg0n1s/BioChemSimulation (Branch: origin) and import all projects.
* Get rid of all errors:
   * Make sure you have JDK 9 or above.
* In the project *org.simsg.simsgl.updatesite*, open *site.xml* and select *Build all*
* Install the resulting update site in the same Eclipse and restart.
* Run the Java class *Sandbox* in the project *org.simsg.development*
   
