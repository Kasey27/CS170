public class SumOdds {

    public static int sumOdds(int start, int end) {
        int result = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                result += i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // System.out.println(sumOdds(3, 5)); // 8
        // System.out.println(sumOdds(3, 6)); // 8
        // System.out.println(sumOdds(2, 6)); // 8
        // System.out.println((3 < 9) || ((20 > 30) && true));
        //   System.out.println(12);
        //   //11 false
          System.out.println(! (true && true) && ((true || false) && true));
    }
}
