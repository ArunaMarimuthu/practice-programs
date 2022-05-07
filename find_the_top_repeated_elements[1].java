import java.util.*;
class main
{
  public static void main(String args[])
  {
    Integer a[]={3,4,2,3,16,15,16,15,15,16,2,3};
    List<Integer> l=new ArrayList<>();
    List<Integer> A=Arrays.asList(a);
    sort(a,A);
    remdup(A);
  }
  
  static void sort(Integer a[],List<Integer> A)
  {
 
    int n=a.length;
    Map<Integer,Integer> m=new HashMap<>();
    for(int i=0;i<n;i++)
    {
     m.put(A.get(i),m.getOrDefault(A.get(i),0)+1);
    }
    Collections.sort(A,(i,j)->{
      int val1=m.get(i);
      int val2=m.get(j);
      if(val1!=val2)
      {
        return (val1<val2)?1:-1;
      }
      else
      {
        return 0;//lambda expression should return something
      }
    });
  }
   
   static void remdup(List<Integer> A)
   {
     Set<Integer> s=new LinkedHashSet<>();
     for(int i:A)
     {
       s.add(i);
     }
     List<Integer> New=new ArrayList<>(s);
     for(int i=0;i<3;i++)
     {
       System.out.print(New.get(i)+" ");
     }
   
    /* List<Integer> New=new ArrayList<>();
     for(Integer ele:A)
     {
       if(!New.contains(ele))
       {
         New.add(ele);
       }
     }
     System.out.print(New);*/
       
     /* int so=0;
     int de=3;
     
     
   /* for(Integer i:s)
     {
       if(so<de)
         System.out.print(i+" ");
       so++;
     }*/
       
   } 
}
  
  