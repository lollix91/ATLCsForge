/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.myatl.ui.internal.MyatlActivator;

public class MyATLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MyatlActivator.getInstance().getInjector("org.xtext.example.mydsl.MyATL");
	}

}