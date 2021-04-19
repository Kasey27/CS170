public class diagonal{

public static int[] primaryDiagonal(int[][] mat){
  int n = mat.length;
  int[] result = new int[n];
  for(int i = 0; i < n; i++){
  result[i] += mat[i][i];
 }
 return result;
}

  public static void main(String[] args){
    System.out.println(arrayToString(primaryDiagonal(new int[][]{{4,0,1,},{2,3,4}}), 6));
  }


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
}
