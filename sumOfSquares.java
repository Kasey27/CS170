public class SumOfSquares{

  //This method takes an int number, and adds up the amount of squared values starting from 0 all the way up to n. This method returns a double number, the number returned is the sum of all of the squares up to n.
  public static double sumOfSquares(int n) {
    double sum = 0; //This variable stores the sum of all of the squared values
    for(int i = 0; i <= n ; i++) {
      sum = sum + Math.pow(i,2); //Adds each squared value into the original sum.
    }
    return(sum); //Returns the total sum of all of the squared values to n.
  }

//This method multiples int x and int y together and returns a double product with the number equal to their product
public static double product(int x, int y) {
  double product = 0; //This is the product of x and y
  if(x >= 0 && y >= 0) {
  for(int i = 0; i < y ;i++) {
    product += x; //This adds up all the values to x as multiplication is additive as x * 2= x + x;
  }
  }
  else if( x < 0 && y < 0){
    y = y * -1;
    x = x * -1;
    for(int i = 0; i < y ;i++) {
      product += x; //This adds up all the values to x as multiplication is additive as x * 2= x + x;
    }
  }
  else if( x < 0) {
    for(int i = 0; i < y ;i++) {
      product += x; //This adds up all the values to x as multiplication is additive as x * 2= x + x;
    }
  }
  else if( y < 0) {
    y = y * -1;
     for(int i = 0; i < y ;i++) {
      product -= x; //This adds up all the values to x as multiplication is additive as x * 2= x + x;
    }
  }
  return(product); //Returns the product of both numbers.
}

//This method calculates the amount of compound interest. This method takes in the parameters double money, as the original money in the bank account, double interestRate which is the annual interest rate on
//The bank account and finally int years for how long that bank account has been opened for.
public static double compoundInterest(double money, double interestRate, int years) {
  interestRate = 1 + interestRate; //I add 1 to the interest rate so when i multiply by the money i can add it to the overall money. Instead of only calculating the interest, im calculating the amount of money in the account after every annual interest.
  for(int i = 0; i < years; i++) {
    money = money*interestRate;
  }
  return(money); //Returns the amount of money
}

//This method calculates the length of a poly spiral. The method takes in the paramater n as the amount of the
public static double polyspirallength(int n, double base, int rounds) {
  double length = 0;
  for(int i = 0; i < n * rounds; i++) {
    length += (i + 1) * base;
  }
  return(length);



}
  public static void main(String[] args) {
    // System.out.println(sumOfSquares(4));
    System.out.println(product(2,3));
    System.out.println(product(-2,3));
    System.out.println(product(2,-3));
    System.out.println(product(-2,-3));
    // System.out.println(compoundInterest(1000,0.05,3));
    // System.out.println(polyspirallength(3, 10, 3));
  }
}
