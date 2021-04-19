//This method counts the amount of words that are in a string.
public class WordCount2 {
	//This is my main method which is utilized to call word count to run the code. There are several test cases to test the method.
	public static void main(String[] args) {
		System.out.println(wordCount("This is a test")); //Test cases
		System.out.println(wordCount("This is a test!!!!!")); //Test cases
		System.out.println(wordCount("")); //Test cases
		System.out.println(wordCount("Wahoo42!??!?!")); //Test cases
		System.out.println(wordCount("hello   triangle  world boy    child   !@#!@$")); //Test cases
		System.out.println(wordCount("i love cs170")); //Test cases
	}
	//Tihs method takes in String text and returns an int value. The int value this method returns is the
	//amount of words that are in that string.
	public static int wordCount(String text) {
		int wordcount = 1; //I set wordcount originally to 1 as if there are no spaces then the word has one zero.

		if(text.length() == 0) {
			wordcount = 0; //This if statement is utilized if the string text is empty, then the return value is equal ot zero.
		}
		else {
			for(int i = 0; i < text.length(); i++) {
				if(text.charAt(i) == 32) { //char value of 32 is equal to a space.
					wordcount ++; //Add 1 number for the amount of words that are in the string
					int b = i + 1;
					while(text.charAt(b) == 32) { //I used this while statement to continue running the code to check for additional spaces between words
						b++;
					}
					i = b; //I set the i equal to b so that the next character inspected is the first letter of the next word
				}
				else {
					wordcount = wordcount; //This else statement returns the same word count and is being used if the character inspected isn't a space then the word count remains the same
				}
			}
		}
		return(wordcount); //Returns the amount of words in the string
	}
}
