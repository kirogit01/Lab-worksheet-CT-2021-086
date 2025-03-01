package Q_09;

import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner sentence = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String cha;
        cha= sentence.nextLine();

        int count = cha.length();

        String initial;
        initial=cha.substring(0,1);

        String last = String.valueOf(cha.charAt(cha.length()-1));



        System.out.println(count);
        System.out.println(initial);
        System.out.println(last);






    }
}
