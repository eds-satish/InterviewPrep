class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x;}
}

public class TreePractice {
	
	//Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
	//LCA is defined as between nodes v and w as the lowest node in T that has both v and w as descendants, a node can be a
	//descendant of itself
	public TreeNode lCA(TreeNode root, TreeNode p, TreeNode q){
		TreeNode node = root;
		if(node.val > p.val && node.val < q.val) return root;
		else if(node.val > p.val && node.val > q.val) return lCA(root.left,p,q); //taking in consideration a descendant of itself
		else if(node.val < p.val && node.val < q.val) return lCA(root.right,p,q);

		return root;
	}

	/*
	 * Properties of a valid BST
	 * 1) The left subtree of a node contains only nodes less than root node
	 * 2) The right subtree of a node contains only nodes greater than root node.
	 * 3) Both the left and right subtree must be binary search trees
	 */
	public static boolean isValidBST(TreeNode root){
		//Creating a helper recursive function to keep track of the minimum and maximum values a node can take
		return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE); 
	}

	private static boolean isValid(TreeNode node, long min, long max){
		
		if(node == null) return true;

		if(node.val <= min || node.val >= max) return false;

		//This recursive solution sets the current value as the new max to our left child and sends the min without changing
		//For the right child, we set the current value as the new min and sent the max without changing.
		return isValid(node.left, min, node.val) && isValid(node.right,node.val,max);
	}

	//Get the maximum depth of a binary tree
	public static int maxDepth(TreeNode root){
		//if tree is empty return 0
		if(root == null) return 0;
		else {
			//compute the depth of each subtree recursively
			int leftSubtreeDepth = maxDepth(root.left); 
			int rightSubtreeDepth = maxDepth(root.right);

			//get the max of max depths of left and right subtree and add 1
			if(leftSubtreeDepth > rightSubtreeDepth) return leftSubtreeDepth + 1;
			else return rightSubtreeDepth + 1;
		}

	}



}