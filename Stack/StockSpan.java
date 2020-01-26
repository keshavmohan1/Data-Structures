import java.util.*;
public class Solution {

	public static int[] stockSpan(int[] price) {
		Stack<Integer> s=new Stack<Integer>();
        int output[]=new int[price.length];
        s.push(0);
        output[0]=1;
        for(int i=1;i<price.length;i++){
            while(!s.isEmpty() && price[s.peek()]<price[i]){
                s.pop();
            }
            
            if(s.isEmpty()){
              output[i]=i+1;  
            }
            else{
               output[i]=i-s.peek(); 
            }
             s.push(i);   
        }
return output;
	}
}
