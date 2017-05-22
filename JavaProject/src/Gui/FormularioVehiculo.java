package Gui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioVehiculo {

	protected JFrame frame;
	private JTextField textMarca;
	private JTextField textMatricula;
	private JTextField textColor;
	private JTextField textFecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioVehiculo window = new FormularioVehiculo();
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
	public FormularioVehiculo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 633, 573);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lblVehculo = new JLabel("Registro de veh\u00EDculos");
		lblVehculo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblVehculo.setBounds(45, 26, 319, 29);
		frame.getContentPane().add(lblVehculo);
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMarca.setBounds(62, 83, 52, 14);
		frame.getContentPane().add(lblMarca);
		JLabel lblColor = new JLabel("Color:");
		lblColor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblColor.setBounds(62, 195, 46, 14);
		frame.getContentPane().add(lblColor);
		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMatricula.setBounds(45, 135, 69, 14);
		frame.getContentPane().add(lblMatricula);
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFecha.setBounds(56, 247, 52, 14);
		frame.getContentPane().add(lblFecha);
		JLabel lblPotenciaMotor = new JLabel("Potencia max:");
		lblPotenciaMotor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPotenciaMotor.setBounds(10, 312, 104, 14);
		frame.getContentPane().add(lblPotenciaMotor);
		JLabel lblPotencia = new JLabel("Potencia = 0");
		lblPotencia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPotencia.setBounds(140, 337, 192, 42);
		frame.getContentPane().add(lblPotencia);
		JSlider slider = new JSlider();
		slider.setValue(0);
		slider.setMaximum(300);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblPotencia.setText("Potencia = " + slider.getValue() + " km/h");
				if (slider.getValue() <= 100) {
					slider.setBackground(Color.GREEN);
				} else if (slider.getValue() <= 200) {
					slider.setBackground(Color.orange);
				} else if (slider.getValue() <= 300) {
					slider.setBackground(Color.red);
				}
			}
		});
		slider.setBounds(132, 303, 200, 23);
		frame.getContentPane().add(slider);
		textMarca = new JTextField();
		textMarca.setBounds(140, 82, 114, 20);
		frame.getContentPane().add(textMarca);
		textMarca.setColumns(10);
		textMatricula = new JTextField();
		textMatricula.setColumns(10);
		textMatricula.setBounds(140, 134, 114, 20);
		frame.getContentPane().add(textMatricula);
		textColor = new JTextField();
		textColor.setColumns(10);
		textColor.setBounds(140, 194, 114, 20);
		frame.getContentPane().add(textColor);
		textFecha = new JTextField();
		textFecha.setColumns(10);
		textFecha.setBounds(140, 246, 114, 20);
		frame.getContentPane().add(textFecha);
		JButton btnCrear = new JButton("Crear");
		btnCrear.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCrear.setBounds(20, 441, 132, 56);
		frame.getContentPane().add(btnCrear);
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnEditar.setBounds(166, 441, 132, 56);
		frame.getContentPane().add(btnEditar);
		JButton btnCliente = new JButton("Cliente");
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCliente.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCliente.setBounds(316, 441, 132, 56);
		frame.getContentPane().add(btnCliente);
		JButton btnReparar = new JButton("Reparar");
		btnReparar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReparar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnReparar.setBounds(464, 441, 132, 56);
		frame.getContentPane().add(btnReparar);
	}
}