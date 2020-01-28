// RECURSION SOLUTION
// public class Solution {


//     public static int mcm(int[] p){

//         return MatrixChainOrder(p,1,p.length-1);

//     }
//     static int MatrixChainOrder(int p[], int i, int j) 
//     { 
//         if (i == j) 
//             return 0; 

//         int min = Integer.MAX_VALUE; 

//         for (int k=i; k<j; k++) 
//         { 
//             int count = MatrixChainOrder(p, i, k) + 
//                 MatrixChainOrder(p, k+1, j) + 
//                 p[i-1]*p[k]*p[j]; 

//             if (count < min) 
//                 min = count; 
//         } 

//         return min; 
//     } 



// }

public class Solution {


    public static int mcm(int[] p){
        int n=p.length;
        int storage[][]=new int[n][n];
        // cost is zero when multiplying one matrix.
        for(int i=0;i<n;i++)
            storage[i][i]=0;

        for(int l=2;l<n;l++){
            for(int i=1;i<n-l+1;i++){
                int j=i+l-1;
                if(j==n)
                    continue;
                storage[i][j] = Integer.MAX_VALUE; 
                for (int k=i; k<=j-1; k++) 
                { 
                    // q = cost/scalar multiplications 
                   int q = storage[i][k] + storage[k+1][j] + p[i-1]*p[k]*p[j]; 
                    if (q < storage[i][j]) 
                        storage[i][j] = q; 
                } 
            }
        }
        
        return storage[1][n-1];
    }



}
