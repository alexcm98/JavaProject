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
import java.awt.ComponentOrientation;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("unused")
public class Login {

	private JFrame frmLogIn;
	private JTextField textField_User;
	private JButton btnIniciar;
	private JPasswordField passwordField;
	private final String PASSWORD = "1234";
	private JLabel lblUser;
	private JLabel lblPassword;
	private JButton btnRegistrar;
	private JLabel lblFondo;
	
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
		frmLogIn.setBounds(100, 100, 390, 464);
		frmLogIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogIn.getContentPane().setLayout(null);

		textField_User = new JTextField();
		textField_User.setBorder(null);
		textField_User.setBounds(77, 200, 265, 41);
		frmLogIn.getContentPane().add(textField_User);
		textField_User.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBorder(null);
		passwordField.setBounds(77, 262, 265, 41);
		frmLogIn.getContentPane().add(passwordField);
		
		btnIniciar = new JButton("");
		btnIniciar.setIcon(new ImageIcon(Login.class.getResource("/Images/btn_iniciar_1.png")));
		btnIniciar.addMouseListener(new MouseAdapter() {
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
		btnIniciar.setBounds(77, 340, 81, 41);
		frmLogIn.getContentPane().add(btnIniciar);
		
		btnRegistrar = new JButton("");
		btnRegistrar.setIcon(new ImageIcon(Login.class.getResource("/Images/btn_regist_1.png")));
		btnRegistrar.setBounds(217, 340, 91, 41);
		frmLogIn.getContentPane().add(btnRegistrar);
		
		lblUser = new JLabel("");
		lblUser.setIcon(new ImageIcon(Login.class.getResource("/Images/txt_user.png")));
		lblUser.setBounds(30, 200, 312, 41);
		frmLogIn.getContentPane().add(lblUser);
		
		lblPassword = new JLabel("");
		lblPassword.setIcon(new ImageIcon(Login.class.getResource("/Images/txt_pass.png")));
		lblPassword.setBounds(30, 262, 312, 41);
		frmLogIn.getContentPane().add(lblPassword);
		
		lblFondo = new JLabel("");
		lblFondo.setBorder(null);
		lblFondo.setIcon(new ImageIcon(Login.class.getResource("/Images/frame_2.png")));
		lblFondo.setBounds(-27, 0, 401, 432);
		frmLogIn.getContentPane().add(lblFondo);	
		
	}
}
