/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.mopp;

public class AtlParseResult implements atl.resource.atl.IAtlParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<atl.resource.atl.IAtlCommand<atl.resource.atl.IAtlTextResource>> commands = new java.util.ArrayList<atl.resource.atl.IAtlCommand<atl.resource.atl.IAtlTextResource>>();
	
	public AtlParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<atl.resource.atl.IAtlCommand<atl.resource.atl.IAtlTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
