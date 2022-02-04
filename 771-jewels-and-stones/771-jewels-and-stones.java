class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        HashMap <Character, Integer> freq = new HashMap<Character,Integer>();
        
        for(int i=0;i<stones.length();i++)
        {
            char c= stones.charAt(i);
            
            if(freq.containsKey(c))
            {
                freq.put(c,freq.get(c)+1);
            }
            else
                freq.put(c,1);
        }
        
        int ans=0;
        
        for(int j=0;j<jewels.length();j++)
        {
            if(freq.containsKey(jewels.charAt(j)))
                ans+=freq.get(jewels.charAt(j));
        }
        
        return ans;
        
    }
}