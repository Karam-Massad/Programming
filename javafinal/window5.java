package javafinal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JButton;

public class window5 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void new3() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window5 window = new window5();
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
	public window5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 153, 102));
		frame.getContentPane().setForeground(new Color(102, 153, 102));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMinistryOfToursim = new JLabel("Ministry of toursim");
		lblMinistryOfToursim.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblMinistryOfToursim.setBounds(136, 11, 181, 29);
		frame.getContentPane().add(lblMinistryOfToursim);
		
		JLabel lblCityOf = new JLabel("City of field ");
		lblCityOf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCityOf.setBounds(174, 61, 83, 19);
		frame.getContentPane().add(lblCityOf);
		
		JCheckBox chckbxMadaba = new JCheckBox("Madaba");
		chckbxMadaba.setBounds(160, 87, 97, 23);
		frame.getContentPane().add(chckbxMadaba);
		
		JCheckBox chckbxJarash = new JCheckBox("Jarash");
		chckbxJarash.setBounds(160, 113, 97, 23);
		frame.getContentPane().add(chckbxJarash);
		
		JCheckBox chckbxAjloun = new JCheckBox("Ajloun");
		chckbxAjloun.setBounds(160, 139, 97, 23);
		frame.getContentPane().add(chckbxAjloun);
		
		JCheckBox chckbxDeadSea = new JCheckBox("Dead sea");
		chckbxDeadSea.setBounds(160, 165, 97, 23);
		frame.getContentPane().add(chckbxDeadSea);
		
		JCheckBox chckbxOmqais = new JCheckBox("Om-Qais");
		chckbxOmqais.setBounds(160, 191, 97, 23);
		frame.getContentPane().add(chckbxOmqais);
		
		JButton btnNext = new JButton("Register");
		btnNext.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnNext);
	}
}
