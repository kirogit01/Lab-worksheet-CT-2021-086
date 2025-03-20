package Q_06;

import java.time.Year;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int currentYear = Year.now().getValue();
        System.out.print("Enter the year you were born: ");
        int birthYear = scanner.nextInt();
        int age = currentYear - birthYear;
        System.out.println("You were born in " + birthYear + " and will be (are) " + age + " this year.");


    }
}
