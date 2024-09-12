class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int min_val=prices[0];
        int max_profit=0;
        for(int i=0;i<prices.size();i++){
            int cost=prices[i]-min_val;
            max_profit= max(max_profit,cost);
            min_val=min(min_val,prices[i]);
        }
        return max_profit;
    }
};