//The purpose of this program is to count the amount of times a letter occurs in a string.
public class LetterCount{

  //This is my main method which is used to call lettercount method and has several cases. The purpose of this code is to
  //check the amount of times a certain letter occurs in a string.
  public static void main(String[] args) {
    System.out.println(lettercount("abc-123-abc-ABC", "b")); //Test Cases
    System.out.println(lettercount("This is interesting!", "z")); //Test Cases
    System.out.println(lettercount("", "q")); //Test Cases
    System.out.println(lettercount("asdfaoifasbf1245!@$zxcvkmdafnwb", "b")); //Test Cases
    System.out.println(lettercount("abc-0313-rroskin traingle", "a")); //Test cases
  }
//The purpose for this method is to count the amount of letters that are in a string s, and check if a certain letter string c, exists in those letters.
//This returns a value of int for how many times that letter is in that string of text s.
  public static int lettercount(String s, String c) {
    int result = 0; //This variable is storing how many times the character occurs in that number
    int asciiCharacter = c.charAt(0); //This produces the asciiCharacter for the letter that is being checked
    for(int i = 0; i < s.length(); i++) { //This for loop checks each character in the string, converts them into asciiicharacter values, then checks if that ascii character value is equal to the value in the letter
          int ascii = s.charAt(i); //Produces the ascii int value for each letter in the string
        if(ascii == asciiCharacter) { //Checks if those two int values match from the letter in the string and the letter of the given value
          result ++; //Adds one to the value
        }
        else {
          result = result; //Result stays the same if the int values dont match
        }
    }
    return result; //Returns the amount of times that speicific character c occurs in that string.
  }
}
