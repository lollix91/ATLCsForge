/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.analysis;

public class OclContextDefinitionDefinitionReferenceResolver implements atl.resource.atl.IAtlReferenceResolver<ocl.OclContextDefinition, ocl.OclFeatureDefinition> {
	
	private atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.OclContextDefinition, ocl.OclFeatureDefinition> delegate = new atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.OclContextDefinition, ocl.OclFeatureDefinition>();
	
	public void resolve(String identifier, ocl.OclContextDefinition container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final atl.resource.atl.IAtlReferenceResolveResult<ocl.OclFeatureDefinition> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(ocl.OclFeatureDefinition element, ocl.OclContextDefinition container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
