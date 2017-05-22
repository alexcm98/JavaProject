package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JButton btnBv = new JButton("Search Vehicle");
		btnBv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBv.setHorizontalTextPosition(SwingConstants.CENTER);
		btnBv.setRolloverIcon(new ImageIcon(PaginaPrincipal.class.getResource("/Images/lupa1.png")));
		btnBv.setPressedIcon(new ImageIcon(PaginaPrincipal.class.getResource("/Images/lupa3.png")));
		btnBv.setIcon(new ImageIcon(PaginaPrincipal.class.getResource("/Images/lupa2.png")));
		btnBv.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnBv.setVerticalAlignment(SwingConstants.BOTTOM);
		btnBv.setIconTextGap(-3);
		btnBv.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBv.setContentAreaFilled(false);
		btnBv.setBorderPainted(false);
		btnBv.setBorder(null);
		btnBv.setBounds(23, 29, 76, 90);
		frame.getContentPane().add(btnBv);
		
		JButton btnNv = new JButton("New Vehicle");
		btnNv.setRolloverIcon(new ImageIcon(PaginaPrincipal.class.getResource("/Images/vehiculo1.png")));
		btnNv.setPressedIcon(new ImageIcon(PaginaPrincipal.class.getResource("/Images/vehiculo3.png")));
		btnNv.setIcon(new ImageIcon(PaginaPrincipal.class.getResource("/Images/vehiculo2.png")));
		btnNv.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNv.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNv.setIconTextGap(-3);
		btnNv.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNv.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNv.setContentAreaFilled(false);
		btnNv.setBorderPainted(false);
		btnNv.setBorder(null);
		btnNv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent evt) {
				FormularioVehiculo formularioV = new FormularioVehiculo();
				formularioV.frame.setVisible(true);
			}
		});
		btnNv.setBounds(157, 29, 76, 90);
		frame.getContentPane().add(btnNv);
	}
}
