import java.util.Stack;

public class solution {
	
     static int count=0;
	public static boolean checkRedundantBrackets(String str) {
        
 Stack<Character> st = new Stack<Character>();
        for(int i=0;i<str.length();i++)
        {
            char curr=str.charAt(i);
          
            if(curr!=')')
                st.push(curr);
         
            else
            {
                while(st.peek()!='(')
                {
                    count++;
                    st.pop();
                }
                st.pop();
                
               
                if(count==0)
                    return true;
                
            }
          count=0;
           
        }
         return false;       

	}
}
