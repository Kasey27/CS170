public class ArrayWorker {

  public static void main(String[] args) {
    String x = "shipping";
    String y = "ship";
    String h = "s**p";
    String checkword = "ship";
    int i = 0;
      i = checkword.indexOf(x);
      System.out.println(i);
      i = checkword.indexOf(y);
      System.out.println(i);
      i = checkword.indexOf(h);
      System.out.println(i);
      // if(i != -1) {
      //   //  String checkword2 = text.substring(0, i+1);
      //     System.out.println("Hello");
      //
      // }
      // else {
      //   //checkword = "ship";
      //   System.out.println("Bye");
      // }

    // int ascii = x.charAt(0);
    // int ascii2 = x.charAt(x.length()-1);
    //  // x = x.substring(0,4);
     // if(x.compareTo(y) == 0){
     //  System.out.println("Hello");
    //  // }
    // for(int i = 0 ; i < x.length() ; i++){
    //   String word = x.substring(0,i);
    //   if(word.compareTo(y) == 0){
    //     System.out.println("Hello");
    //     word = h;
    //     word += x.substring(i,x.length());
    //     System.out.println(word);
    //   }
    //   System.out.println(x.substring(0,i));
    }
  }


//
// for(int i = 0 ; i < checkword.length() ; i++){
// 	String word = checkword.substring(0,i);
// 	if(checkword.compareTo(checkword2) == 0){
// 		checkword = swearWords_2[h];
// 		System.out.println("Hello");
// 		checkword += checkword.substring(i,checkword.length());
// 		System.out.println(word);
// 	}
// 	System.out.println(checkword.substring(0,i));
// }
