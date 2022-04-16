public class main
{
  static void removeeven(int arr[])
  {
    int n=arr.length;
    for(int i=0;i<n;i++)
    {
      if(arr[i]%2==0)
      {
        arr[i]=-1;
      }
      else
      { 
        System.out.print(arr[i]);
        
      }
    }
    for(int i=0;i<n;i++)
    {
     if(arr[i]==-1)
     {
       System.out.print(0);
     }
      
    }
    
    }
    public static void main(String[] args)
    {
      int arr[]={2,3,8,5,7,6};
      removeeven(arr);
    }
    
    
  
}