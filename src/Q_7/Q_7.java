package Q_7;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q_7 {
    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a.");
        System.out.println(sdf.format(today));

    }
}
