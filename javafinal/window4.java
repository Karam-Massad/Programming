package javafinal;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.PrintWriter;

public class window4 {

	private JFrame frame;
	private JTextField textField;
	private JTextField txtMotherName;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
    public FileWriter fw;
	/**
	 * Launch the application.
	 */
	public static void new2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window4 window = new window4();
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
	public window4() {
		initialize();
	}

	/**
	 * Initialise the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 153, 102));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMinistryOfTourism = new JLabel("Ministry of tourism");
		lblMinistryOfTourism.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblMinistryOfTourism.setBounds(139, 11, 190, 27);
		frame.getContentPane().add(lblMinistryOfTourism);
		
		JLabel lblFatherName = new JLabel("Father name ");
		lblFatherName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFatherName.setBounds(10, 92, 95, 14);
		frame.getContentPane().add(lblFatherName);
		
		textField = new JTextField();
		textField.setBounds(103, 91, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblMotherName = new JLabel("Mother name");
		lblMotherName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMotherName.setBounds(225, 92, 105, 14);
		frame.getContentPane().add(lblMotherName);
		
		txtMotherName = new JTextField();
		txtMotherName.setBounds(340, 91, 86, 20);
		frame.getContentPane().add(txtMotherName);
		txtMotherName.setColumns(10);
		
		JLabel lblIdNumber = new JLabel("ID number");
		lblIdNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIdNumber.setBounds(10, 172, 95, 14);
		frame.getContentPane().add(lblIdNumber);
		
		textField_2 = new JTextField();
		textField_2.setBounds(103, 171, 139, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCity.setBounds(10, 117, 46, 22);
		frame.getContentPane().add(lblCity);
		
		textField_3 = new JTextField();
		textField_3.setBounds(103, 119, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNa = new JLabel("Nationality");
		lblNa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNa.setBounds(235, 117, 69, 20);
		frame.getContentPane().add(lblNa);
		
		textField_4 = new JTextField();
		textField_4.setBounds(340, 122, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblBloodType = new JLabel("Blood type");
		lblBloodType.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBloodType.setBounds(273, 166, 69, 27);
		frame.getContentPane().add(lblBloodType);
		
		textField_5 = new JTextField();
		textField_5.setBounds(352, 171, 53, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(10, 197, 69, 20);
		frame.getContentPane().add(lblEmail);
		
		textField_6 = new JTextField();
		textField_6.setBounds(103, 202, 139, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window6 d=new window6();
				d.new4();
				frame.setVisible(false);
			}
		});
		btnNext.setBounds(337, 227, 89, 23);
		frame.getContentPane().add(btnNext);
	}

}
