class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int result[]; 
        int p = 0;
        
        result = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            if (nums[i] % 2 == 0)
            {
                result[p] = nums[i];
                p++;
            } 
                
        for (int i = 0; i < nums.length; i++)
            if (nums[i] % 2 != 0)
            {
                result[p] = nums[i];
                p++;
            } 
        return result;
    }
}