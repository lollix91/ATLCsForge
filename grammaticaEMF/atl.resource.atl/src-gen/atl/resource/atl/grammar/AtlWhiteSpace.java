/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.grammar;

public class AtlWhiteSpace extends atl.resource.atl.grammar.AtlFormattingElement {
	
	private final int amount;
	
	public AtlWhiteSpace(int amount, atl.resource.atl.grammar.AtlCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
