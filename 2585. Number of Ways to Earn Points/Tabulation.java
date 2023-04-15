class Solution {
    public int waysToReachTarget(int target, int[][] types) {
        int mod=1000000007;
        int n=types.length;
        int dp[][]=new int[n+1][target+1];
        for(int i=0;i<=n;i++)
        dp[i][0]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){
                int count=types[i-1][0];
                int val=types[i-1][1];
                int res=0;
                for(int ind=0;ind<=count;ind++){
                    int currv=val*ind;
                    if(currv<=j){
                        res=(res%mod + dp[i-1][j-currv]%mod)%mod;
                    }
                }
                dp[i][j]=res;
            }
        }
        return dp[n][target];
    }
}
