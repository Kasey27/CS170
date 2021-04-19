public class MatrixWorker {

    public static void main(String[] args) {
        int a[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };

        System.out.println("Matrix A:");
        System.out.println(matrixToString(a,4,4));

//        // Test Primary Diagonal
       System.out.print("Primary Diagonal: ");
       int[] x = primaryDiagonal(a);
       System.out.println(arrayToString(x,4));

//        // Test Secondary Diagonal
       System.out.print("Secondary Diagonal: ");
       int[] y = secondaryDiagonal(a);
       System.out.println(arrayToString(y,4));

//        // Test Reverse Diagonals
       System.out.println("Matrix A with reversed diagonals: ");
       reverseDiagonals(a);
       System.out.println(matrixToString(a,4,4));

       int b[][] = {
               {10, 20, 30, 40},
               {50, 60, 70, 80},
               {10, 20, 30, 40},
               {50, 60, 70, 80}
       };

//        System.out.println("Matrix B:");
//        System.out.println(matrixToString(b,4,4));

//        // Test Reverse Diagonals Copy
       System.out.println("Copy of Matrix B with reversed diagonals: ");
       int[][] z = reverseDiagonalsCopy(b);
       System.out.println(matrixToString(z,4,4));

//        // Test Above Average
//        double[][] c = new double[][] {
//            {100, 80, 30, 95},
//            {40, 10, 78, 85},
//            {5, 90, 10, 15}
//        };

//        System.out.println("Matrix C:");
//        System.out.println(matrixToString(c, c.length, c[0].length));
//        boolean[][] above = aboveAverage(c, c.length, c[0].length);
//        System.out.println("Above average:");
//        System.out.println(matrixToString(above, above.length, above[0].length));

//        // Test Average Lengths
//        String[][] d = new String[][] {
//            {"apple", "banana", "carrot", "orange"},
//            {"pear", "strawberry", "spinach", "celery"},
//            {"tomato", "potato", "pumpkin", "mango"}
//        };

//        System.out.println("Matrix D:");
//        System.out.println(matrixToString(d, d.length, d[0].length));

//        double[][] averages = averageLengths(d, d.length, d[0].length);
//        System.out.println("Row averages: " + arrayToString(averages[0], averages[0].length));
//        System.out.println("Col averages: " + arrayToString(averages[1], averages[1].length));
    }
    public static boolean[][] aboveAverage(double [][] x, int rows, int cols) {
      int average = 0;
      for(int i = 0; i < rows * cols; i++
      average += x[i][i];
    }
    average = average / (row * cols);
    for(int i = 0; )

    public static void reverseDiagonals(int mat[][]) {
      int i = 0, j = mat.length, temp = 0;
      while(i < j) {
        //reversing the elements of principal diagnonal
        temp = mat[i][j];
        mat[i][j] = mat[j-1][j-1];
        mat[j-1][j-1] = temp;

        //reversing the elements of secondary diagnonal
        temp = mat[i][j-1];
        mat[i][j-1] = mat[j-1][i];
        i++;
        j--;
      }

   }


    public static int[] secondaryDiagonal(int[][] mat) {
      int n = mat.length;
      int j = mat.length - 1;
      int[] result = new int[n];
      for(int i = 0; i < mat.length; i++){
        result[i] = mat[i][j];
        j--;
      }
      return result;
    }
    public static int[] secondaryDiagonal(int[][] mat) {
      int n = mat.length;
      int[] result = new int[n];
      for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++) {
          if((i+j) == (n-1)) {
            result[i] += mat[i][j];
          }
        }
      }
      return result;
    }

    public static int[] primaryDiagonal(int[][] mat){
      int n = mat.length;
      int[] result = new int[n];
      for(int i = 0; i < n; i++){
      result[i] += mat[i][i];
     }
     return result;
    }

    public static boolean isTriangular(double[][] x, int n ){
      //Check if it's lower triangular
      boolean isLowerTriangular = true;
      for(int row = 0; row < n - 1; row++) {
        for(int col = row + 1; col < n; col++){
          if(x[row][col] != 0) {
            isLowerTriangle = false;
          }
        }
      }
      //check if its upper triangular
      boolean isUpperTriangular = true;
      for(int row = 1; row < n; row ++) {
        for(int col = row + 1; col < n; col++){
          if(x[row][col] != 0) {
            isUpperTriangular = false;
          }
        }
      }

      return isLowerTriangular || isUpperTriangular;
    }

    /**
     * Returns a string representation of an array of integers in the following
     * format: [a0, a1, a2, ..., an-1]
     *
     * @param a an array of integers
     * @param n the number of elements in a (n <= a.length)
     */
    public static String arrayToString(int[] a, int n) {
        String result = "[";
        for (int i = 0; i < n - 1; i++) {
            result = result + a[i] + ", ";
        }
        if (n > 0) {
            result = result + a[n - 1];
        }
        result += "]";
        return result;
    }

    /**
     * Returns a string representation of an array of doubles in the following
     * format: [a0, a1, a2, ..., an-1]
     *
     * @param a an array of doubles
     * @param n the number of elements in a (n <= a.length)
     */
    public static String arrayToString(double[] a, int n) {
        String result = "[";
        for (int i = 0; i < n - 1; i++) {
            result = result + a[i] + ", ";
        }
        if (n > 0) {
            result = result + a[n - 1];
        }
        result += "]";
        return result;
    }

    /**
     * Returns a string representation of a 2D array of strings in the format:
     * [
     *  [x[0][0], x[0][1], x[0][m-1]]
     *  [x[1][0], x[1][1], x[1][m-1]]
     *  [...        ...        ...      ]
     *  [x[n-1][0], x[n-1][1], x[n-1][m-1]]
     * ]
     *
     * @param x a matrix (2D array) of strings
     * @param n number of rows of x[][]
     * @param m number of columns of x[][]
     * @return a String representation of x[][]
     */
    public static String matrixToString(String[][] x, int n, int m) {
        String result = "[\n";
        for (int row = 0; row < n; row++) {
            result += " [";
            for (int col = 0; col < m - 1; col++) {
                result += x[row][col] + ", ";
            }
            result += x[row][m - 1] + "]\n";
        }
        result += "]";
        return result;
    }

    /**
     * Returns a string representation of a 2D array of ints in the format:
     * [
     *  [x[0][0], x[0][1], x[0][m-1]]
     *  [x[1][0], x[1][1], x[1][m-1]]
     *  [...        ...        ...      ]
     *  [x[n-1][0], x[n-1][1], x[n-1][m-1]]
     * ]
     *
     * @param x a matrix (2D array) of ints
     * @param n number of rows of x[][]
     * @param m number of columns of x[][]
     * @return a String representation of x[][]
     */
    public static String matrixToString(int[][] x, int n, int m) {
        String result = "[\n";
        for (int row = 0; row < n; row++) {
            result += " [";
            for (int col = 0; col < m - 1; col++) {
                result += x[row][col] + ", ";
            }
            result += x[row][m - 1] + "]\n";
        }
        result += "]";
        return result;
    }

    /**
     * Returns a string representation of a 2D array of doubles in the format:
     * [
     *  [x[0][0], x[0][1], x[0][m-1]]
     *  [x[1][0], x[1][1], x[1][m-1]]
     *  [...        ...        ...      ]
     *  [x[n-1][0], x[n-1][1], x[n-1][m-1]]
     * ]
     *
     * @param x a matrix (2D array) of doubles
     * @param n number of rows of x[][]
     * @param m number of columns of x[][]
     * @return a String representation of x[][]
     */
    public static String matrixToString(double[][] x, int n, int m) {
        String result = "[\n";
        for (int row = 0; row < n; row++) {
            result += " [";
            for (int col = 0; col < m - 1; col++) {
                result += x[row][col] + ", ";
            }
            result += x[row][m - 1] + "]\n";
        }
        result += "]";
        return result;
    }

    /**
     * Returns a string representation of a 2D array of booleans in the format:
     * [
     *  [x[0][0], x[0][1], x[0][m-1]]
     *  [x[1][0], x[1][1], x[1][m-1]]
     *  [...        ...        ...      ]
     *  [x[n-1][0], x[n-1][1], x[n-1][m-1]]
     * ]
     *
     * @param x a matrix (2D array) of booleans
     * @param n number of rows of x[][]
     * @param m number of columns of x[][]
     * @return a String representation of x[][]
     */
    public static String matrixToString(boolean[][] x, int n, int m) {
        String result = "[\n";
        for (int row = 0; row < n; row++) {
            result += " [";
            for (int col = 0; col < m - 1; col++) {
                result += x[row][col] + ", ";
            }
            result += x[row][m - 1] + "]\n";
        }
        result += "]";
        return result;
    }

    /**
     * Adapted from https://www.geeksforgeeks.org
     *
     * Given a 2D square matrix, returns the elements of its primary diagonal.
     *
     * @param mat[][] a matrix of integers
     * @return the primary diagonal of mat[][]
     */
    public static int[] primaryDiagonal(int mat[][]) {
        // You implement this method
        return null;
    }

    /**
     * Adapted from https://www.geeksforgeeks.org
     *
     * Given a 2D square matrix, returns the elements of its secondary diagonal.
     *
     * @param mat[][] a matrix of integers
     * @return the secondary diagonal of mat[][]
     */
    public static int[] secondaryDiagonal(int mat[][]) {
        // You implement this method
        return null;
    }

    /**
     * Adapted from https://www.geeksforgeeks.org
     *
     * Given a 2D square matrix, reverses the elements of both its diagonals.
     * This method modifies the original matrix.
     *
     * @param mat[][] a matrix of integers
     */
    public static void reverseDiagonals(int mat[][]) {
        // You implement this method
    }

    /**
     * Adapted from https://www.geeksforgeeks.org
     *
     * Given a 2D square matrix, return a new matrix containing a copy
     * of the original matrix with the elements of both diagonals reversed.
     * This method does not modify the original matrix.
     *
     * @param mat[][] a matrix of integers
     * @return mat[][] the matrix with the reversed elements of both diagonals.
     */
    public static int[][] reverseDiagonalsCopy(int mat[][]) {
        // You implement this method
        return null;
    }

    /**
     * This method takes a matrix of doubles and its number of rows and columns.
     * The method returns a new matrix of booleans with the same size of the
     * original matrix, where each element is true if the corresponding double
     * is greater than the global average of the original matrix, false otherwise.
     *
     * @param x a matrix (2D array) of doubles
     * @param rows number of rows of x[][]
     * @param cols number of columns of x[][]
     * @return a new matrix of booleans
     */
    public static boolean[][] aboveAverage(double[][] x, int rows, int cols) {
        // You implement this method
        return null;
    }

    /**
     * This method takes a matrix of strings and its number of rows and columns.
     * The method returns an array of arrays of doubles.
     * The first element (index 0) of the result is an array that contains the
     * average lengths of the strings in the corresponding rows of the original matrix.
     * The second element (index 1) of the result is an array that contains the
     * average lengths of the strings in the corresponding columns of the original matrix.
     *
     * @param s a matrix (2D array) of strings
     * @param rows number of rows of s[][]
     * @param cols number of columns of s[][]
     * @return a new array of arrays of doubles
     */
    public static double[][] averageLengths(String[][] s, int rows, int cols) {
        // You implement this method
        return null;
    }

}
