// CS 170 Homework 4 Problem #3
/*
THIS CODE IS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
A TUTOR OR CODE WRITTEN BY OTHER STUDENTS - Sumedh Khanolkar, Kasey Cervantes
*/
public class FractalFlowers_2 {

    public static void main(String[] args) {

        Turtle t = new Turtle();
        t.delay(1);

        simpleFlower(t, 200);
        //fractalFlower(t, 300, 4);
    }

    /**
     *
     * @param t
     * @param size
     */
    public static void simpleFlower(Turtle t, double size) {

        t.forward(size * 2.0 / 3.0);
        t.left(135);

        // Draws the petals
        for(int i = 0; i < 7; i++) {

            t.forward(size * 1.0 / 3.0);
            t.backward(size * 1.0 / 3.0);
            t.right(45);
        }

        t.forward(size * 2.0 / 3.0);
        t.left(180);
    }

    /**
     *
     * @param t
     * @param size
     * @param level
     */
    public static void fractalFlower(Turtle t, double size, int level) {

        // Base case
        if(level == 0) {

//            // Level 0 is a straight line of length = size / 3
//            t.forward(size / 3.0);
//            t.backward(size / 3.0);
        }

        // Recursive case
        else {
//            // Draw stem
//            t.forward(size * 2.0 / 3.0);
//            t.left(135);
//
//            // Draws the petals
//            for(int i = 0; i < 7; i++) {
//
//                fractalFlower(t, size * 2.0/ 3.0, level - 1);
//                t.right(45);
//            }
//
//            t.forward(size * 2.0 / 3.0);
//            t.left(180);
        }
    }
}
