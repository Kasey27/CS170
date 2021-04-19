
//The purpose of this program is to calculate the value that occurs when you divide each element in an array by the preceding
//element, until you stop at the n-th element.
public class RobustDivision{

//This is the main method of my program which has several test cases that shows how my program handles differnet exceptions
  public static void main(String[] args){
    int[] test1 = {2,4,6,0,8,16}; //Array of elements to test on
    int test1_number = 4; //To what index the function goes to.
    int test2_number = 5;
    int test3_number = 7;
    System.out.println(sumOfIntegerDiv(test1,test1_number)); //3
    System.out.println(sumOfIntegerDiv(test1, test2_number)); //Handling ArithmeticException, //5
    System.out.println(sumOfIntegerDiv(test1, test3_number)); //Handling ArrayIndexOutOfBoundsException, //5
  }

  //This is my method utilized to calculate the value that occurs when you divide each element in an array by the preceding
  //element, until you stop at the n-th element. This function takes in the paramaters int[] a which is the array of numbers
  //as well as integer n, which is the number of index the function goes to, this method returns a sum integer value
  public static int sumOfIntegerDiv(int[] a, int n) {
    int result = 0;
    for(int i = 1; i < n; i++) {
    try{ //This try and catch goes through each of the different exceptions.
      result += a[i]/a[i-1];
      } catch(ArithmeticException e){
          System.out.println("Cannot Divide by zero. Skipping index: " + a[i-1]);
          n = n+1; //I add one to the index, so that the next number can proceed if this specific exception occurs, skips that value.
        } catch(ArrayIndexOutOfBoundsException e){
          System.out.println("Cannot access array at index: " + i);
        } catch(Exception e){
          System.out.println("Something went wrong! Skipping index: " + i);
          n = n+1; //I add one to the index, so that the next number can proceed if this specific exception occurs, skips that value.
        }
      }
    return result; //returns total sum of the result;
  }
}
