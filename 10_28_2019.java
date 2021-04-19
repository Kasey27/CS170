public class Recursion{

public static int calculatefactorial(int n){
  if(n ==0) {
    return 1;
  }
  else {
    return(n*calculateFactorial(n-1));
  }
  }
}
