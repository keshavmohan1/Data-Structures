
public class Solution {
	
	
	
	public static int knapsack(int[] weight,int value[],int maxWeight){

	
        int n=weight.length;
        int dp[]=new int[maxWeight+1];
        
        for(int i=0;i<n;i++){
            dp[i]=0;
        }
		
        for(int i=0;i<n;i++){
            for(int j=maxWeight;j>=weight[i];j--){
                dp[j]=Math.max(dp[j],value[i]+dp[j-weight[i]]);
            }
        }
        return dp[maxWeight];
	}
	
}
