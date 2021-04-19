//The purpose of this program is to extract the movie titles given an XML format.
public class ExtractMovieTitle{

  //This is the main method of my program calls the extractTitle method.
    public static void main (String[] args){
      String test1 = "<item><title>Hello (2017)</title><meta>"; //Hello (@017)
      String test2 = "item><title>Split (2017)</title><meta><IMBD>6375308</imdb></meta>"; //Split (2017)
      System.out.println(extractTitle(test1));
      System.out.println(extractTitle(test2));
    }
    //The purpose of this method is to extract the title of the film, the method takes in String text, with the
    //text being in XML format.
    public static String extractTitle(String text){
      String result = "";
      int start = text.indexOf("<title>"); //Checks for the where specifically the index of <title> is in the text
      start += 7; //Adds 7 to the start of the substring used later on because <title> has 7 characters positioning the substring to the start of where the title will be
      int end = text.indexOf("</title>"); //The end of the substring occurs when </title> is found
      result = text.substring(start,end); //Creates a substring of the text between these <title> and </title> using the start and end indexs calculted above
    return result; //Returns the movie title
    }
}
