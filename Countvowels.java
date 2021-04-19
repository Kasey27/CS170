//The purpose of this program is to count how many vowels are in a string
public class Countvowels{
  //The purpose of this method is to take in a String s, and to count how many times a vowel occurs in that string. This method returns an
  //int value, which is equal to how many times a vowel occured in said String s.
  public static int countVowels(String s) {
    int result = 0; //This stores the amount of times a vowel is the string s
    for(int i = 0; i < s.length(); i++) { //This for loop checks each character in the string, and takes that ascii number and checks if it is equivalent to a vowel Upper or lowercase
      int ascii = s.charAt(i); //Pulls a letter out of a string and converts it into the ascii number
      if(ascii == 65){ //This checks if the ascii number from the string is equal to vowel A
        result ++;
      }
      else if( ascii == 69) { //This checks if the ascii number from the string is equal to vowel E
        result ++;
      }
      else if(ascii == 73) { //This checks if the ascii number from the string is equal to vowel I
        result ++;
      }
      else if(ascii == 79) { //This checks if the ascii number from the string is equal to vowel O
        result ++;
      }
      else if(ascii == 85) { //This checks if the ascii number from the string is equal to vowel U
        result ++;
      }
      else if(ascii == 97) { //This checks if the ascii number from the string is equal to vowel a
        result ++;
      }
      else if(ascii == 101) { //This checks if the ascii number from the string is equal to vowel e
        result ++;
      }
      else if(ascii == 105) { //This checks if the ascii number from the string is equal to vowel i
        result ++;
      }
      else if(ascii == 111) { //This checks if the ascii number from the string is equal to vowel o
        result ++;
      }
      else if(ascii == 117) { //This checks if the ascii number from the string is equal to vowel u
        result ++;
      }
      else {
        result = result; //If none of these if else statements are true, then the result stays the same
      }
    }
    return result; //Returns the amount of times a vowel occured in the string
  }

//This is my main method which is being used to call my countvowels methods and has several test cases. The purpose of this method is to run my code.
  public static void main(String[] args) {
    System.out.println(countVowels("AEIOUaeiou")); //Test cases
    System.out.println(countVowels("zxcvy")); //Test cases
    System.out.println(countVowels("")); //Test cases
    System.out.println(countVowels("jbAieoBc xoty eamina"));//Test cases
    System.out.println(countVowels("asdkf ekio asdfm !@# asdf")); //Test cases
    System.out.println(countVowels("boy girl son daughter")); //Test Cases
  }
}
