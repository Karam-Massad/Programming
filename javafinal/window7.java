package javafinal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class window7 {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void new7() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window7 window = new window7();
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
	public window7() {
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
		lblMinistryOfTourism.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMinistryOfTourism.setBounds(149, 11, 156, 30);
		frame.getContentPane().add(lblMinistryOfTourism);
		
		JLabel lblLoginDetails = new JLabel("Login details");
		lblLoginDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLoginDetails.setBounds(172, 52, 104, 30);
		frame.getContentPane().add(lblLoginDetails);
		
		JLabel lblCivilNumber = new JLabel("Civil number");
		lblCivilNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCivilNumber.setBounds(122, 103, 90, 17);
		frame.getContentPane().add(lblCivilNumber);
		
		textField = new JTextField();
		textField.setBounds(122, 121, 154, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(122, 154, 79, 20);
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(122, 173, 154, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window9 k=new window9();
				k.new9();
				frame.setVisible(false);
				
			}
		});
		btnLogin.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnLogin);
	}
}
