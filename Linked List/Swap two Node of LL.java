


/*
class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
* */
public class Solution {
	public static  LinkedListNode<Integer> swap_nodes(LinkedListNode<Integer> head,int i,int j){
        
         LinkedListNode<Integer>curr1=null;
         LinkedListNode<Integer>curr2=null;
          LinkedListNode<Integer>temp=head;
        int count=0;
        while(temp!=null)
        {
            if(count==i)
                curr1=temp;
            else if(count==j)
                curr2=temp;
            count++;
            temp=temp.next;    
        }
        int n=curr1.data;
        curr1.data=curr2.data;
        curr2.data=n;
		return head;
	}
}
