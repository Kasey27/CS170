public class RecursiveDivision{

  public static void main(String[] args){
    System.out.println(division(10,2));

  }
  public static int division(int n, int d){
   if(n < d){
    return 0;
  } else{
    System.out.println("hello");
    return 1 + division(n-d,d);
  }

  }

}
