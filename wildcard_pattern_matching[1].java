class patternmatching
{
  public static void main(String args[])
  {
    String str="baaabab";
    String pattern="b*ab";
    int n=str.length();
    int m=pattern.length();
    if(wildcard(str,pattern,n,m))
    {
      System.out.println("true");
    }
    else
    {
      System.out.println("false");
    }
  }
  
  static boolean wildcard(String str,String pattern,int n,int m)
  {
    boolean dp[][]=new boolean[n+1][m+1];
    dp[0][0]=true;
    for(int i=1;i<=n;i++)
    {
      dp[i][0]=false;
    }
    for(int j=1;j<=m;j++)
    {
      dp[0][j]=false;
    }
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=m;j++)
      {
        if((pattern.charAt(j-1)==str.charAt(i-1))||(pattern.charAt(j-1)=='?'))
        {
          dp[i][j]=dp[i-1][j-1];
        }
        else if(pattern.charAt(j-1)=='*')
        {
          dp[i][j]=dp[i][j-1]||dp[i-1][j];
        }
        else
        {
          dp[i][j]=false;
        }
      }
    }
    return dp[n][m];
  }
}