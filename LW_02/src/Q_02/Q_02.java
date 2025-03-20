package Q_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        float cm;
        System.out.print("Enter centimeter:");
        cm= scanner.nextFloat();
        float feet = cm/30;
        float inch = cm % 30 * 0.3937f;
        System.out.print(feet +"ft "+df.format(inch)+"in");




    }
}
