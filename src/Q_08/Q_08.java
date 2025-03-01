package Q_08;

import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        System.out.println("Enter a string with a single exclamation mark:");
        line= scanner.nextLine();

        int index = line.indexOf('!');

        String before = line.substring(0, index).trim();
        String after = line.substring(index + 1).trim();
        System.out.println(before);
        System.out.println(after);


    }
}
