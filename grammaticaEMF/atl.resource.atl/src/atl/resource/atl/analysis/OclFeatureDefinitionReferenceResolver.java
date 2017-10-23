/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.analysis;

public class OclFeatureDefinitionReferenceResolver implements atl.resource.atl.IAtlReferenceResolver<ocl.OclFeature, ocl.OclFeatureDefinition> {
	
	private atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.OclFeature, ocl.OclFeatureDefinition> delegate = new atl.resource.atl.analysis.AtlDefaultResolverDelegate<ocl.OclFeature, ocl.OclFeatureDefinition>();
	
	public void resolve(String identifier, ocl.OclFeature container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final atl.resource.atl.IAtlReferenceResolveResult<ocl.OclFeatureDefinition> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(ocl.OclFeatureDefinition element, ocl.OclFeature container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
