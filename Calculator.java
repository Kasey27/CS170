//This programs implements a simple calculator ussing command line Arguments

public class Calculator {

  public static void main(String[] args){

      if(args.length != 3){
        System.out.println("Usage: java Calculator <number> <operator> <number>");
        System.exit(0); //Terminates java program 0->termination is successful.
      } else{
        double result = 0;
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[2]);
        String operation = args[1];
        if(operation.equals("+")){
          System.out.println(result = x + y);
        } else if(operation.equals("-")){
          System.out.println(result = x-y);
        } else if(operation.equals("*")){ //Have to type out "*" in command prompt
            System.out.println(result = x*y);
        } else if(operation.equals("/")){
            System.out.println(result = x / y);
        } else{
          System.out.println("operation not supported");
        }
        }
      }
  }
