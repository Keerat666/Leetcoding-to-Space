class Solution {
    public int removeDuplicates(int[] nums) {
        
        Set <Integer> set = new HashSet<Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        
        Object[] namesArray = set.toArray();
        Arrays.sort(namesArray);
        for (int i = 0; i < namesArray.length; i++) 
        {
                nums[i]=(int)namesArray[i];
        }
        
        return set.size();
        
    }
}