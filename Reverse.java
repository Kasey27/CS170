//This program reverses the numbers in a array
public class Reverse {

	/**
   * Reverse the numbers in an array
   * Does so by taking the last value then places that in the front of a new array
	 * Note changes the original array
   * @param int[]x is an array of integers that is being used to test on
   */
	public static void reverse(int [] x) {
		int[] result = new int[x.length];  //Creates new array with length equal to original.
		int count = 0;
		for(int i = x.length - 1; i >= 0; i--) { //Starts from the end -> beginning
			result[count] = x[i]; //Fills array with that value at i
			count += 1;  //Adds one to count to fill in the next section in the array
		}
	for(int i = 0; i < x.length; i++) { //Sets the original array to reverse order
		x[i] = result[i];
	}
}
	public static void main(String[] args) {
		int[] example1 = {1,2,3};
		System.out.println("------The original array is------");
		System.out.println(arrayToString(example1,3));
		reverse(example1);
		System.out.println("------The reverse array is------");
		System.out.println(arrayToString(example1, example1.length));

		int[] example2 = {4,0,-1};
		System.out.println("------The original array is------");
		System.out.println(arrayToString(example2, example2.length));
		System.out.println("------The reverse array is------");
		reverse(example2);
		System.out.println(arrayToString(example2, example2.length));

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
}
