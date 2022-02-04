class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        HashMap  <Integer,Integer> index = new HashMap<Integer, Integer>();
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(index.containsKey(nums[i]))
            {
                index.put(nums[i],index.get(nums[i])+1);
            }
            else
                index.put(nums[i],1);
        }
        
        for (Integer key : index.keySet()) 
        {
           if(index.get(key)>1)
               
           {
               int n= index.get(key);
               ans+=(n*(n-1))/2;
           }
        }
             
            
                          
        return ans;
        
    }
}