package com.interfaz;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class PanelDatosCajero extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public PanelDatosCajero() {
		setBorder(new TitledBorder(null, "Datos del Cajero", TitledBorder.CENTER, TitledBorder.BELOW_TOP, null, Color.RED));
		setLayout(null);
		
		JLabel lblCantidadRestante = new JLabel("CANTIDAD RESTANTE");
		lblCantidadRestante.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidadRestante.setFont(new Font("Arial", Font.BOLD, 12));
		lblCantidadRestante.setBounds(56, 39, 168, 50);
		add(lblCantidadRestante);
		
		JLabel lblNewLabel_1_1 = new JLabel("Billetes de 50 :");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(0, 76, 168, 50);
		add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(138, 91, 118, 20);
		add(textField);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Billetes de 20 :");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(0, 122, 168, 50);
		add(lblNewLabel_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(138, 137, 118, 20);
		add(textField_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Billetes de 10 :");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1_1.setBounds(0, 168, 168, 50);
		add(lblNewLabel_1_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(138, 183, 118, 20);
		add(textField_2);
		
		JLabel lblDineroEnEl = new JLabel("DINERO EN EL CAJERO");
		lblDineroEnEl.setHorizontalAlignment(SwingConstants.CENTER);
		lblDineroEnEl.setFont(new Font("Arial", Font.BOLD, 12));
		lblDineroEnEl.setBounds(272, 90, 168, 50);
		add(lblDineroEnEl);
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.BLUE);
		textField_3.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(300, 140, 112, 32);
		add(textField_3);

	}

}
