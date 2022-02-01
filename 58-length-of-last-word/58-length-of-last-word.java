class Solution {
    public int lengthOfLastWord(String s) {
        
        boolean found_word=false;
        int ans=0;
        
        for(int i=s.length()-1;i>=0;i--)
        {
            if(!found_word && s.charAt(i)==' ')
                continue;
            else if(s.charAt(i)!=' ')
            {
                found_word=true;
                ans++;
            }
            else if(found_word && s.charAt(i)==' ')
                break;
                
        }
        
        return ans;
        
    }
}