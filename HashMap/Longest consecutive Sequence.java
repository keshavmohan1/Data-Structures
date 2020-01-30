import java.util.*;
public class Solution {
    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        HashMap<Integer,Boolean>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            
                map.put(arr[i],false);
            
            
        }
        //finding leader element
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]-1)){
                map.put(arr[i],true);
            }
            else{
                //do nothing
            }
        }
        //final step
        int leader=-1;
        int length=0;
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==false){
                int mylen=0;
                int temp=arr[i];
               // System.out.print("H"+temp);
                while(map.containsKey(temp)){
                    mylen++;
                    temp++;
                }
                if(mylen>length){
                    leader=arr[i];
                    length=mylen;
                }else {
                    //nothing
                }
            }
        }

        //4. Create ArrayList
        ArrayList<Integer> mylist= new ArrayList<>();
        for(int lv=leader; lv<(length+leader); lv++)
        {
            mylist.add(lv);
        }
        return mylist;
    }





}
