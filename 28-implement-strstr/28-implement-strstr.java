class Solution {
    public int strStr(String haystack, String needle) {
        int ans=0;
        
        if(needle.equals(""))
            return ans;
        else
        {
            ans=haystack.indexOf(needle);
        }
        
        return ans;
        
    }
}