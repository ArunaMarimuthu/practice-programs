/*. Pangram Checking
Check whether all english alphabets are present in the given sentence or not
I/P: abc defGhi JklmnOP QRStuv wxyz
O/P: True

I/P: abc defGhi JklmnOP QRStuv
O/P: False
*/
import java.util.*;
class main
{
  public static void main(String args[])
  {
    String s="abc defGhi Jklmnop Qrstuv";
    List<Character> l=new ArrayList<>();
    List<Character> n=new ArrayList<>();
    String t=s.toLowerCase();
    for(int i=0;i<s.length();i++){
      if(t.charAt(i)!=' '){
        l.add(s.charAt(i));
      }
    }
    for(Character i:l){
      if(!n.contains(i)){
        n.add(i);
      }
    }
  
    System.out.println(n.size()==26?"true":"false");
  }
  
}