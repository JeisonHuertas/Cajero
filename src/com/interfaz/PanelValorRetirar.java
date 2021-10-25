package com.interfaz;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelValorRetirar extends JPanel {
	private JTextField txtCantidadARetirar;
	
	private Interfaz principal;
	
	public PanelValorRetirar(Interfaz principal) {
		this();
		this.principal = principal;
	}

	/**
	 * Create the panel.
	 */
	public PanelValorRetirar() {
		setBorder(new TitledBorder(null, "Valor a Retirar", TitledBorder.CENTER, TitledBorder.BELOW_TOP, null, Color.ORANGE));
		setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Valor a Retirar: ");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(10, 59, 168, 50);
		add(lblNewLabel_1_1);
		
		txtCantidadARetirar = new JTextField();
		txtCantidadARetirar.setColumns(10);
		txtCantidadARetirar.setBounds(149, 74, 118, 20);
		add(txtCantidadARetirar);
		
		JButton btnNewButton = new JButton("Retirar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cantidadRetiro = Integer.parseInt(txtCantidadARetirar.getText());
				principal.retirar(cantidadRetiro);
			}
		});
		btnNewButton.setBounds(306, 73, 89, 23);
		add(btnNewButton);

	}
}
