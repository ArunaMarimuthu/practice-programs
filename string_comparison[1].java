  
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    String str="zohocorporation port";
    int n=str.length();
    String half="";
    for(int i=0;i<n;i++)
    {
      if(str.charAt(i)==' ')
      {
       for(int j=i+1;j<n;j++)
        {
          half+=str.charAt(j);
        }
      }
    }
    print(str,half);
  }
  
  
  static void print(String str,String half)
  {
    int m=half.length();
    int n=str.length();
    List<Integer> l=new ArrayList<>();
    for(int i=0;i<m;i++)
    {
     for(int j=0;j<n;j++)
      {
        if(str.charAt(j)==half.charAt(i))
        {
          l.add(j);
          break;
        }
      }
    }
    Collections.sort(l);
    int Size=l.size();
    int source=l.get(0);
    int desti=l.get(Size-1);
    for(int i=source;i<=desti;i++)
    {
      System.out.print(str.charAt(i));
    }
  }
}