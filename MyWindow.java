package LessonEight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {

    public MyWindow() {

        setTitle("My Window");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 300, 600, 450);
        JPanel panel = new JPanel(new GridLayout(1, 2));

        JButton button1 = new JButton("Exit");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        JButton button2 = new JButton("Ok");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        panel.add(button2);
        panel.add(button1);

        add(panel, BorderLayout.SOUTH);
    }
}
