package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Studreport {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_3;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTable table;
	double total;
	double avg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Studreport window = new Studreport();
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
	public Studreport() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(100, 100, 894, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Student Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(21, 11, 364, 262);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblStudentid = new JLabel("Student_ID");
		lblStudentid.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStudentid.setBounds(10, 28, 74, 15);
		panel.add(lblStudentid);
		
		textField = new JTextField();
		textField.setBounds(86, 25, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFirstName.setBounds(10, 54, 66, 14);
		panel.add(lblFirstName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(86, 51, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSurname.setBounds(10, 85, 66, 14);
		panel.add(lblSurname);
		
		textField_2 = new JTextField();
		textField_2.setBounds(86, 82, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCourseCode = new JLabel("Course code");
		lblCourseCode.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCourseCode.setBounds(10, 118, 74, 14);
		panel.add(lblCourseCode);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(10, 154, 162, 14);
		panel.add(separator);
		
		JLabel lblTotalScore = new JLabel("Total Score");
		lblTotalScore.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotalScore.setBounds(10, 169, 66, 14);
		panel.add(lblTotalScore);
		
		textField_4 = new JTextField();
		textField_4.setBounds(86, 166, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAverage.setBounds(10, 203, 66, 14);
		panel.add(lblAverage);
		
		textField_5 = new JTextField();
		textField_5.setBounds(86, 200, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRanking.setBounds(10, 234, 54, 14);
		panel.add(lblRanking);
		
		textField_6 = new JTextField();
		textField_6.setBounds(86, 231, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"CS111", "CS112", "CS113"}));
		comboBox.setBounds(86, 115, 86, 20);
		panel.add(comboBox);
		
		JLabel lblMaths = new JLabel("Maths");
		lblMaths.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMaths.setBounds(193, 28, 71, 14);
		panel.add(lblMaths);
		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
	                }
	    
			}
		});
		textField_3.setBounds(268, 25, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("English");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(193, 54, 46, 14);
		panel.add(lblNewLabel);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
	                }
			}
		});
		textField_7.setBounds(268, 51, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblBiology = new JLabel("Biology");
		lblBiology.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBiology.setBounds(193, 85, 46, 14);
		panel.add(lblBiology);
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
	                }
			}
		});
		textField_8.setBounds(268, 82, 86, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComputer.setBounds(193, 118, 71, 14);
		panel.add(lblComputer);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
	                }
			}
		});
		textField_9.setBounds(268, 115, 86, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblChemistry.setBounds(193, 154, 71, 14);
		panel.add(lblChemistry);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
	                }
			}
		});
		textField_10.setBounds(268, 148, 86, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblPhysics = new JLabel("Physics");
		lblPhysics.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPhysics.setBounds(193, 185, 54, 14);
		panel.add(lblPhysics);
		
		textField_11 = new JTextField();
		textField_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
	                }
			}
		});
		textField_11.setBounds(268, 179, 86, 20);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblTamil = new JLabel("Tamil");
		lblTamil.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTamil.setBounds(193, 210, 46, 14);
		panel.add(lblTamil);
		
		textField_12 = new JTextField();
		textField_12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
	                }
			}
		});
		textField_12.setBounds(268, 207, 86, 20);
		panel.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblMalayalam = new JLabel("Malayalam");
		lblMalayalam.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMalayalam.setBounds(193, 234, 71, 14);
		panel.add(lblMalayalam);
		
		textField_13 = new JTextField();
		textField_13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
	                }
			}
		});
		textField_13.setBounds(268, 231, 86, 20);
		panel.add(textField_13);
		textField_13.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(123, 104, 238));
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Student Report", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(395, 11, 425, 319);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(25, 23, 377, 251);
		panel_1.add(textArea);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("");
			}
		});
		btnClear.setForeground(new Color(0, 0, 255));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClear.setBounds(169, 285, 89, 23);
		panel_1.add(btnClear);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(21, 341, 814, 76);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student_ID", "Course_Name", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "Total Score ", "Average", "Ranking"},
			},
			new String[] {
				"Student_ID", "Course_Name", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "Total Score", "Average", "Ranking"
			}
		));
		table.setBounds(0, 0, 814, 76);
		panel_2.add(table);
		
		JButton btnAddReport = new JButton("Add Report");
		btnAddReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double t1 = Double.parseDouble(textField_3.getText());
				double t2 = Double.parseDouble(textField_7.getText());
				double t3 = Double.parseDouble(textField_8.getText());
				double t4 = Double.parseDouble(textField_9.getText());
				double t5 = Double.parseDouble(textField_10.getText());
				double t6 = Double.parseDouble(textField_11.getText());
				double t7 = Double.parseDouble(textField_12.getText());
				double t8 = Double.parseDouble(textField_13.getText());
				total = t1+t2+t3+t4+t5+t6+t7+t8;
				String c = String.format("%.2f", total);
				textField_4.setText(c);
				avg = total/8;
				String a = String.format("%.2f", avg);
				textField_5.setText(a);
				if(total>700)
				{
					textField_6.setText("1");
				}
				else if(total>600 && total<700)
				{
					textField_6.setText("2");
				}
				else if(total>500 && total<600)
				{
					textField_6.setText("3");
				}
				else
				{
					textField_6.setText("Fail");
				}
				DefaultTableModel model=(DefaultTableModel)table.getModel();
                model.addRow(new String[] {
                		textField.getText(),
                		(String) comboBox.getSelectedItem(),
                		textField_3.getText(),
                		textField_7.getText(),
                		textField_8.getText(),
                		textField_9.getText(),
                		textField_10.getText(),
                		textField_11.getText(),
                		textField_12.getText(),
                		textField_13.getText(),
                		textField_4.getText(),
                		textField_5.getText(),
                		textField_6.getText(),
                });
			}
		});
		btnAddReport.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddReport.setForeground(Color.GREEN);
		btnAddReport.setBounds(143, 428, 112, 23);
		frame.getContentPane().add(btnAddReport);
		
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
		btnDelete.setForeground(Color.RED);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDelete.setBounds(280, 428, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnShowReport = new JButton("Show Report");
		
		btnShowReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Student Record\n"
						+ "Student Name :\t\t"+textField_1.getText()+" "+textField_2.getText()
						+ "\n======================================"
						+ "\nMaths:\t\t" + textField_3.getText()
						+ "\nEnglish:\t\t" + textField_7.getText()
						+ "\nBiology:\t\t" + textField_8.getText()
						+ "\nComputer:\t\t" + textField_9.getText()
						+ "\nChemistry:\t\t" + textField_10.getText()
						+ "\nPhysics:\t\t" + textField_11.getText()
						+ "\nTamil:\t\t" + textField_12.getText()
						+ "\nMalayalam:\t\t" + textField_13.getText()
						+ "\n======================================="
						+ "\nTotal Score:\t\t" + textField_4.getText()
						+ "\nAverage:\t\t" + textField_5.getText()
						+ "\nRanking:\t\t" + textField_6.getText() + "\n"
						);						
						
			}
		});
		btnShowReport.setForeground(Color.BLUE);
		btnShowReport.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnShowReport.setBounds(393, 428, 118, 23);
		frame.getContentPane().add(btnShowReport);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.setForeground(Color.MAGENTA);
		btnExit.setBounds(532, 428, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				
			}
		});
		btnReset.setForeground(new Color(148, 0, 211));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnReset.setBounds(642, 428, 89, 23);
		frame.getContentPane().add(btnReset);
	}
}
