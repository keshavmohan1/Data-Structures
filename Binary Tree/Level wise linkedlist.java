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

	/* class Node<T> {
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
		}
	}
*/
	public static ArrayList<Node<BinaryTreeNode<Integer>>> LLForEachLevel(BinaryTreeNode<Integer> root) {
		
        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<BinaryTreeNode<Integer>>();  // Queue of node that are entered themselves but their children aren't added yet
	   Node<BinaryTreeNode<Integer>> head= null;
	   Node<BinaryTreeNode<Integer>> tail= null;
      ArrayList<Node<BinaryTreeNode<Integer>>> output = new ArrayList<Node<BinaryTreeNode<Integer>>>();
	   Node<BinaryTreeNode<Integer>> newnode= new Node<BinaryTreeNode<Integer>>(null);
	  // Node<BinaryTreeNode<Integer>> tempp= new Node<BinaryTreeNode<Integer>>(null);

		pendingNodes.enqueue(root);
        pendingNodes.enqueue(null);
        
        
		while(!pendingNodes.isEmpty()){
            
            try {
                 
      
             if(pendingNodes.front()==null && !pendingNodes.isEmpty())
             {
                 pendingNodes.dequeue();
                 
                 if(head!=null){
                     output.add(head);
                 }
                head= null;
	            tail= null;
                  
                 if(pendingNodes.isEmpty() ==true)
                {
                    break;
                }
                 else
            pendingNodes.enqueue(null);
        }
       
                                          
                //remove
                   BinaryTreeNode<Integer> tempNode=pendingNodes.dequeue();
               
                //linking newnode 
                if(tempNode!=null){
                      	    newnode= new Node<BinaryTreeNode<Integer>>(tempNode);
         
                    
                }
                 
                 if(head==null && tail==null){
                    head=newnode;
                     tail=newnode;
                }  
                else{
                    tail.next=newnode;
                    tail=tail.next;
                }
                
                /*Enqueue left child */
                 if (tempNode.left != null ) { 
                pendingNodes.enqueue(tempNode.left); 
                  
                 }
  
            /*Enqueue right child */
            if (tempNode.right != null) { 
                pendingNodes.enqueue(tempNode.right); 
                
             } 
                
                
               
            
            }
        
				
            catch (QueueEmptyException e) {
			}
           
            
		}
           return output;        
		
	}
}
