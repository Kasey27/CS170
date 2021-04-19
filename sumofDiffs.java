//This program calculates the sum of the differences between the integer values in a array
public class sumofDiffs{

  /**
   * Calculates the sum of differences by taking the
   * first value and subtracting that by the next value
   * returns a integer value with the sum of the differences
   * @param int[]x is an array of integers that is being used to test on
   */
public static int sumofDiffs(int[] x){
  int result = 0;
  for(int i = 0; i < x.length - 1; i++) {
    result += x[i] - x[i+1];
  }
  return result;
}

public static void main(String[] args) {
  System.out.println(sumofDiffs(new int[]{3,4,5})); //Output: -2
  System.out.println(sumofDiffs(new int[]{4,1,19,6})); //Output: -2
  System.out.println(sumofDiffs(new int[]{})); //Output: 0
  System.out.println(sumofDiffs(new int[]{3,0,-1})); //Output: 4
  System.out.println(sumofDiffs(new int[]{0,0,0})); //Output: 0
  System.out.println(sumofDiffs(new int[]{-13,13,-1})); //Output: -12
  System.out.println(sumofDiffs(new int[]{13,9, })); //Output: -4
}
}
