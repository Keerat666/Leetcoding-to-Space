class Solution {
    public String toLowerCase(String s) {
        
        String ans="";
        
        for(int i=0;i<s.length();i++)
        {
            int key=(int)s.charAt(i);
            
            if(key>=65 && key<=90)
            {
                key+=32;
            }
            
            char c = (char)key;
            ans+=c;
        }
        
        return ans;
        
    }
}