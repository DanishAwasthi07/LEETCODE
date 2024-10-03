class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        if(k<0) return 0;
        int n =nums.size();int count=0;
        sort(nums.begin(),nums.end());
        for(int i=0;i<n;i++){
             if (i>0 && nums[i]==nums[i-1]) continue;
             for(int j=i+1;j<n;j++){
                if(nums[j]-nums[i]==k){
                    count++;
                    break;
                }
                if (nums[j] - nums[i] > k) break;
                }
             }
        return count;
    }
};