public class SquareGrid {

  public static void main(String[] args) {
    Turtle bob = new Turtle();

    // draw a grid of squares
    for (int k = 0; k < 3; k++) {
      // draw a line of squares
      for (int j = 0; j < 5; j++) {
        // draw a square
        for (int i = 0; i < 4; i++) {
          bob.forward(40); // how many times is this instruction executed? 4 * 5 * 3 = 60 times
          bob.left(90);
        }
        bob.penup();
        bob.forward(100); // how many times is this instruction executed? 5 * 3 = 15 times
        bob.pendown();
      }
      // move the turtle back to beginning of line
      bob.penup();
      bob.backward(500); // how many times is this instruction executed? 3 times
      // move the turtle up for the next line
      bob.left(90);
      bob.forward(60);
      bob.right(90);
      bob.pendown();
    }
    //move the turtle to the original position
    bob.penup();
    bob.right(90);
    bob.forward(180); // how many times is this instruction executed? 1 time
    bob.left(90);
    bob.pendown();
  }

}
