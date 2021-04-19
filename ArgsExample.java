public class ArgsExample {

  public static void main(String[] args){
    //Now we understand that the args above is an array of strings!
    //Let's use it somehow:
      System.out.println("You typed " + args.length + " words."); //Chooses words by number of spaces, to split the words.

      //Everything you type after "java ArgsExample" is read
      // and "Split" based on the number of spaces; multiple consective spaces
      // do not count

      for(int i = 0; i < args.length; i++){
        System.out.println("Arguments " + i + ": " + args[i]); //Chooses words by number of spaces, to split the words.

      }
  }

}
