class Solution 
{
public:
    vector<vector<int>> threeSum(vector<int>& nums) 
    {
        vector<vector<int>> result;
        int nums_len = nums.size();
        int left, right, dif;
        sort(nums.begin(), nums.end());
        for (int i = 0; i < nums_len - 2; i++)
        {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i - 1] == nums[i]) continue;
            left = i + 1;
            right = nums_len - 1;
            dif = -nums[i];

            while (left < right) 
            {
                if (nums[left] + nums[right] == dif) 
                {
                    result.push_back({ nums[i], nums[left], nums[right] });
                    ++left;
                    while (left < right && nums[left - 1] == nums[left]) ++left;
                    --right;
                }
                else if (nums[left] + nums[right] < dif) 
                {
                    ++left;
                }
                else 
                {
                    --right;
                }
            }
        }
        return result;
    }
};
