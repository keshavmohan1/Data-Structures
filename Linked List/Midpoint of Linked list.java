
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
	public static int printMiddel(LinkedListNode<Integer> head) {
       LinkedListNode<Integer> slow=head;
       LinkedListNode<Integer> fast=head;
        while(fast.next.next!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        int s=slow.data;
        return s;
        
        
        
        
    }
}
