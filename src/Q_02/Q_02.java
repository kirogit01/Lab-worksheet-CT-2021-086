package Q_02;

import javax.swing.*;
import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JFrame jframe = new JFrame();
        String firstname;
        System.out.println("Enter your first name:");
        firstname=scanner.next();
        String lastname;
        System.out.println("Enter your last name:");
        lastname=scanner.next();
        String fullname;
        fullname=firstname + lastname;
        jframe.setTitle(fullname);
        jframe.setVisible(true);
        jframe.setSize(300,300);



    }
}
