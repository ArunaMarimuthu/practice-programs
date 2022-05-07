/*Ex I/p abcccccbba

O/p 8 (from a to a)

I/p aaaaaaaa

O/p 6*/
  
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    String s="abcccccbbazxfc";
    int n=s.length();
    int count=0;
    List<Integer> l=new ArrayList<>();
    for(int i=0;i<n;i++)
    {
      count=0;
      for(int j=i+1;j<n;j++)
      {
        if(s.charAt(i)!=s.charAt(j))
        {
          count++;
        }
        else
        {
          l.add(count);
          count++;
        }
      }
    }
    int max=l.get(0);
    for(int i:l)
    {
      if(i>max)
      {
        max=i;
      }
    }
    System.out.println(max);
  }
}