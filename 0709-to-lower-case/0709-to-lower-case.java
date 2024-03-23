class Solution {
    public String toLowerCase(String s) {
        
        char[] charArray = s.toCharArray();   
        for (int i = 0; i < charArray.length; i++) 
        {
            if (Character.isUpperCase(charArray[i])) 
                charArray[i] = Character.toLowerCase(charArray[i]);
        
        }
        String lowercaseString = new String(charArray);
        return lowercaseString; 

    }
}

//Hello -> .toLowerCase() -> H e l l O -> 