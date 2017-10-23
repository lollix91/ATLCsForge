/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.analysis;

public class ModuleElementModuleReferenceResolver implements atl.resource.atl.IAtlReferenceResolver<atl.ModuleElement, atl.Module> {
	
	private atl.resource.atl.analysis.AtlDefaultResolverDelegate<atl.ModuleElement, atl.Module> delegate = new atl.resource.atl.analysis.AtlDefaultResolverDelegate<atl.ModuleElement, atl.Module>();
	
	public void resolve(String identifier, atl.ModuleElement container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final atl.resource.atl.IAtlReferenceResolveResult<atl.Module> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(atl.Module element, atl.ModuleElement container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
