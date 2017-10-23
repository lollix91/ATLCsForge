/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.mopp;

/**
 * A representation for a range in a document where a boolean attribute is
 * expected.
 */
public class AtlExpectedBooleanTerminal extends atl.resource.atl.mopp.AtlAbstractExpectedElement {
	
	private atl.resource.atl.grammar.AtlBooleanTerminal booleanTerminal;
	
	public AtlExpectedBooleanTerminal(atl.resource.atl.grammar.AtlBooleanTerminal booleanTerminal) {
		super(booleanTerminal.getMetaclass());
		this.booleanTerminal = booleanTerminal;
	}
	
	public atl.resource.atl.grammar.AtlBooleanTerminal getBooleanTerminal() {
		return booleanTerminal;
	}
	
	/**
	 * Returns the expected boolean terminal.
	 */
	public atl.resource.atl.grammar.AtlSyntaxElement getSymtaxElement() {
		return booleanTerminal;
	}
	
	private org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return booleanTerminal.getFeature();
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof AtlExpectedBooleanTerminal) {
			return getFeature().equals(((AtlExpectedBooleanTerminal) o).getFeature());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getFeature().hashCode();
	}
	
	public java.util.Set<String> getTokenNames() {
		// BooleanTerminals are associated with two or one token(s)
		java.util.Set<String> tokenNames = new java.util.LinkedHashSet<String>(2);
		String trueLiteral = booleanTerminal.getTrueLiteral();
		if (!"".equals(trueLiteral)) {
			tokenNames.add("'" + trueLiteral + "'");
		}
		String falseLiteral = booleanTerminal.getFalseLiteral();
		if (!"".equals(falseLiteral)) {
			tokenNames.add("'" + falseLiteral + "'");
		}
		return tokenNames;
	}
	
}
