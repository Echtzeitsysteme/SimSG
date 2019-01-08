BioChemSimulation

## Setup instructions

* Get Eclipse 2018-12 with Modeling Components
* Install Democles http://gervarro.org/democles/advanced/integration-0.5.0/
* Install XText Complete SDK 2.16.0: https://download.eclipse.org/modeling/tmf/xtext/updates/releases/
* Install Viatra via 'Install' button from here: https://www.eclipse.org/viatra/downloads.html
* Install NeoEMF update site https://atlanmod.github.io/NeoEMF/releases/latest/plugin/
   * Select the following components
      * NeoEMF Persistence Framework
      * NeoEMF : BluePrints Core and Neo4J
      * NeoEMF : HBase
      * Neo4J Convenience Wrapper
      * NeoEMF : I/O
   * More info here: https://github.com/atlanmod/NeoEMF/wiki/Get-Started
* In a fresh Eclipse workspace, check out: https://github.com/arg0n1s/BioChemSimulation (Branch: devel-nextGen) and import all projects.
* Get rid of all errors:
   * Make sure you have JDK 9 or above.
* In the project *updatesite*, open *site.xml* and select *Build all*
* Install the resulting update site in the same Eclipse and restart.
* Run the Java class *Sandbox* in the project *Simulation*
   
