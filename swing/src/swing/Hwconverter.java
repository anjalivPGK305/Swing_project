package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Hwconverter {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double height;
	double weight;
	double result1;
	double result2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hwconverter window = new Hwconverter();
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
	public Hwconverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHelp.setBounds(10, 0, 46, 23);
		frame.getContentPane().add(lblHelp);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAbout.setBounds(46, 4, 46, 14);
		frame.getContentPane().add(lblAbout);
		
		JLabel lblUsMeasurement = new JLabel("US Measurement");
		lblUsMeasurement.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUsMeasurement.setBounds(121, 49, 106, 23);
		frame.getContentPane().add(lblUsMeasurement);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(115, 83, 106, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setBounds(114, 132, 106, 23);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Height:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(46, 86, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblWeight = new JLabel("Weight:");
		lblWeight.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblWeight.setBounds(46, 136, 46, 14);
		frame.getContentPane().add(lblWeight);
		
		JLabel lblMetric = new JLabel("Metric");
		lblMetric.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMetric.setBounds(271, 53, 46, 14);
		frame.getContentPane().add(lblMetric);
		
		JLabel lblM = new JLabel("");
		lblM.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblM.setBounds(285, 83, 46, 14);
		frame.getContentPane().add(lblM);
		
		JLabel lblKg = new JLabel("");
		lblKg.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblKg.setBounds(285, 136, 46, 14);
		frame.getContentPane().add(lblKg);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				height=Double.parseDouble(textField.getText());
				weight=Double.parseDouble(textField_1.getText());
				result1=height*0.296;
				String ans1=String.format("%.2fm", result1);
				result2=weight*0.4514;
				String ans2=String.format("%.0fkg",result2);
				lblM.setText(ans1);
				lblKg.setText(ans2);
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnOk.setBounds(115, 199, 106, 23);
		frame.getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCancel.setBounds(231, 199, 100, 23);
		frame.getContentPane().add(btnCancel);
	}
}
