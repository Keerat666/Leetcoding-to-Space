class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        
        int count=0;
        
        String first=strs[0];
        String last = strs[strs.length-1];
        
        while(count<first.length())
        {
            if(first.charAt(count)==last.charAt(count))
                count++;
            else
                break;
        }
        
        return count==0 ? "": first.substring(0,count);
        
    }
}