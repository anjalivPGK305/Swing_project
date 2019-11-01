package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class Bmi {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	double height;
	double weight;
	double res;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bmi window = new Bmi();
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
	public Bmi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 350, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(278, 156, -254, 157);
		frame.getContentPane().add(layeredPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(154, 205, 50));
		panel.setBounds(10, 81, 314, 208);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblHeightm = new JLabel("Height(m):");
		lblHeightm.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHeightm.setBounds(31, 41, 62, 14);
		panel.add(lblHeightm);
		
		textField = new JTextField();
		textField.setBounds(118, 39, 173, 25);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblWeightkg = new JLabel("Weight(kg):");
		lblWeightkg.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblWeightkg.setBounds(31, 87, 72, 14);
		panel.add(lblWeightkg);
		
		textField_1 = new JTextField();
		textField_1.setBounds(118, 83, 173, 25);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBmi.setBounds(31, 136, 36, 14);
		panel.add(lblBmi);
		
		JLabel lblOverweight = new JLabel("");
		lblOverweight.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOverweight.setForeground(new Color(255, 165, 0));
		lblOverweight.setBounds(213, 136, 78, 16);
		panel.add(lblOverweight);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				height=Double.parseDouble(textField.getText());
				weight=Double.parseDouble(textField.getText());
				res=(height/weight/weight)*10000;
				String ans = String.format("%.2f", res);
				//lblNewLabel.setText(ans);
				if(res<18.5)
				{
					lblOverweight.setText("Under Weight");
				}
				else if(res>18.5 && res<24.9)
				{
					lblOverweight.setText("Normal Weight");
				}
				else if(res>25 && res<29.9)
				{
					lblOverweight.setText("Over Weight");
				}
				else
				{
					lblOverweight.setText("Obese");
				}
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCalculate.setBounds(93, 174, 78, 23);
		panel.add(btnCalculate);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(181, 174, 62, 23);
		panel.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(253, 174, 51, 23);
		panel.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(93, 127, 72, 25);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(154, 205, 50));
		panel_1.setBounds(0, 0, 334, 70);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(28, 36, 1, 1);
		panel_1.add(layeredPane_1);
		
		JLabel lblBodyMassIndex = new JLabel("Body Mass Index");
		lblBodyMassIndex.setForeground(new Color(0, 0, 205));
		lblBodyMassIndex.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBodyMassIndex.setBounds(87, 21, 173, 23);
		panel_1.add(lblBodyMassIndex);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(154, 205, 50));
		panel_2.setBounds(10, 308, 314, 136);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setBounds(238, 119, -168, -57);
		panel_2.add(table);
	}
}
