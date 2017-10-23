/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl;

public interface IAtlProblem {
	public String getMessage();
	public atl.resource.atl.AtlEProblemSeverity getSeverity();
	public atl.resource.atl.AtlEProblemType getType();
	public java.util.Collection<atl.resource.atl.IAtlQuickFix> getQuickFixes();
}
