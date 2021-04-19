public class GiveCandies {

    public static String giveCandies(int candies, int students) {
        return "I have " + candies + " candies and "
                + students + " students. I can give "
                + (candies / students) + " candies to each student and have "
                + (candies % students) + " left.";
    }

    public static void main(String[] args) {
        System.out.println(giveCandies(5, 2));
    }

}
