package javafinal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class window9 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void new9() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window9 window = new window9();
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
	public window9() {
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
		lblMinistryOfTourism.setBounds(114, 11, 213, 28);
		frame.getContentPane().add(lblMinistryOfTourism);
		
		JLabel lblUploadYourOld = new JLabel("Upload your old license ");
		lblUploadYourOld.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUploadYourOld.setBounds(39, 74, 161, 28);
		frame.getContentPane().add(lblUploadYourOld);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.setBounds(199, 79, 89, 23);
		frame.getContentPane().add(btnUpload);
		
		JLabel lblUploadANew = new JLabel("Upload a New photo");
		lblUploadANew.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUploadANew.setBounds(39, 108, 150, 23);
		frame.getContentPane().add(lblUploadANew);
		
		JButton btnNewButton = new JButton("Upload");
		btnNewButton.setBounds(199, 110, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window8 m = new window8();
				m.new8();
				frame.setVisible(false);
			}
		});
		btnNext.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnNext);
	}

}
