class Solution {
    public int maxProfit(int[] prices) {
        int s1=Integer.MAX_VALUE;
        int s2=Integer.MAX_VALUE;
        int p1=Integer.MIN_VALUE;
        int p2=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            s1=Math.min(prices[i],s1);
            p1=Math.max(p1,prices[i]-s1);
            s2=Math.min(s2,prices[i]-p1);
            p2=Math.max(p2,prices[i]-s2);
        }
        return p2;
    }
}