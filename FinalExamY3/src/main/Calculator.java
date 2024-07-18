package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class Calculator extends JFrame {

    private JTextField txtFirstNum, txtSecondNum, txtResult;
    private JButton btnAdd, btnSub, btnMul, btnDiv, btnMol, btnClear, btnBack;
    private double result = 0.0;
    private int firstNum, secondNum;
    private double a = 0.0, b = 0.0;

    public Calculator() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setLayout(null);
        initUI();

    }

    private void initUI() {

        JLabel lblFirstNumber = new JLabel("First Number:");
        lblFirstNumber.setFont(new Font("Calibri ", Font.BOLD,15));
        lblFirstNumber.setBounds(10,10, 200, 90);
        add(lblFirstNumber);

        txtFirstNum = new JTextField(100);
        txtFirstNum.setBounds(160,30,300,40);
        getContentPane().add(txtFirstNum);

        JLabel lblSecondNumber = new JLabel("Second Number:");
        lblSecondNumber.setFont(new Font("Calibri ", Font.BOLD,15));
        lblSecondNumber.setBounds(10,90, 150, 90);
        add(lblSecondNumber);

        txtSecondNum = new JTextField(100);
        txtSecondNum.setBounds(160,110,300,40);
        getContentPane().add(txtSecondNum);


        JLabel lblResult = new JLabel("Result:");
        lblResult.setFont(new Font("Calibri ", Font.BOLD,15));
        lblResult.setBounds(10,170, 100, 90);
        add(lblResult);

        txtResult = new JTextField(100);
        txtResult.setBounds(160,190,300,40);

        getContentPane().add(txtResult);

        btnAdd = new JButton("+");
        btnAdd.setBounds(200, 300, 100, 30);
        btnAdd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addNum();
            }
        });
        getContentPane().add(btnAdd);

        btnMul = new JButton("*");
        btnMul.setBounds(200, 350, 100, 30);
        btnMul.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mulNum();
            }
        });
        getContentPane().add(btnMul);

        btnMol = new JButton("%");
        btnMol.setBounds(200, 400, 100, 30);
        btnMol.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                molNum();
            }
        });
        getContentPane().add(btnMol);

        btnSub = new JButton("-");
        btnSub.setBounds(310, 300, 100, 30);
        btnSub.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                subNum();
            }
        });
        getContentPane().add(btnSub);

        btnDiv = new JButton("/");
        btnDiv.setBounds(310, 350, 100, 30);
        btnDiv.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                divNum();
            }
        });
        getContentPane().add(btnDiv);

        btnClear = new JButton("Clear");
        btnClear.setBounds(310, 400, 100, 30);
        btnClear.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clear();
            }
        });
        getContentPane().add(btnClear);

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

    public void addNum() {
        a = Integer.parseInt(txtFirstNum.getText());
        b = Integer.parseInt(txtSecondNum.getText());
        result  = a + b;
        txtResult.setText("" + result);
    }

    public void subNum() {
        a = Integer.parseInt(txtFirstNum.getText());
        b = Integer.parseInt(txtSecondNum.getText());
        result  = a - b;
        txtResult.setText("" + result);
    }

    public void mulNum() {
        a = Integer.parseInt(txtFirstNum.getText());
        b = Integer.parseInt(txtSecondNum.getText());
        result  = a * b;
        txtResult.setText("" + result);
    }

    public void divNum() {
        a = Integer.parseInt(txtFirstNum.getText());
        b = Integer.parseInt(txtSecondNum.getText());
        result  = a / b;
        txtResult.setText("" + result);
    }

    public void molNum() {
        a = Integer.parseInt(txtFirstNum.getText());
        b = Integer.parseInt(txtSecondNum.getText());
        result  = (a % b);
        txtResult.setText("" + result);
    }





    public void clear() {
        txtFirstNum.setText("");
        txtSecondNum.setText("");
        txtResult.setText("");
    }

    public void display() {
        setVisible(true);
    }
}
