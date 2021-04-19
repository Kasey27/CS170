public class SplitString {

    public static String[] split(String s, int k) {
        String[] result = new String[k];
        int start = 0;
        int end = 0;
        for (int i = 0; i < k; i++) {
            end = start + s.length() / k;
            result[i] = s.substring(start, end);
            start = end;
        }
        if (start < s.length()) {
            result[k - 1] += s.substring(start);
        }
        return result;
    }

    public static void main(String[] args) {
        printArray(split("banana", 3));
        printArray(split("hello", 3));
        printArray(split("hello", 2));
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
