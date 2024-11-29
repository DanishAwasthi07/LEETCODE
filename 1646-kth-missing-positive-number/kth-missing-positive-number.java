class Solution {
    public int findKthPositive(int[] arr, int k) {
        int miss=0;
        int curr=1;
        int idx=0;
        while(miss<k){
            if(idx<arr.length && arr[idx]==curr){
                idx++;
            }
            else{
                miss++;
                if(miss==k) return curr;
            }
            curr++;
        }
        return -1;
    }
}