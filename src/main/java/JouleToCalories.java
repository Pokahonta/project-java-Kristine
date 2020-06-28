public class JouleToCalories {
    public static void main(String[] args) {
        int joule = 1;
        double calories = joule * 0.239;

        System.out.println("1 Joule = " + calories + "cal");

        int joulePerDay = 15;
        double calPerDay = joulePerDay * calories;

        System.out.println("Calories per Day: " + calPerDay + "cal");
    }
}