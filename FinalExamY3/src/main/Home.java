package main;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Home extends JFrame {

    private JButton btnCalculator, btnCustomer;

    public Home() {
        super.setTitle("Home Screan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 600);
        setLayout(null);
        initUI();

    }

    public void initUI() {
        btnCalculator = new JButton("1: Calculator");
        btnCalculator.setBounds(150, 200, 150, 30);
        btnCalculator.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                Calculator calculator = new Calculator();
                calculator.display();
            }
        });
        getContentPane().add(btnCalculator);

        btnCustomer = new JButton("2: Customer");
        btnCustomer.setBounds(150, 300, 150, 30);
        btnCustomer.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                Customer customer = new Customer();
                customer.display();
            }
        });
        getContentPane().add(btnCustomer);


    }

    public void display() {
        setVisible(true);
    }
}
