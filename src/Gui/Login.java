package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import javafx.scene.paint.Color;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.SwingConstants;

@SuppressWarnings("unused")
public class Login {

	private JFrame frmLogIn;
	private JTextField textField_User;
	private JButton btnIniciar;
	private JPasswordField passwordField;
	private final String PASSWORD = "1234";
	private final String USUARIO = "admin";
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
		frmLogIn.addKeyListener(new KeyListener() {			
			
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_RIGHT)
				{
					btnRegistrar.requestFocus();
				}
				if(e.getKeyCode()==KeyEvent.VK_LEFT)
				{
					btnIniciar.requestFocus();
				}
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					lblUser.requestFocus();
				}
			}
			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyTyped(KeyEvent e) {
				
			}
		});
		frmLogIn.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Images/icon.png")));
		frmLogIn.setTitle("Login");
		frmLogIn.setBounds(100, 100, 378, 464);
		frmLogIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogIn.getContentPane().setLayout(null);
		frmLogIn.setResizable(false);	
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frmLogIn.setLocation(dim.width/2-frmLogIn.getSize().width/2, dim.height/2-frmLogIn.getSize().height/2);

		
		textField_User = new JTextField();
		textField_User.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()== KeyEvent.VK_ENTER || e.getKeyCode()== KeyEvent.VK_DOWN)
				{
				passwordField.requestFocus();
				}
			}
		});
		textField_User.setBounds(77, 200, 265, 41);
		textField_User.setBorder(null);
		frmLogIn.getContentPane().add(textField_User);
		textField_User.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()== KeyEvent.VK_UP)
				{
					textField_User.requestFocus();
				}
				if(e.getKeyCode()== KeyEvent.VK_ENTER)
				{
					btnIniciar.doClick();
				}
				if(e.getKeyCode()== KeyEvent.VK_DOWN)
				{
					btnIniciar.requestFocus();
				}
			}
		});
		passwordField.setBounds(77, 262, 265, 41);
		passwordField.setBorder(null);
		frmLogIn.getContentPane().add(passwordField);
		
		btnIniciar = new JButton("");
		btnIniciar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_UP)
				{
					passwordField.requestFocus();
				}
				if(e.getKeyCode()==KeyEvent.VK_RIGHT)
				{
					btnRegistrar.requestFocus();
				}
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					btnIniciar.doClick();
				}
			}
		});
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField_User.getText().equals(USUARIO) || !PASSWORD.equals(new String(passwordField.getPassword()))){
					JOptionPane.showMessageDialog(frmLogIn, "Usuario o contraseña inválidos", "ERROR",
							JOptionPane.ERROR_MESSAGE);
					textField_User.requestFocus();
				}else{
					PaginaPrincipal principal = new PaginaPrincipal();
					principal.frame.setVisible(true);
					frmLogIn.dispose();
				}
			}
		});
		btnIniciar.setBounds(77, 340, 81, 41);
		btnIniciar.setIcon(new ImageIcon(Login.class.getResource("/Images/btn_iniciar_1.png")));
		frmLogIn.getContentPane().add(btnIniciar);
		
		btnRegistrar = new JButton("");
		btnRegistrar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_LEFT)
				{
					btnIniciar.requestFocus();
				}
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					btnRegistrar.doClick();
				}
			}
		});
		btnRegistrar.setBounds(217, 340, 91, 41);
		btnRegistrar.setIcon(new ImageIcon(Login.class.getResource("/Images/btn_regist_1.png")));
		frmLogIn.getContentPane().add(btnRegistrar);
		
		lblUser = new JLabel("");
		lblUser.setBounds(30, 200, 312, 41);
		lblUser.setIcon(new ImageIcon(Login.class.getResource("/Images/txt_user.png")));
		frmLogIn.getContentPane().add(lblUser);
		
		lblPassword = new JLabel("");
		lblPassword.setBounds(30, 262, 312, 41);
		lblPassword.setIcon(new ImageIcon(Login.class.getResource("/Images/txt_pass.png")));
		frmLogIn.getContentPane().add(lblPassword);
		
		lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 372, 435);
		lblFondo.setBorder(null);
		lblFondo.setIcon(new ImageIcon(Login.class.getResource("/Images/frame_2.png")));
		frmLogIn.getContentPane().add(lblFondo);
		}
}
