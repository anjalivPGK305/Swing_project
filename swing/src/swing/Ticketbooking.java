package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Ticketbooking {

	private JFrame frame;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	String va=" ";
    String Ac=" ";
    String non=" ";
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticketbooking window = new Ticketbooking();
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
	public Ticketbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 815, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(169, 11, 426, 52);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTicketBooking = new JLabel("Ticket Booking");
		lblTicketBooking.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTicketBooking.setBounds(85, 11, 232, 32);
		panel.add(lblTicketBooking);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(366, 69, 400, 250);
		panel_1.setForeground(Color.BLACK);
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Ticket Detail", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName_1.setBounds(10, 32, 57, 14);
		panel_1.add(lblName_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(79, 31, 86, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFrom.setBounds(10, 84, 46, 14);
		panel_1.add(lblFrom);
		
		textField_2 = new JTextField();
		textField_2.setBounds(79, 81, 86, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTo.setBounds(10, 118, 46, 14);
		panel_1.add(lblTo);
		
		textField_3 = new JTextField();
		textField_3.setBounds(79, 115, 86, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDate.setBounds(10, 153, 46, 14);
		panel_1.add(lblDate);
		
		textField_4 = new JTextField();
		textField_4.setBounds(79, 150, 86, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTime.setBounds(10, 184, 46, 14);
		panel_1.add(lblTime);
		
		textField_5 = new JTextField();
		textField_5.setBounds(79, 181, 86, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTicketNo.setBounds(249, 61, 65, 14);
		panel_1.add(lblTicketNo);
		
		textField_6 = new JTextField();
		textField_6.setBounds(249, 81, 86, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrice.setBounds(262, 105, 46, 14);
		panel_1.add(lblPrice);
		
		textField_7 = new JTextField();
		textField_7.setBounds(249, 127, 86, 20);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRoute.setBounds(262, 153, 46, 14);
		panel_1.add(lblRoute);
		
		textField_8 = new JTextField();
		textField_8.setBounds(249, 178, 86, 20);
		panel_1.add(textField_8);
		textField_8.setColumns(10);
		JRadioButton rdbtnAc = new JRadioButton("AC");
		rdbtnAc.setBounds(118, 156, 47, 23);
		rdbtnAc.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(rdbtnAc);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(224, 186, 54, 20);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		frame.getContentPane().add(comboBox_2);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String v="";
				if(rdbtnAc.isSelected())
				{
					v="AC";					
				}
				else
				{
					v="Non";
				}
				DefaultTableModel model=(DefaultTableModel)table.getModel();
                model.addRow(new String[] {
                		textField.getText(),
                		textField_6.getText(),
                		textField_2.getText(),
                		textField_3.getText(),
                		(String)comboBox_2.getSelectedItem(),
                		textField_4.getText(),
                		textField_5.getText(),v,
                		textField_7.getText(),
                		
                		});
			}
		});
		btnConfirm.setBounds(148, 212, 89, 23);
		panel_1.add(btnConfirm);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(34, 83, 61, 14);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(127, 83, 98, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(34, 108, 316, 4);
		separator.setForeground(Color.BLACK);
		frame.getContentPane().add(separator);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Standard");
		rdbtnNewRadioButton.setBounds(18, 119, 77, 23);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton single = new JRadioButton("Single Ticket");
		single.setBounds(111, 119, 98, 23);
		single.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(single);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setBounds(224, 119, 77, 23);
		rdbtnAdult.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("First Class");
		rdbtnNewRadioButton_2.setBounds(18, 156, 84, 23);
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		
		
		JRadioButton sleeper = new JRadioButton("Sleeper");
		sleeper.setBounds(169, 156, 69, 23);
		sleeper.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(sleeper);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setBounds(240, 156, 61, 23);
		rdbtnChild.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(rdbtnChild);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(34, 186, 77, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Thrissur", "Chennai", "Kollam"}));
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(127, 186, 70, 20);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Thrisur", "Chennai", "Kollam"}));
		frame.getContentPane().add(comboBox_1);
		
		
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(70, 217, 1, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(355, 108, 1, 202);
		separator_2.setForeground(Color.BLACK);
		frame.getContentPane().add(separator_2);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setBounds(34, 230, 46, 14);
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(lblTax);
		
		JLabel lblNewLabel = new JLabel("Subtotal");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(34, 255, 61, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(34, 313, 316, 14);
		separator_3.setForeground(Color.BLACK);
		frame.getContentPane().add(separator_3);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.setBounds(34, 325, 89, 23);
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    double no=Double.parseDouble((String)comboBox_2.getSelectedItem());
				textField_1.setText(textField.getText());
				String a = (String)comboBox.getSelectedItem();
				textField_2.setText(a);
				String b = (String)comboBox_1.getSelectedItem();
				textField_3.setText(b);
				Random ran = new Random();
				int n = ran.nextInt(1000000)+1;
				String val = String.valueOf(n);
				textField_6.setText(val);
				 Calendar timer=Calendar.getInstance();
	                timer.getTime();
	                SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
	                textField_5.setText(tTime.format(timer.getTime()));
	                //Date
	                SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
	                textField_4.setText(tdate.format(timer.getTime()));
	                if(rdbtnAc.isSelected()==true && sleeper.isSelected()==true && single.isSelected()==true)
	                {
	                	 va="3400";
                         double nn=Double.parseDouble(va);
                         double sub=no*nn;
                         Ac="200";
                         
                         String aa=String.format("%s",sub);
                            textField_10.setText(aa);
                           String a1=String.format("%s", Ac);
                            textField_9.setText(a1);
	                }
	                if(rdbtnAc.isSelected()==true && sleeper.isSelected()==true && single.isSelected()==false)
	                {
	                	va="4000";
                        double nn=Double.parseDouble(va);
                        double sub=no*nn;
                        Ac="200";
                       
                        String aa=String.format("%s",sub);
                           textField_10.setText(aa);
                          String a1=String.format("%s", Ac);
                           textField_9.setText(a1);
	                }
	                if(rdbtnAc.isSelected()==false && sleeper.isSelected()==true && single.isSelected()==true)
	                {
	                	va="3000";
                        double nn=Double.parseDouble(va);
                        double sub=no*nn;
                        Ac="100";
                        
                        String aa=String.format("%s",sub);
                           textField_10.setText(aa);
                          String a1=String.format("%s", Ac);
                           textField_9.setText(a1);
	                }
	                if(rdbtnAc.isSelected()==false && sleeper.isSelected()==true && single.isSelected()==false)
	                {
	                	va="3400";
                        double nn=Double.parseDouble(va);
                        double sub=no*nn;
                        Ac="100";
                       
                        String aa=String.format("%s",sub);
                           textField_10.setText(aa);
                          String a1=String.format("%s", Ac);
                           textField_9.setText(a1);
	                }
	                if(rdbtnAc.isSelected()==true && sleeper.isSelected()==false && single.isSelected()==true)
	                {
	                	va="3200";
                        double nn=Double.parseDouble(va);
                        double sub=no*nn;
                        Ac="200";
                        
                        String aa=String.format("%s",sub);
                           textField_10.setText(aa);
                          String a1=String.format("%s", Ac);
                           textField_9.setText(a1);
	                }
	                if(rdbtnAc.isSelected()==true && sleeper.isSelected()==false && single.isSelected()==false)
	                {
	                	va="3800";
                        double nn=Double.parseDouble(va);
                        double sub=no*nn;
                        Ac="200";
                        
                        String aa=String.format("%s",sub);
                           textField_10.setText(aa);
                          String a1=String.format("%s", Ac);
                           textField_9.setText(a1);
	                }
	                if(rdbtnAc.isSelected()==false && sleeper.isSelected()==false && single.isSelected()==true)
	                {
	                	va="2800";
                        double nn=Double.parseDouble(va);
                        double sub=no*nn;
                        Ac="100";
                        
                        String aa=String.format("%s",sub);
                           textField_10.setText(aa);
                          String a1=String.format("%s", Ac);
                           textField_9.setText(a1);
	                }
	                if(rdbtnAc.isSelected()==false && sleeper.isSelected()==false && single.isSelected()==false)
	                {
	                	va="3200";
                        double nn=Double.parseDouble(va);
                        double sub=no*nn;
                        Ac="100";
                     
                        String aa=String.format("%s",sub);
                           textField_10.setText(aa);
                          String a1=String.format("%s", Ac);
                           textField_9.setText(a1);
	                }
	               double tax = Double.parseDouble(textField_9.getText());
	               double subtot = Double.parseDouble(textField_10.getText());
	               double total = tax+subtot;
	               String tot = String.format("%s", total);
	               textField_11.setText(tot);
	               textField_7.setText(textField_11.getText());
	               textField_8.setText("Any");
	               
	                

	             
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				rdbtnNewRadioButton.setSelected(false);
				single.setSelected(false);
				rdbtnAdult.setSelected(false);
				rdbtnNewRadioButton_2.setSelected(false);
				rdbtnAc.setSelected(false);
				sleeper.setSelected(false);				
				rdbtnChild.setSelected(false);
			}
		});
		btnReset.setBounds(136, 325, 89, 23);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(239, 325, 89, 23);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(btnExit);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(31, 352, 735, 72);
		panel_2.setBackground(Color.BLUE);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking No", "From", "To", "No of Seats", "Time", "Date", "AC/Non-AC", "Price"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 11, 715, 53);
		panel_2.add(table);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(353, 110, -10, 202);
		separator_4.setForeground(Color.BLACK);
		separator_4.setOrientation(SwingConstants.VERTICAL);
		frame.getContentPane().add(separator_4);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotal.setBounds(34, 287, 46, 14);
		frame.getContentPane().add(lblTotal);
		
		textField_9 = new JTextField();
		textField_9.setBounds(123, 227, 86, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(123, 252, 86, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(123, 282, 86, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(342, 219, -29, 2);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setForeground(Color.BLACK);
		separator_6.setBounds(28, 215, 322, 4);
		frame.getContentPane().add(separator_6);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				try
				{
					int rownum = table.getSelectedRow();
					model.removeRow(rownum);
				}
				catch(Exception msg)
				{
					JOptionPane.showMessageDialog(null,"Please choose the particular row");
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDelete.setBounds(256, 435, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnNewButton = new JButton("Print");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Thanks for booking.Happy Journey\n"
						+"Name:\t\t"+textField_1.getText()
						+"\nFrom\t\t"+textField_2.getText()
						+"\nTo\t\t"+textField_3.getText()
						+"\nDate\t\t"+textField_4.getText()
						+"\nTime\t\t"+textField_5.getText()
						+"\nTicketNo\t\t"+textField_6.getText()
						+"\nPrice\t\t"+textField_7.getText()
						+"\nRoute\t\t"+textField_8.getText());				
			}
		});
		btnNewButton.setBounds(391, 435, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
