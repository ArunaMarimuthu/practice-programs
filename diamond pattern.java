class main
{
  public static void main(String args[])
  {
    int n=5;
   int mid=n/2;
   int s1=0;
   int s2=n-1;
   for(int i=0;i<n;i++){
     int space=Math.abs(mid-s1);
     s1++;
     for(int j=0;j<space;j++){
       System.out.print("  ");
     }
     int star=n-Math.abs(s2);
     for(int k=0;k<star;k++)
     {
       System.out.print("* ");
     }
     s2-=2;
     System.out.println();
   }
  }
  
}