package Q_09;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double P,R,N;
        System.out.print("Enter the amount: ");
        P = scanner.nextDouble();
        System.out.print("Enter the interest rate: ");
        R= scanner.nextDouble();
        System.out.print("Enter the number of years: ");
        N = scanner.nextDouble();
        double TotalAmount = (P * Math.pow((1+(R/100)),N));
        double TotalInterest = TotalAmount - P;
        System.out.println("Total Interest Of " + N + "years is: " + df.format(TotalInterest));
        System.out.println("Total Amount Of After" + N + "years is: " + df.format(TotalAmount));





    }
}
