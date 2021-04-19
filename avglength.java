//This program calculates the average length of all of the strings in a array
public class avglength{

  /**
   * First calculates the total length of each string in the array
   * Then calculates the average length of each string by dividing
   * the total amount of string segments.
   * Returns a double value with the average length.
   *
   * @param String[]x is an array of String type, this is the original array
   */
  public static double avgLength(String[] x) {
    double result = 0; //This is the final result
    for(int i = 0; i < x.length; i++) {
      result += x[i].length();
    }
    result = result / x.length; //Calculates the average
    if(x.length == 0){ //This if statement only runs if the array is an empty array
      result = 0;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(avgLength(new String[]{"Hello","Q"})); //Output: 3.0
    System.out.println(avgLength(new String[]{})); //Output: 0.0
    System.out.println(avgLength(new String[]{"Hello","Goodbye"})); //Output: 6.0
    System.out.println(avgLength(new String[]{"Hello","Goodbye", "GoodMorning", "CS170"})); //Output: 7.0
    System.out.println(avgLength(new String[]{"Hello!!!","Goodbye;!234"})); //Output: 10.0  
  }


}
