import java.util.*;

public class Tree {
	int value;
	Tree left;
	Tree right;
	Tree(int x) { value = x;}

	private ArrayList<Integer>returnList = new ArrayList<Integer>();


	public ArrayList<Integer>preorderTraversal(Tree root){ //visit node, left, right

		if(root == null){
			return returnList;
		}

		Stack<Tree>stack = new Stack<Tree>();
		stack.push(root); //visit the node
		
		while(!stack.isEmpty()){
			Tree n = stack.pop();
			returnList.add(n.value);

			if(n.left != null){
				preorderTraversal(n.left);

			}
			if(n.right != null){
				preorderTraversal(n.right);
			}
		}
		return returnList;
	}

	public ArrayList<Integer>inorderTraversal(Tree root){
		if(root == null){
			return returnList;
		}
		
		Tree r = root;
		Stack<Tree>stack = new Stack<Tree>();

		while(!stack.isEmpty() || r != null){
			if(r != null){
				stack.push(r);
				r = r.left;
			} else {
				Tree t = stack.pop();
				returnList.add(t.value); //visit node and push before going to righr
				r = r.right;
			}

		}
		return returnList;
	}

	public ArrayList<Integer> recursiveInOrder(Tree root){
		if(root != null){
			helper(root);
		}
		return returnList;
	}
	public void helper(Tree node){
		if(node.left != null){
			helper(node.left);
		}
		returnList.add(node.value);

		if(node.right != null){
			helper(node.right);
		}
	}

	public ArrayList<Integer>postOrderTraversal(Tree root){
		
		if(root == null){
			return returnList;
		}
		
		Stack<Tree>stack = new Stack<Tree>();
		stack.push(root);

		Tree prev = null; //used to keep track of previous node location

		while(!stack.isEmpty()){
			Tree current = stack.peek();

			//iterate through the tree check if current node
			//is a leaf, if lead, add it, pop stack
			//if not keep going down

			//prev == null is root node
			//check if current node is leaf, if not keep going down 
			if(prev == null || prev.left == current || prev.right == current){
				if(current.left != null){ //not a leaf
					stack.push(current.left);
				} else if(current.right){ //not a leaf
					stack.push(current.right);
				} else { //a leaf
					stack.pop();
					returnList.add(current.value);
				}

			///go back to left node's parent, check right node, 
			//if there is a right child, push it to stack
			//other process parent, pop stack and add it to list

			else if(current.left == prev){
				if(current.right != null){
					stack.push(current.right);
				} else { //no children
					stack.pop();
					returnList.add(current.value);
				}
			}

			//go back to root node and go right
			else if(current.right == prev){
				stack.pop();
				returnList.add(current.value);
			}

			prev = current;


			}
		}
		return returnList;
	}


}
