/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.analysis;

public class ParameterOperationReferenceResolver implements atl.resource.atl.IAtlReferenceResolver<ocl.Parameter, ocl.Operation> {
	
	private atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.Parameter, ocl.Operation> delegate = new atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.Parameter, ocl.Operation>();
	
	public void resolve(String identifier, ocl.Parameter container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final atl.resource.atl.IAtlReferenceResolveResult<ocl.Operation> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(ocl.Operation element, ocl.Parameter container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
