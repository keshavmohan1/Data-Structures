import java.util.Stack;

public class Solution {

	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) {
		if(s1.size()==0)
            return;
        
        int a=s1.peek();
        s1.pop();
       s2.push(a);
        
        reverseStack(s1,s2);
        int freq1=s1.size();
        int freq=s1.size();
        while(freq!=0)
        {
        s2.push(s1.peek());
        s1.pop();
            freq--;
        }
        
        s1.push(a);
         
        while(freq1!=0)
        {
        s1.push(s2.peek());
        s2.pop();
            freq1--;
        }
        
        
        
	}
}
