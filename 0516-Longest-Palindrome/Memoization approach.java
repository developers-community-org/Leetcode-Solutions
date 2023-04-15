class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return lcs(s,sb.toString());
    }
    public int lcs(String s,String t){
        int dp[][]=new int[s.length()+1][t.length()+1];
        for(int i=0;i<=s.length();i++)
            Arrays.fill(dp[i],-1);
        return helper(s.length(),t.length(),s,t,dp);
    }
    int helper(int i,int j,String s,String t,int dp[][]){
        if(i==0 || j==0)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(s.charAt(i-1)==t.charAt(j-1)){
            return dp[i][j]=1+helper(i-1,j-1,s,t,dp);
        }
        else
            return dp[i][j]=Math.max(helper(i-1,j,s,t,dp),helper(i,j-1,s,t,dp));
    }
}
