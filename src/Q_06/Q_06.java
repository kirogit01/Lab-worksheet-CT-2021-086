package Q_06;

import javax.swing.*;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        Scanner scanner = new Scanner(System.in);
        String title;
        System.out.println("Enter the frame window tittle:");
        title= scanner.nextLine();
        int width;
        System.out.println("enter frame window width:");
        width= scanner.nextInt();
        int height;
        System.out.println("enter frame window height:");
        height= scanner.nextInt();

        jframe.setTitle(title);
        jframe.setSize(height,width);
        jframe.setVisible(true);

    }
}
