import java.lang.Math;

public class Castle {

//The purpose of this method is to draw one tower of the castle. The input parameter is Turtle t, as this method uses turtle graphics to draw the tower.
    public static void tower(Turtle t) {
        t.forward(50);
        t.left(90);
        t.forward(100);
        t.right(45);
        t.forward(22.36067978);  //This is drawing the diagonal line segment.
        t.left(45);
        t.forward(20);
        towertop(t); //This is calling the towertop method to draw the top of the tower
        t.left(90);
        t.forward(10);
        t.left(90);
        t.forward(20);
        t.left(45);
        t.forward(22.36067978); //This is drawing the diagonal line segment.
        t.right(45);
        t.forward(100);
        t.left(90);
        t.forward(10);
        t.left(90);
        t.penup(); //This brings the penup and the following 3 lines of code brings the turtle back to the starting place.
        t.forward(40);
        t.right(90);
        t.pendown();
        towerwindows(t); //This is calling the towerwindows method to draw the windows of the tower.
    }


//The purpose of this method is to draw the top of the tower. The paramter turtle t is accepted as this method uses turtle graphics to draw the top.
    public static void towertop(Turtle t) {

      for(int i = 0; i < 4; i++) { //This for loop is responsible for creating the top, it creates two different types of line segmeents
            for(int b = 0; b < 2; b++) { //This for loop creates the line segments of the square that are the first and second line segments of the top
           t.left(90);
           t.forward(10);
          }
           for(int c = 0; c < 2; c++) { //This for loop creates the line segments of the square that brings the turtle back up.
            t.right(90);
            t.forward(10);
            }
          }

    }

//This method is responsible for drawing the windows within the tower. The parameter this method takes is Turtle, as it uses Turtle graphics to draw the windows
    public static void towerwindows(Turtle t) {
      for(int i = 0; i < 3; i++) { //This for loop brings the turtrle back up and is responsible for drawing all 6 windows
        for(int b = 0; b < 2; b ++) { //This for loop moves turtle to the second window location, as well as draws two windows
            for(int c = 0 ; c < 4; c++) { //This for loop creates one window
                  t.forward(10);
                  t.right(90);
                }
          t.penup();
          t.forward(20);
          t.pendown();
        }
        t.penup();
        t.backward(40);
        t.left(90);
        t.forward(20);
        t.right(90);
        t.pendown();
        }
      t.penup(); //This brings the Turtle back down to the starting place.
      t.right(90);
      t.forward(110);
      t.right(90);
      t.forward(10);
      t.right(180);
    }

//This method draws  section 1 of the wall in specifically the top layer of the wall as the construction of the wall is composed of two different type of wall layouts. The parameter accepted is turtle, as this method uses turtle graphics
public static void wall1(Turtle t) {
  for(int b =0 ; b <8 ; b++) { //This for loop creates 8 bricks all together to draw the layer
    brick1(t); //This is calling the brick1 method as brick1 is the type of brick that is used to draw the wall
    t.forward(10);
  }
}
//This method draws section 2 of the wall in specifically the second layer of the wall as the construction of the wall is composed of two different type of wall layouts. The parameter accepted is turtle, as this method uses turtle graphics
public static void wall2(Turtle t) {
    brick2(t); //This draws brick2 which is the type of brick that is half the normal size.
    t.forward(5);
    for(int b = 0 ; b < 7 ; b++) { //This for loop creates 7 bricks all together to draw this layer
      brick1(t); //This is calling the brick1 method as brick1 is the type of brick that is used to build the wall
      t.forward(10);
    }
    brick2(t); //This draws brick2 which is the type of brick that is half the normal size.
}

//This method composes wall1 and wall2 to create the whole wall.
public static void wall3(Turtle t) {
    for(int g = 0; g < 3; g++) { //This for loop draws the first and second layer of the wall, then repeats to continue drawing the rest of the wall except the last layer.
      wall1(t); //Calls wall1 to draw that type of wall
      t.penup(); //The following code betwen penup() and pendown() brings the turtle back to the point where the turtle can draw wall2.
      t.backward(80);
      t.right(90);
      t.forward(5);
      t.left(90);
      t.pendown();
      wall2(t); //Calls wall2 to draw that type of wall
      t.penup(); //The following code betwen penup() and pendown() brings the turtle back to the point where the turtle can draw wall1.
      t.backward(75);
      t.right(90);
      t.forward(5);
      t.left(90);
      t.pendown();
    }
  wall1(t); //This calls wall1 to build the last layer
  t.penup(); //The following lines of code brings the turtle back to the starting point
  t.backward(80);
  t.right(90);
  t.forward(5);
  t.left(90);
  t.pendown();
}
//This method draws one type of brick that is used to build the wall.
  public static void brick1(Turtle t) {
    for(int i = 0 ; i < 2; i++) { //This for loop draws the 4 line segments that build up the brick
      t.forward(10);
      t.right(90);
      t.forward(5);
      t.right(90);
    }
  }
//This method draws the second type of brick that is used to build the wall.
  public static void brick2(Turtle t) {
      for(int i = 0 ; i < 2; i++) { //This for loop draws the 4 line segments that build up the brick
        t.forward(5);
        t.right(90);
        t.forward(5);
        t.right(90);
      }
    }

//This method draws the outer Arch in specifically it utilizes polygons to estimate a semicircle utilized to create the arch. The parameters this method takes is Turtle t, because it usees Turtle graphics, Radius as the user
//can input the radius of the circle, and numSides as the number of sides of the polygon
  public static void outerArch(Turtle t, double radius, int numSides) {
      double lineSegmentLength = radius * 2.0 * (Math.sin(Math.PI/(numSides))); //This calculates the line segment length of the polygon. Math.PI is used to convert to radians.
        t.delay(5); //This speeds up the turtle
        for (int i = 0; i < numSides/2; i ++) //This for loop draws the semicircle by going through half of the amount of sides of the polygon.
        {
          t.forward(lineSegmentLength);
          t.right(360/numSides);
        }
      t.delay(100); //Returns the speed of the turtle to normal speed.
    }p
    //This method draws the inner Arch in specifically it utilizes polygons to estimate a semicircle utilized to create the arch. The parameters this method takes is Turtle t, because it usees Turtle graphics, Radius as the user
    //can input the radius of the circle, and numSides as the number of sides of the polygon
     public static void innerArch(Turtle t, double radius, int numSides) {

       double lineSegmentLength = radius * 2.0 * (Math.sin(Math.PI/(numSides))); //This calculates the line segment length of the polygon. Math.PI is used to convert to radians.
         t.delay(5); //This speeds up the turtle
         for (int i = 0; i < numSides / 2; i ++) //This for loop draws the semicircle by utilizng half of the amount of sides of the polygon.
         {
           t.forward(lineSegmentLength);
           t.left(360/numSides);
         }
       t.delay(100);
     }
//This method composes the inner arch and outer arch method to draw the full arch.
    public static void arch(Turtle t)
    {
      t.left(90);
      t.forward(30);
      outerArch(t,20,360); //Calls the outer arch method to draw the inner arch.
      t.forward(30);
      t.right(90);
      t.forward(10);
      t.right(90);
      t.forward(30);
      innerArch(t,10,360); //Calls the inner arch method to draw the inner arch.
      t.forward(30);
      t.right(90);
      t.forward(10);
      t.right(180); //Brings the polygon back to the starting place of the arch.
    }
//This method draws the multiple archs that can be found above the trees. It calls the arch method to draw the archs.
    public static void multipleArchs(Turtle t) {
      for(int i = 0; i < 3; i++) { //This for loop is drawing the 3 archs
        arch(t);
        t.penup(); //The following lines of code position the turtle to draw the rest of the archs.
        t.forward(50);
        t.left(90);
        t.forward(20);
        t.right(90);
        t.pendown();
      }
    }

//This method draws a single star in the sky.

  public static void star(Turtle t) {
    for(int b = 0; b < 2; b ++) {
      for(int i = 0 ; i < 2; i++) { //This method is drawing the line segments of the star
        t.forward(10);
        t.backward(20);
        t.forward(10);
        t.right(90);
      }
      t.left(45); //This postions the turtle to go back to the original angle of where turtle was facing
    }
  }
//This method draws the complete star sky by calling the star method multiple times and moving the turtle to the rigth place in the sky to draw the sky
public static void starsky(Turtle t) {
    star(t); //Draws a star
    t.penup(); //The following lines of code up to pendown() position the turtle to draw the next star
    t.right(90);
    t.forward(80);
    t.pendown();
    star(t);  //Draws a star
    t.penup(); //The following lines of code up to pendown() position the turtle to draw the next star
    t.right(180);
    t.forward(40);
    t.right(90);
    t.forward(40);
    t.left(90);
    t.pendown();
    star(t);  //Draws a star
    t.penup(); //The following lines of code up to pendown() position the turtle to draw the next star
    t.forward(120);
    t.left(90);
    t.forward(70);
    t.right(90);
    t.pendown();
    star(t);  //Draws a star
    t.penup(); //The following lines of code up to pendown() position the turtle to draw the next star
    t.left(180);
    t.forward(70);
    t.left(90);
    t.forward(40);
    t.pendown();
    star(t);  //Draws a star
    t.penup(); //The following lines of code up to pendown() position the turtle to draw the next star
    t.forward(50);
    t.right(90);
    t.forward(130);
    t.pendown();
    star(t);  //Draws a star
    t.penup(); //The following lines of code up to pendown() position the turtle to draw the next star
    t.left(180);
    t.forward(60);
    t.left(90);
    t.forward(60);
    t.pendown();
    star(t);  //Draws a star
    t.penup(); //The following lines of code up to pendown() position the turtle to draw the next star
    t.forward(50);
    t.right(90);
    t.forward(80);
    t.pendown();
    star(t);  //Draws a star
  }

  //This method draws a single hill. I utilized the line segements of right triangles to calculate the angles as well as the length of the line segment itself.
public static void hill(Turtle t) {
  t.left(26.565051);
  t.forward(178.88543282);
  t.right(116.5650512);
  t.left(26.565051);
  t.forward(134.1640787);
}

//This method draws all of the 3 hills entirely. As well as position the turtle to the correct place to draw the next hill.
  public static void hills(Turtle t) {
    hill(t);
    t.backward(89.4427191);
    t.left(63.43494882);
    hill(t);
    t.backward(22.36067978);
    t.left(63.43494882);
    hill(t);
    t.right(26.565051);
  }
//This method draws a single tree of the forest
  public static void tree(Turtle t) {
    for(int i = 0 ; i < 5; i++){
      t.right(45);
      t.forward(14.14213562);
      t.penup();
      t.backward(14.14213562);
      t.pendown();
      t.right(90);
      t.forward(14.14213562);
      t.penup();
      t.backward(14.14213562);
      t.pendown();
      t.left(45);
      t.forward(5);
      t.left(90); //Repostions the turtle to be able to draw the other branch after the for loop is ran once
    }
  }

//This method calls the tree method to draw all 8 trees and the entire forest.
  public static void Forest(Turtle t) {
    for(int i = 0; i < 2 ; i++) {
        for(int b = 0; b < 4 ; b++) { //This for loop is responsible for drawing a row of 4 trees
          tree(t); //Calls the tree method to draw a tree
          t.right(90); //The following lines of code are responsible for positioning the turtle to the next tree starting place.
          t.forward(15);
          t.right(180);
          t.penup();
          t.forward(40);
          t.right(90);
          t.forward(30);
          t.pendown();
        }
      t.penup(); //The following lines of code position the turtle to the first tree of the first row to get ready to draw the row of four trees.
      t.backward(160);
      t.right(90);
      t.forward(40);
      t.left(90);
      t.pendown();
    }
  }

//This is the main method which draws all of the castle. Note in this method i call all the above methods to draw parts of the castle, as well as move the turtle graphic to the exact place where it can draw that specific object of the landscape or castle itself.
    public static void main(String[] args) {
      Turtle t = new Turtle();
      t.penup(); //Following lines of code up to pendown() are positioning the turtle to draw the hills of the landscape
      t.delay(2);
      t.backward(80);
      t.left(90);
      t.forward(150);
      t.right(90);
      t.pendown();
      hills(t); //Calls hills method to draws the hills in the background
      t.penup(); //Following lines of code up to pendown() are positioning the turtle to draw the stars of the landscape
      t.left(180);
      t.forward(190);
      t.left(90);
      t.forward(540);
      t.left(180);
      t.pendown();
      starsky(t); //Calls starsky to draw the stars in the sky in the background
      t.penup(); //Following lines of code up to pendown() are positioning the turtle to draw the mutliple archs of the landscape
      t.right(180);
      t.forward(280);
      t.right(90);
      t.forward(120);
      t.left(180);
      t.pendown();
      multipleArchs(t); //calls multiplearchs method to draw the 3 archs in the rigth side of the landscape.
      t.penup(); ////Following lines of code up to pendown() are positioning the turtle to draw the trees of the landscape
      t.delay(2);
      t.backward(40);
      t.right(90);
      t.forward(30);
      t.left(90);
      t.pendown();
      Forest(t); //Calls Forest method to draw all of the trees on the right side.
      t.penup(); //Following lines of code up to pendown() are positioning the turtle to draw a tower of the landscape
      t.backward(50);
      t.left(90);
      t.forward(20);
      t.right(90);
      t.backward(50);
      t.pendown();
      t.delay(1);
      tower(t); //Calls tower method to draw a single tower of the castle.
      t.penup(); //Following lines of code up to pendown() are positioning the turtle to draw the right wall of the castle.
      t.backward(80);
      t.left(90);
      t.forward(45);
      t.right(90);
      t.pendown();
      wall3(t); //Calls wall3 method to draw the entire wall
      t.penup(); //Following lines of code up to pendown() are positioning the turtle to draw the arch of the castle.
      t.backward(40);
      t.pendown();
      arch(t); //Calls arch method to draw the arch.
      t.penup(); //Following lines of code up to pendown() are positioning the turtle to draw the left wall of the castle
      t.backward(80);
      t.left(90);
      t.forward(35);
      t.right(90);
      t.delay(1);
      t.pendown();
      wall3(t); //Calls wall3 to draw the entire wall
      t.penup(); ////Following lines of code up to pendown() are positioning the turtle to draw the left tower of the castle
      t.backward(50);
      t.pendown();
      tower(t); //Calls tower method to draw the tower on the left hand side.
    }

}
