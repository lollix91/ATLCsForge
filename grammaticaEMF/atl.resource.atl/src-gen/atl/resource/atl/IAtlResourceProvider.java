/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl;

/**
 * Implementors of this interface provide an EMF resource.
 */
public interface IAtlResourceProvider {
	
	/**
	 * Returns the resource.
	 */
	public atl.resource.atl.IAtlTextResource getResource();
	
}
