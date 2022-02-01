class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length==0)
            return 0;
        
        int ans=0;
        
        int buy_price=prices[0];
        
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>buy_price)
            {
                if(ans< (prices[i]-buy_price))
                    ans=prices[i]-buy_price;
            }
            else
            {
                buy_price=prices[i];
            }
        }
        
        return ans;
        
        
    }
}