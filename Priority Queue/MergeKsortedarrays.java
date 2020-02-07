import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {

	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) {
		java.util.ArrayList<Integer> hm=new java.util.ArrayList<>();
        
        for(int i=0;i<input.size();i++){
            
            ArrayList<Integer> temp=new ArrayList<Integer>(input.get(i));
            for(int j=0;j<temp.size();j++){
                hm.add(temp.get(j));
            }
            
        }
        
        java.util.Collections.sort(hm);
        return hm;
	}

}
