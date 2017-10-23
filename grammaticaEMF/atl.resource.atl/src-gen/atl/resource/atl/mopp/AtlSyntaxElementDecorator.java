/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.mopp;

public class AtlSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private atl.resource.atl.grammar.AtlSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private AtlSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<Integer> indicesToPrint = new java.util.ArrayList<Integer>();
	
	public AtlSyntaxElementDecorator(atl.resource.atl.grammar.AtlSyntaxElement decoratedElement, AtlSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(Integer index) {
		indicesToPrint.add(index);
	}
	
	public atl.resource.atl.grammar.AtlSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public AtlSyntaxElementDecorator[] getChildDecorators() {
		return childDecorators;
	}
	
	public Integer getNextIndexToPrint() {
		if (indicesToPrint.size() == 0) {
			return null;
		}
		return indicesToPrint.remove(0);
	}
	
	public String toString() {
		return "" + getDecoratedElement();
	}
	
}
