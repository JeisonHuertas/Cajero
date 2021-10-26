package com.interfaz;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import com.mundo.Billete;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class PanelDatosCajero extends JPanel {
	private JTextField txtCantidadBilletes50;
	private JTextField txtCantidadBilletes20;
	private JTextField txtCantidadBilletes10;
	private JTextField txtDineroTotal;
	private Interfaz principal;

	/**
	 * Create the panel.
	 */
	public PanelDatosCajero(Interfaz principal) {
		this.principal = principal;
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
		
		txtCantidadBilletes50 = new JTextField();
		txtCantidadBilletes50.setEditable(false);
		txtCantidadBilletes50.setColumns(10);
		txtCantidadBilletes50.setBounds(138, 91, 118, 20);
		add(txtCantidadBilletes50);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Billetes de 20 :");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(0, 122, 168, 50);
		add(lblNewLabel_1_1_1);
		
		txtCantidadBilletes20 = new JTextField();
		txtCantidadBilletes20.setEditable(false);
		txtCantidadBilletes20.setColumns(10);
		txtCantidadBilletes20.setBounds(138, 137, 118, 20);
		add(txtCantidadBilletes20);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Billetes de 10 :");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1_1.setBounds(0, 168, 168, 50);
		add(lblNewLabel_1_1_1_1);
		
		txtCantidadBilletes10 = new JTextField();
		txtCantidadBilletes10.setEditable(false);
		txtCantidadBilletes10.setColumns(10);
		txtCantidadBilletes10.setBounds(138, 183, 118, 20);
		add(txtCantidadBilletes10);
		
		JLabel lblDineroEnEl = new JLabel("DINERO EN EL CAJERO");
		lblDineroEnEl.setHorizontalAlignment(SwingConstants.CENTER);
		lblDineroEnEl.setFont(new Font("Arial", Font.BOLD, 12));
		lblDineroEnEl.setBounds(272, 90, 168, 50);
		add(lblDineroEnEl);
		
		txtDineroTotal = new JTextField();
		txtDineroTotal.setForeground(Color.BLUE);
		txtDineroTotal.setFont(new Font("Arial", Font.PLAIN, 12));
		txtDineroTotal.setEditable(false);
		txtDineroTotal.setColumns(10);
		txtDineroTotal.setBounds(300, 140, 112, 32);
		add(txtDineroTotal);
		actualizar(principal.getCaja(),principal.getSaldoDisponible() );
	}
	public void actualizar(  Billete[] caja, int saldoDisponible) {
		txtCantidadBilletes50.setText(formatearValorEntero(caja[0].getCantidad()));
		txtCantidadBilletes20.setText(formatearValorEntero(caja[1].getCantidad()));
		txtCantidadBilletes10.setText(formatearValorEntero(caja[2].getCantidad()));
		txtDineroTotal.setText(formatearValorEntero(saldoDisponible));
	}
	private String formatearValorEntero(int valor) {
		return Integer.toString(valor);
	}
}
