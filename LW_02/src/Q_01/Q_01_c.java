package Q_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_01_c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double X,Y;
        System.out.println("Enter X:");
        X = scanner.nextDouble();
        System.out.println("Enter Y:");
        Y = scanner.nextDouble();
        System.out.println(df.format(Math.cbrt(X*Y)));
    }
}
