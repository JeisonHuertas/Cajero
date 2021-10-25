package com.interfaz;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PanelValorRetirar extends JPanel {
	private JTextField textField;

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
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(149, 74, 118, 20);
		add(textField);
		
		JButton btnNewButton = new JButton("Retirar");
		btnNewButton.setBounds(306, 73, 89, 23);
		add(btnNewButton);

	}
}
