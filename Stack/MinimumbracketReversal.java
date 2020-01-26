import java.util.*;

public class Solution {

	
	// Function returns -1 if brackets can't be balanced
	public static int countBracketReversals(String expr){
		 int len = expr.length(); 
      int count=0;
        int r=0;
        int f=0;
     if (len%2 != 0)
        return -1; 
      
      
        Stack<Character> s=new Stack<>(); 
          
        for (int i=0; i<len; i++) 
        { 
            char c = expr.charAt(i);
            if(c=='}' && !s.isEmpty()){
                if(s.peek()=='{'){
                s.pop();
                count--;
                   }else{
                    s.push(c);
                    count++;   
                }
            }
            else{
                s.push(c);
                count++;
            }
              
          
        }
        while(!s.isEmpty() && s.peek()=='{'){
            s.pop();
            f++;
        }
//System.out.println(count);
     
        if(count>=1)
         r=count/2;
        
        return r+f%2;
        
	}
	
	

}
