/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.ui;

/**
 * A provider for annotation models.
 */
public interface IAtlAnnotationModelProvider {
	
	/**
	 * Returns the annotation model.
	 */
	public org.eclipse.jface.text.source.IAnnotationModel getAnnotationModel();
	
}
