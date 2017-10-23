/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IAtlParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<atl.resource.atl.IAtlCommand<atl.resource.atl.IAtlTextResource>> getPostParseCommands();
	
}
