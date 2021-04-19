public class Fractal_Flowers{

  public static void main(String[] args){
    Turtle t = new Turtle();
    simpleFlower(t,100);

  }

  public static void simpleFlower(Turtle t, double size){
    t.left(90);
    t.forward(size);
    t.backward(size*(1.0/3.0));
    t.right(90);
    simpleFlowerPetal(t,size);
    t.left(45);
    simpleFlowerPetal(t,size);
    t.left(90);
    simpleFlowerPetal(t,size);
    t.right(45);
    t.backward(size*(2.0/3.0));
  }
  public static void simpleFlowerPetal(Turtle t, double size){
    t.forward((size*(2.0/3.0))/2);
    t.backward(size*(2.0/3.0));
    t.forward((size*(2.0/3.0))/2);
  }

  public static void fractalFlower(Turtle t, double size, int level){

  }

}
