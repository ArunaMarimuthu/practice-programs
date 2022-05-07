class Main
{
  public static void main(String args[])
  {
    String s="asdfghij";
    String d="adsfgijh";
    char a[]=s.toCharArray();
    char b[]=d.toCharArray();
    mismatch(a,b);
  }
  
  static void mismatch(char a[],char b[])
  {
    int n=a.length;
    int m=b.length;
    int j=0;
    for(int i=0;i<n;i=j)
    {
      if(a[i]==b[i])
      {
       j++;
       continue;
      }
      else
      {
        for(j=i;j<n&&a[j]!=b[j];j++)
        {
           System.out.print(a[j]);                       
        }
        
        System.out.print("-");
        
        for(int k=i;k<n&&a[k]!=b[k];k++)
        {
          System.out.print(b[k]);
        }
      }
      System.out.println();
    }
  }
}