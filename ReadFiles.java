import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class ReadFiles {

  // We will discuss what "throws FileNotFoundException" means next lecture ;-)
  public static void main(String[] args) throws FileNotFoundException {

    // ----------------------------------------------- //
    // From last lecture: replaceAll()
    String text = "To be, or not to be. That is the question.";
    // Q1: Replace with:
    // "To be, or not to be. That is the question."
  //  System.out.println(text.replaceAll("e","eee"));
//    System.out.println(text.replaceAll("(e)(\\w)", "$1$1$1$2"));


    // Someone messed up the text... let's fix it!
    text = "To be , or not to be. That is the question .";
    text = fixString(text);
    System.out.println(text);

    /* Sources:
      Section 3.4: Grouping and back reference
      Section 3.5: Negative look ahead
      https://www.vogella.com/tutorials/JavaRegularExpressions/article.html
      More Exercises: http://regex.sketchengine.co.uk/cgi */
    // ----------------------------------------------- //


    // Q3: Now let's read the text from a file instead
    String filename = "example1.txt";
    // Step 1: create a File object
    File file = new File(filename);
    //File file = new File("example1.txt");




    // Some supported functions in Java:
    // System.out.println(file.canRead());
    // System.out.println(file.canWrite());
    // System.out.println(file.isFile());
    // System.out.println(file.isDirectory());
    // //System.out.println(file.delete());
    // System.out.println("File Path:" + file.getPath());
    // System.out.println("File Path:" + file.getAbsolutePath());
    // System.out.println("File Path:" + file.exists());


    // Step 2: create Scanner object
    Scanner scan = new Scanner(file); //Input for scanner is file;
  //  Scanner scan = new Scanner(file2); //Input for sccaner 2 is file


    // Step 3: read file line by line
    // while(scan.hasNextLine()){
    //   String line = scan.nextLine();
    //   System.out.println(fixString(line));
    // }
    // while(scan.hasNextDouble()){
    //   double value = scan.nextDouble();
    //   System.out.println(calcAverageFromFile(value));
    // }

    // Step 4: remember to close the scanner object!
    scan.close(); //Open file and have to clsoe it when another porgram wants to edit hat file, it gets errors because it is opened on another project.



    // More file input examples:
    String fileName2 = "example2.txt"; // try: example2_newline.txt
     System.out.println(calcAverageFromFile(fileName2));
     double [] grades = readGradesFromFile(filename2);
     System.out.println(readGradesFromFile(fileName2));

     (int i = 0;  i)
    // Test: fileMatchAndPrint("hamlet.txt")
  }


  // Q2: Remove white space between a word character and . or ,
  public static String fixString(String str) {
    String pattern = "(\\w)(\\s+)([\\.,])";
      return str.replaceAll(pattern,"$1$3"); //Only want the 1 and fourth one everything else not incldued
  }



  // Q4: Read double values from a file and return their average
  public static double calcAverageFromFile(String fileName) throws FileNotFoundException {
    String filename2 = "example2.txt";
    File file2 = new File(filename2);
    Scanner scan = new Scanner(file2); //Input for sccaner 2 is file

    double sum = 0;
    double count = 0;
    while(scan.hasNextDouble()){
      sum += scan.nextDouble();
      count ++;
    }

    scan.close();
    return sum/count; // temporarily
  }




  // Q5: Read double values from a file and store them
  // into an array, then return the array
  public static double[] readGradesFromFile(String fileName) throws FileNotFoundException {
    String filename2 = "example2.txt";
    File file2 = new File(filename2);
    Scanner scan = new Scanner(file2); //Input for sccaner 2 is file

    int count = 0;

    while(scan.hasNextDouble()){
        scan.nextDouble();
        count++;
    }
    scan.close();

        double[] GradeArray = new double[count];
        count = 0;
        double value = 0;
        scan = new Scanner(filename2);
        while(scan.hasNextDouble()){
        value = scan.nextDouble();
        GradeArray[count] = value;
        count++;
      }
      scan.close();
    return GradeArray;
  }

  // Q6: Read lines from file and print them while replacing
  // "to", "too", or "two" (case insensitive) with the number 2
  public static void fileMatchAndPrint(String fileName) throws FileNotFoundException {
    // TODO
  }

}
