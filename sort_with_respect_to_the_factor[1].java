/*Sort the given elements in decending order
based on the number of factors of each element
Input : {5, 11, 10, 20, 9, 16, 23}
Output : 20 16 10 9 5 11 23
Number of distinct factors:
For 20 = 6, 16 = 5, 10 = 4, 9 = 3
and for 5, 11, 23 = 2 (same number of factors
therefore sorted in increasing order of index)*/
import java.util.*;
class main
{
  public static void main(String args[])
  {
    Integer a[]={5,11,10,20,9,16,23};
    List<Integer> l=Arrays.asList(a);
    List<Integer> c=new ArrayList<>();
    int count=0;
    Map<Integer,Integer> m=new HashMap<>();
    for(int i:a){
      count=0;
      int no=i;
      for(int j=1;j<=no;j++){
        if(no%j==0){
          count++;
        }
      }
      c.add(count);
    }
   for(int i=0;i<l.size();i++)
   {
     m.put(l.get(i),c.get(i));
   }
   Collections.sort(l,(i,j)->{
     int v1=m.get(i);
     int v2=m.get(j);
     return v1>v2?-1:1;
   });
   System.out.println(l);
  }
}

