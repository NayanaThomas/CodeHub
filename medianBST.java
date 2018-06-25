package codeing;

public class medianBST {
	class Node {
		int data;
		Node left, right;
		
		Node(int item) {
			data = item;
			left=right=null;
		}
	}
	
	Node root;
	public medianBST()
	{
		root = null;
	}
	
	public void insert(int key) {
		root = insertRec(root, key);
	}
	
	public Node insertRec(Node root,int key) {
		if(root == null) {
			root = new Node(key);
			return root;
		}
		if(key < root.data) {
			root.left = insertRec(root.left,key);
		}
		else if(key > root.data){
			root.right = insertRec(root.right, key);
		}
		return root;
	}
	
	public int countNodes(Node root) {
		int count = 0;
		Node current=null;
		Node pre = null;
		if(root == null) {
			return count;
		}
		else {
			current = root;
			while(current!=null) {
				if(current.left == null) {
					count++;
					current = current.right;
				}
				else {
					pre = current.left;
					while(pre.right!=null && pre.right!=current) {
						pre = pre.right;
					}
					if(pre.right == null) {
						pre.right = current;
						current = current.left;
					}
					else {
						pre.right = null;
						count++;
						current = current.right;
					}
				}
			}
			return count;
		}
		
	}
	
	public int findMedian(Node root) {
		if(root == null) {
			return 0;
		}
		int nodeCount = countNodes(root);
		int currCount=0;
		Node prev=null;
		Node pre = null;
		Node current = null;
		current=root;
		while(current!=null) {
			if(current.left == null) {
				currCount++;
				if(nodeCount%2!=0 && currCount == (nodeCount+1)/2) {
					return current.data;
				}
				else if(nodeCount%2==0 && currCount == (nodeCount/2)+1) {
					return (prev.data+current.data)/2;
				}
				prev = current;
				current = current.right;
			}
			else {
				pre = current.left;
				while(pre.right!=null && pre.right != current) {
					pre = pre.right;
				}
				if(pre.right == null) {
					pre.right = current;
					current = current.left;
				}
				else {
					pre.right = null;
					prev = pre;
					currCount++;
					if(nodeCount%2!=0 && currCount == (nodeCount+1)/2) {
						return current.data;
					}
					else if(nodeCount%2==0 && currCount == (nodeCount/2)+1) {
						return (prev.data+current.data)/2;
					}
					prev = current;
					current = current.right;
				}
			}
		}
		return 0;
	}
	/*void inorder()  {
	       inorderRec(root);
	    }
	 
	    // A utility function to do inorder traversal of BST
	    void inorderRec(Node root) {
	        if (root != null) {
	            inorderRec(root.left);
	            System.out.println(root.data);
	            inorderRec(root.right);
	        }
	    }
	 
	*/
	
	public static void main(String[] args) {
		medianBST med = new medianBST();
		
		/*med.insert(50);
		med.insert(30);
		med.insert(20);
		med.insert(40);
		med.insert(70);
		med.insert(60);
		med.insert(80);*/
		
		/*med.insert(20);
		med.insert(8);
		med.insert(22);
		med.insert(4);
		med.insert(12);
		med.insert(14);
		med.insert(10);*/
		
		med.insert(1);
		med.insert(3);
		med.insert(4);
		med.insert(6);
		med.insert(7);
		med.insert(8);
		med.insert(9);
		
		System.out.println(med.findMedian(med.root));
		//med.inorder();
	}
}
	
