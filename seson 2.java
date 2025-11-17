//QUESTION 1
public class VacationCalculator {
    public static double calculateTotalCost( double accommodationCost, double mealCost, double activityCost) {
        double total = accommodationCost + mealCost + activityCost;
        return total;
    }

    public static void main(String[] args) {

        double accommodation = 850.25;
        double meal = 300.25;
        double activity = 300.25;

        double totalCost = calculateTotalCost(accommodation, meal , activity);

        System.out.println("Total Vacation Cost: $" + totalCost);
    }
}



//QUESTION 2
import java.util.Scanner;

public class FitnessTracker {
    public static String getFitnessLevel(int steps) {
        if (steps >= 10000) {
            return "Excellent";
        } else if (steps >= 7000) {
            return "Good";
        } else if (steps >= 4000) {
            return "Average";
        } else {
            return "Poor";
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your steps for today: ");
        int steps = input.nextInt();

        String level = getFitnessLevel(steps);

        System.out.println("Your fitness level: " + level);

        input.close();
    }
}
