class crosspattern
{
  public static void main(String args[])
  {
    String s="Aruna";
    int n=s.length();
    char c[][]=new char[n][n];
    for(int i=0,j=0;i<n&&j<n;i++,j++){
      c[i][j]=s.charAt(i);
    }
    for(int i=n-1,j=0;i>=0&&j<n;i--,j++)
    {
      c[i][j]=s.charAt(i);
    }
    for(char h[]:c)
    {
      for(char k:h)
      {
        System.out.print(k+" ");
      }
      System.out.println();
    }
    
  }
}