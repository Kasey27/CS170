public class Polywheel {

//This method creates the basic polygon which takes the user's request of the numSides (number of sides of the polygons
//The parameter length as to describe the length of each of the sides. The method takes in Turtle t, as Turtle graphics are being used to draw the respected polygon.

public static void polygon(Turtle t, int numSides, double length) {
    for(int i = 0; i < numSides; i++) { //This for loop creates each side of the polygon and continues until the number of sides is reached.
      t.forward(length); //Goes forward for the length of each side as requested by the user
      t.left(360/numSides); //After drawing the side length, the polygon turns to the left based off the number of sides of the polygon requested
    }
  }

//The polywheel method creates a polygonal wheel drawing the outside wheel using the same polygon throughout. The parameters that this function takes the parameters Turtle t,
// as Turtle graphics are being used to draw the respected polygon
//The parameter numSides (number of sides of the polygons) to create a polygon with the number of sides the user requests and finally the parameter length, which is the
//length of each of the sides of the polygon.

//The output of this method is a poylgonal wheel.


public static void polywheel(Turtle t, int numSides, double length) {
  for(int b = 0; b < numSides; b++) {
      polygon(t, numSides,length); //This calls the polygon method to create a polygon
      t.forward(length); //This goes forward to give room for the next polygon, which will be created after the for loop is run once
      t.right(360/numSides); //This changes the angle of line segment to again change the angle that the polygon is created after the for loop is run once.
  }

}

  //This is my main method that users can call the polywheel method to test if it works. The Turtle graphics variable name t is created here, as without it
  //the other methods cannot run. I also included test cases in comments.
  public static void main(String[] args) {
    Turtle t = new Turtle(); //Creates the Turtle
    //  polywheel(t,4,50); //Test Case
    //  polywheel(t,3,70); //Test Case
      polywheel(t,12,15);  //Test Case

  }



}
