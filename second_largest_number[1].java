class main
{
  public static void bublesort(int arr[])
  {
    int n=arr.length;
    for(int i=0;i<n;i++)
    {
      for(int j=1;j<n-i;j++)
      {
        if(arr[j-1]>arr[j])
        {
          int temp=arr[j-1];
          arr[j-1]=arr[j];
          arr[j]=temp;
        }
      }
    }
  }
  public static void main(String args[])
  {
    int arr[]={54,3,45,72,2,34,67};
    bublesort(arr);
    int n=arr.length;
    System.out.print(arr[n-2]);
  
  }
}