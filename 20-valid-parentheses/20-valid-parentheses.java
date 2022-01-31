class Solution {
    public boolean isValid(String s) {
        
        
       if(s.length()%2 !=0)
           return false;
        
      Stack stk = new Stack();  

       for(int i=0;i<s.length();i++)
       {
           if(s.charAt(i)== '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
               stk.push(s.charAt(i));
           else
           {
               if(!stk.empty())
               {
                       char p = (char)stk.pop();
                       if(p == '(' && s.charAt(i)==')')
                           continue;
                       else if(p == '[' && s.charAt(i)==']')
                           continue;
                       else if(p == '{' && s.charAt(i)=='}')
                           continue;
                       else
                           return false;
               }
               else
                   return false;

           }
       }
if(stk.empty())
    return true;
else
    return false;
    }
    
}