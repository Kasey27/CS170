public class House {


//This is the main method that is responsible for drawing the row of houses.
  public static void main(String[] args) {
    Turtle t = new Turtle();
    t.delay(10);
    houseline(t, 20);
  }o

//The purpose of this method is to draw a line of houses that are getting smaller in size as the number of houses increase
//The parameters Turtle t is used as turtle graphics is used to draw the houses. The paramter numHouses describes the number of houses that are built by this program
  public static void houseline(Turtle t, int numHouses) {
    for(int i = 1 ; i < numHouses; i ++){
        house(t,i);
        t.penup();
        t.forward(100/i);
        t.pendown();
      }
  }

  public static void house(Turtle t, int numHouses) {
    front(t, numHouses);
    t.left(90);
    t.forward(80 / numHouses);
    t.right(90);
    top(t, numHouses);
    t.left(90);
    t.backward(80 / numHouses);
    t.right(90);
  }

  public static void front(Turtle t, int numHouses) {
    walls(t, numHouses);
    t.forward(30 / numHouses);
    door(t,numHouses);
    t.penup();
    t.left(90);
    t.forward(50 / numHouses);
    t.right(90);
    t.backward(20 / numHouses);
    t.pendown();
    windows(t, numHouses);
    t.penup();
    t.backward(10 / numHouses);
    t.left(90);
    t.backward(50 / numHouses);
    t.right(90);
    t.pendown();
  }

  public static void top(Turtle t, int numHouses) {
    roof(t, numHouses);
    t.penup();
    t.forward(10 / numHouses);
    t.left(90);
    t.forward(10 / numHouses);
    t.right(90);
    t.pendown();
    chimney(t, numHouses);
    t.penup();
    t.backward(10 / numHouses);
    t.right(90);
    t.forward(10 / numHouses);
    t.left(90);
    t.pendown();
  }

  public static void walls(Turtle t, int numHouses) {
    square(t, 80, numHouses);
  }

  public static void windows(Turtle t, int numHouses) {
    square(t, 20, numHouses);
    t.penup();
    t.forward(40 / numHouses);
    t.pendown();
    square(t, 20, numHouses);
    t.penup();
    t.backward(40 / numHouses);
    t.pendown();
  }

  public static void door(Turtle t, int numHouses) {
    for (int i = 0; i < 2; i++) {
      t.forward(20 / numHouses);
      t.left(90);
      t.forward(30 / numHouses);
      t.left(90);
    }
  }

  public static void roof(Turtle t, int numHouses) {
    t.forward(80 / numHouses);
    t.left(135);
    t.forward(40 * Math.sqrt(2) / numHouses);
    t.left(90);
    t.forward(40 * Math.sqrt(2) / numHouses);
    t.left(135);
  }

  public static void chimney(Turtle t, int numHouses) {
    t.left(90);
    t.forward(20 / numHouses);
    t.right(90);
    t.forward(10 / numHouses);
    t.right(90);
    t.forward(10 / numHouses);
    t.backward(10 / numHouses);
    t.left(90);
    t.backward(10 / numHouses);
    t.left(90);
    t.backward(20 / numHouses);
    t.right(90);
  }

  public static void square(Turtle t, double x, int numHouses) {
    for (int i = 0; i < 4; i++) {
      t.forward(x / numHouses);
      t.left(90);
    }
  }

}
