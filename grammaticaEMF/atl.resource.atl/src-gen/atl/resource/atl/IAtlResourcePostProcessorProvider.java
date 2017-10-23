/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IAtlResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public atl.resource.atl.IAtlResourcePostProcessor getResourcePostProcessor();
	
}
