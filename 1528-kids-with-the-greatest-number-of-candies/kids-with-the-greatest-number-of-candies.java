class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int extraCandies) {
        List<Boolean>ans= new ArrayList<>();
        int max=0;
        for(int i=0;i<=arr.length-1;i++){
            max=Math.max(arr[i],max);
        }
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]+extraCandies>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}