class Solution {
    public int climbStairs(int n) {
        
        Map<Integer,Integer> memo= new HashMap<Integer,Integer>();
        
        memo.put(0,0);
        memo.put(1,1);
        memo.put(2,2);
        

            return calculate_ways(n,memo);
        
    }
    
    int calculate_ways(int n , Map<Integer,Integer> memo)
    {
        if(memo.containsKey(n))
            return memo.get(n);
        
            
        memo.put(n,calculate_ways(n-1,memo)+calculate_ways(n-2,memo));
        return memo.get(n);
    }
}