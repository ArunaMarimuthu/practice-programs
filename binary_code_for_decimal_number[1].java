import java.util.*;
class DecimaltoBinary
{
  public static void main(String args[])
  {
  int n=1;
    int m=0;
    if(n%2==0)
      m=(int)Math.pow(n,2);
    else if(n==1)
      m=2;
    else
      m=(int)Math.pow(n,2)-1;
    for(int i=0;i<m;i++)
    {
      int q=i;
      String s="";
      while(q>0)
      {
        int rem=q%2;
        q=q/2;
        s+=rem;
      }
      while(s.length()!=n)
      {
        s+='0';
      }
      for(int k=s.length()-1;k>=0;k--)
      {
        System.out.print(s.charAt(k)+" ");
      }
      System.out.println();
    }
   }
 }