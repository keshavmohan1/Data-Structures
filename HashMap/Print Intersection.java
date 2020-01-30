import java.util.*;
public class Intersection{

    public static void intersection(int[] arr1, int[] arr2){
        HashMap<Integer,Integer>hm=new HashMap<>();

        for(int i=0;i<arr1.length;i++){

            if(hm.containsKey(arr1[i])){
                int freq=hm.get(arr1[i]);
                freq++;
                hm.put(arr1[i],freq);
            }else{
                hm.put(arr1[i],1);
            }
        }
        for(int i=0;i<arr2.length;i++){

            if(hm.containsKey(arr2[i])){
                int value=hm.get(arr2[i]);
                    if(value>0){
                        System.out.println(arr2[i]);
                        hm.put(arr2[i],value-1);
                    }
            }
        }


    }
}
