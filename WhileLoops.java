public class WhileLoops {

  public static void main(String[] args) {

  //  helloMultiverse(4);
  // countdownReverse(4);
  // System.out.println(sumN(5 ));
  // System.out.println(yearsToTarget(1000,0.05,2000));
  System.out.println(breakEvenQuantity_Teacher(1, 0.7,1000));
  System.out.println(breakEvenQuantity_Teacher(1, 0.5, 1000));
  }
 //Example 0: Simple Repetition
  public static void helloMultiverse(int n) {
    int i = 0;

    while( i < n) {
      System.out.println("Hello Universe #" + (i+1) + "!");
      i++;
    }
}
//Counts down from 10 ->1;
    public static void countdownReverse(int n) {
      int i = n;
      while( i > 0) {
        System.out.println(i--);
      }
  }

  //Accumulation another strategy both
  public static int sumN(int n) {
    int sum = 0;
    while(n > 0) {
      sum += n;
      n--;
    }
    // int i = 1;
    //while( i <=n) {
    // sum +=i;
    // i++;
      return sum;
  }

  public static int yearsToTarget(double initMoney, double interestRate, double targetMoney) {
    int year = 0;
    double sum = initMoney;
        System.out.println("year \t sum");
    while(sum < targetMoney) {
      year++;
      sum *=  1 + interestRate; //money * (1+interstRate)
      System.out.println(year + "\t" + (int)(sum*100) / 100.00);
    }
    return year;
  }
  //
  // public static int breakEvenQuantity(double p, double c, double k) {
  //   int cost = 0;
  //   int cost2 = 0;
  //   while(cost < k){
  //     cost += p;
  //   }
  //   while(cost < k) {
  //     cost2 += c;
  //   }
  //   System.out.println( "The cost of buying your product for " + k + "is " + cost + "while the cost of making your product is " + cost2);
  //   if(cost > cost2) {
  //   return(cost);
  // }
  // else if (cost2 > cost) {
  //   return(cost2);
  // }
  // }

  public static int breakEvenQuantity_Teacher(double p, double c, double k){
    int quantity = 0;
    double costBuy = 0;
    double costMake = k;

    while(costBuy < costMake) {
      quantity++;
      costBuy+= p;
      costMake += c;
    }
    return quantity;
  }
}
