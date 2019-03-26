package hotelmang;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsername.setBounds(22, 49, 86, 41);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(22, 124, 76, 20);
		contentPane.add(lblPassword);
		
		user = new JTextField();
		user.setBounds(22, 83, 116, 30);
		contentPane.add(user);
		user.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(22, 155, 116, 28);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Traditional Arabic", Font.PLAIN, 18));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
									Connection connection;
					try {
						connection = DriverManager.getConnection(
								"jdbc:mysql://localhost:3306/hotelmang","root","1403");
						Statement state=connection.createStatement();
						String sql="Select * From login where password='"+passwordField.getText()+"'and username='"+user.getText()+"'";
						ResultSet result = state.executeQuery(sql);
						if (result.next()) {
						
						JOptionPane.showMessageDialog(null,"Login sucessfully");}
						 else
						
						 {	JOptionPane.showMessageDialog(null,"incorrect password or username");
						}
						state.close();
						result.close();
						connection.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
			}
		});
		btnLogin.setBounds(98, 210, 89, 40);
		contentPane.add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnCancel.setBounds(250, 210, 89, 40);
		contentPane.add(btnCancel);
		
		JLabel lblLoginPage = new JLabel("Login page");
		lblLoginPage.setFont(new Font("Traditional Arabic", Font.PLAIN, 26));
		lblLoginPage.setBounds(145, 11, 156, 49);
		contentPane.add(lblLoginPage);
	}

}
