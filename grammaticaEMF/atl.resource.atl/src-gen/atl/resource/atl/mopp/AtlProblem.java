/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.mopp;

public class AtlProblem implements atl.resource.atl.IAtlProblem {
	
	private String message;
	private atl.resource.atl.AtlEProblemType type;
	private atl.resource.atl.AtlEProblemSeverity severity;
	private java.util.Collection<atl.resource.atl.IAtlQuickFix> quickFixes;
	
	public AtlProblem(String message, atl.resource.atl.AtlEProblemType type, atl.resource.atl.AtlEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<atl.resource.atl.IAtlQuickFix>emptySet());
	}
	
	public AtlProblem(String message, atl.resource.atl.AtlEProblemType type, atl.resource.atl.AtlEProblemSeverity severity, atl.resource.atl.IAtlQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public AtlProblem(String message, atl.resource.atl.AtlEProblemType type, atl.resource.atl.AtlEProblemSeverity severity, java.util.Collection<atl.resource.atl.IAtlQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<atl.resource.atl.IAtlQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public atl.resource.atl.AtlEProblemType getType() {
		return type;
	}
	
	public atl.resource.atl.AtlEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<atl.resource.atl.IAtlQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
