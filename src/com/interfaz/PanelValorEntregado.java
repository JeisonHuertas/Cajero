package com.interfaz;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;

import com.mundo.Billete;

import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PanelValorEntregado extends JPanel {
	private JTextField txtValorEntregado;
	private JTextField txtCantidadBilletes50;
	private JTextField txtCantidadBilletes20;
	private JTextField txtCantidadBilletes10;

	/**
	 * Create the panel.
	 */
	public PanelValorEntregado() {
		setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Valor Entregado", TitledBorder.CENTER, TitledBorder.BELOW_TOP, null, new Color(0, 0, 255)));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Valor Entregado");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(28, 48, 168, 50);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		add(lblNewLabel);
		
		JLabel lblCan = new JLabel("CANTIDADES");
		lblCan.setHorizontalAlignment(SwingConstants.CENTER);
		lblCan.setFont(new Font("Arial", Font.BOLD, 12));
		lblCan.setBounds(242, 26, 168, 50);
		add(lblCan);
		
		JLabel lblNewLabel_1_1 = new JLabel("Billetes de 50 :");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(170, 63, 168, 50);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Billetes de 20 :");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(170, 109, 168, 50);
		add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Billetes de 10 :");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1_1.setBounds(170, 155, 168, 50);
		add(lblNewLabel_1_1_1_1);
		
		txtValorEntregado = new JTextField();
		txtValorEntregado.setForeground(Color.BLUE);
		txtValorEntregado.setFont(new Font("Arial", Font.PLAIN, 12));
		txtValorEntregado.setEditable(false);
		txtValorEntregado.setBounds(56, 98, 112, 32);
		add(txtValorEntregado);
		txtValorEntregado.setColumns(10);
		
		txtCantidadBilletes50 = new JTextField();
		txtCantidadBilletes50.setEditable(false);
		txtCantidadBilletes50.setBounds(308, 78, 118, 20);
		add(txtCantidadBilletes50);
		txtCantidadBilletes50.setColumns(10);
		
		txtCantidadBilletes20 = new JTextField();
		txtCantidadBilletes20.setEditable(false);
		txtCantidadBilletes20.setColumns(10);
		txtCantidadBilletes20.setBounds(308, 124, 118, 20);
		add(txtCantidadBilletes20);
		
		txtCantidadBilletes10 = new JTextField();
		txtCantidadBilletes10.setEditable(false);
		txtCantidadBilletes10.setColumns(10);
		txtCantidadBilletes10.setBounds(308, 170, 118, 20);
		add(txtCantidadBilletes10);

	}
	public void actualizar( int posicion, int cantidadBilletes, int dineroEntregado) {
		if(posicion == 0) {
			txtCantidadBilletes50.setText(formatearValorEntero(cantidadBilletes));
		}else if(posicion == 1) {
			txtCantidadBilletes20.setText(formatearValorEntero(cantidadBilletes));
		}else if(posicion ==2) {
			txtCantidadBilletes10.setText(formatearValorEntero(cantidadBilletes));
		}
		txtValorEntregado.setText(formatearValorEntero(dineroEntregado));
	}
	private String formatearValorEntero(int valor) {
		return Integer.toString(valor);
	}
}
