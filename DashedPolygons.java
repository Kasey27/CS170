public class DashedPolygons {

public static void main(String[] args) {
    Turtle boy= new Turtle();
    // kaseydashed(boy,100,5);
    polygons(boy,100,6);
    //dashedline(t, 150, 10);
  }

    // public static void polygons(Turtle t, double size, int numSide) {
    //  for (int i = 0; i < numSide; i++) {
      //  dashedline(t,length,numDashes);
        //t.left(360/numSide);
  //  }
//}
//   public static void dashedline(Turtle t, double length, int numDashes) {
  //    for (int i = 0; i < numDashes - 1 ; i++) {
    //    t.forward(length / (2 * numDashes -1));
      //  t.penup();
        // t.forward(length /(2 * numDashes -1));
      //  t.pendown();
  //  }
    //t.forward(length/(2 * numDashes -1));
  //}
  public static void polygons(Turtle t, double size, int numSide) {
    for (int i = 0; i < numSide; i++)
      {
      kaseydashed(t,100,5);
      t.left(360/numSide);
    }
  }

  public static void kaseydashed(Turtle boy,double length, int numDashes) {
    for(int i = 0; i < numDashes; i++) {
      boy.forward(length / (2 * numDashes -1));
      boy.penup();
      boy.forward(length / (2 * numDashes-1));
      boy.pendown();
    }
    boy.forward(length/(2 * numDashes -1));
  }


}
