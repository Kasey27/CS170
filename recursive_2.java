public class recursive_2{

  public static void main(String[] args){
    // // test addDigits
    // System.out.println("---test addDigits----");
    // // System.out.println(addDigits(5));
    // // System.out.println(addDigits(37));
    // // System.out.println(addDigits(1325));
    // int[] x1 = {};
    // int[] x2 = {5};
    // int[] x3 = {2,1,3};
    // // System.out.println(addsum(x1,x1.length));
    // System.out.println(addsum(x2,x2.length));
    // System.out.println(addsum(x3,x3.length));


    //   //test oddCount
    //   int[] x4;
    //   int[] x5;
    //
    // System.out.println(oddCount);

    int[] x7 = {2,5,1,4,3};
    System.out.println(min(x7,x7.length));
    System.out.println(minIndex(x7,x7.length)); s


    System.out.println(f1(3,2);

    System.ot.println("------ test f2----");
    System.out.println(f2(20));

  }
  public static int addDigits(int n){
    if(n < 10) { //base case single-digit number
      return n;
    }
    else {
      return (n % 10) + addDigits(n/10); //Remainder is the very last digit + , took care of the last idigt now you can remove it
    }
  }

  public static int addsum(int[] x, int n){
    if(n == 0) { //base case single-digit number
      return 0;
    }
    else {
      return (x[n-1]) + addsum(x,n-1); //Remainder is the very last digit + , took care of the last idigt now you can remove it
    }
  }

  // public static int sum2(int [] x. int n, int start){
  //
  // }

  public static int oddCount(int[] x, int n){

          if(n == 0) { //base case single-digit number
              return 0;
            }
            else if (x[n-1] % 2 == 1) { //oddd
              return 1 + oddCount(x,n-1); //Remainder is the very last digit + , took care of the last idigt now you can remove it
            }
            else{ //even
              return oddCount(x, n-1);
            }
          }


        // public static int oddCount2(int[] x, int n){
        //
        //         if(n == 0) { //base case single-digit number
        //             return 0;
        //           }
        //           else { //oddd
        //             return x[n-1] % 2 + oddCount(x,n-1); //Remainder is the very last digit + , took care of the last idigt now you can remove it
        //           }
        //         }
        //   }

        public static int min(int[] x, int n){
          if(n==1){
            return x[0];
          }
              else {
              int k = min(x,n-1);
                 if(x[n-1] < k){
                  return x[n-1];
                }else{
                  return k;
                }
          }
        }
        public static int minIndex(int[] x, int n){
          if(n==1){
            return 0;
          }
              else {
              int k = minIndex(x,n-1);
                 if(x[n-1] < k){
                  return x[n-1]);
                }else{
                  return k;
                }
          }
        }

      public static void f1(int x, iny y){
        if( x== y){
          System.out.println("done " + x + " " + y);
        }
        else if( x> y) {
          System.out.println("swap   " + x + " " + y);
          f1(y,x);
        }
        else {
         System.out.println("cut" + x + " " + y);
          f1(x,y / 2);
        }
      }
      public static int f2(int n){
        if (n<3){
          System.out.println("end");
          return n;
        } else{
          System.out.println("go" + n);
          return 1+ f2 (n/2);
        }
      }
      public static int f3(int n){
        if(n > 5){
          return n-5;
        } else{
          System.out.println(n);
          return f3(n+2) + f3(n+3);
        }

      }
}
