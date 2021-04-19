public class multiSquare {

  public static void square(Turtle t, double length)
  {
    for(int i = 0; i < 4; i++) {
    t.forward(length);
    t.left(90);
  }
}
public static void multiSquare2(Turtle t, double base, int numSquares)
{
  for(int b = 0; b < numSquares; b++) {
  square(t,((b+1)*base));
//  base = (base * 2);
}
  }
  public static void multiSquare3(Turtle t, double base, int numSquares) {
    for(int k = 1; k <= numSquares; k++) {
    square(t,((k)*base));
  //  base = (base * 2);
  }
}
  public static void main(String[] args) {
    Turtle square2 = new Turtle();
    rotatedSquare(square2,20, 5);
  }

  public static void rotatedSquare(Turtle t, double base, int numSquares) {
    for(int i = 0; i< numSquares; i++){
    square(t,( 2* i + 1) * base);
    t.penup();
    t.right(90);
    t.backward(base);=
    t.left(90);
    t.forward(base);
    t.pendown();
    }
  }

public static void squareSpiral(Turtle t, double base, int numSides) {
  for(int i = 0; i < numSides; i++){

  }
}

}
