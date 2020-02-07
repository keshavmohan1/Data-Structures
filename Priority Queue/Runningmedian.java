import java.util.Collections; 
import java.util.PriorityQueue; 
public class Solution {
      
    // method to calculate med of stream  
    public static void runningMedian(int[] a) 
    { 
          
        int med = a[0]; 
          
        // max heap to store the smaller half elements  
        PriorityQueue<Integer> smaller = new PriorityQueue<> 
        (Collections.reverseOrder()); 
          
        // min heap to store the greater half elements  
        PriorityQueue<Integer> greater = new PriorityQueue<>(); 
          
        smaller.add(a[0]); 
        System.out.println(med); 
          
        // reading elements of stream one by one  
        /* At any time we try to make heaps balanced and  
            their sizes differ by at-most 1. If heaps are  
            balanced,then we declare median as average of  
            min_heap_right.top() and max_heap_left.top()  
            If heaps are unbalanced,then median is defined  
            as the top element of heap of larger size */
        for(int i = 1; i < a.length; i++) 
        { 
              
            int x = a[i]; 
              
            // case1(left side heap has more elements)  
            if(smaller.size() > greater.size()) 
            { 
                if(x < med) 
                { 
                    greater.add(smaller.remove()); 
                    smaller.add(x); 
                } 
                else
                    greater.add(x); 
                med = (int)(smaller.peek() + greater.peek())/2; 
            } 
              
            // case2(both heaps are balanced)  
            else if(smaller.size() == greater.size()) 
            { 
                if(x < med) 
                { 
                    smaller.add(x); 
                    med = (int)smaller.peek(); 
                } 
                else
                { 
                    greater.add(x); 
                    med = (int)greater.peek(); 
                } 
            } 
              
            // case3(right side heap has more elements)  
            else
            { 
                if(x > med) 
                { 
                    smaller.add(greater.remove()); 
                    greater.add(x); 
                } 
                else
                    smaller.add(x); 
                med = (int)(smaller.peek() + greater.peek())/2; 
                  
            } 
            System.out.println(med); 
        } 
    } 
	}

