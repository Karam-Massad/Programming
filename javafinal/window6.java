package javafinal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class window6 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void new4() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window6 window = new window6();
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
	public window6() {
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
		
		JLabel lblNewLabel = new JLabel("Ministry of toursim");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(138, 11, 185, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblDoYouHave = new JLabel("Do you have any health problems ?");
		lblDoYouHave.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDoYouHave.setBounds(10, 86, 240, 29);
		frame.getContentPane().add(lblDoYouHave);
		
		JRadioButton rdbtnYes = new JRadioButton("Yes");
		rdbtnYes.setBackground(new Color(102, 153, 102));
		rdbtnYes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnYes.setBounds(261, 91, 62, 23);
		frame.getContentPane().add(rdbtnYes);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.setBackground(new Color(102, 153, 102));
		rdbtnNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNo.setBounds(325, 91, 109, 23);
		frame.getContentPane().add(rdbtnNo);
		
		JLabel lblIfYesPlease = new JLabel("If yes please explain");
		lblIfYesPlease.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIfYesPlease.setBounds(20, 126, 191, 29); 
		frame.getContentPane().add(lblIfYesPlease);
		
		textField = new JTextField();
		textField.setBounds(10, 166, 267, 54);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window5 f= new window5();
				f.new3();
				frame.setVisible(false);
			
				
			}
		});
		btnNext.setBounds(325, 227, 89, 23);
		frame.getContentPane().add(btnNext);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(20, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
