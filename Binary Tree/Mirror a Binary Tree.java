
public class Solution {

/*	Binary Tree Node class
 * 
 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/
	
	public static void mirror(BinaryTreeNode<Integer> root){
	root=helper(root);
    }
  	public static BinaryTreeNode<Integer> helper(BinaryTreeNode<Integer> root){

        if(root==null){
            return root;
        }
        /* do the subtrees */
        BinaryTreeNode<Integer> left = helper(root.left); 
        BinaryTreeNode<Integer> right = helper(root.right); 
  
        /* swap the left and right pointers */
        root.left = right; 
       root.right = left; 
  
     return root;

	}
	
}
