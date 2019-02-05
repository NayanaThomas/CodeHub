package codeing;

import java.util.ArrayList;
import java.util.LinkedList;

class TreeNode1 {
	int data;
	TreeNode1 left, right;

	TreeNode1(int d) {
		data = d;
		left = right = null;
	}
}

public class ListOfDepths {
	public ArrayList<LinkedList<TreeNode1>> createLevelLinkedList(TreeNode1 root) {
		ArrayList<LinkedList<TreeNode1>> result = new ArrayList<LinkedList<TreeNode1>>();
		LinkedList<TreeNode1> current = new LinkedList<TreeNode1>();
		if(root!=null) {
			current.add(root);
		}
		while(current.size() > 0) {
			result.add(current);
			LinkedList<TreeNode1> parents = current;
			current = new LinkedList<TreeNode1>();;
			for(TreeNode1 node:parents) {
				if(node.left!=null)
					current.add(node.left);
				if(node.right!=null)
					current.add(node.right);
			}
		}
		return result;
	}
	

	public static void main(String args[]) 
	{
		ListOfDepths l = new ListOfDepths();
		TreeNode1 root = new TreeNode1(10);
		root.left = new TreeNode1(8);
		root.right = new TreeNode1(12);
	    root.left.left = new TreeNode1(3);
	    root.left.right = new TreeNode1(9);
	    root.right.right = new TreeNode1(90);
	    root.right.right.left = new TreeNode1(80);
	    root.right.right.right = new TreeNode1(190);
	    ArrayList<LinkedList<TreeNode1>> list = l.createLevelLinkedList(root);
	    for(LinkedList<TreeNode1> ll: list) {
	    		for(TreeNode1 n:ll) {
	    			System.out.print(n.data+  " ");
	    		}
	    		System.out.println();
	    }
	}
}