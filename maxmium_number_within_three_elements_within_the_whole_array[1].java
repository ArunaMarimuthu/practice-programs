/*Given an array of numbers and a window of
 size k. Print the maximum of numbers inside 
 the window for each step as the
 window moves from the beginning of the array.
Input Format
Input contains the array size , no of elements
 and the window size
Output Format
print the maximum of numbers

Sample Input 1
8
1 3 5 2 1 8 6 9
3
Sample Output 1
5 5 5 8 8 9*/
  
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    int arr[]={33,86,39,55,87,47,66,75,58,17,37,13};
    int n=arr.length;
    int m=9;
  
    for(int j=0;j<m;j++)
    {
      if(m<=n)
      {
        int max=arr[j];
        for(int k=j+1;k<m;k++)
        {
          if(max<arr[k])
            max=arr[k];
        }
        System.out.print(max+" ");
        m++;
      }
      else
      {
         break;
      }
   }
 }
  
}