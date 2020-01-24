
/*
class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}



}
* */
public class Solution {
	public static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> head) {
        LinkedListNode<Integer>eh=null;
        LinkedListNode<Integer>et=null;
        LinkedListNode<Integer>oh=null;
        LinkedListNode<Integer>ot=null;
        LinkedListNode<Integer>curr=head;
        
        while(curr!=null){
            
            int ele=(int)curr.data;
            if(ele%2==0)
            {
                if(eh==null){
                eh=curr;
                et=curr;
                } 
                else{
                et.next=curr;
                et=et.next;
                }
            }
           else{
               if(oh==null){
                   oh=curr;
                   ot=curr;
               }
               else{
                   ot.next=curr;
                   ot=ot.next;
               }
           }
            
            curr=curr.next;
        }
        if(oh==null){
            return eh;
        }
        ot.next=eh;    
        return oh;
	}
}
