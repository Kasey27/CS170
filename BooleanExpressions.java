public class BooleanExpressions {

  public static void main(String[] args) {
    // //Boolean values
    // System.out.println(true);
    // System.out.println(false);
    // System.out.println("true");
//     // System.out.println(5 < 2);
//     // System.out.println(5 > 2);
//     System.out.println(5 == 2); //Error cannot be do that = is for assignment
//     System.out.println( 5 == 5);
//
// //I can store boolean values into variables
//     boolean x = true;
//     boolean y = 5 < 2;
//     System.out.println(x);
//     System.out.println(y);


    //Boolean (logical) Operators

    // && and
    // || or
    // | not1
    System.out.println("!----Boolean Operator Test---");
    // System.out.println(!true);
    // System.out.println(!false);
    // // System.out.println(true && true); //And is true when both  1 0, true,/ true will be true, everything else will be false
    // System.out.println(true && false);
    // // System.out.println( true || true);
    // // System.out.println(true || false);
    // // System.out.println(false || true);
    // // System.out.println(false ||false);

    //boolean BooleanExpressions
    //expressions that evaluate to a boolean value
    System.out.println(false || !true && true); // first is !, second is &&, third is  || false and false is true
  }


}
