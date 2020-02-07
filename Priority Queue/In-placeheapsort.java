import java.util.*;
public class Solution {

    public static void insert(int arr[],int i){

        int childIndex = i;
        int parentIndex = (childIndex - 1) / 2;

        while(childIndex > 0){
            if(arr[childIndex] < arr[parentIndex]){
                int temp = arr[childIndex];
                arr[childIndex]= arr[parentIndex];
                arr[parentIndex]= temp;
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            }else{
                return;
            }
        }
    }

    public static int remove(int arr[],int size){
        int temp1=arr[0];
        int leftindex=1,rightindex=2;
        arr[0]=arr[size-1];
        size--;
        int index=0;
        int minindex=index;
        while(leftindex<size){
            if(arr[leftindex]<arr[minindex]){
                minindex=leftindex;
            }
            if(rightindex<size && arr[rightindex]<arr[minindex]){
                minindex=rightindex;
            }
            if(minindex!=index){
                int temp2=arr[index];
                arr[index]=arr[minindex];
                arr[minindex]=temp2;
                index=minindex;
                leftindex=2*index+1;
                rightindex=2*index+2;

            }
            else{
                break;
            }

        }
        return temp1;
    }   







    public static void inplaceHeapSort(int input[]) {

        for(int i=0;i<input.length;i++)
            insert(input,i);

         for(int i=0;i<input.length;i++)
        input[input.length-1-i]=remove(input,input.length-i);

//         for(int i=0;i<input.length;i++){
//             System.out.print(input[i]+" ");
//         }
    }
}
