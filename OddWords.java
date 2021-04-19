// \** Write a method oddWords(String[] x) that takes an array of strings x and returns
// a new array containing only the words from x that have an odd number of
// characters. You can assume all the elements of x contain a valid string. To help
// you test your code, a method printArray is already implemented for you.
//
// Examples:
// oddWords({"list", "of", "words"}) returns {"words"}
// oddWords({"a", "b"}) returns {"a", "b"}
// oddWords({"a", "aa", "aaaa", "aaa"}) returns {"a", "aaa"}
// **/

public class OddWords {


public static String[] oddWords(String [] x){
  int count = 0;
  for(int i = 0; i < x.length; i++) {
    if(x[i].length() % 2 != 0) {
      count ++;
    }
  }
  String [] result = new String[count];
  int j  = 0;
  for(int i = 0; i < x.length; i++) {
    if(x[i].length() % 2 != 0) {
      result[j] = x[i];
      j++;
    }
  }
    return result;
  }
    public static void main(String[] args) {
      String [] x1 = {"list","of","words"};
      String [] x2 = {"a","b"};
      printArray(oddWords(x2));
        // test your method here
    }

    // prints an array of strings on one line
    public static void printArray(String[] x) {
        for (String s : x) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
