package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Login {

	private JFrame frame;
	private JTextField textField_User;
	private JTextField textField_Password;
	private JLabel lblUser;
	private JLabel lblPassword;
	private JButton btnGo;

	private final int PASSWORD = 1234;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 321, 215);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblUser = new JLabel("User:");
		lblUser.setBounds(10, 38, 46, 14);
		frame.getContentPane().add(lblUser);

		lblPassword = new JLabel("Password:");
		lblPassword.setBounds(10, 82, 64, 14);
		frame.getContentPane().add(lblPassword);

		textField_User = new JTextField();
		textField_User.setBounds(84, 35, 86, 20);
		frame.getContentPane().add(textField_User);
		textField_User.setColumns(10);

		textField_Password = new JTextField();
		textField_Password.setColumns(10);
		textField_Password.setBounds(84, 79, 86, 20);
		frame.getContentPane().add(textField_Password);

		btnGo = new JButton("GO");
		btnGo.setBounds(84, 142, 89, 23);
		frame.getContentPane().add(btnGo);
	}
}
