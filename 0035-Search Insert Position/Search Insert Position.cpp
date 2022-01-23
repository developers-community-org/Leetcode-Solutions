class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int answer=0;
        int n = nums.size();
        for(int i=0;i<n;i++){
            if(target == nums[i]){
                answer = i;
                break;
            }
            else if(nums[i]>target){
                answer = i;
                break;
            }
            else if(i == n-1){
                answer = n;
            }
            
            
        }
    return answer;
    }
};
