package Q_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        double C,F;
        System.out.println("Enter the Temperature in celsius:");
        C = scanner.nextDouble();
        F = (1.8*C)+32;
        System.out.println("Temperature is fahrenheit: " + df.format(F)+"f");
    }
}
