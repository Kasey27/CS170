
    // public static void outerarch(Turtle t, double radius, int numSides) {
    //   for(int i = 0; i < 180; i++) {
    //     t.forward((length/360)*Math.PI);
    //     t.right(0.5);
    //   }
    // }

  //
  //  public static void innerArch(Turtle t, int radius, int numSides) {
  //   double lineSegmentLength = getLineSegmentSideLength(radius, numSides);
  //     t.delay(5);
  //     t.right(2 / numSide );
  //    t.right(88.2);
  //     for (double i = 0; i < Math.PI*(radius); i += lineSegmentLength)
  //     {
  //       t.forward(lineSegmentLength);
  //       t.right(360.0/numSides);
  //     }
  //   t.delay(100);
  //  t.left(360/numSide);
  // }
  //
  // //
  //  public static void outerArch(Turtle t, int radius, int numSides) {
  //
  //   double lineSegmentLength = getLineSegmentSideLength(radius, numSides);
  //   t.delay(5);
  //   for (int i = 0; i < numSides; i++) {
  //       t.forward(lineSegmentLength);
  //       t.left(360/numSides);
  //   }
  //  t.right(360/numSide);
  // }
  //
  // private static void main getLineSegmentSideLength(int radius, int numSides) {
  //   return (double)radius*2.0*(Math.sin((Math.PI)/((double) numSides)));
  // }

  public static void arch(Turtle t)
  {
    t.left(90);
    innerarch(t,100);
    t.forward(10);
    // t.left(90);
    // t.forward(30);
    // t.left(90);
    // t.forward(30);
    // // innerArch(t, 30, 100);
    // t.forward(10);
    // t.left(90);
    // t.forward(30);
    // // outerArch(t,10,100);
    // t.forward(30);
    // t.left(90);

    // polygons2(t, 20);
    // t.forward(30);
    // t.left(90);
    // t.forward(100);
  }
