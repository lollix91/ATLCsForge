/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.example.mydsl.MyATLRuntimeModule
import org.xtext.example.mydsl.MyATLStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class MyATLIdeSetup extends MyATLStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new MyATLRuntimeModule, new MyATLIdeModule))
	}
	
}
