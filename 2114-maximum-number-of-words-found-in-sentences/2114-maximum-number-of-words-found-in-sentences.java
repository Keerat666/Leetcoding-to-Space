class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int ans=0;
        
        for(int i=0;i<sentences.length;i++)
        {
            String s = sentences[i].toLowerCase();
            int v_count=0;
            for(int j=0;j<s.length();j++)
            {
                char c = s.charAt(j);
                
                if(c == ' ')
                    v_count++;
            }
            
            if(v_count>=ans)
            {
                ans=v_count+1;
            }
           
        }
        
        return ans;
        
    }
}