public class StringMatchReplace {

  // Java String documentation:
  // https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

  // Useful Java String matches/replaceAll Tutorial:
  // https://www.vogella.com/tutorials/JavaRegularExpressions/article.html

  public static void main(String[] args) {

    // Simple matching
    String s = "apple";
    System.out.println(s.matches("apple")); // true
    System.out.println(s.matches("Apple")); // false
    System.out.println(s.matches("[aA]pple")); // true

    s = "Apple";
    System.out.println(s.matches("[aA]pple")); // true
    System.out.println(s.matches("[aA]pple|[oO]range")); // true
    s = "Orange";
    System.out.println(s.matches("[aA]pple|[oO]range")); // true
    s = "apple pie";
    System.out.println(s.matches("[a|A]pple.*") ); // starts with apple: true
    System.out.println(s.matches("[a|A]pple\\s[p|P]ie")); // white space check

    // Quantifiers: +, ?, *, {X}, {X,Y}
    s = "apple";
    System.out.println(s.matches("c*a+p+l.*")); // true
    System.out.println(s.matches("c*a+p?l.*")); // false (at most one "p")
    System.out.println(s.matches("c+a+p+l.*")); // false (at least one "c" at beginning)
    System.out.println(s.matches(".*apple.*")); // contains apple: true

    s = "pie";
    // s = "p_e";
    System.out.println(s.matches("[a-zA-Z]{3}")); // consists of 3 alphabet letters? true
    System.out.println(s.matches("\\w{3}")); // consists of 3 word characters? true
    System.out.println(s.matches("\\w{5,9}")); // between 5 and 9 word characters? false
    System.out.println(s.matches("\\.{5,9}")); // between 5 and 9 characters (not necessarily word characters)

    // Note: when the caret appears as the first character
    // inside [], it negates the pattern
    System.out.println(s.matches("[^\\d].*")); // does NOT start with a digit: true
    s = "10 apples";
    System.out.println(s.matches("[^\\d].*")); // false
    System.out.println(s.matches("\\D.*")); // equivalent

    // Check if the string represents a valid phone number.
    // A phone number either consists of 7 digits in a row (e.g. 1234567)
    // or 3 digits followed by a dash followed by 4 digits (e.g. 123-4567)
    // or 3 digits followed by a space followed by 4 digits (e.g. 123 4567)
    String phonePattern = "\\d{3}[-\\s]?\\d{4}";
    String phone1 = "9993434"; // valid
    String phone2 = "999-3434"; // valid
    String phone3 = "999 3434"; // valid
    String phone4 = "9993 434"; // invalid
    String phone5 = "999,4434"; // invalid
    System.out.println(phone1.matches(phonePattern)); // true
    System.out.println(phone2.matches(phonePattern)); // true
    System.out.println(phone3.matches(phonePattern)); // true
    System.out.println(phone4.matches(phonePattern)); // false
    System.out.println(phone5.matches(phonePattern)); // false

    // replaceAll()
    // ============
    // Grouping and back reference using parentheses ()
    String pattern = "(\\w)(\\s+)([\\.,])"; // remove whitespace between a word character and . or ,
    String text = "To be , or not to be. That is the question .";
    System.out.println("Before => " + text);
    System.out.println(text.replaceAll(pattern, "$1$3"));
    System.out.println("After => " + text); // does NOT change!

    text = text.replaceAll(pattern, "$1$3");
    System.out.println("After re-assigning result back to text => " + text);

    // more replaceAll() examples:
    System.out.println(text.replaceAll("e[^\\w]", "eee"));
    System.out.println(text.replaceAll("(e)([^\\w])", "$1$1$1$2")); // how is this different?

    s = "To be, or not to be. My two cents. Twwwoooo!!!";
    System.out.println(s);
    System.out.println(s.replaceAll("[tT]w?o", "2"));
    System.out.println(s.replaceAll("[tT]w+o", "2"));
    System.out.println(s.replaceAll("[tT]w*o", "2"));
  }

}
