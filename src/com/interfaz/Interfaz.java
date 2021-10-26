package com.interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mundo.Billete;
import com.mundo.Cajero;

import java.awt.GridLayout;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	/**
	 * Asociaciones con los paneles
	 */
	private PanelValorRetirar panelValorRetirar;
	private PanelValorEntregado panelValorEntregado;
	private PanelDatosCajero panelDatosCajero;
	private PanelTotalesEntregados panelTotalesEntregados;
	
	private Cajero cajero;
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
		cajero = new Cajero();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 942, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 5, 5));
		
		panelValorRetirar = new PanelValorRetirar(this);
		contentPane.add(panelValorRetirar);
		
		panelValorEntregado = new PanelValorEntregado();
		contentPane.add(panelValorEntregado);
		
		panelDatosCajero = new PanelDatosCajero(this);
		contentPane.add(panelDatosCajero);
		
		panelTotalesEntregados = new PanelTotalesEntregados();
		contentPane.add(panelTotalesEntregados);
	}
	public void retirar(int dineroARetirar) {
		int cantidadBilletesAUtilizar;
		int total = dineroARetirar;
		if (dineroARetirar > cajero.getSaldoDisponible()) {
			JOptionPane.showMessageDialog(null, "El cajero no tiene fondos", "warning", JOptionPane.WARNING_MESSAGE);
		}else {
			for( int i = 0; i < cajero.getCaja().length ;i++) {
				cantidadBilletesAUtilizar = total / cajero.getCaja()[i].getValor();
				if (dineroARetirar <= 0 ) {
					break;
				}else {
					if (cantidadBilletesAUtilizar > cajero.getCaja()[i].getCantidad()) {
						cantidadBilletesAUtilizar = cajero.getCaja()[i].getCantidad();
					}
					total = total - (cajero.getCaja()[i].getValor() * cantidadBilletesAUtilizar);
					panelValorEntregado.actualizar(i,cantidadBilletesAUtilizar, dineroARetirar);
					cajero.getEntregado()[i] += cantidadBilletesAUtilizar;
					cajero.getCaja()[i].retiro(cantidadBilletesAUtilizar);
				}
			} 
			cajero.descontarRetiro(dineroARetirar);
			cajero.getEntregado()[3] += dineroARetirar;
		}
		panelDatosCajero.actualizar(cajero.getCaja(),cajero.getSaldoDisponible());
		panelTotalesEntregados.actualizar(cajero.getEntregado());
	}
	public Billete[] getCaja() {
		return cajero.getCaja();
	}
	public int getSaldoDisponible() {
		return cajero.getSaldoDisponible();
	}
}
