package Q_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_01_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double X,Y;
        System.out.print("Enter X:");
        X = scanner.nextDouble();
        System.out.print("Enter Y:");
        Y = scanner.nextDouble();
        System.out.print(df.format(Math.sqrt(X + 4*Math.pow(Y,3))));
    }
}
