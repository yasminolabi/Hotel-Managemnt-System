package hotelmang;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Panel;
import java.awt.Button;
import javax.swing.JSlider;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Color;

public class mainpage extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainpage frame1 = new mainpage();
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mainpage() {
		setVisible(true);
		setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1000, 1000, 649, 500);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("first name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 82, 60, 28);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("last name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 147, 60, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Address");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 167, 60, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mobile no");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(10, 192, 60, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(10, 217, 60, 14);
		getContentPane().add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(90, 87, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(90, 141, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(90, 165, 86, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(90, 190, 86, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(76, 214, 75, 23);
		getContentPane().add(rdbtnNewRadioButton);
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setBounds(150, 214, 86, 23);
		getContentPane().add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("check in");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(10, 256, 60, 14);
		getContentPane().add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(80, 254, 86, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("check out");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(10, 281, 60, 14);
		getContentPane().add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(80, 279, 86, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Room-no");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(10, 306, 60, 14);
		getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Room-type");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_8.setBounds(10, 331, 75, 14);
		getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Rate");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_9.setBounds(10, 356, 46, 14);
		getContentPane().add(lblNewLabel_9);
		
		textField_6 = new JTextField();
		textField_6.setBounds(80, 304, 86, 20);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(80, 329, 86, 20);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Guest Details");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblNewLabel_10.setBounds(319, 30, 163, 28);
		getContentPane().add(lblNewLabel_10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(80, 354, 86, 20);
		getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		Button button = new Button("save");
		button.addActionListener(new ActionListener() {
			private JLabel firstname;
			private JLabel lastname;
			private JLabel address;
			private JLabel mobile;
			private Object gender;
			public void actionPerformed(ActionEvent e) { Connection connection;
				JFrame frame = new JFrame();
			    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    try {
					connection = DriverManager.getConnection(
							"jdbc:mysql://localhost:3306/hotelmang","root","1403");
					DefaultTableModel table = new DefaultTableModel();
					table.addColumn("firstname");
					table.addColumn("lastname");
					table.addColumn("address");
					table.addColumn("mobile no");
					table.addColumn("check in");
					table.addColumn("check out");
					table.addColumn("room no");
					table.addColumn("room type");
					table.addColumn("reate");
					Statement st = connection.createStatement();
			        st.executeUpdate("insert into hotelmang VALUES('"+firstname.getText()+"','"+lastname.getText()+"','"+address.getText()+"','"+mobile.getText()
			        +"','"+gender.getClass()+"')");
			        JOptionPane.showMessageDialog(rootPane, "saved");
			        		
					} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			   

			}
		});
		button.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		button.setBounds(228, 352, 70, 22);
		getContentPane().add(button);
		
		Button button_1 = new Button("show");
		button_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		button_1.setBounds(319, 348, 70, 22);
		getContentPane().add(button_1);
		
		Button button_2 = new Button("update");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
			}
		});
		button_2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		button_2.setBounds(406, 348, 70, 22);
		getContentPane().add(button_2);
		
		Button button_3 = new Button("Delete");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		button_3.setBounds(228, 393, 70, 22);
		getContentPane().add(button_3);
		
		Button button_4 = new Button("Reset");
		button_4.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		button_4.setBounds(336, 393, 70, 22);
		getContentPane().add(button_4);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, 0, 636, 21);
		getContentPane().add(menuBar);
		
		JMenu mnHome = new JMenu("Home");
		menuBar.add(mnHome);
		
		JMenu mnRoom = new JMenu("Room");
		menuBar.add(mnRoom);
		
		JMenu mnEmployee = new JMenu("employee");
		menuBar.add(mnEmployee);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(228, 90, 380, 230);
		getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
	}
}
