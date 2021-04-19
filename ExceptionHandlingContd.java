import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class ExceptionHandlingContd {

  // Reading material: https://www.w3schools.com/java/java_try_catch.asp

  public static void main(String[] args) {

    // What happens if we change the order of these two catch
    // blocks, in the example below?
    //    catch(Exception e) <--- this catches *any* Exception
    //    catch(FileNotFoundException e)
    try {
      // x = 3 / 0; // divide by zero
      int[] y = new int[4];
      // y[6] = 10; // invalid array index

      // If this file is not found, where will the problem be "caught"?
      Scanner input = new Scanner(new File("blah.txt"));
    }
    catch(ArithmeticException e){
      System.out.println("An ArithmeticException occured: " + e.getMessage());
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("An ArrayIndexOutOfBoundsException occured at index: " + e.getMessage());
      e.printStackTrace(); // you can also print the entire exception stack trace
    }
    // // What happens if we comment/uncomment this catch block?
    catch(FileNotFoundException e){
      e.printStackTrace();
    }
    catch(Exception e){ //Generalize format, fall into that category
      System.out.println("Something wrong happened, but it was neither ArithmeticException nor ArrayIndexOutOfBoundsException....");
      e.printStackTrace();
    }
    System.out.print("This line will be printed out after the first exception handling! \n");

    // --- Contd. discussion from previous lecture --- //
    // try-catch-finally with File I/O
    // Note: The finally block is always executed. If the execution of the try block is successful, then the finally block is executed immediately after the try. If an exception occurs, then the corresponding catch block is executed, followed by the finally block. The finally block is the place where we do any necessary cleanup.
    //  System.out.println("calcAvgGradeFromFile(blah.txt) => " + calcAvgGradeFromFile("blah.txt") + "\n"); // file does not exist
    // System.out.println("calcAvgGradeFromFile(example1.txt) => " + calcAvgGradeFromFile("example1.txt") + "\n"); // file contains text (not double values)
    // System.out.println("calcAvgGradeFromFile(example2.txt) => " + calcAvgGradeFromFile("example2.txt") + "\n"); // valid (but still visits the finally block)

     fileMatchAndWrite("hamlet.txt", "hamlet_version2.txt");
  }

  // File operations with try-catch-finally
  // Let's add exception handling to our calcAvgGradeFromFile method:
  public static double calcAvgGradeFromFile(String fileName) {
    int count = 0;
    double sum = 0.0;
    File file;
    Scanner scanner = null;
    try{
      file = new File(fileName);
      scanner = new Scanner(file);
      while (scanner.hasNext()) {
        sum += scanner.nextDouble();
        count++;
      }
    } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
        return -1; // e.g. error code
    } catch (InputMismatchException e) {
        System.out.println("Input must be double!");
        return -2; // e.g. error code
    } finally { // cleanup time: release the file scanner!
      System.out.println("Inside the finally block: releasing file resources...");
      if (scanner != null)
        scanner.close();
    }
    return sum / count;
  }


  /**
   * Reads lines from file, replaces "to", "too", or "two" (case insensitive)
   * with the number 2, then writes the output text to another file
   *
   * @param fileInputName name of the source file
   * @param fileOutName name of the destination file
   */
  public static void fileMatchAndWrite(String fileInputName, String fileOutName) {
    File file = null;
    Scanner scanner = null;
    FileWriter fileWriter = null;
    BufferedWriter out = null;
    String text = "";
    try{
      file = new File(fileInputName);
      scanner = new Scanner(file);
      while (scanner.hasNext()) {
        String line = scanner.nextLine();
        String lineNew = line.replaceAll("[tT][wW]?[oO]+", "2");
        text += lineNew + "\n";
      }
      // Write new text to file
      fileWriter = new FileWriter(fileOutName);
      out = new BufferedWriter(fileWriter);
      out.write(text);
      out.close();
    } catch(IOException e){
        System.out.println("IOException occurred inside fileMatchAndWrite method:");
        e.printStackTrace();
    } finally { // cleanup time: release the file scanner!
      if(scanner != null)
        scanner.close();
    }
  }

}
