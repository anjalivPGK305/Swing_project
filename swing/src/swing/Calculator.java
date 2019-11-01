package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double num1;
	double num2;
	double result;
	String op;
	String ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(45, 11, 335, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+btnNewButton.getText();
				textField.setText(Number);
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(62, 107, 57, 27);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("5");
		button.setForeground(Color.BLUE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number = textField.getText()+button.getText();
			    textField.setText(Number);
				
			}
		});
		button.setBounds(150, 107, 57, 27);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("6");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+button_1.getText();
			textField.setText(Number);
				
			}
		});
		button_1.setForeground(Color.BLUE);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_1.setBounds(235, 107, 57, 27);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("7");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String Number = textField.getText()+button_2.getText();
			textField.setText(Number);
			}
		});
		button_2.setForeground(Color.BLUE);
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_2.setBounds(62, 145, 57, 27);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("8");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+button_3.getText();
				textField.setText(Number);
			}
		});
		button_3.setForeground(Color.BLUE);
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_3.setBounds(150, 145, 57, 27);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("9");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+button_4.getText();
				textField.setText(Number);
			}
		});
		button_4.setForeground(Color.BLUE);
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_4.setBounds(235, 145, 57, 27);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("0");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+button_5.getText();
				textField.setText(Number);
			}
		});
		button_5.setForeground(Color.BLUE);
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_5.setBounds(62, 183, 57, 27);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton(".");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+button_6.getText();
				textField.setText(Number);
			}
		});
		button_6.setForeground(Color.BLUE);
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_6.setBounds(150, 183, 57, 27);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("=");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num2=Double.parseDouble(textField.getText());
				if(op=="+")
				{
					result=num1+num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="-")
				{
					result=num1-num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="*")
				{
					result=num1*num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="/")
				{
					result=num1/num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="%")
				{
					result=num1%num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
			}
		});
		button_7.setForeground(Color.BLUE);
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_7.setBounds(235, 183, 57, 27);
		frame.getContentPane().add(button_7);
		
		JButton btnNewButton_1 = new JButton("C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(62, 224, 57, 27);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
			}
		});
		btnB.setForeground(Color.BLUE);
		btnB.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnB.setBounds(150, 224, 57, 27);
		frame.getContentPane().add(btnB);
		
		JButton button_8 = new JButton("-");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		button_8.setForeground(Color.BLUE);
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_8.setBounds(329, 107, 56, 27);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("*");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		button_9.setForeground(Color.BLUE);
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_9.setBounds(329, 145, 57, 27);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("/");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		button_10.setForeground(Color.BLUE);
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_10.setBounds(329, 183, 57, 27);
		frame.getContentPane().add(button_10);
		
		JButton btnNewButton_2 = new JButton("1");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+btnNewButton_2.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setBounds(62, 65, 57, 27);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton button_11 = new JButton("2");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+button_11.getText();
				textField.setText(Number);
			}
		});
		button_11.setForeground(Color.BLUE);
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_11.setBounds(150, 65, 56, 27);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("3");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+button_12.getText();
				textField.setText(Number);
			}
		});
		button_12.setForeground(Color.BLUE);
		button_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_12.setBounds(235, 64, 57, 29);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("+");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
				
			}
		});
		button_13.setForeground(Color.BLUE);
		button_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_13.setBounds(329, 67, 57, 23);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("%");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		button_14.setForeground(Color.BLUE);
		button_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_14.setBounds(329, 228, 57, 23);
		frame.getContentPane().add(button_14);
	}
}
