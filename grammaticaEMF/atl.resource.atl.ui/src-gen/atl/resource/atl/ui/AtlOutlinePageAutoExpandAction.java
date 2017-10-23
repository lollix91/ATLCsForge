/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package atl.resource.atl.ui;

public class AtlOutlinePageAutoExpandAction extends atl.resource.atl.ui.AbstractAtlOutlinePageAction {
	
	public AtlOutlinePageAutoExpandAction(atl.resource.atl.ui.AtlOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Auto expand", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/auto_expand_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setAutoExpand(on);
		getTreeViewer().refresh();
	}
	
}
