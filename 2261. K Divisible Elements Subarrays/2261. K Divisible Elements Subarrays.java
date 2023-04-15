class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        HashSet<String> set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            StringBuilder sb= new StringBuilder();
            int count=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]%p==0) count++;
                if(count>k) break;
                
                sb.append(nums[j]+"-");
                set.add(sb.toString());
            }
        }
        return set.size();
    }
}
