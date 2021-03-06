/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.example.mydsl.MyAtlRuntimeModule
import org.xtext.example.mydsl.MyAtlStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class MyAtlIdeSetup extends MyAtlStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new MyAtlRuntimeModule, new MyAtlIdeModule))
	}
	
}
