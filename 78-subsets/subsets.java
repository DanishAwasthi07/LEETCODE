class Solution {
    public void SubSet(int idx,int[]arr,List<List<Integer>>ans,List<Integer>ds){
        ans.add(new ArrayList<>(ds));
        for(int i=idx;i<arr.length;i++){
            if(i>idx &&arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);
            SubSet(i+1,arr,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans= new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        SubSet(0,nums,ans,ds);
        return ans;
    }
}