public class StringStuff {

      public static String pickAndRepeat(String s, int n) {
          String result = s.substring(0, n);
          for (int i = 0; i < n; i++) {
              result += s.charAt(n);
          }
          result += s.substring(n + 1);
          return result;
      }

      public static void main(String[] args) {
          System.out.println(pickAndRepeat("cart", 0));
          System.out.println(pickAndRepeat("cart", 1));
          System.out.println(pickAndRepeat("cart", 2));
          System.out.println(pickAndRepeat("cart", 3));

          String x = "hey";
          String y = "zey";
          String z = "hey";

          System.out.println(x.compareTo(y)); // < 0
          System.out.println(y.compareTo(x)); // > 0
          System.out.println(x.compareTo(z)); // 0
      }
}
