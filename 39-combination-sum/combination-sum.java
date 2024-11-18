class Solution {
    public void CombSum(int idx,int[] arr,int target,List<List<Integer>>ans,List<Integer>ds){
        if(arr.length==idx){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[idx]<=target){
            ds.add(arr[idx]);
            CombSum(idx,arr,target-arr[idx],ans,ds);
            ds.remove(ds.size()-1);
        }
        CombSum(idx+1,arr,target,ans,ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans= new ArrayList<>();
        List<Integer>ds= new ArrayList<>();
        CombSum(0,candidates,target,ans,ds);
        return ans;
    }
}