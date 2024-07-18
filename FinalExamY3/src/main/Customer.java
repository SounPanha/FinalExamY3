package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Customer extends JFrame {

private JButton btnBack;

    public Customer() {
        setTitle("Customer Info");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setLayout(null);
        initUI();
    }

    public void initUI() {

        JLabel lblId = new JLabel("ID:");
        lblId.setFont(new Font("Calibri ", Font.BOLD,15));
        lblId.setBounds(10,10, 100, 90);
        add(lblId);

        JLabel lblLastName = new JLabel("Last Name:");
        lblLastName.setFont(new Font("Calibri ", Font.BOLD,15));
        lblLastName.setBounds(10,90, 150, 90);
        add(lblLastName);

        JLabel lblFistName = new JLabel("First Name:");
        lblFistName.setFont(new Font("Calibri ", Font.BOLD,15));
        lblFistName.setBounds(10,170, 100, 90);
        add(lblFistName);

        JLabel lblPhone = new JLabel("Phone:");
        lblPhone.setFont(new Font("Calibri ", Font.BOLD,15));
        lblPhone.setBounds(10,250, 100, 90);
        add(lblPhone);

        btnBack = new JButton("Back");
        btnBack.setBounds(10, 400, 100, 30);
        btnBack.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                Home home = new Home();
                home.display();
            }
        });
        getContentPane().add(btnBack);
    }

    public void display() {
        setVisible(true);
    }
}
