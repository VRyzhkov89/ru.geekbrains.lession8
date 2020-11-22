package lession8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by geekbrains on 11/17/20
 */
public class MyWindow extends JFrame {

    public MyWindow() {
        setTitle("Geekbrains урок номер 8");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 500);

        JButton ok = new JButton("Ok");
        JTextField text = new JTextField();
        JTextField bigField = new JTextField();

        add(text, BorderLayout.NORTH);
        add(bigField, BorderLayout.CENTER);

        add(ok, BorderLayout.SOUTH);

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Нажата кнопка ok...");
            }
        });

        text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Введен текст '" + text.getText() + '\'');
                bigField.setText(text.getText());

            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        MyWindow myWindow = new MyWindow();
    }


}
