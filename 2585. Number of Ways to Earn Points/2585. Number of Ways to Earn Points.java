class Solution {
    int mod=1000000007;
    public int waysToReachTarget(int target, int[][] types) {
        int n=types.length;
        int dp[][]=new int[n+1][target+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(n-1,target,types,dp);
    }
    public int helper(int ind,int tar,int types[][],int dp[][]){
        if(tar==0)
            return 1;
        if(ind<0)
            return 0;
        if(dp[ind][tar]!=-1) return dp[ind][tar];
        int count=types[ind][0];
        int val=types[ind][1];
        int res=0;
        for(int i=0;i<=count;i++){
            int currv=val*i;
            if(currv<=tar){
                res=(res%mod + helper(ind-1,tar-currv,types,dp)%mod)%mod;
            }
        }
        return dp[ind][tar]=res;
    }
}
