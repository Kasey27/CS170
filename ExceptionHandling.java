import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class ExceptionHandling {

  public static void main(String[] args) {
       //
 //       // int x = 3/0;
 //       // System.out.println(" Resuming program execution (System not exist!)");
 //      /*syntax for try catch
 //      try{
 //      //protected code
 //    }
 //  } catch(Exception e) {
 //    //Catch block to handle exceptions(of type Exception)
 // }
 //
 // */
 // // 1. Simple try-catch example
 //
 // int x;
 // try{
 //   x = 3/0;
 // }
 // catch (Exception e){ //Exception is a class,
 //   System.out.println("An Exception occured: " + e.getMessage());
 // }
 //  System.out.println(" Resuming program execution (System not exist!)");

  //2, we can also catch specific types of exceptions
  // try{ x = 3/0; }
  // catch(ArithmeticException e){
  //  System.out.println("An ArithmeticException occured: " + e.getMessage());
  // }
  //   System.out.println(" No2. Resuming program execution (System not exist!)");
  //3. We can have multiple catch blocks (catching different types
  //of exceptions)
  try{
  //  int x = 3/0;
    // int[] y = new int[4];
    // y[6] = 10;

    //if this file is not found
    Scanner input = new Scanner(new File("blah.txt"));
  } catch(ArithmeticException e){
   //     System.out.println("An ArithmeticException occured: " + e.getMessage());
   // } catch(ArrayIndexOutOfBoundsException e){
   //      System.out.println("An ArrayIndexOutofBoundException occured at index: " + e.getMessage());
   //      e.printStackTrace(); //Prints the exact tract of the problem
   // }
   //    //4. What happens if I catch this file not found exception
   //    catch(FileNotFoundException e){
   //   System.out.println("An FileNotFoundException occured at index: " + e.getMessage());
   //   e.printStackTrace();
   // }
   //
   // System.out.println("==========Test===========");

   //5. Method "throw" exceptions back to the caller( in this case)
   //the main method)
   //divide(4,0); //Implicitly
  // divide2 (4,0); //Excplicitly get and handle the except
 // angryMethod(); //Explicitly throw a RuntimeException

  // int n1 = convertStringToInt("3");
  // System.out.println(n1);
// try{
//   int n2 = convertStringToInt("three");
//   System.out.println(n2);
// }catch(NumberFormatException e){
//   System.out.println(e.getMessage());
// }
// System.out.println("helllllo");

  System.out.println("calcAvgGradeFromFile(blah.txt)");
  calcAvgGradeFromFile("blah.txt") + \n)
}

  // If y is zero, this method will throw an ArithmeticException to its caller
  public static int divide(int x, int y) {
      int z = x / y;
      return z;
  }
  // You can also "throw" exceptions explicitly in Java
  public static int divide2(int x, int y) {
    if(y==0) throw new ArithmeticException("Divide by 0!:(");
    int z = x / y;
    return z;
  }

//   // You can throw a RuntimeException with a custom message
  public static void angryMethod() {
    throw new RuntimeException ("Throwing a Tantrum!!");
  }
//
  // This method has its own try-catch
  public static int convertStringToInt(String str) {
    int result = 0;
    try{
      result = Integer.valueOf(str);
    } catch(NumberFormatException e) {
      throw new NumberFormatException("We can throw a customized message back...");
    }
    System.out.println("********");
    return result;
  }
//
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

  //
  // /**
  //  * Reads lines from file, replaces "to", "too", or "two" (case insensitive)
  //  * with the number 2, then writes the output text to another file
  //  *
  //  * @param fileInputName name of the source file
  //  * @param fileOutName name of the destination file
  //  */
  // public static void fileMatchAndWrite(String fileInputName, String fileOutName) {
  //   File file = null;
  //   Scanner scanner = null;
  //   FileWriter fileWriter = null;
  //   BufferedWriter out = null;
  //   String text = "";
  //   try{
  //     file = new File(fileInputName);
  //     scanner = new Scanner(file);
  //     while (scanner.hasNext()) {
  //       String line = scanner.nextLine();
  //       String lineNew = line.replaceAll("[t|T][w|W]?[o|O]+", "2");
  //       text += lineNew + "\n";
  //     }
  //     // Write new text to file
  //     fileWriter = new FileWriter(fileOutName);
  //     out = new BufferedWriter(fileWriter);
  //     out.write(text);
  //     out.close();
  //   } catch(IOException e){
  //       System.out.println("IOException occurred inside fileMatchAndWrite method:");
  //       e.printStackTrace();
  //   } finally { // cleanup time: release the file scanner!
  //     if(scanner != null)
  //       scanner.close();
  //   }
  // }

 }
