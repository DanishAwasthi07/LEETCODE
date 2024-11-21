class Solution {
    void backtrack(List<List<Integer>> result, List<Integer> temp, int start, int n, int k){
        if(temp.size()==k){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<=n;i++){
            temp.add(i);
            backtrack(result,temp,i+1,n,k);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> ds= new ArrayList<>();
        backtrack(res,ds,1,n,k);
        return res;
    }
}