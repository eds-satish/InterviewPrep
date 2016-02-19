/*
 * Two trees are equal if the have the same data and arrangement of data is the same.
 *
 */ 

public class EqualTrees {
	public boolean checkTree(Node a, Node b){
		//if both trees are empty return true
		if(a == null && b == null) return true;
		
		else if(a != null && b != null){
			//check data of root nodes
			return a.data == b.data && checkTree(a.left,b.left) && checkTree(a.right,b.right);
			//check left and right subtrees recursively
		}
		return false;
	}
}