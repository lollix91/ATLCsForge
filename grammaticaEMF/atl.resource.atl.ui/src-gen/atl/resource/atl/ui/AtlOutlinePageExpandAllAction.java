/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.ui;

public class AtlOutlinePageExpandAllAction extends atl.resource.atl.ui.AbstractAtlOutlinePageAction {
	
	public AtlOutlinePageExpandAllAction(atl.resource.atl.ui.AtlOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Expand all", org.eclipse.jface.action.IAction.AS_PUSH_BUTTON);
		initialize("icons/expand_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().expandAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
