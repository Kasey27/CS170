public class Star {

  public static void star(Turtle t, double length) {
    for(int i = 0; i < 5; i++) {
      t.forward(length);
      t.left(216);
    }
  }

  public static void main(String[] Args) {
    Turtle sun = new Turtle();
    star(sun,50);
    star(sun,100);
    star(sun,200);
    star(sun,40);
  }
}
