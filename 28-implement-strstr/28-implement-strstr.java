class Solution {
    public int strStr(String haystack, String needle) {
        int ans=0;
        
        if(needle.equals(""))
            return ans;
        else
        {
            ans=-1;
            
            for(int i=0;i<haystack.length()-needle.length()+1;i++)
            {
                if(haystack.substring(i,i+needle.length()).equals(needle))
                {
                    ans=i;
                    break;
                }
            }
        }
        
        return ans;
        
    }
}