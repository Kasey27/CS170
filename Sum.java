public class Sum{

public static int sum(int n) {
  int sum = 0;
  for(int i = 1; i <= n; i++) {
    sum += i;
  }
  return sum;

}

//What is the common structure in those examples?
//Accumulation strategy:
// 1) Initialize a variable that will contain the result
// 2) Update the result inside a loop
// 3) After the loop, finalize (if needed) and return the result

public static int sumFive(int n) { //i+= 5 is equal to i = i + 5;
  int sum = 0;
  for(int i = 0; i <= n; i+=5) {
    sum += i;
  }
  return sum;

}

public static String multiplyString(String text, int n) { //i+= 5 is equal to i = i + 5;
  String text2 = "";
  for(int i = 0; i < n; i++) {
     text2 += text;
      // System.out.print(text);
  }
  return text2;

}

//multiply alll the postiive intergers between 1 and n (Included)
public static int multN(int n) {
  int mult = 1;
  for(int i = 1; i <= n; i++) {
  mult *= i;
  }
  return mult;

}


  public static void main(String[] args) {
   // System.out.println("The sum is: " + sum(3));
   // System.out.println("The sum is: " + sum(0));
   // System.out.println("The sum is: " + sum(1)); //1
   // System.out.println("The sum is: " + sum(2)); //3
   // System.out.println("The sum is: " + sum(5)); //15
   // System.out.println("The sum is: " + multN(3));
   // System.out.println("The sum is: " + multN(0));
   // System.out.println("The sum is: " + multN(1)); //1
   // System.out.println("The sum is: " + multN(2)); //3
   // System.out.println("The sum is: " + multN(5)); //15
   // System.out.println("The sum is: " + sumFive(0)); //0
   // System.out.println("The sum is: " + sumFive(3)); //0
   // System.out.println("The sum is: " + sumFive(5)); //5
   // System.out.println("The sum is: " + sumFive(12)); //15
   // System.out.println("The sum is: " + sumFive(15)); //30
   // System.out.println("The sum is: " + sumFive(16)); //30
   System.out.println(multiplyString("hey", 3)); // "heyheyhey"
 System.out.println(multiplyString("hey", 0)); //""
 System.out.println(multiplyString("hey", 5)); //"Hey"
 System.out.println(multiplyString("hey", 3)); //" "
 System.out.println(multiplyString("hey", 3));
  }
}
