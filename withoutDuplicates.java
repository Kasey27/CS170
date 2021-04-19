public class withoutDuplicates {

    public static int[] withoutDuplicates(int[] x) {
        int count = 0; //This variable counts for how long the new array is going to be without the duplicates
        boolean duplicate = false; //This variable checks if that number is repeated or not.
        int repeats = 0; //This counts the number of repeats that a number occurs in the array
        int[] check = new int[x.length]; //This is a new array that checks each integer value.
        int checkvariable = 0; //This variable is used only in line 23-26, to fill the check array with the values that are not duplicates.

        for (int i = 0; i < x.length; i++) {
            duplicate = false;
            for (int j = i; j < x.length; j++) {
                if (x[i] == x[j]) {
                    repeats++; //This counts how many times a variable is repeated
                }
                if (x[i] == x[j] && repeats == 1) { //sets duplicate true only when that value is by itself
                    duplicate = true;
                }
                if (x[i] == x[j] && repeats > 1) { //Becomes false when there are several integers that repeat
                    duplicate = false;
                }
            }
            if (duplicate == true) {
                check[checkvariable] = x[i]; //Stores the unique value to a new array
                count += 1; //Adds one for the new array to be the perfect size
                checkvariable++;
            }
            duplicate = false; //Reset duplicate for the next round
            repeats = 0; //Resets repeats counter back to 0;
        }
        int[] result = new int[count]; //Creates a new array with the size of all of the unique values
        for (int i = 0; i < count; i++) { //Fills the array with the check values.
            result[i] = check[i];
        }
        System.out.println(arrayToString(result, count)); //Prints out the result, for you to see. As well as relies upon count counter, for the arrayToString method to print the array to the perfect length.
        return result;
    }

    public static void main(String[] args) {
      withoutDuplicates(new int [] {1,2,3}); //Output: {1,2,3}
      withoutDuplicates(new int [] {1,2,1,1,3,2,3}); //Output: {1,2,3}
      withoutDuplicates(new int [] {1,2,0,0,1,2, -1, -1, -2}); //Output: {0, 1, 2, -1, 2} 
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
