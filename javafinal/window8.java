package javafinal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class window8 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void new8() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window8 window = new window8();
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
	public window8() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 153, 102));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMinistryOfTourism = new JLabel("Ministry of tourism");
		lblMinistryOfTourism.setHorizontalAlignment(SwingConstants.CENTER);
		lblMinistryOfTourism.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblMinistryOfTourism.setBounds(109, 0, 228, 34);
		frame.getContentPane().add(lblMinistryOfTourism);
		
		JLabel lblRenewYour = new JLabel("Renew your license ");
		lblRenewYour.setHorizontalAlignment(SwingConstants.CENTER);
		lblRenewYour.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRenewYour.setBounds(139, 28, 166, 24);
		frame.getContentPane().add(lblRenewYour);
		
		JLabel lblFirstName = new JLabel("First name ");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFirstName.setBounds(47, 93, 86, 24);
		frame.getContentPane().add(lblFirstName);
		
		textField = new JTextField();
		textField.setBounds(119, 97, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last name ");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLastName.setBounds(243, 100, 94, 14);
		frame.getContentPane().add(lblLastName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(317, 97, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblLicenseExprationDate = new JLabel("license expration date");
		lblLicenseExprationDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLicenseExprationDate.setBounds(47, 145, 158, 24);
		frame.getContentPane().add(lblLicenseExprationDate);
		
		textField_2 = new JTextField();
		textField_2.setBounds(194, 149, 209, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Renew");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window10 n=new window10();
				n.new10();
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
