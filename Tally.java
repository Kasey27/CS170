//This program counts the number of vowels(a,e,i,o,u) in a string
public class Tally {
	
    public static void main(String[] args) {

        tally("HEY! Apples and bananas!"); // ouput {5,2,0,0,0}
        tally("Aunt Sue is craaaaazy"); //output {6,1,1,0,2}
        tally("Mississppi"); //output {0,0,3,0,0}
        tally("NOWAYJOSE!"); //ouput {1,1,0,2,0}
        tally("Sync"); //output {0,0,0,0,0}

    }
    //This method returns an array of integers
    // that contains the frequency of each vowel
    //(a,e,i,o,u) in a string
    //If the string has no vowels the method
    //will return an array of zeros
    public static int[] tally(String x) {
        int frequencyA = 0;
        int frequencyE = 0;
        int frequencyI = 0;
        int frequencyO = 0;
        int frequencyU = 0;
        //checks if the character at index i is
        //the uppercase or lowercase form of a vowel
        //if the statement is true 1 is added to the
        //frequency of that vowel
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'A' || x.charAt(i) == 'a') {
                frequencyA += 1;
            }
            if (x.charAt(i) == 'E' || x.charAt(i) == 'e') {
                frequencyE += 1;
            }
            if (x.charAt(i) == 'I' || x.charAt(i) == 'i') {
                frequencyI += 1;
            }
            if (x.charAt(i) == 'O' || x.charAt(i) == 'o') {
                frequencyO += 1;
            }
            if (x.charAt(i) == 'U' || x.charAt(i) == 'u') {
                frequencyU += 1;
            }
        }
        //creates an array of five elements (representing the five vowels)
        int[] newArray = new int[5];
        //assigns the value (int) for the frequency of each vowel to an index in the array
        newArray[0] = frequencyA;
        newArray[1] = frequencyE;
        newArray[2] = frequencyI;
        newArray[3] = frequencyO;
        newArray[4] = frequencyU;
        //prints the elements in the array
        System.out.println(arraytoString(newArray));
        return newArray;
    }
    //Helper method to print out the array for vowel frequency
    public static String arraytoString(int[] x) {
        String result = "[";
        for (int i = 0; i < x.length - 1; i++) {
            result += x[i] + ", ";
        }
        if (x.length > 0) {
            result += x[x.length - 1];
        }
        result += "]";
        return result;
    }
}
