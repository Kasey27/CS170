public class Polygons {

  public static void main(String[] args) {
    // System.out.println("Hello Polygons");
    Turtle t = new Turtle();
    polygons(t,30,10);
  //  Square(t,59);
  //  Pentagon(t,60);
    //Triangle(t,90);
    //t.penup();
    //t.backward(50);
    //t.pendown();
    //Triangle(t,120);
  }

  //draws a Polygons
  public static void polygons(Turtle t, double size, int numSide) {
    for (int i = 0; i < numSide; i++)
    {
      t.forward(size);
      t.left(360/numSide);
  }
}

  //This method draw a triangle with the requested size
  public static void Triangle(Turtle t, double size) {
      for (int i = 0; i < 3; i++) {
      t.forward(size);
      t.left(120);
    }
    }
    public static void Square(Turtle t, double size) {
      for (int i = 0; i < 4; i++) {
        t.forward(size);
        t.left(90);
    }
  }
//draws a pentagon
    public static void Pentagon(Turtle t, double size) {
      for (int i = 0; i < 5; i++) {
        t.forward(size);
        t.left(72);
    }
  }

}
