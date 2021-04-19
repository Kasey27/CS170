public class Pairs {

    public static String[] pairs(String s1, String s2) {
        int diff = s1.length() - s2.length();
        if (diff < 0) {
            for (int i = 0; i < diff; i++) {
                s1 += "*";
            }
        }
        if (diff > 0) {
            for (int i = 0; i < diff; i++) {
                s2 += "*";
            }
        }

        int n = s1.length();
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = "" + s2.charAt(i) + s1.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        printArray(pairs("hey", "you"));
        printArray(pairs("apple", "cup"));
        printArray(pairs("hi", "there"));
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
