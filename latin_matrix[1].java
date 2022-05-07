class latinmatrix
{
  public static void main(String args[])
  {
    int n=6;
    print(n);
  }
  
  public static void print(int n)
  {
    int j;
    int next;
    int temp=n;
    for(int k=1;k<=n;k++)
    {
      for(j=1;j<=temp;j++)
      {
        System.out.print(j+" ");
        
      }
      next=j-1;
      System.out.println();
      if(k!=n)
      {
      while(next<=n)
      {
        System.out.print(next+" ");
        next++;
      }
      temp--;
      }
      
    }
  }
}