class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int ans=0;
        int index=0;
        
        if(ruleKey.equals("color"))
            index=1;
        if(ruleKey.equals("name"))
            index=2;
        
        
        for(int i=0;i<items.size();i++)
        {
            List<String> obj =items.get(i);
            
            if(obj.get(index).equals(ruleValue))
                ans++;
            
        }
        
        return ans;
    }
}