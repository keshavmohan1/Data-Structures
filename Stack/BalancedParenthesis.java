import java.util.*;
public class Solution {

	public static boolean checkBalanced(String str) {
        
        if(str.isEmpty())
            return true;
        
 Stack<Character> st = new Stack<Character>();
        for(int i=0;i<str.length();i++)
        {
            char curr=str.charAt(i);
            if(curr=='{' || curr=='[' || curr=='('){
                st.push(curr);
            }
            if(curr=='}' || curr==']' || curr==')'){
                
                if(st.isEmpty())
            return false;
            
               char last=st.peek();
            if(curr=='}' && last=='{' || curr==')' && last=='(' || curr==']' && last=='[')
            st.pop();
            else
                return false;
            }
        }
    if(st.isEmpty())
        return true;
        else
            return false;
	}
}
