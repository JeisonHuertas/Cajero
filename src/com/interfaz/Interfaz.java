package com.interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mundo.Billete;

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
	/**
	 * Asociacion con la clase Billete
	 */
	private Billete billeteDe50;
	private Billete billeteDe20;
	private Billete billeteDe10;
	/**
	 * Arrays que contienen las instancias de la clase Billete
	 */
	private Billete[] caja;
	private int[] entregado;
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
		//inicializando los Arrays
		
		caja = new Billete[3];
		entregado = new int[4];
		
		// instancia de los billetes
		caja[0] = new Billete(50000,3);
		caja[1] = new Billete(20000,5);
		caja[2] = new Billete(10000,5);
		
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
	public Billete[] darArreglo() {
		return caja;
	}
	
	public void retirar(int cantidad) {
		int cantidadBilletesAUtilizar;
		int total;
		for( int i = 0; i < caja.length ;i++) {
			if (caja[i].getCantidad() == 0 ) {
				continue;
			}else {
				cantidadBilletesAUtilizar = cantidad/caja[i].getValor();
				total = cantidad - (caja[i].getValor() * cantidadBilletesAUtilizar);
				caja[i].setCantidad(caja[i].getCantidad()-cantidadBilletesAUtilizar);
			}
			if(total == 0) {
				break;
			}
		} 
		panelDatosCajero.actualizar(caja);
	}
}
