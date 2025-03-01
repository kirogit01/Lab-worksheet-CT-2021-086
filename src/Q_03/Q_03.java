package Q_03;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstname;
        System.out.println("Enter your first name:");
        firstname= scanner.next();
        String middlename;
        System.out.println("Enter your middle name:");
        middlename= scanner.next();
        String lastname;
        System.out.println("Enter your last name:");
        lastname= scanner.next();
        String initial;
        initial= middlename.substring(0,1);
        System.out.println(firstname + " "+ initial+"."+lastname+".");


    }
}
