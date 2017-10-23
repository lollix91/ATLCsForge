/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.grammar;

public class AtlContainment extends atl.resource.atl.grammar.AtlTerminal {
	
	private final org.eclipse.emf.ecore.EClass[] allowedTypes;
	
	public AtlContainment(org.eclipse.emf.ecore.EStructuralFeature feature, atl.resource.atl.grammar.AtlCardinality cardinality, org.eclipse.emf.ecore.EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public org.eclipse.emf.ecore.EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = atl.resource.atl.util.AtlStringUtil.explode(allowedTypes, ", ", new atl.resource.atl.IAtlFunction1<String, org.eclipse.emf.ecore.EClass>() {
				public String execute(org.eclipse.emf.ecore.EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
