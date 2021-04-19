public class MirrorString {

    public static String mirror(String s) {
        String result = s;
        int i = 0;
        while (i < s.length()) { // change <= to <
            result = s.charAt(i) + result; // swap the addition operands
            System.out.println(result);
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(mirror("hey"));
    }
}
