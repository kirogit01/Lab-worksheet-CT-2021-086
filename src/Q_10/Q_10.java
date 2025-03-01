package Q_10;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the any sentances:");
        String sentance;
        sentance=scanner.nextLine();

        int length = sentance.length();

        if (length %  2 == 1)
        {
            int middle = length / 2;
            System.out.println(sentance.charAt(middle));
        }
        else
            System.out.println("enter valid odd number off characters.");





    }
}
