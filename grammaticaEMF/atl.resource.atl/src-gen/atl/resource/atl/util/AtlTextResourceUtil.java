/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.util;

/**
 * Class AtlTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * atl.resource.atl.util.AtlResourceUtil.
 */
public class AtlTextResourceUtil {
	
	/**
	 * Use atl.resource.atl.util.AtlResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static atl.resource.atl.mopp.AtlResource getResource(org.eclipse.core.resources.IFile file) {
		return new atl.resource.atl.util.AtlEclipseProxy().getResource(file);
	}
	
	/**
	 * Use atl.resource.atl.util.AtlResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static atl.resource.atl.mopp.AtlResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return atl.resource.atl.util.AtlResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use atl.resource.atl.util.AtlResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static atl.resource.atl.mopp.AtlResource getResource(org.eclipse.emf.common.util.URI uri) {
		return atl.resource.atl.util.AtlResourceUtil.getResource(uri);
	}
	
	/**
	 * Use atl.resource.atl.util.AtlResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static atl.resource.atl.mopp.AtlResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return atl.resource.atl.util.AtlResourceUtil.getResource(uri, options);
	}
	
}
