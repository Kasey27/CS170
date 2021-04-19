public class Recursion{

public static void main(String[] args){
  // System.out.println(factorial(0)); //1
  // System.o
  ut.println(factorial(1)); //1
  // System.out.println(factorial(2)); //2
  // System.out.println(factorial(3)); //6
  // System.out.println(factorial(4)); //24

  System.out.println(poweroftwo(0)); //1
  System.out.println(poweroftwo(1)); //1
  System.out.println(poweroftwo(2)); //2
  System.out.println(poweroftwo(3)); //6
  System.out.println(poweroftwo(4));
}


public static int factorial(int n){
  if(n ==0) { //base case
    return 1;
  }
  else {
    return(n * factorial(n-1)); //REcursive case
  }
  }

public static int poweroftwo(int n){
  if(n == 0) {
    return 2;
  }
  else {
    return (2 * poweroftwo(n-1));
  }

}

public static String reverse(String s) {
  if(s.length() == 0) {
    return s;
  }
  else{
    return s.substring(s,length()-1);
    reverse (s.substring(s,s.length() -1 ));
  }


}

public static boolean isPalindrome(String s){
  boolean result = false;
  if(s.length()== 0){
    "";
  }
  else{
    return(s.charAt(0) == s.charAt(s.length-1))
    && (isPalindrome(s.substring(1,s.length()-1)));
    result = true;
  }
}

}
