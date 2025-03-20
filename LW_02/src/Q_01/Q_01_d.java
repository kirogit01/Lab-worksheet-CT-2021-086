package Q_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_01_d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double R;
        System.out.println("Enter Radius:");
        R = scanner.nextDouble();
        final double PI = 3.14159;
        System.out.println("Area of the circle is: "+df.format(PI*R*R));
    }
}
