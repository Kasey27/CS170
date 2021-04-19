public class Small {

  public static double smallestNumber(double x, double y){
    if(x < y){
      return x;

    }
    else {
    return y;

    }
  }

public static String longestString(String x, String y) {

  if(x.length() > y.length()) {
    return x;
  }
  else if (x.length() == y.length()) {
    System.out.println("They are the same length!");
  }
  else {
    return y;
  }

}

  public static void main(String[] args) {
    // System.out.println(smallestNumber(4,3));
    // System.out.println(smallestNumber(2.0,5.0));
    System.out.println(longestString("Xy","bye"));
    System.out.println(longestString("hi","bye"));
    System.out.println(longestString("aaaa","bbbb"));
  }

}
