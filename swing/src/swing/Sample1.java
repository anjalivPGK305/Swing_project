package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;

public class Sample1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double num1;
	double num2;
	double result;
	String op,ans;
	double United=301.56;
	double Russia=200.43;
	double China=145.34;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sample1 window = new Sample1();
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
	public Sample1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 787, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(568, 97, 177, 315);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCurrencyConverter = new JLabel("Currency converter");
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblCurrencyConverter.setBounds(10, 24, 157, 14);
		panel.add(lblCurrencyConverter);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"USD", "EUR", "POUNDS"}));
		comboBox.setBounds(27, 69, 97, 20);
		panel.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(27, 123, 97, 28);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(27, 186, 97, 20);
		panel.add(lblNewLabel);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double bp = Double.parseDouble(textField_1.getText());
				if(comboBox.getSelectedItem().equals("POUNDS"))
				{
					String c = String.format("Rs %.2f", bp*China);
					lblNewLabel.setText(c);
				}
				if(comboBox.getSelectedItem().equals("USD"))
				{
					String c = String.format("Rs %.2f", bp*United);
					lblNewLabel.setText(c);
					
				}
				if(comboBox.getSelectedItem().equals("EUR"))
				{
					String c = String.format("Rs %.2f", bp*Russia);
					lblNewLabel.setText(c);
				}
				
						
			}
		});
		btnConvert.setBounds(10, 265, 71, 23);
		panel.add(btnConvert);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(91, 265, 76, 23);
		panel.add(btnClear);
		
		textField = new JTextField();
		textField.setBounds(10, 109, 198, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("B");
		btnNewButton.setBounds(10, 161, 46, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
			}
		});
		btnNewButton_1.setBounds(59, 161, 53, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("c");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton_2.setBounds(122, 161, 46, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("+-");
		btnNewButton_3.setBounds(178, 161, 46, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("sqrt");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.sqrt(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_4.setBounds(224, 161, 66, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("L..");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.log(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_5.setBounds(304, 161, 53, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("sin");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.sin(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_6.setBounds(360, 161, 56, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("sinh");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.sinh(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_7.setBounds(416, 161, 53, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Mod");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		btnNewButton_8.setBounds(473, 161, 56, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("cosh");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.cosh(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_9.setBounds(416, 211, 56, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("7");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+btnNewButton_10.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_10.setBounds(10, 211, 46, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("8");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+btnNewButton_11.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_11.setBounds(59, 211, 46, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("9");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+btnNewButton_12.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_12.setBounds(115, 211, 46, 23);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("/");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		btnNewButton_13.setBounds(178, 211, 46, 23);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("%");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		btnNewButton_14.setBounds(234, 211, 46, 23);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("pi");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =3.14;
				String s = String.format("%.2f", a);
				textField.setText(s);
			}
		});
		btnNewButton_15.setBounds(300, 211, 46, 23);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("cos");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.cos(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_16.setBounds(350, 211, 66, 23);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("Inx");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.log(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_17.setBounds(476, 211, 56, 23);
		frame.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("4");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+btnNewButton_18.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_18.setBounds(10, 268, 46, 23);
		frame.getContentPane().add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("5");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+btnNewButton_19.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_19.setBounds(59, 268, 46, 23);
		frame.getContentPane().add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("6");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+btnNewButton_20.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_20.setBounds(122, 268, 46, 23);
		frame.getContentPane().add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("*");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		btnNewButton_21.setBounds(178, 268, 46, 23);
		frame.getContentPane().add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("1/x");
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				result =1/num1;
				String a = String.format("%.2f", result);
				textField.setText(a);
			}
		});
		btnNewButton_22.setBounds(234, 268, 56, 23);
		frame.getContentPane().add(btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton("x^y");
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="x^y";
			}
		});
		btnNewButton_23.setBounds(304, 268, 56, 23);
		frame.getContentPane().add(btnNewButton_23);
		
		JButton btnNewButton_24 = new JButton("tan");
		btnNewButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.tan(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_24.setBounds(360, 268, 53, 23);
		frame.getContentPane().add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("tanh");
		btnNewButton_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.sin(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_25.setBounds(416, 268, 56, 23);
		frame.getContentPane().add(btnNewButton_25);
		
		JButton btnNewButton_26 = new JButton("C");
		btnNewButton_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton_26.setBounds(476, 268, 53, 23);
		frame.getContentPane().add(btnNewButton_26);
		
		JButton btnNewButton_27 = new JButton("1");
		btnNewButton_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+btnNewButton_27.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_27.setBounds(10, 333, 46, 23);
		frame.getContentPane().add(btnNewButton_27);
		
		JButton btnNewButton_28 = new JButton("2");
		btnNewButton_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+btnNewButton_28.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_28.setBounds(59, 333, 46, 23);
		frame.getContentPane().add(btnNewButton_28);
		
		JButton btnNewButton_29 = new JButton("3");
		btnNewButton_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+btnNewButton_29.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_29.setBounds(120, 333, 48, 23);
		frame.getContentPane().add(btnNewButton_29);
		
		JButton btnNewButton_30 = new JButton("-");
		btnNewButton_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		btnNewButton_30.setBounds(178, 333, 46, 23);
		frame.getContentPane().add(btnNewButton_30);
		
		JButton btnNewButton_31 = new JButton("=");
		btnNewButton_31.addActionListener(new ActionListener() {
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
				if(op=="Mod")
				{
					result=num1%num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="x^y")
				{
					result=Math.pow(num1, num2);
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="Cbr")
				{
					result=(num1/num2)*100;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
			}
		});
		btnNewButton_31.setBounds(244, 333, 46, 69);
		frame.getContentPane().add(btnNewButton_31);
		
		JButton btnNewButton_32 = new JButton("x^2");
		btnNewButton_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				double a =num1*num1;
				String d = String.format("%.2f", a);
				textField.setText(d);
			}
		});
		btnNewButton_32.setBounds(304, 333, 56, 23);
		frame.getContentPane().add(btnNewButton_32);
		
		JButton btnNewButton_33 = new JButton("Cbr");
		btnNewButton_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="Cbr";
			}
		});
		btnNewButton_33.setBounds(360, 333, 56, 23);
		frame.getContentPane().add(btnNewButton_33);
		
		JButton btnNewButton_34 = new JButton("Rund");
		btnNewButton_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.round(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_34.setBounds(416, 333, 64, 23);
		frame.getContentPane().add(btnNewButton_34);
		
		JButton btnNewButton_35 = new JButton("2*pi");
		btnNewButton_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =2*3.14;
				String s = String.format("%.2f", a);
				textField.setText(s);
			}
		});
		btnNewButton_35.setBounds(480, 333, 53, 23);
		frame.getContentPane().add(btnNewButton_35);
		
		JButton btnNewButton_36 = new JButton("0");
		btnNewButton_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+btnNewButton_36.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_36.setBounds(10, 379, 106, 23);
		frame.getContentPane().add(btnNewButton_36);
		
		JButton btnNewButton_38 = new JButton(".");
		btnNewButton_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText()+btnNewButton_38.getText();
				textField.setText(Number);
			}
		});
		btnNewButton_38.setBounds(121, 379, 47, 23);
		frame.getContentPane().add(btnNewButton_38);
		
		JButton btnNewButton_39 = new JButton("+");
		btnNewButton_39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		btnNewButton_39.setBounds(178, 379, 46, 23);
		frame.getContentPane().add(btnNewButton_39);
		
		JButton btnNewButton_40 = new JButton("x^3");
		btnNewButton_40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				double a =num1*num1*num1;
				String d = String.format("%.2f", a);
				textField.setText(d);
			}
		});
		btnNewButton_40.setBounds(294, 379, 56, 23);
		frame.getContentPane().add(btnNewButton_40);
		
		JButton btnNewButton_41 = new JButton("bin");
		btnNewButton_41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toBinaryString(a));
			}
		});
		btnNewButton_41.setBounds(350, 379, 56, 23);
		frame.getContentPane().add(btnNewButton_41);
		
		JButton btnNewButton_42 = new JButton("hex");
		btnNewButton_42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toHexString(a));
			}
		});
		btnNewButton_42.setBounds(408, 379, 64, 23);
		frame.getContentPane().add(btnNewButton_42);
		
		JButton btnNewButton_43 = new JButton("oct");
		btnNewButton_43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toOctalString(a));
			}
		});
		btnNewButton_43.setBounds(476, 379, 69, 23);
		frame.getContentPane().add(btnNewButton_43);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(0, 0, 745, 21);
		frame.getContentPane().add(menuBar_1);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar_1.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Standard");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setBounds(100, 100, 310, 488);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(null);
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmScientific = new JMenuItem("Scientific");
		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setBounds(100, 100, 576,488);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(null);
				
			}
		});
		mnNewMenu.add(mntmScientific);
		
		JMenuItem mntmUnitconversion = new JMenuItem("Unitconversion");
		mntmUnitconversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 771,488);
			}
		});
		mnNewMenu.add(mntmUnitconversion);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
			}
		});
		mnNewMenu.add(mntmExit);
	}
}
