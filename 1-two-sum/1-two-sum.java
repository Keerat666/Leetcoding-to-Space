class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap hm = new HashMap<Integer, Integer>();
        int ans[]=new int[2];
        
        for(int i=0;i<nums.length;i++)
        {
            int sub=target-nums[i];
            
            hm.put(sub,i);
        }
        
        for(int i=0;i<nums.length;i++)
        {
            int req=nums[i];
            
            if(hm.containsKey(req))
            {
                if(i != (int)hm.get(req))
                {
                    ans[0]=i;
                    ans[1]=(int)hm.get(req);
                    return ans;
                }

            }
        }
        
        return ans;
        
    }
}