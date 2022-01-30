class Solution {
    public boolean isPalindrome(int x) {
        
        int dg_copy=x;
        int dg_rev=0;
        
        while(dg_copy>0)
        {
            int dg=dg_copy%10;
            dg_rev=(dg_rev*10)+dg;
            dg_copy=dg_copy/10;
        }
        
        if(dg_rev == x)
            return true;
        
        return false;
        
    }
}