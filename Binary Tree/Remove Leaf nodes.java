import java.util.ArrayList;


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

	public static BinaryTreeNode<Integer> removeAllLeaves(BinaryTreeNode<Integer> root){
		
		
        if(root==null){
            return null;
        }
        if(root.left==null && root.right==null){
            return null;
        }
            BinaryTreeNode<Integer>l;
            BinaryTreeNode<Integer>r;
            root.left=removeAllLeaves(root.left);
            root.right=removeAllLeaves(root.right);
        // root.data=l.data;
        // root.data=r.data;
        return root;
        
	}



}
