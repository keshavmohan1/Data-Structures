import java.util.*;

public class Solution{

    public static int minDistance(int[] arr){

        HashMap<Integer,Integer>map=new HashMap<>();

        int min_dist = Integer.MAX_VALUE    ; 
        int arr1[]=new int[arr.length];
        int b[]=new int[arr.length];
        int k=0;
        for (int i = 0; i < arr.length; i++) 
        { 

            if (!map.containsKey(arr[i])) 
                map.put(arr[i], i); 


            else{
                //int f=map.get(arr[i]);
               
                min_dist = Math.min(min_dist, i - map.get(arr[i])); 
                 map.put(arr[i],i);
                //System.out.print(f);

            } 
        }

        return min_dist; 
    } 
}


