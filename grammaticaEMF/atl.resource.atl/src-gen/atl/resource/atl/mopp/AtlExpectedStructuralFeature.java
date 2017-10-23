/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class AtlExpectedStructuralFeature extends atl.resource.atl.mopp.AtlAbstractExpectedElement {
	
	private atl.resource.atl.grammar.AtlPlaceholder placeholder;
	
	public AtlExpectedStructuralFeature(atl.resource.atl.grammar.AtlPlaceholder placeholder) {
		super(placeholder.getMetaclass());
		this.placeholder = placeholder;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return placeholder.getFeature();
	}
	
	/**
	 * Returns the expected placeholder.
	 */
	public atl.resource.atl.grammar.AtlSyntaxElement getSymtaxElement() {
		return placeholder;
	}
	
	public String getTokenName() {
		return placeholder.getTokenName();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton(getTokenName());
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof AtlExpectedStructuralFeature) {
			return getFeature().equals(((AtlExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
	@Override	
	public int hashCode() {
		return getFeature().hashCode();
	}
	
}
