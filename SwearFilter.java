//The purpose of this program is to filter out swear words in a text.
public class SwearFilter {
	public static void main (String[] args){
		String text = "duck ship wheat DUCK SHIP WHEAT Duck Ship Wheat ducK shiP wheaT shipping";
		String[] swear = {"duck", "ship", "wheat"};
		System.out.println(swearfilter(text,swear));
		   text = "A duck was sailing on a ship shipping whole wheat bread. Duck that SHIP!!!";
			 System.out.println(swearfilter(text,swear));
	}

 public static String swearfilter(String text, String[] swear){
int wordCount = wordCount(text);
String[] textArray = new String[wordCount];
textArray = stringtoArray(text);
String[] swearWords_2 = replacedswearwords(swear);
String finalresult = ""; //Final result after method
String checkword = ""; //This is the original word
String checkword2 = ""; //This is the swear.
boolean checkcapitilaztion_Front = false; //CHecks if the first char is lower or uppercase
boolean checkcapitilaztion_End = false; //CHecks if the last character is lower or uppercase
for(int z = 0; z < textArray.length; z++) {
		checkword = textArray[z]; //Set the orginal word to the first vvalue in the array
		int ascii = textArray[z].charAt(0); ////Uppercase check
		int ascii2 = textArray[z].charAt(textArray[z].length()-1); //Uppercase check
		boolean uppercasecheck = false;
		boolean uppercasecheck_2 = false;
		if(ascii > 64 && ascii <= 90) { //Uppercase check
			uppercasecheck = true;
		}
		if(ascii2 > 64 && ascii2 <= 90){ //Uppercase check
			uppercasecheck_2 = true;
		}
		checkword = checkword.toLowerCase(); //Sets the string to lower case.
		for(int h = 0; h < swear.length; h++) {
			checkword2 = swear[h]; //Makes it equal to the first swear.
			if(checkword.equals(checkword2)) { //if the swear is equal to the checkword then...
					checkword = swearWords_2[h];

						if(uppercasecheck && uppercasecheck_2){ //Uppercase check
							checkword = checkword.toUpperCase();
						}
						else if (uppercasecheck){ //Uppercase check
							String ucswearword = "";
							int ascii3 = 0;
							ascii3 = checkword.charAt(0) - 32;
							ucswearword += (char)(ascii3);
							ucswearword += checkword.substring(1,checkword.length());
							checkword = ucswearword;
						}
						else if (uppercasecheck_2){ //Uppercase check
							String ucswearword = ""; //Uppercase check
							int ascii3 = 0;
							ucswearword += checkword.substring(0,checkword.length()-1);
							ascii3 = checkword.charAt(checkword.length()-1) - 32;
							ucswearword += (char)(ascii3);
							checkword = ucswearword;
						}
						else{
							checkword = checkword;
					}
				}
			}
			finalresult += checkword + " ";
		}
			return finalresult;
}





//Method to take a string and make it to an array.
public static String[] stringtoArray(String text) {
		String substring = "";
		String text2 = text + " ";
		int wordCount = wordCount(text);
		int indexsubstring = 0;
		int topendindexsubstring = 0;
		String word = "";
		String[] textArray = new String[wordCount];

		for (int i = 0; i < wordCount; i++) {
				int b = word.length();
				while (text2.charAt(b) != 32) {
						if (b > text.length()) {
								break;
						} else {
								word += text2.charAt(b);
								b++;
						}
				}

				int c = word.length();
				word += " ";
				topendindexsubstring = b;
				substring = text2.substring(indexsubstring, topendindexsubstring);
				if (indexsubstring < text2.length()) {
						if (indexsubstring + 1 > text2.length()) {
								indexsubstring = indexsubstring;
						} else {
								indexsubstring = topendindexsubstring + 1;
						}
				}
				textArray[i] = substring;
		}
		return textArray;
}


//This method takes the swear words and make them into *** so duck -> d**k, etc. etc. I call this method to set the word if present to the cursed out version of the word.
public static String[] replacedswearwords(String[] swear){
	String[] replacedswearwords = new String[swear.length]; //This array has upper and lower case swears.
	int count = 0;
		for(int k = 0; k < swear.length; k++){
		  	String swearword_2 = "";
				swearword_2 += swear[k].charAt(0);
				int astericks = 0;
				if(swear[k].length() <= 2) {
					astericks = 0;
				}
				else if(swear[k].length() % 2 == 1){
				 	astericks = (int) swear[k].length() / 2;
					astericks += 1;
				}else {
						astericks = (int) swear[k].length() / 2;
				}
				 for(int c = 0; c < astericks; c++) {
					swearword_2 += "*";
				 }
				 swearword_2 += swear[k].charAt(swear[k].length()-1);
				 replacedswearwords[k] = swearword_2;
		    }
					return replacedswearwords;
}

//Produces the substring of the swear
public static String substringswear(String text, String[] swear) {
	String result = "";
int wordCount = wordCount(text);
String[] textArray = new String[wordCount];
textArray = stringtoArray(text);
String[] swearWords_2 = replacedswearwords(swear);
String finalresult = "";
String checkword = "";
String checkword2 = "";
boolean checkcapitilaztion_Front = false;
boolean checkcapitilaztion_End = false;
for(int z = 0; z < textArray.length; z++) {
		checkword = textArray[z];
		int ascii = textArray[z].charAt(0);
		checkword = checkword.toLowerCase();
		for(int h = 0; h < swear.length; h++) {
			checkword2 = swear[h];
			if(checkword.equals(checkword2)) {
					checkword = swearWords_2[h];
				}
				for(int i = 0 ; i < checkword.length(); i++){
					String word = checkword.substring(0,i);
					if(word.compareTo(checkword2) == 0){
						word = swearWords_2[h];
						word += checkword.substring(i,checkword.length());
						checkword = word;
					}
				}
			}
						result = checkword;
		}
			return result;
}



public static int wordCount(String s) {
		int indexOfSpace = 0;
		int result = 0;
		int i = 0;
		int numSpaces = 0;
		while (i < s.length()) {
			if (s.substring(i, i+1).equals(" ")) {
				indexOfSpace = i;
				numSpaces += 1;
				if ((s.charAt(i) < indexOfSpace || s.charAt(i) > indexOfSpace && s.substring(i) != " ")) {
					result += 1;
				} else{
					result += 0;
				}
			}
			else if (i == (s.length() - 1)) {
				result += 1;
			}
			i++;
		}
		return result;
	}


	/**
	  * Returns a string representation of an array of integers in the following
	  * format: [a0, a1, a2, ..., an-1]
	  *
	  * @param a an array of integers
	  * @param n the number of elements in a (n <= a.length)
	  */
	 public static String arrayToString(String[] a, int n) {
	   String result = "[";
	   for (int i = 0; i < n - 1; i++) {
	     result = result + a[i] + ", ";
	   }
	   if (n > 0) {
	     result = result + a[n - 1];
	   }
	   result += "]";
	   return result;
	 }
}
