public class RegexSwearFilter {

  public static void main(String[] args) {
    String text = "A duck was sailing on a ship shipping whole wheat bread. Duck that SHIP!!!";
    String[] swear = {"duck", "ship", "whole"};
    System.out.println(swearFilter(text, swear));
  }

  public static String swearFilter(String text, String[] swear) {
    String result = text;
    String[] swearBig = new String[swear.length];
    String[] detect = new String[swear.length];
    for(int i = 0; i < swear.length; i++) {
      swearBig[i] = swear[i].toUpperCase();
    }
    for(int i = 0; i < swear.length; i++) {
      detect[i] = "";
      for(int j = 0; j < swear[i].length(); j++) {
        detect[i] += "[" + swearBig[i].charAt(j) + swear[i].charAt(j) + "]";
      }
    }
    for(int i = 0; i < swear.length; i++) {
      for(int j = 0; j < text.length() - swear[i].length(); j++) {
        String fragment = text.substring(j, j + swear[i].length());
        if(fragment.matches(detect[i])) {
          result = result.replaceAll(fragment ,censor(fragment));
        }
      }
    }
    return result;
  }

  public static String censor(String fragment) {
    String censor = fragment.substring(0,1);
    for(int i = 0; i < fragment.length() - 2; i++) {
      censor += "*";
    }
    censor += fragment.substring(fragment.length() - 1);
    return censor;
  }
}
