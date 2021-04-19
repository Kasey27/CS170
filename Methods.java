public class Methods {

public static void main(String[] args){
  int x;
  int y;
  x = 1;
  y = addOne(x);
  System.out.println("x contains: " + x);
  System.out.println("y contains: " + y);
  int z;
  z = x + y;
  System.out.println("Z contains: " + z);
}
//This metho takes a value of type int in paramter x and 
public static int addOne(int x) {
  return (x+1);
}
public static int sum(int x, int y) {
  int z = x + y;
  return z;
}
}
