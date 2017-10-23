/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.grammar;

/**
 * A class to represent boolean terminals in a grammar.
 */
public class AtlBooleanTerminal extends atl.resource.atl.grammar.AtlTerminal {
	
	private String trueLiteral;
	private String falseLiteral;
	
	public AtlBooleanTerminal(org.eclipse.emf.ecore.EStructuralFeature attribute, String trueLiteral, String falseLiteral, atl.resource.atl.grammar.AtlCardinality cardinality, int mandatoryOccurrencesAfter) {
		super(attribute, cardinality, mandatoryOccurrencesAfter);
		assert attribute instanceof org.eclipse.emf.ecore.EAttribute;
		this.trueLiteral = trueLiteral;
		this.falseLiteral = falseLiteral;
	}
	
	public String getTrueLiteral() {
		return trueLiteral;
	}
	
	public String getFalseLiteral() {
		return falseLiteral;
	}
	
	public org.eclipse.emf.ecore.EAttribute getAttribute() {
		return (org.eclipse.emf.ecore.EAttribute) getFeature();
	}
	
}
