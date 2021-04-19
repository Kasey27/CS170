public class Notes_9_25 {

  public static void main(String[] args) {
    int a = 2;
    double b = 2.0;
    String c = "2";
    System.out.println(a + b + c); // 4.02
    System.out.println((int)(a + b) + c); //42
    System.out.println(a + (int)b + Integer.parseInt(c)); //5
    System.out.println(a * Double.parseDouble(c)); // 4.0
    System.out.println((double)a - a); //0.0
    System.out.println(Double.parseDouble(c + a * a)); //24.0
    for (int i = a; i < a + a * a; i++) { //22, //32 / 42 //52
        System.out.println(i + c);
    }
  }
}
// }
// }
// bolean is a data type in java that can either be true or false(true possible values only)
//
//
// a boolean expression can either be true or flase
//
// relational Operators
// x == y //x equals y
// x!= y //x i snot equal to y
//
// x > y //x is greater than y
// x < y // y is greater than x
// x >= y is greater than or equal to y
// x <= y //x is less tan or equal to y
//
// //Order of precedence:
// //
//
// && // second hand
// !! // third
// ! // first not

}
