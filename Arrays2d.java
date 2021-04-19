public class Arrays2d {

  public static void main(String[] args){
  int[] a1 = new int[] {10,7,5,2,13}; //Create and initialize an array
  System.out.println(arrayToString(a1,5)); //a.length; //#rows, a[rowIndex].length; //#cols

  int[] a2 = {10,7,5,2,13}; //This works
//  a2 = {10, 7, 5, 2, 13}; //Doesnt work you need to create new int[] or call it all in one
  System.out.println(arrayToString(a2,5));

  System.out.println(arrayToString(new int[] {10,7,5,2,13},5));

  //2d arrayToString
  int [][] x = new int[2][3]; // matrix with 2 rows + 3 columns

  x[0][0] = 100; //assign 100 to the element at row 0 and column 0;

  double [][] y = new double[2][3];
  y[0][0] = 10;
  y[0][1] = 20;
  y[0][2] = 30;
  y[1][0] = 40;
  y[1][1] = 50;
  y[1][2] = 60;

  // System.out.println(matrixToString(y,2,3)); //array, number of rows, number of columns.

double [][] w = {{15,25,35}, {45,55,65}};
System.out.println(matrixToString(w,2,3));
System.out.println(matrixToString(new double[][] {{17,27,37},{
  47,57,67}},2,3));



//test transpose
  // System.out.println(matrixTransposeToString(y,2,3));
  // double [][] yt = matrixTransposeToString(y,2,3);
  // System.out.println(matrixToString(yt,3,2));
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
* Return a string represenation of a 2d array of doubles in the format:
* [
* [x[0][0]], x[0][1], [x[0],[m-1]]
*
* [x[1][0], x[1][1]], x[1][m-1]]]
* [...   ... ...   ]
* [x[n-1][0], x[n-1][1], x[n-1][m-1]]
 *]

* @param x a matrix(2 array) of doubles
* @param n number of rows of x[][]
* @param m numbe ro foclumns of x[][]
*/

public static String matrixToString(double[][] x, int n, int m) {

  String result = "[\n";
  for(int row = 0; row < n; row++) {
    result  += " [";
    for(int col = 0; col < m-1; col++) {
      result += x[row][col] + ", ";
    }
    result += x[row][m-1] + "]\n"; //goes to the next line
  }
  result += "]";
  return result;
}


public static double[][] matrixTransposeToString(double [][] x, int n, int m) {
  double [][] result = new double [m][n];

  for(int row = 0; row < m; row++) {
    for(int col = 0; col < n; col++) {
      result [row][col] = x[col][row];
    }
  }
  return result;
}

public static boolean triangular(double [][] x, int n, int m) {
  boolean result = false;
  
  if([row][2] == [0]);

  for(int row = 0; row < m; row++) {
    for(int col = 0; col < n; col++){

    }
  }

}

}
