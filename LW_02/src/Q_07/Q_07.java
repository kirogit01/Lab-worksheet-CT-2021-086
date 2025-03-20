package Q_07;

import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in kg: ");
        int weight = scanner.nextInt();
        System.out.print("Enter your height in cm: ");
        int height = scanner.nextInt();
        double bmi = weight / Math.pow((height / 100.0), 2);
        if (bmi >= 20 && bmi <= 25) {
            System.out.println("Your BMI is in the normal range.");
        } else {
            System.out.println("Your BMI is outside the normal range.");
        }
    }
}
