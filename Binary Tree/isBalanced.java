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
	
	public static boolean checkBalanced(BinaryTreeNode<Integer> root){
		if(root==null){
            return true;
        }
       int lh= height(root.left);
       int rh= height(root.right);
        
        if(Math.abs(lh-rh)<=1&&checkBalanced(root.left)&&
        checkBalanced(root.right)){
            return true ; 
        }
       
          return false;
	}
    public static int height(BinaryTreeNode<Integer> root) {
	
	if(root==null){
        return 0;
    }
        
        int l=height(root.left);
        int r=height(root.right);
        if(l>r){
          return l+1;  
        }
        else{
            return r+1;
        }
	}

	
	
}
