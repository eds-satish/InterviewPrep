import java.util.*;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x;}
}

public class TreeTraversals {

	public static void main(String[] args){
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(2);
		root.right = new TreeNode(10);
		System.out.println(inOrder(root));
	}

	private static List<Integer>result = new ArrayList<Integer>();
	public static List<Integer> preOrder(TreeNode root){ //V,L,R

		if(root == null) return result;		

		Stack<TreeNode>stack = new Stack<TreeNode>();
		stack.push(root); //visit the node
		
		while(!stack.isEmpty()){
			TreeNode node = stack.pop();
			result.add(node.val);

			if(node.left != null) preOrder(node.left);

			if(node.right != null) preOrder(node.right);
			
		}
		return result;
	}


	public static List<Integer> inOrder(TreeNode root){ //L,V,R
		if(root == null) return result;

		Stack<TreeNode>stack = new Stack<TreeNode>();

		while(root != null){
			stack.push(root);
			root = root.left;
			while(root == null){
				if(stack.empty()) return result;
				root = stack.pop();
				result.add(root.val);
				root = root.right;
			}
			
		}
		return result;
	}

	public static List<Integer> iterativeInOrder(TreeNode root) {
        if(root != null){
            helperFcn(root);
        }
        return result;
    }

    private static void helperFcn(TreeNode node){
        
        if(node.left != null){
            helperFcn(node.left);
        }

        result.add(node.val);

        if(node.right != null){
            helperFcn(node.right);
        }
    }

}


		


	

