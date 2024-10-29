class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer>mp = new HashMap<>();
        List<Integer>ans= new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(Integer j:mp.keySet()){
            if(mp.get(j)>n/3){
               ans.add(j);
            }
        }
        return ans;
    }
}