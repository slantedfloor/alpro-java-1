package tugas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    double num1 = 0, num2 = 0, result = 0;
    char op;
    Font myFont = new Font("Calibri",Font.BOLD,20);
    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton ba, bs, bm, bd, beq, bclr, bdec, bdel;
    JPanel buttons;
    
    Calculator() {

        frame = new JFrame("Calculator");
        frame.getContentPane().setBackground(new Color(255, 255, 255));
        frame.setSize(401, 550);
        frame.getContentPane().setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textfield = new JTextField();
        textfield.setHorizontalAlignment(SwingConstants.RIGHT);
        textfield.setBounds(50,25,300,50);
        textfield.setFont(myFont); 
        textfield.setEditable(false);
        textfield.setFocusable(false);

        ba = new JButton("+");
        ba.setBackground(new Color(192, 192, 192));
        bs = new JButton("-");
        bm = new JButton("*");
        bd = new JButton("/");
        beq = new JButton("=");
        bclr = new JButton("clear");
        bdec = new JButton(".");
        bdel = new JButton("del");

        functionButtons[0] = ba;
        functionButtons[1] = bs;
        functionButtons[2] = bm;
        functionButtons[3] = bd;
        functionButtons[4] = beq;
        functionButtons[5] = bclr;
        functionButtons[6] = bdec;
        functionButtons[7] = bdel;


        for (int i = 0; i < 8; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFocusable(false);
            functionButtons[i].setFont(myFont); 
        }

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFocusable(false);
            numberButtons[i].setFont(myFont); 

        }

        bdel.setBounds(212,104,64,68);
        bclr.setBounds(286,104,64,68);


        buttons = new JPanel();
        buttons.setBackground(new Color(255, 255, 255));
        buttons.setBounds(50, 183, 300, 300);
        buttons.setLayout(new GridLayout(4, 4, 10, 10));

        buttons.add(numberButtons[0]);
        buttons.add(numberButtons[1]);
        buttons.add(numberButtons[2]);
        buttons.add(numberButtons[3]);
        buttons.add(numberButtons[4]);
        buttons.add(numberButtons[5]);
        buttons.add(numberButtons[6]);
        buttons.add(numberButtons[7]);
        buttons.add(numberButtons[8]);
        buttons.add(numberButtons[9]);

        buttons.add(ba);
        buttons.add(bs);
        buttons.add(bm);
        buttons.add(bd);
        buttons.add(beq);
        buttons.add(bdec);
    

        frame.getContentPane().add(buttons);
        frame.getContentPane().add(bdel);
        frame.getContentPane().add(bclr);
        frame.getContentPane().add(textfield);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }

        if (e.getSource() == bdec) {
            textfield.setText(textfield.getText() + ".");
        }

        if (e.getSource() == ba) {
            num1 = Double.parseDouble(textfield.getText());
            op = '+';
            textfield.setText("");
        }
       
        if (e.getSource() == bs) {
            num1 = Double.parseDouble(textfield.getText());
            op = '-';
            textfield.setText("");
        }
       
        if (e.getSource() == bm) {
            num1 = Double.parseDouble(textfield.getText());
            op = '*';
            textfield.setText("");
        } 
        if (e.getSource() == bd) {
            num1 = Double.parseDouble(textfield.getText());
            op = '/';
            textfield.setText("");
        }

      
        if (e.getSource() == beq) {
            num2 = Double.parseDouble(textfield.getText());

            
            switch (op) {

                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        textfield.setText("Ma ERROR");
                        return;
                    }
                    break;
            }
            
            textfield.setText(String.valueOf(result)); 
           
            num1 = result;
        }

        
        if (e.getSource() == bclr) {
            textfield.setText("");
        }

       
        if(e.getSource()==bdel) {
			String string = textfield.getText();
			textfield.setText("");
			for(int i=0;i<string.length()-1;i++) {
				textfield.setText(textfield.getText()+string.charAt(i));
			}
		}

    }

}
