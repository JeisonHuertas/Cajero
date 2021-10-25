package com.interfaz;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.TitledBorder;

public class PanelTotalesEntregados extends JPanel {
	private JTextField txtValorEntregado;
	private JTextField txtCantidadBilletes50;
	private JTextField txtCantidadBilletes20;
	private JTextField txtCantidadBilletes10;

	/**
	 * Create the panel.
	 */
	public PanelTotalesEntregados() {
		setBorder(new TitledBorder(null, "Totales Entregados", TitledBorder.CENTER, TitledBorder.BELOW_TOP, null, null));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Valor Entregado");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBounds(30, 51, 168, 50);
		add(lblNewLabel);
		
		txtValorEntregado = new JTextField();
		txtValorEntregado.setForeground(Color.BLUE);
		txtValorEntregado.setFont(new Font("Arial", Font.PLAIN, 12));
		txtValorEntregado.setEditable(false);
		txtValorEntregado.setColumns(10);
		txtValorEntregado.setBounds(58, 101, 112, 32);
		add(txtValorEntregado);
		
		JLabel lblCan = new JLabel("CANTIDADES");
		lblCan.setHorizontalAlignment(SwingConstants.CENTER);
		lblCan.setFont(new Font("Arial", Font.BOLD, 12));
		lblCan.setBounds(244, 29, 168, 50);
		add(lblCan);
		
		JLabel lblNewLabel_1_1 = new JLabel("Billetes de 50 :");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(172, 66, 168, 50);
		add(lblNewLabel_1_1);
		
		txtCantidadBilletes50 = new JTextField();
		txtCantidadBilletes50.setEditable(false);
		txtCantidadBilletes50.setColumns(10);
		txtCantidadBilletes50.setBounds(310, 81, 118, 20);
		add(txtCantidadBilletes50);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Billetes de 20 :");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(172, 112, 168, 50);
		add(lblNewLabel_1_1_1);
		
		txtCantidadBilletes20 = new JTextField();
		txtCantidadBilletes20.setEditable(false);
		txtCantidadBilletes20.setColumns(10);
		txtCantidadBilletes20.setBounds(310, 127, 118, 20);
		add(txtCantidadBilletes20);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Billetes de 10 :");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1_1.setBounds(172, 158, 168, 50);
		add(lblNewLabel_1_1_1_1);
		
		txtCantidadBilletes10 = new JTextField();
		txtCantidadBilletes10.setEditable(false);
		txtCantidadBilletes10.setColumns(10);
		txtCantidadBilletes10.setBounds(310, 173, 118, 20);
		add(txtCantidadBilletes10);

	}

}
