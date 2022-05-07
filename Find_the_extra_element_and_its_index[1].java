/*Input : [ 10, 20, 30, 12, 5 ]
    [ 10, 5, 30, 20 ]
Output : 12 is the extra element in array 1 at index 4

Input : [ -1, 0, 3, 2 ]
    [ 3, 4, 0, -1, 2 ]
Output : 4 is the extra element */


import java.util.*;
 class main
 {
   public static void main(String args[])
   { 
    int a[]={10,20,30,12,5};
    int b[]={10,5,30,20};
    int flag=1;
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<b.length;j++)
      {
          if(a[i]==b[j])
          {
            flag=1;
            break;
          }
          else
          {
            flag=0;
          }
        }
      
      if(flag==0)
      {
        System.out.print(a[i]+" is the extra element at index "+i);
      }
    }
   }
 }
