public class CheckMult {

  public static boolean[][] checkMult(int[][] x, int k){
    boolean[][] result = new boolean[x.length][x[0].length];
    for(int row = 0; row < x.length; row++){
      for(int col = 0; col < x[row].length; col++){
        if(x[row][col] % k == 0) {
           result[row][col] = true;
        }
        else {
          result[row][col] = false;
        }
      }
    }
    return result;
  }
    // write your method here

    public static void main(String[] args) {
      int[][] x = { {1, 2, 3, 4},
              {5, 6, 7, 8},
              {9, 10, 11, 12} };

              printArray(checkMult(x, 3));
            }
    // prints a 2D array followed by a blank line
    public static void printArray(boolean[][] x) {
        for (int row = 0; row < x.length; row++) {
            for (int col = 0; col < x[row].length; col++) {
                System.out.print(x[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
