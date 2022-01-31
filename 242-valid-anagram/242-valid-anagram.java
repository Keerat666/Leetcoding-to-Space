class Solution {
    public boolean isAnagram(String s, String t) {
        
        
        if(s.length() != t.length())
            return false;
        
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sorted_s = new String(chars);
       
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars2);
        String sorted_t = new String(chars2);
        
        if(sorted_s.equals(sorted_t))
            return true;
        else
            return false;
        
        
    }
}