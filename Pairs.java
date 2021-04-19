public class StringSquare {

  public static char[][] stringSquare(String s){
    char[][] result = new char[s.length()][s.length()];
    for(int row = 0; row < s.length(); row++){
      for(int col = 0; col < s.length(); col++){
        if(row == 0) {
          result[row][col] = s.charAt(col);
        }
        else if(col == 0){
          int counter = 2;
          result[row][col] = s.charAt(counter);
          counter++;
        }
        else if(row == 5){
          int counter = s.length();
          result[row][col] = s.charAt(counter);
          counter--;
        }
        else if(col == 5){
          int counter = s.length();
          result[row][col] = s.charAt(counter);
          counter --;
        }
      }
    }
    return result;
  }

    public static void main(String[] args) {
      printArray(stringSquare("hello"));
        // test your method here
    }

    // prints a 2D array followed by a blank line
    public static void printArray(char[][] x) {
        for (int row = 0; row < x.length; row++) {
            for (int col = 0; col < x[row].length; col++) {
                System.out.print(x[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
