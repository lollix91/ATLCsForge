/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl;

/**
 * Implementors of this interface can be configured by a map of options (or
 * parameters).
 */
public interface IAtlConfigurable {
	
	/**
	 * Passes the options given by the map to the configurable object.
	 */
	public void setOptions(java.util.Map<?,?> options);
}
