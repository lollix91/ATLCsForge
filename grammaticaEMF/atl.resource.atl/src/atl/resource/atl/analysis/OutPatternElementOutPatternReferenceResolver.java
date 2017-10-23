/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.analysis;

public class OutPatternElementOutPatternReferenceResolver implements atl.resource.atl.IAtlReferenceResolver<atl.OutPatternElement, atl.OutPattern> {
	
	private atl.resource.atl.analysis.AtlDefaultResolverDelegate<atl.OutPatternElement, atl.OutPattern> delegate = new atl.resource.atl.analysis.AtlDefaultResolverDelegate<atl.OutPatternElement, atl.OutPattern>();
	
	public void resolve(String identifier, atl.OutPatternElement container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final atl.resource.atl.IAtlReferenceResolveResult<atl.OutPattern> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(atl.OutPattern element, atl.OutPatternElement container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
