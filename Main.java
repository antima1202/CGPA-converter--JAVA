package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Main {

    public static void convert()
    {
        JFrame frame= new JFrame("Cgpa-> GPA");

        JLabel label1, label2;
        JTextField textField1, textField2;
        JButton button1, button2, button3;

        String conversions[]={"CGPA to GPA","GPA to CGPA"};
        JComboBox c= new JComboBox(conversions);
        c.setBounds(20,25,160,27);
        frame.add(c);

        label1 = new JLabel("CGPA");
        label1.setBounds(20,60,60,30);

        label2=new JLabel("GPA");
        label2.setBounds(20,95,60,30);

        textField1= new JTextField(0);
        textField1.setBounds(80,60,100,25);

        textField2= new JTextField(0);
        textField2.setBounds(80,95,100,25);

        button1 = new JButton("CGPA");
        button1.setBounds(50, 130, 80, 18);
        button2 = new JButton("GPA");
        button2.setBounds(190, 130, 80, 18);
        button3 = new JButton("Reset");
        button3.setBounds(150, 150, 60, 30);


        final JLabel lable =  new JLabel();
        lable.setHorizontalAlignment(JLabel.CENTER);
        lable.setSize(400,100);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double cgpa= Double.parseDouble(textField1.getText());

                double gpa;
                gpa = Math.round(cgpa*4)/10;
                String message = "Converting" + c.getItemAt(c.getSelectedIndex());

                lable.setText(message);

                String str1= String.valueOf(gpa);
                textField2.setText(str1);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double gpa1= Double.parseDouble(textField2.getText());

                double cgpa1= Math.round(gpa1*10)/4;

                String message = "Converting" + c.getItemAt(c.getSelectedIndex());
                lable.setText(message);

                String str2= String.valueOf(cgpa1);
                textField1.setText(str2);
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                textField1.setText("0");
                textField2.setText("0");
            }
        });

        frame.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setLayout(null);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        convert();
	// write your code here
    }
}
