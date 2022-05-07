/*Given two Strings s1 and s2, 
remove all the characters from s1 which 
is present in s2.

Input: s1=”expErIence”, s2=”En”
output: s1=”exprIece”*/
  
  
class main
{
  public static void main(String args[])
  {
    String s1="expErlence";
    String s2="En";
    char s[]=s1.toCharArray();
    char c[]=s2.toCharArray();
    int n=s.length;
    int m=c.length;
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(s[j]==c[i])
        {
          s[j]='0';
        }
      }
    }
    
    for(char p:s)
    {
      if(p!='0')
      {
        System.out.print(p);
      }
        
    }
  }
}