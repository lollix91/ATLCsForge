/*
 * generated by Xtext 2.11.0
 */
package org.xtext.example.mydsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractMyAtlProjectValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/gmt/2005/ATL"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/ocl/3.1.0/EssentialOCLCST1"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/ocl/3.1.0/BaseCST1"));
		return result;
	}
	
}
