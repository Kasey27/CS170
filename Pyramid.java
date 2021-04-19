public class Pyramid {


//This method is responsible for drawing one single square block of the pyramid. The parameters this method uses is it takes the paramater turtle as turtle graphics are used to draw this square block and finally double side, as
//that parameter is used to draw the side lengths of the square block.
public static void squareblock(Turtle t, double side) {
  for(int i = 0; i < 4; i++) { //This for loop draws all four line segments of the square block
    t.forward(side);
    t.right(90);
  }
}
//The purpose of this method is to draw one single level of the pyramid.
////The paramaters this method takes is Turtle t, as turtle graphics are used to draw one level of the square blocks, the base parameter is the total length of the base of the pyramid, and levels is the amount of levels in the pyramid.
public static void level(Turtle t, double base, double side,int levels) {
  for(int i = (2 * levels) - 1 ; i >= 1; i--) //This for loop starts with the number of blocks of that specific level then keeps going down until the number of blocks left is 0
  {
    squareblock(t,side); //Calls the square block method to draw a single square block of the pyramid.
    t.forward(side);
  }
  for(int i = (2 * levels) - 1 ; i >= 2; i--) //The purpose of this for loop is to bring the Turtle back to the original starting place
  {
    t.penup();
    t.backward(side);
    t.pendown();
  }
}

//The purpose of this method is to draw the complete pyramid which does it by first calculating the side length of the square blocks, then running for loops calling the level method.
//The paramaters this method takes is Turtle t, as turtle graphics are used to draw this pyramid, the base parameter is the total length of the base of the pyramid, and levels is the amount of levels in the pyramid.
public static void pyramid(Turtle t, double base, int levels) {
  double side = base / levels; //This calculates the length of the side of one of the square blocks
  t.delay(10);
  t.penup();
  t.backward(base/2); //This moves the turtle back a little bit just in case the base pyramid is way too big.
  t.pendown();

    for(int y = levels; y > 0; y--) //This for loop draws each of the levels of the pyramid.
    {
      level(t,base,side,y);
      t.penup(); //The following lines of code up to pendown() position the turtle to start the next level of the pyramid.
      t.left(90);
      t.forward(side);
      t.right(90);
      t.pendown();
  }
}

  public static void main(String[] args) {
  Turtle t = new Turtle();
   pyramid(t,500,10); //Test cases
   //pyramid(t,200,10); //Test cases
   //pyramid(t,300,10); //Test case
   //pyramid(t,200,5); //Test case

  }
}
