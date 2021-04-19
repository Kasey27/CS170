public class ArrayExample {

public static void main(String[] args) {
   int [] a; //Declare an array of integers named A
   a = new int [4]; //Creates an array with 4 slots
   a[0] = 7;
   a[1] = 3;
  a[2] = 15;
  a[3] = 9;
//  a[4] = 10;
  int [] c = new int[5];
  c[0] = 1;
  c[1] = 3;
  c[2] = 5;
  c[3] = 7;
  c[4] = 34;
  // System.out.println(a[0]);
  // System.out.println(a[1]);
  // System.out.println(a); //This prints the address at machine level that the computer finds that specific array
  // for(int i = 0; i < a.length; i++) {
  //   System.out.println(a[i]);
  // }
  // for(int i = 0; i < a.length; i++) {
  //   System.out.print(a[i]);
  // }
  // System.out.println();
   int[] b = new int[0]; //empty array (array with no element)
  System.out.println("Sum: " + sumAll(a));
  System.out.println("Sum: " + sumAll(b));
  System.out.println("a: " + arrayToString(a));
  System.out.println("b: " + arrayToString(b));
  System.out.println("C: " +  arrayToString(c));
  System.out.println("a: " + minValue(a));
  System.out.println("C: " +  minValue(c));
}

public static int sumAll(int[] x){
  int sum = 0;
  for(int i = 0; i < x.length; i++) {
    sum += x[i];
  }
  return sum;
}
public static String arrayToString(int[] x){
  String result = "";
  for(int i = 0; i < x.length - 1; i++) { //All the elements except the last one
    result += x[i] + ", ";
  }
  if(x.length > 0) { //protection from the index out of bound error
  result += x[x.length - 1]; //Last element
 }
 result += "}";
  return result;
}

public static int minValue(int[] x){
  int min = x[0];
  for(int i = 0; i < x.length; i++) {
    if(min > x[i] ) {
      min = x[i];
    }
    else{
      min = min;
    }
  }
  return min;
}

public static int minIndex(int[] x){
  int index = 0;
  int min = x[0];
  for(int i = 0; i < x.length; i++) {
    if(min > x[i] ) {
      index = i;
    }

  }
  return index;
}

}
