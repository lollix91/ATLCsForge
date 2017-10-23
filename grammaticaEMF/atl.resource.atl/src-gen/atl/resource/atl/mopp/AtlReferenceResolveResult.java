/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.mopp;

/**
 * A basic implementation of the atl.resource.atl.IAtlReferenceResolveResult
 * interface that collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class AtlReferenceResolveResult<ReferenceType> implements atl.resource.atl.IAtlReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<atl.resource.atl.IAtlReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<atl.resource.atl.IAtlQuickFix> quickFixes;
	
	public AtlReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<atl.resource.atl.IAtlQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<atl.resource.atl.IAtlQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(atl.resource.atl.IAtlQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<atl.resource.atl.IAtlQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<atl.resource.atl.IAtlReferenceMapping<ReferenceType>> getMappings() {
		return mappings;
	}
	
	public boolean wasResolved() {
		return mappings != null;
	}
	
	public boolean wasResolvedMultiple() {
		return mappings != null && mappings.size() > 1;
	}
	
	public boolean wasResolvedUniquely() {
		return mappings != null && mappings.size() == 1;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		if (!resolveFuzzy && target == null) {
			throw new IllegalArgumentException("Mapping references to null is only allowed for fuzzy resolution.");
		}
		addMapping(identifier, target, null);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<atl.resource.atl.IAtlReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new atl.resource.atl.mopp.AtlElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<atl.resource.atl.IAtlReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new atl.resource.atl.mopp.AtlURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
