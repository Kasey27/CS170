public class Polyspiral {

//The purpose of this program is to create a spiral using Turtle graphics of any type of polygonal shape.

//Polyspiral method takes the parameters Turtle t, utilize Turtle graphics to draw the spiral, int n, n stands for the polygonal shape of the polyspiral to create,
//The parameter double base, indicates the size of the smallest side of the spiral, the base is also used in the method to make other sides longer as shown within the first for loop
//The parameter int rounds indicates the number of rounds of the spiral of that respective polygon that the user wants in the image.

//The output of this method is a spiral of any shape of a polygon
  public static void Polyspiral(Turtle t, int n, double base, int rounds) {

        for(int i = 0; i < n * rounds; i++) { //This for loop is creating the spiral for each spiral. The output of this for loop is a polyspiral shape
          t.forward(( i + 1) * base); //I go forward by this equation because each side of the polygon is longer as the spiral is created.
          t.right(360/n); //This produces the correct angle required to produce that polygon shape, dependent on the shape of the polygon, so 2 is a triangle and 4 is a square etc.
        }
        t.penup(); //This brings the penup so that the next for loop does not draw over the same spiral that was produce
        for(int i = (n * rounds)-1 ; i >= 0 ; i--) { //This for loop allows for the turtle to go back to the starting place
          t.left(360/n);
          t.backward(( i + 1) * base);
        }
        t.pendown(); //This brings the pen down so that for the next for loop if u call the method twice, the pen is alredy down, ready to create the next spiral.

      }


  public static void main(String[] args) {
    Turtle t = new Turtle(); //Creates the Turtle
     Polyspiral(t,5,10,4); //These are the test cases
    //Polyspiral(t,8,40,5); //These are the test cases
    //Polyspiral(t,3,20,5); //These are the test cases


  }

}
