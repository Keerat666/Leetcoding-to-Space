class Solution {
    public int majorityElement(int[] nums) {
        
        int freq=nums.length/2;
        
        HashMap <Integer,Integer> frequency = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(frequency.containsKey((Integer)nums[i]))
            {
                int n= frequency.get(nums[i])+1;
                frequency.put(nums[i],n);
            }
            else
            {
                frequency.put(nums[i],1);
            }
        }
        
for (Integer key : frequency.keySet()) 
{
   if(frequency.get(key)>freq)
       return key;
}
        return 0;
    }
}