
public class Solution {

    public static int lis(int arr[]) {
        int n=arr.length;
        int storage[]=new int[n];
        int max=0;
        //initialize all value with 1
        for(int i=0;i<n;i++){
            storage[i]=1;
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] && storage[i]<storage[j]+1){
                    storage[i]=storage[j]+1;
                }
            }
        }
        //find max
        for (int i = 0; i < n; i++ ) 
            if ( max < storage[i] ) 
                max = storage[i]; 

        return max; 

    }	
}
