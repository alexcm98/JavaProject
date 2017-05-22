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

public class Login {

	private JFrame frame;
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

		passwordField = new JPasswordField();
		passwordField.setBounds(84, 79, 86, 20);
		frame.getContentPane().add(passwordField);
		
		btnGo = new JButton("GO");
		btnGo.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent evt) {
				if (textField_User.getText().isEmpty() || passwordField.getText().isEmpty()){
					JOptionPane.showMessageDialog(frame, "Se deben rellenar todos los campos.", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				}else if (passwordField.getText() != PASSWORD){
					JOptionPane.showMessageDialog(frame, "La contraseña no es correcta.", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				}else{
					PaginaPrincipal principal = new PaginaPrincipal();
					principal.frame.setVisible(true);
					frame.dispose();
				}
				
			}
		});
		btnGo.setBounds(84, 142, 89, 23);
		frame.getContentPane().add(btnGo);
		
		
	}
}
