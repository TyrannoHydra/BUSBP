package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;


public class c_Frame extends JFrame{
    public JFrame jf;
    public JLabel ml;

    public c_Frame() throws AWTException {
        System.out.println("C_Frame");
        jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.setSize(720, 480);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);
        jf.setTitle("BUSBP");
        jf.getContentPane().setBackground(Color.GREEN);
        JLabel jL = new JLabel("Test");
        jL.setVisible(true);
        jf.add(jL);
        jf.requestFocus();
        jf.setVisible(true);

        int xw = Toolkit.getDefaultToolkit().getScreenSize().width;
        int yw = Toolkit.getDefaultToolkit().getScreenSize().height;
        Robot robot = new Robot();
        long t1 = System.currentTimeMillis();
        while (System.currentTimeMillis()-t1 < 30000){


            robot.mouseMove(xw / 2, yw / 2);
            int mask = InputEvent.BUTTON1_DOWN_MASK;
            robot.mousePress(mask);
            robot.mouseRelease(mask);
        }

        /*
        ml = new c_Panel();
        ml.setLayout(null);
        ml.setBounds(0,0,720, 480);
        ml.setBackground(Color.blue);
        ml.setVisible(true);

        this.add(ml);
        */


    }


}
