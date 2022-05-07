import java.util.*;
class permute
{
  public static void main(String args[])
  {
    String s="ABCA";
    Set<String> t=new TreeSet<>();
    permute("",s,t);
    System.out.print(t);
  }
  
  static Set<String> permute(String prefix,String s,Set<String> t)
  {
     
     int n=s.length();
     if(n==0)
     {
        t.add(prefix);
     }
     for(int i=0;i<n;i++)
     {
       permute(prefix+s.charAt(i),s.substring(0,i)+s.substring(i+1,n),t);
     }
     return t;
  }
}