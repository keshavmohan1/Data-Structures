import java.util.*;

/*
	- You are given an integer array containing positive and negative numbers.
	- Your task is to find out the length of the longest continuous subset of this array whose elements add upto zero.

*/

public class solution 
{
    public static int lengthOfLongestSubsetWithZeroSum(ArrayList<Integer> arr) 
   	{
      
		 HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>(); 
  
        int sum = 0; // Initialize sum of elements 
        int max_len = 0; // Initialize result 
  
        // Traverse through the given array 
        for (int i = 0; i < arr.size(); i++) { 
            // Add current element to sum 
            sum += arr.get(i); 
  
            if (arr.get(i) == 0 && max_len == 0) 
                max_len = 1; 
  
            if (sum == 0) 
                max_len = i + 1; 
  
            // Look this sum in hash table 
            Integer prev_i = hM.get(sum); 
  
            // If this sum is seen before, then update max_len 
            // if required 
            if (prev_i != null) 
                max_len = Math.max(max_len, i - prev_i); 
            else // Else put this sum in hash table 
                hM.put(sum, i); 
        } 
  
        return max_len; 
    } 

	}

