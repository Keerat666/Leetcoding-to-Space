class Solution {
    public boolean isHappy(int n) {
        
        int sum=getSumofDG(n);
        String str=""+sum;
        int t=0;
        while(str.length()!=1)
        {
            t=getSumofDG(sum);
            sum=t;
            str=""+sum;
        }
        
        if(Integer.parseInt(str)==1 || Integer.parseInt(str) == 7)
            return true;
        else
            return false;
        
    }
    
    public static int getSumofDG(int n)
    {
        int sodg=0;
        
        while(n>0)
        {
            int dg=n%10;
            sodg+=(dg*dg);
            n=n/10;
        }
        
        return sodg;
    }
}