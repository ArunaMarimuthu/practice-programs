import java.util.*;
class Main
{
  public static void main(String args[])
  {
    String s[]={"catch","get","tiger","mat","eat","pat","tap","tea"};
    String word="ate";
   for(int i=0;i<s.length;i++){
      permute("",s[i],word,s[i]);
   }
  }
  static void permute(String prefix,String str,String word,String ori){
   
    if(prefix.length()==word.length()&&prefix.equals(word)){
     System.out.println(ori);
      
     }
      else{
        for(int i=0;i<str.length();i++){
          permute(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,str.length()),word,ori);
        }
    } 
  }
}