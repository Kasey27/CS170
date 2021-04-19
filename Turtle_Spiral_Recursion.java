public class Turtle_Spiral_Recursion{

  public static void main(String[] args){
    Turtle t = new Turtle();
    // turtleSpiralIter(t, 200, 20);
    turtleSpiral(t,200,20);

  }
  public static void turtleSpiral(Turtle t, double size, double minSize){
    if(size <= minSize){
      t.forward(minSize);
    }else{
      t.forward(size);
      t.right(90);
      turtleSpiral(t,size * 0.9, minSize);
    }
  }
  public static void turtleSpiralIter(Turtle t, double size, double minSize){
    for(double size2 = size; size > minSize; size = size*0.9) {
      t.forward(size);
      t.right(90);
    }
    t.forward(minSize);
  }
}
