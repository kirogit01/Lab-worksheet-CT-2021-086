package Q_05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        double C,F;
        System.out.println("Enter the Temperature in Fahrenheit:");
        F= scanner.nextDouble();
        C= (F-32)*5/9;
        System.out.println("Temperature is fahrenheit: " + df.format(C)+"c");
    }
}
