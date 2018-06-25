package codeing;

//you can also use imports, for example:
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
 //class TreeNode contains the declaration of the parent node, 
 //the label, the list of children and neighbours, the visited flag,
 //and the length of th longest path
 int longestPathLength;
 class TreeNode {
		TreeNode parent;
		int label;
		ArrayList<TreeNode> children;
		ArrayList<TreeNode> neighbours;
		boolean visited;
		
		//initialises the TreeNode
	    public TreeNode(int label) {
			this.parent = null;
			this.label = label;
			this.children = new ArrayList<TreeNode>();
			this.neighbours = new ArrayList<TreeNode>();
			this.visited = false;
		}
		
		//creates a new edge which is equivalent to setting the neighbours of nodes
		public void newEdge(TreeNode node) {
			this.neighbours.add(node);
		}
		
		//running a dfs traversal on the tree
		public void dfs() {
			this.visited = true;
			for(TreeNode neighbour : this.neighbours) {
				if(!neighbour.visited) {
					neighbour.parent = this;
					this.children.add(neighbour);
					neighbour.dfs();
				}
			}
		}
		
		//Function to find the longest path length
		//@input: none
		//@return: longestPathLength
		public int longestPath() {
			ArrayList<Integer> path = new ArrayList<Integer>();
			//for each of the children, if the children have same label value
			//as their parent, it will be considered for the longest path
			for(TreeNode child : this.children) {
				if(child.label == this.label) {
					path.add(child.longestPath());
				}
				else {
					child.longestPath();
				}
			}
			int pathSize = path.size();
			if( pathSize == 0) {
				return 1;
			}
			if(pathSize > 1) {
				Collections.sort(path);
				longestPathLength = Math.max(longestPathLength, 1+path.get(pathSize-1)+path.get(pathSize-2));
			}
			longestPathLength = Math.max(longestPathLength, 1+path.get(pathSize-1));
			return 1+path.get(pathSize-1);
		}
 }
		
	//Function to create a tree from the given array and edges
	//@input: A: array containing label values of the tree
	//        E: array which describes the edges of the tree
	
 public int solution(int[] A, int[] E) {
     // write your code in Java SE 8
     //creating tree from the given label array and edge array
     TreeNode[] treeNodes = new TreeNode[A.length];
		for(int i=0;i<A.length;i++) {
			treeNodes[i]=new TreeNode(A[i]);
		}
		for(int i=0;i<E.length;i+=2) {
			treeNodes[E[i]-1].newEdge(treeNodes[E[i+1]-1]);
			//since it is undirected graph
			treeNodes[E[i+1]-1].newEdge(treeNodes[E[i]-1]);
		}
		//running a dfs traversal on the above tree from the root.
		//this identifies the parent and the children of each nodes
		treeNodes[0].dfs();
		treeNodes[0].longestPath();
		return longestPathLength-1;
 }
 public static void main(String args[]) {
	 Solution s = new Solution();
	 int[] A = new int[]{ 1,1,1,1,1,1, 1};
	 int[] B = new int[] {1, 2, 1, 3, 2, 4, 2, 5, 3, 6, 6, 7};
	 System.out.println("solution1: " +s.solution(A,B));
 }
}