public class IterationvsRecursion{

  public static void main(String[] args){
    System.out.println(factorialFor(5)); // 120
    System.out.println(factorialWhile(5)); //120
    System.out.println(factorialRec(5)); //120
    System.out.println(reverseFor("hello")); //olleh
    System.out.println(reverseWhile("hello")); //olleh
    System.out.println(reverseRec("hello")); //alleh
  }

  public static int factorialFor(int n) {
  int result = 1;
  for(int i = 1; i <= n; i++){
    result *= i;
  }
//  System.out.println(i); // i doesnt exist out of the for loop.
  return result;
  }

  //Calculates the factorial of a number using a WHILE loop
  public static int factorialWhile(int n){
    int result = 1;
    int i = n;
    while(i > 0)  {
      result *= i;
      i--;
    }
    return result;
    }

    public static int factorialRec(int n){
      if(n == 0){
        return 1;
      } else{
        return n * factorialRec(n-1);
      }
    }

    public static String reverseFor(String s){
      String result = "";
      for(int i = s.length()-1; i >= 0; i--){
        result += s.charAt(i);
      }
      return result;
      }
      public static String reverseWhile(String s){
        String result = "";
        int i = s.length() -1;
        while(i >= 0){
              result += s.charAt(i);
               i--;
               }
        return result;
        }
      public static String reverseRec(String s){
        if(s.length() == 0){
          return "";
        } else{
          return "" + s.charAt(s.length()-1) + reverseRec(s.substring(0,s.length()-1));
        }
      }
        //50 problems multi choice, different callings, last class, monday no class so study for final, deadline for peer evaluations due next monday.
  }
