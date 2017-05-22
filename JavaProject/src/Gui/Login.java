package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import java.awt.Font;

public class Login {

	private JFrame frmLogIn;
	private JTextField textField_User;
	private JLabel lblUser;
	private JLabel lblPassword;
	private JButton btnGo;
	private JPasswordField passwordField;
	private final String PASSWORD = "1234";
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogIn.setVisible(true);
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
		frmLogIn = new JFrame();
		frmLogIn.setTitle("Log in");
		frmLogIn.setBounds(100, 100, 290, 215);
		frmLogIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogIn.getContentPane().setLayout(null);

		lblUser = new JLabel("User:");
		lblUser.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUser.setBounds(10, 38, 46, 14);
		frmLogIn.getContentPane().add(lblUser);

		lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPassword.setBounds(10, 82, 64, 14);
		frmLogIn.getContentPane().add(lblPassword);

		textField_User = new JTextField();
		textField_User.setBounds(84, 35, 86, 20);
		frmLogIn.getContentPane().add(textField_User);
		textField_User.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(84, 79, 86, 20);
		frmLogIn.getContentPane().add(passwordField);
		
		btnGo = new JButton("GO");
		btnGo.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent evt) {
				if (textField_User.getText().isEmpty() || !passwordField.getText().equals(PASSWORD)){
					JOptionPane.showMessageDialog(frmLogIn, "Usuario o contraseña inválidos", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				}else{
					PaginaPrincipal principal = new PaginaPrincipal();
					principal.frame.setVisible(true);
					frmLogIn.dispose();
				}
				
			}
		});
		btnGo.setBounds(97, 142, 64, 23);
		frmLogIn.getContentPane().add(btnGo);
		
		
	}
}
