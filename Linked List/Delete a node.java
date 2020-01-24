/*************** 
 * Following is the Node class already written 
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public Node(T data) {
		this.data = data;
	}
}
 ***************/

public class Solution {

	public static LinkedListNode<Integer> deleteIthNode(LinkedListNode<Integer> head, int i){
        int count=1;
        LinkedListNode<Integer>temp=head;
               LinkedListNode<Integer>temp1=head;
        int count1=0;
while(temp1!=null)
{
   ++count1;
    temp1=temp1.next;
}
        if(i>=count1)
            return head;
        
       else  if(i==0)
        {
            head=temp.next;
            return head;
        }   
        
		while(temp!=null)
        {
            if(count==i)
            {
                temp.next=temp.next.next;
            }
             ++count;
            temp=temp.next;
           
          
        }            
		return head;
	}
}
