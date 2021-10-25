package com.interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	// Asociaciones con los paneles
	private PanelValorRetirar panelValorRetirar;
	private PanelValorEntregado panelValorEntregado;
	private PanelDatosCajero panelDatosCajero;
	private PanelTotalesEntregados panelTotalesEntregados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 942, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 5, 5));
		
		panelValorRetirar = new PanelValorRetirar();
		contentPane.add(panelValorRetirar);
		
		panelValorEntregado = new PanelValorEntregado();
		contentPane.add(panelValorEntregado);
		
		panelDatosCajero = new PanelDatosCajero();
		contentPane.add(panelDatosCajero);
		
		panelTotalesEntregados = new PanelTotalesEntregados();
		contentPane.add(panelTotalesEntregados);
	}
}
