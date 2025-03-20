package Q_04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        double weight;
        System.out.println("Enter your weight in pounds:");
        weight= scanner.nextDouble();

        System.out.println("you need " + df.format(weight*19)+ "calories per day");
    }
}
