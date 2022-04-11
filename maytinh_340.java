/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thjava;

/**
 *
 * @author Admin
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
 
public class maytinh_340 extends JFrame implements ActionListener{
       private JButton btn1, btn2, btn3, btn4;
       private JTextField tf1, tf2, tf3;
       private double result;
       private Container container;
       private JPanel panel1, panel2;
 
       public maytinh_340(String s) { 
            super(s);
            container = this.getContentPane(); 
      
            JLabel num1 = new JLabel("Số thứ nhất: ");
            tf1 = new JTextField();
            JLabel num2 = new JLabel("Số thứ nhất: ");
            tf2 = new JTextField();
            JLabel resultl = new JLabel("Kết quả: ");
            tf3 = new JTextField();
           
            tf3.setEditable(false);
 
            panel1 = new JPanel(); 
            panel1.setLayout(new GridLayout(3,2));
            panel1.add(num1); 
            panel1.add(tf1); 
            panel1.add(num2); 
            panel1.add(tf2);
            panel1.add(resultl);
            panel1.add(tf3);
            btn1 = new JButton("+");
            btn2= new JButton("-");
            btn3 = new JButton("*");
            btn4 = new JButton(":");
            panel2 = new JPanel();
            panel2.add(btn1);
            panel2.add(btn2);
            panel2.add(btn3);
            panel2.add(btn4);
 
            container.add(panel1); 
            container.add(panel2,"South"); 
 
            btn1.addActionListener(this);
            btn2.addActionListener(this); 
            btn3.addActionListener(this); 
            btn4.addActionListener(this);
           
            this.setSize(350, 200);
            this.setVisible(true);
       }
 
       public void Add_340() 
       { 
            result = Double.parseDouble(tf1.getText()) + Double.parseDouble(tf2.getText()); 
            tf3.setText(String.valueOf(result)); 
       }
       public void Minus_340() 
       { 
            result = Double.parseDouble(tf1.getText()) - Double.parseDouble(tf2.getText());
            tf3.setText(String.valueOf(result));
       }
       public void Multi_340() 
       {
            result = Double.parseDouble(tf1.getText()) * Double.parseDouble(tf2.getText());
            tf3.setText(String.valueOf(result)); 
       }
       public void Div_340()
       {
           result = Double.parseDouble(tf1.getText()) / Double.parseDouble(tf2.getText());
           tf3.setText(String.valueOf(result));
       } 
      
       public void actionPerformed(ActionEvent e) 
       { 
            if (e.getActionCommand()=="+") {
                if(tf1.getText().equals("") || tf2.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ");
                }else {
                    Add_340();
                }
            }
               
            if (e.getActionCommand()=="-") {
                if(tf1.getText().equals("")|| tf2.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ");
                }else {
                    Minus_340();
                }
            }
            if (e.getActionCommand()=="*"){
                if(tf1.getText().equals("")|| tf2.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ");
                }else {
                    Multi_340();
                }
            }               
            if (e.getActionCommand()==":") {
                if(tf1.getText().equals("")|| tf2.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ");
                }else {
                    Div_340();
                }
            }               
       }
       
    public static void main(String[] args) {
        maytinh_340 cal = new maytinh_340("SimpleCalculator");
       cal.setLocationRelativeTo(null);
    }  
}
 
