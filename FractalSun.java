// CS 170 Homework 4 Problem #5
/*
THIS CODE IS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
A TUTOR OR CODE WRITTEN BY OTHER STUDENTS - Sumedh Khanolkar, Kasey Cervantes
*/
public class FractalSun {

    public static void main(String[] args) {

        Turtle t = new Turtle();
        t.delay(0);
        fractalSun(t, 150, 3);
    }

    /**
     *
     * @param t
     * @param r
     * @param level
     */
    public static void fractalSun(Turtle t, double r, int level) {

        // Base case
        if(level == 0) {

            t.color(255, 0, 0);
            move(t, r, 0);
            t.right(90);
            circle(t, r);
            t.left(90);
            move(t, -r, 0);
            t.fill();
        }

        // Recursive case
        else {

            t.color(255, 255 - 255 / (level + 1), 0);

            move(t, r, 0);
            t.right(90);
            circle(t, r);
            t.left(90);
            t.backward(2*r);
            t.forward(r);

            // Fills left half
            move(t, 0, -r/2);
            t.fill();

            // Fills right half
            move(t, 0, r);
            t.fill();
            move(t, 0, -r/2);

            for(int i = 0; i < 8; i++) {

                t.forward(2*r - r/4);
                move(t, r/4, 0);
                fractalSun(t, r/4, level - 1);
                t.color(255, 255 - 255 / (level + 1), 0);
                move(t, -r/4, 0);
                t.backward(2*r - r/4);
                t.right(45);
            }
        }
    }

    /**
     *
     * @param t
     * @param x
     * @param y
     */
    public static void move(Turtle t, double x, double y) {

        t.penup();
        t.forward(x);
        t.left(90);
        t.forward(y);
        t.right(90);
        t.pendown();
    }

    /**
     *
     * @param t
     * @param radius
     */
    public static void circle(Turtle t, double radius) {

        double length = 2 * radius * (Math.sin(Math.PI/(360.0)));

            for(int i = 0; i < 360; i++) { // Change 361 to 360

                t.forward(length);
                t.right(1);
            }

        //t.left(1); --> Remove this line
    }
}
