class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int len = nums.length;
        int[] result = new int[len];
        List<Integer> temp = new ArrayList<>();

        for(int n : nums) temp.add(n);

        Collections.sort(temp);

        for (int i = 0 ; i < len ; i++) {
            result[i] = temp.indexOf(nums[i]);
        }

        return result;

        
    }
}