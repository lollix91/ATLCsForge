/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.grammar;

public class AtlLineBreak extends atl.resource.atl.grammar.AtlFormattingElement {
	
	private final int tabs;
	
	public AtlLineBreak(atl.resource.atl.grammar.AtlCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
