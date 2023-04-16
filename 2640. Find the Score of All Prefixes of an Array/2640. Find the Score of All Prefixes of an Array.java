class Solution {
    public long[] findPrefixScore(int[] nums) {
        long res[]=new long[nums.length];
        long max=nums[0];
        res[0]=nums[0]*2;
        for(int i=1;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            res[i]=nums[i]+max+res[i-1];
        }
        return res;
    }
}
