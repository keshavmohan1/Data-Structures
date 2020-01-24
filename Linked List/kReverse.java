
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
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
        
        LinkedListNode<Integer>curr=head;
        LinkedListNode<Integer>pre=null;
        LinkedListNode<Integer>next1=null;
        int count=0;
        while(count<k && curr!=null)
        {
            next1=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next1;
            count++;
        }
        if(next1!=null)
            head.next=kReverse(next1,k);
        return pre;
        
    }
}
