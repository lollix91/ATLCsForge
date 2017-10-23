/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class AtlProposalPostProcessor {
	
	public java.util.List<atl.resource.atl.ui.AtlCompletionProposal> process(java.util.List<atl.resource.atl.ui.AtlCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
