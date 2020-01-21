package javafinal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class window2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window2 window = new window2();
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
	public window2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 153, 102));
		frame.getContentPane().setForeground(new Color(255, 0, 51));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcomeToThe = new JLabel("Welcome to the ministry of tourism ");
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblWelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToThe.setBounds(62, 0, 323, 36);
		frame.getContentPane().add(lblWelcomeToThe);
		
		JButton btnNewButton = new JButton("Get a new license");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window3 a=new window3();
				a.new1();
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(135, 112, 174, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblToursimGuide = new JLabel("Toursim guide");
		lblToursimGuide.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblToursimGuide.setHorizontalAlignment(SwingConstants.CENTER);
		lblToursimGuide.setBounds(116, 47, 193, 36);
		frame.getContentPane().add(lblToursimGuide);
		
		JButton btnNewButton_1 = new JButton("Renew your license");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window7 c= new window7 ();
				c.new7();
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(135, 146, 174, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);		
			}
		});
		btnExit.setBounds(10, 227, 89, 23);
		frame.getContentPane().add(btnExit);
	}
}
