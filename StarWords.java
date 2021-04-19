public class StarWords{
      public static String[] compose(String[] a, String[] b, String[] c) {
          String[] result = new String[a.length * b.length * c.length]; // *
          int p = 0; // p = 0
          for (int i = 0; i < a.length; i++) {
              for (int j = 0; j < b.length; j++) { // j < b.length
                  for (int k = 0; k < c.length; k++) {
                      result[p] = a[i] + " " + b[j] + " " + c[k]; // " "
                      p++; // move p++ here
                  }
              }
          }
          return result;
      }

      public static void main(String[] args) {
          printArray(compose(new String[]{"cheese", "chicken"},
                             new String[]{"potato", "carrot", "spinach"},
                             new String[]{"soup", "salad"}));
      }

      // prints an array on one line
      public static void printArray(String[] x) {
          System.out.print("{");
          for (int i = 0; i < x.length - 1; i++) {
              System.out.print(x[i] + ", ");
          }
          if (x.length > 0) {
              System.out.print(x[x.length - 1]);
          }
          System.out.println("}");
      }
  }
