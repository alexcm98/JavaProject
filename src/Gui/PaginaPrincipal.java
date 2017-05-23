package Gui;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Event;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
public class PaginaPrincipal {

	protected JFrame frame;
	private JButton btnBv;
	private JButton btnNv;


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
		frame.requestFocus();
		frame.addKeyListener(new KeyListener() {			
			
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_RIGHT)
				{
					btnNv.requestFocus();
				}
				if(e.getKeyCode()==KeyEvent.VK_LEFT)
				{
					btnBv.requestFocus();
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyTyped(KeyEvent e) {
				
			}
		});
		frame.setFocusable(true);
		frame.requestFocus();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(PaginaPrincipal.class.getResource("/Images/icon.png")));
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setTitle("Panel");
		frame.setBounds(100, 100, 317, 205);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
		
		
		btnBv = new JButton("Buscar Veh\u00EDculo");
		btnBv.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {

				btnBv.setIcon(new ImageIcon(PaginaPrincipal.class.getResource("/Images/lupa1.png")));
			}
			@Override
			public void focusLost(FocusEvent e) {
				btnBv.setIcon(new ImageIcon(PaginaPrincipal.class.getResource("/Images/lupa3.png")));
			}
		});
		btnBv.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_RIGHT)
				{
					btnNv.requestFocus();
				}
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					btnBv.doClick();
				}
			}
		});
		btnBv.setBounds(37, 27, 97, 106);
		btnBv.setForeground(Color.WHITE);
		frame.getContentPane().setLayout(null);
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
		btnBv.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(btnBv);

		btnNv = new JButton("Nuevo Veh\u00EDculo");
		btnNv.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				btnNv.setIcon(new ImageIcon(PaginaPrincipal.class.getResource("/Images/vehiculo1.png")));
			}
			@Override
			public void focusLost(FocusEvent e) {

				btnNv.setIcon(new ImageIcon(PaginaPrincipal.class.getResource("/Images/vehiculo3.png")));
			}
		});
		btnNv.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNv.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_LEFT)
				{
					btnBv.requestFocus();
				}
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					btnNv.doClick();
				}
			}
		});
		btnNv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormularioVehiculo formularioV = new FormularioVehiculo();
				formularioV.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNv.setBounds(176, 15, 97, 118);
		btnNv.setForeground(Color.WHITE);
		btnNv.setRolloverIcon(new ImageIcon(PaginaPrincipal.class.getResource("/Images/vehiculo1.png")));
		btnNv.setPressedIcon(new ImageIcon(PaginaPrincipal.class.getResource("/Images/vehiculo3.png")));
		btnNv.setIcon(new ImageIcon(PaginaPrincipal.class.getResource("/Images/vehiculo2.png")));
		btnNv.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNv.setIconTextGap(-3);
		btnNv.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNv.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNv.setContentAreaFilled(false);
		btnNv.setBorderPainted(false);
		btnNv.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(btnNv);
		btnBv.setFocusPainted(false);
		btnNv.setFocusPainted(false);
	}

}
