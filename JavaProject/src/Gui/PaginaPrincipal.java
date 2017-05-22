package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PaginaPrincipal {

	protected JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaginaPrincipal window = new PaginaPrincipal();
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
	public PaginaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("P\u00E1gina Principal");
		frame.setBounds(100, 100, 300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnBv = new JButton("BV");
		btnBv.setBounds(45, 71, 67, 23);
		frame.getContentPane().add(btnBv);
		
		JButton btnNv = new JButton("NV");
		btnNv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent evt) {
				FormularioVehiculo formularioV = new FormularioVehiculo();
				formularioV.frame.setVisible(true);
			}
		});
		btnNv.setBounds(166, 71, 67, 23);
		frame.getContentPane().add(btnNv);
	}
}
