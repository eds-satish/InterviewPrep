import java.util.*;


class zizzag {
	/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> returnList = new ArrayList<List<Integer>>();
        
        if(root == null){
            return returnList; //returns a blank list
        }
        
        Stack<TreeNode>currentLevel = new Stack<TreeNode>();
        currentLevel.push(root);
        
        Stack<TreeNode>nextLevel = new Stack<TreeNode>();
        
        List<Integer>levelList = new ArrayList<Integer>();
        boolean direction = false; //true if left to right 

        while(!currentLevel.isEmpty()){
            TreeNode node = currentLevel.pop();
            levelList.add(node.val);
            
            if(direction){ //left to right
                if(node.right != null){ //push right first since youre using a stack and you want it in zizzag order
                    nextLevel.push(node.right);
                }
                if(node.left != null){
                    nextLevel.push(node.left);
                }
            } else { //right to left
                if(node.left != null){
                    nextLevel.push(node.left);
                }
                 if(node.right != null){
                    nextLevel.push(node.right);
                }
            }
            if(currentLevel.isEmpty()){
                returnList.add(levelList); //add the contents of current stack
                levelList = new ArrayList<Integer>(); //refresh levelList to get rid of root or contents inserted there
                currentLevel = nextLevel;
                nextLevel = new Stack<TreeNode>(); //refresh for nextlevel stack
                direction = !direction; //set the opposite for zizag
            }
        }
        return returnList;    
    }
}