import java.util.Scanner;
class main
{
  
  static void bubblesort(int arr[])
  {
    int n=arr.length;
    for(int i=0;i<n;i++)
    {
      for(int j=1;j<n;j++)
      {
        if(arr[j-1]>arr[j])
        {
          int temp=arr[j-1];
          arr[j-1]=arr[j];
          arr[j]=temp;
        }
      }
    }
    System.out.println("array in ascending order");
    for(int l=0;l<n;l++)
      {
        System.out.println(arr[l]+" ");
      }
  }
  static void occurence(int arr[])
  {
    int n=arr.length;
    
    int j;
    for(int i=0;i<n;i=j)
    {
      int count=1;
      for(j=i+1;j<n;j++)
      {
        if(arr[i]==arr[j])
        {
          count++;
        }
        else
        {
          break;
        }
      }
      System.out.println("num is"+arr[i]+"count is"+count);
      System.out.println("i is"+i+"j is"+j);
    }
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the elements");
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    bubblesort(arr);
    occurence(arr);
  }
}