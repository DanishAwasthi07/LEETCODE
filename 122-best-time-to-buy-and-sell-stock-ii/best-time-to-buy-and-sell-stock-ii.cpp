class Solution {
public:
    int maxProfit(vector<int>&arr) {
        int max=0,sum=0;
        for(int i=0;i<arr.size()-1;i++){
            if(arr[i]<arr[i+1]){
                max=arr[i+1]-arr[i];
                sum+=max;
            }
        }
        return sum;
    }
};