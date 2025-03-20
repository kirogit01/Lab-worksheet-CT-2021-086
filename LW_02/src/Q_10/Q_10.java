package Q_10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter loan period in years: ");
        int loanPeriod = input.nextInt();

        final int MONTHS_IN_YEAR = 12;

        double monthlyInterestRate = annualInterestRate / 100.0 / MONTHS_IN_YEAR;


        int numberOfPayments = loanPeriod * MONTHS_IN_YEAR;

        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 / (1 + monthlyInterestRate), numberOfPayments));


        double totalPayment = monthlyPayment * numberOfPayments;


        System.out.println("Monthly Payment:" +df.format(monthlyPayment)+"Rs");
        System.out.print("Total Payment:"+df.format(totalPayment)+"Rs");


    }
}
