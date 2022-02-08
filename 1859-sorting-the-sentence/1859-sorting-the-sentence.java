class Solution {
    public String sortSentence(String s) {
        
        
        String words[]=new String[s.split(" ").length];
        words = s.split(" ");
        String ans[]=new String[s.split(" ").length];;
        for(int i=0;i<ans.length;i++)
        {
           int index=Integer.parseInt(words[i].charAt(words[i].length()-1)+"")-1;
           ans[index]=words[i].substring(0,words[i].length()-1);
        }
        
        String ans2="";
        
        for(int j=0;j<ans.length;j++)
            ans2=ans2+" "+ans[j];
        return ans2.trim();
    }
}