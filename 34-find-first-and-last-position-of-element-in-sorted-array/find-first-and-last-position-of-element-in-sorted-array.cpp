class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int> ans;
        int ans1 = -1, ans2 = -1;
        int s1 = 0, e1 = nums.size() - 1, mid1;
        while (s1 <= e1) {
            mid1 = s1 + (e1 - s1) / 2;
            if (nums[mid1] == target) {
                ans1 = mid1;
                e1 = mid1 - 1;
            } else if (nums[mid1] < target) {
                s1 = mid1 + 1;
            } else {
                e1 = mid1 - 1;
            }
        }
        int s2 = 0, e2 = nums.size() - 1, mid2;
        while (s2 <= e2) {
            mid2 = s2 + (e2 - s2) / 2;
            if (nums[mid2] == target) {
                ans2 = mid2;
                s2 = mid2+ 1;
            } else if (nums[mid2] < target) {
                s2 = mid2 + 1;
            } else {
                e2 = mid2 - 1;
            }
        }
        ans.push_back(ans1);
        ans.push_back(ans2);
        return ans;
    }};
