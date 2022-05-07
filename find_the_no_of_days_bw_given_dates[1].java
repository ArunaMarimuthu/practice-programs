import java.util.*;
class Main
{
  public static void main(String args[])
  {
    int d1=10;
    int d2=10;
    int m1=2;
    int m2=3;
    int y1=2004;
    int y2=2004;
    int m[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
    int days=0;
    days+=Math.abs(d1-m[m1])+d2;
    for(int i=m1+1;i<m2;i++){
      days+=m[i];
    }
  
    int yr=Math.abs(y1-y2);
    if(y1%4==0||y1%100==0||y1%400==0||y2%4==0||y2%100==0||y2%400==0)
     days+=yr+1;
    else
     days+=yr;
    System.out.println(days);
  }
}