import java.util.*;
class concentric
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n");
    int N=sc.nextInt();
    int size=N*2-1;
    int a[][]= new int[size][size];
    int start=0;
    int end=size-1;
    for(int k=0;k<N;k++)
    {
    for(int i=start;i<=end;i++)
    {
      for(int j=start;j<=end;j++)
      {
        if(i==start||j==start||i==end||j==end)
        {
        a[i][j]=N;
        }
       
      }
       
    }
    start++;
    end--;
    N--;
    }
    for(int i=0;i<size;i++)
    {
      
      for(int j=0;j<size;j++)
      {
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
  }
}