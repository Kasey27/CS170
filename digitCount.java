//The purpose of this code is to check if a certain digit is stored in a certain number and if so how many times does that digit exist in that number
public class digitCount {

  //This is my main method which is being used to run the code.
  public static void main(String[] args) {
   System.out.println(digitCount(842,8)); //Test cases
   // System.out.println(digitCount(456234,4)); //Test cases
   // System.out.println(digitCount(456234,5)); //Test cases
   // System.out.println(digitCount(456234,4)); //Test cases
   // System.out.println(digitCount(-456234,4)); //Test cases
   // System.out.println(digitCount(0,0)); //Test cases
  }
//This method is utilized to count the amount of digits that are in a given number. This method returns an int value
//which is equivalent to the amount of times that digit is in the number.
  public static int digitCount(int number, int digit) {
    int result = 0; //The end result of how many times the digit is in the number.
    int length = (int)Math.log10(number) + 1; //This number is used to calculate the length of the number, which is used for the for loop later on the problem
    int checkDigit = 0; //This variable is being used to store the value of the number for each of the iterations in the for loop.
    int storeDigit = 0; //This  variables stores the last number so it can be used to substract from the total
    int checkDigit2 = 0; //This variable is being used to check if the value produced is the same as the digit
    if(number == 0 && digit == 0) { //This condition is being used if the number and digit both equal zero.
      result ++;
      return result;
    }
    else if( number < 0) { //This else if statement is being used if the number is < 0, for all those negative numbers
      number = number * - 1; //This condition makes the negative number positive
      length = (int)Math.log10(number) + 1; //I recalculate length here because the -negative number would give me a wrong number
      for(int i = 1 ; i < length + 1; i++) {
       checkDigit = number / (int) Math.pow(10,length-i); //This equation extracts digits out of the number so For example: 456234, this method produces 4, then 45, then 456.
       checkDigit2 = (storeDigit - checkDigit) * -1; //This equation calculates the specific digit from the number.
       storeDigit = checkDigit * (int) Math.pow(10,1); //This stores the original checkdigit value and multiplies it by 10 to substract it later on to get that speicfic number so for example: 456234, this method produces 40, then 450, then 456
       if(digit == checkDigit2) { //This checks if the digit is equal to the digit extracted from the number.
         result ++;
       }
       else { //This checks if the digit is not equal to that number
         result = result;
        }
       checkDigit2 = 0; //This resets the checkdigit back to zero
      }
    }
    else { //This condition is being used if the number is >= 0
    for(int i = 1 ; i < length + 1; i++) {
     checkDigit = number / (int) Math.pow(10,length-i); //This equation extracts digits out of the number so For example: 456234, this method produces 4, then 45, then 456.
     checkDigit2 = (storeDigit - checkDigit) * -1; //This equation calculates the specific digit from the number.
     storeDigit = checkDigit * (int) Math.pow(10,1); //This stores the original checkdigit value and multiplies it by 10 to substract it later on to get that speicfic number so for example: 456234, this method produces 40, then 450, then 456
     System.out.println(checkDigit);
     System.out.println(checkDigit2);
     System.out.println(storeDigit);
     if(digit == checkDigit2) { //This checks if the digit is not equal to that number
       result ++;
     }
     else {
       result = result;
      }
     checkDigit2 = 0; //This resets the checkdigit back to zero
    }
  }
    return(result); //This returns the amount of digits that are in the number.
  }
}
