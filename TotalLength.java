public class TotalLength {

    public static int totalLength(String[] x) {
        int result = 0;
        for (int i = 0; i < x.length; i++) {
          System.out.println(result);
            result += x[i].length();
            System.out.println(result);
            System.out.println(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] x1 = {"hello"};
        System.out.println(totalLength(x1));
    //     String[] x2 = {"hey", "you"};
    //     System.out.println(totalLength(x2));
    //     String[] x3 = {"list", "of", "words"};
    //     System.out.println(totalLength(x3));
     }
}
