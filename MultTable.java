public class MultTable {

  public static int[][] multTable(int n){
    int[][] result = new int[n][n];
    for(int row = 0; row < n; row++){
      for(int col = 0; col < n; col++){
          result[row][col] = (row+1) * (col+1);
        }

      }
    return result;
  }
    // write your method here

    public static void main(String[] args) {
      printArray(multTable(5));
        // test your method here
    }

    // prints a 2D array followed by a blank line
    public static void printArray(int[][] x) {
        for (int row = 0; row < x.length; row++) {
            for (int col = 0; col < x[row].length; col++) {
                System.out.print(x[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
