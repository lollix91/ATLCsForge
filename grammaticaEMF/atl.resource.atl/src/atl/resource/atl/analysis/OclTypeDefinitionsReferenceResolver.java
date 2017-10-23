/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.analysis;

public class OclTypeDefinitionsReferenceResolver implements atl.resource.atl.IAtlReferenceResolver<ocl.OclType, ocl.OclContextDefinition> {
	
	private atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.OclType, ocl.OclContextDefinition> delegate = new atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.OclType, ocl.OclContextDefinition>();
	
	public void resolve(String identifier, ocl.OclType container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final atl.resource.atl.IAtlReferenceResolveResult<ocl.OclContextDefinition> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(ocl.OclContextDefinition element, ocl.OclType container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
