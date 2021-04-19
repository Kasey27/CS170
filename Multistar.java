public class Multistar{

//This method draws a star utilizing Turtle graphics. The parameters this method takes is Turtle t, as this method utilizes Turtle Graphics to draw the star,
//The parameter double n, stands for the number of rays of the star indicated by the user, so if n = 6, 6 rays will be utilized to create a star. Finally the
// last parameter is double length, which specifies the length of the long rays, in this case the short rays of the stars are length/4.

  public static void star(Turtle t, double n, double length) {
    for(int i = 0; i < n; i++) { //This for loop is creating the star
      t.forward(length/4); //This  draws the line segment of the star, length/4 is the length of the short rays of the star.
      t.backward(length/4); //This returns the Turtle back to the origin of the star, length/4 is the length of the short rays of the star.
      t.left(360/n); //This rotates Turtle to be ready to create the next line of the star
    }
    t.penup();
  for(int i = 0; i < n; i++) { //This for loop takes the Turtle reverse, so it goes back through the star that is created to get to the origin of the star.
    t.penup();
    t.right(360/n);
    t.forward(length/4);
    t.backward(length/4);
  }
    t.penup();
    t.backward(length); //This makes the Turtle go back to the origin after the creation of the star
    t.pendown();
  }

//This method utilizies Turtle graphics to draw a star, this method calls the star method to draw surrounding stars.
//The parameters this method takes is Turtle t, as this method utilizes Turtle Graphics to draw the star,
//The parameter double n, stands for the number of rays of the star indicated by the user, so if n = 6, 6 rays will be utilized to create a star. As well as 6 long rays from the origin to origin of the star surrounding it
//  Finally the last parameter is double length, which specifies the length of the long rays.


  public static void multistar(Turtle t,double n, double length) {
    for(int i = 0; i < n; i++) { //This for loop is creating the multistar by first going forward by the length of a long ray, then that point serving as a point for the star to be drawn, and finally turning to the right to draw the next long ray, for the next star.
      t.forward(length);
      star(t,n,length);
      t.right(360/n);
    }
  }

  //This is my main method that users can call the multistar method to test if it works. The Turtle graphics variable name t is created here, as without it
  //the other methods cannot run. I also included test cases in comments.

  public static void main(String[] args) {
    Turtle t = new Turtle(); //Creates the Turtle
    t.delay(5);
    //multistar(t, 7, 125); //Test case
    //multistar(t, 10, 70); //Test case
    multistar(t, 25, 120); //Test case
  }

}
