/*
 * generated by Xtext 2.16.0
 */
package org.simsg.simsgl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SimSGLStandaloneSetup extends SimSGLStandaloneSetupGenerated {

	def static void doSetup() {
		new SimSGLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}