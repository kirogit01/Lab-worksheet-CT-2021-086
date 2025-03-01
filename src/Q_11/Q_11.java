package Q_11;

import java.util.Scanner;

public class Q_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstname;
        System.out.println("Enter your first name:");
        firstname= scanner.next();
        String middle;
        System.out.println("Enter your middle name:");
        middle= scanner.next();
        String last;
        System.out.println("Enter your last name:");
        last= scanner.next();

        String initial = middle.substring(0,1);

        System.out.println(last+","+firstname+" "+initial+".");




    }
}
