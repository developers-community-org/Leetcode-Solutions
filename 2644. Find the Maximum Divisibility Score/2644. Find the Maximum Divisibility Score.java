class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int res=Integer.MAX_VALUE,max=0;
        for(int i=0;i<divisors.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]%divisors[i]==0)
                    c++;
            }
            if(c>max){
                max=c;
                res=divisors[i];
            }
            else if(c==max){
                res=Math.min(divisors[i],res);
            }
        }
        return res;
    }
}
