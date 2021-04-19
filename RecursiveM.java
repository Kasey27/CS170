public class RecursiveM{

  public static void main(String[] args){
    System.out.println(reverse("Hello"));

  }
  public static String reverse(String s){
   if(s.length() == 0){
    return "";
  } else{
    return s.substring(s.length()-1,s.length()) + reverse(s.substring(0,s.length()-1));
  }

  }

}
