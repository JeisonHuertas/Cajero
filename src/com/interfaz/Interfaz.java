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
		// variable que almacena la cantiada de  billetes a utilizar por cada valor
		int cantidadBilletesAUtilizar;
		// variable que ira teniendo en cuenta el valor restante que quede despues de cada iteracion"
		int total = dineroARetirar;
		/* 
		 * Esta variable es un acumulador que se encarga de verificar si la cantidad de billetes utilizada en todo el
		 * recorrido del arreglo «caja», para evitar errores en el caso de que la cantidad solicitada por el usuario
		 * no es posible retirarla con la cantidad de billetes que se tiene por ejemplo que se solicite valores inferiores
		 * a los valores de los billetes disponibles. 
		 */
		int acumulador = 0;
		
		//se evalua si el dinero a retirar esta disponible dentro del saldo del cajero
		if (dineroARetirar > cajero.getSaldoDisponible()) {
			JOptionPane.showMessageDialog(null, "El cajero no tiene fondos", "warning", JOptionPane.WARNING_MESSAGE);
		//si la anterior condición no se cumple se evalua si el monto solicitado es multiplo de 10.000
		}else if(dineroARetirar%10000 != 0){
			JOptionPane.showMessageDialog(null, "ingrese multiplos de 10000", "warning", JOptionPane.WARNING_MESSAGE);
		// una vez ninguna de las condiciones se cumpla se ejecuta la logica para el retiro
		}else {
		//ciclo que recorre el arreglo «caja»
			for( int i = 0; i < cajero.getCaja().length ;i++) {
		//se realiza la operacion para calcular el numero de billetes que se necesitan de la iteración realizada	
				cantidadBilletesAUtilizar = total / cajero.getCaja()[i].getValor();
		// se evalua si el dinero a retirar es menor a 0, si se cumple cierra el ciclo 
				if (dineroARetirar <= 0 ) {
					break;
				}else {
		// condicional que evalua si la cantidad de billeteses mayor a la disponible, de ser asi, se toman los disponibles
					if (cantidadBilletesAUtilizar > cajero.getCaja()[i].getCantidad()) {
						cantidadBilletesAUtilizar = cajero.getCaja()[i].getCantidad();
					}
		/* 
		 * cada vez que el usuario de clic sobre el botón, «cantidadBilletesAUtilizar» tiene un valor por cada iteración, 
		 * el acumulador suma estos tres valores. «total» toma la cantidad de dinero a retirar y le resta el valor del billete por la cantidad
		 * de billetes a utilizar, para que la siguiente iteracion trabaje bajo el restante que falta para el retiro completo del dinero.
		 */
					acumulador += cantidadBilletesAUtilizar;
					total = total - (cajero.getCaja()[i].getValor() * cantidadBilletesAUtilizar);
					panelValorEntregado.actualizar(i,cantidadBilletesAUtilizar, dineroARetirar);
					cajero.getEntregado()[i] += cantidadBilletesAUtilizar; // se aumenta la cantidad de billetes utilizados del valor de billete y se guarda en la array «entregado»
					cajero.getCaja()[i].retiro(cantidadBilletesAUtilizar); // disminuye la cantidad de billetes disponibles de ese valor
				}
			} 
			// si el acumulador es 0, significa que ninguno de los tres billetes sumados o individuales pueden completar el pago
			if (acumulador == 0) {
				JOptionPane.showMessageDialog(null, "la transaccion no es posible realizarla", "warning", JOptionPane.WARNING_MESSAGE);
				return;
			}else {
				cajero.getEntregado()[3] += dineroARetirar; // se guarda el valor retirado en el array «entregado»
				cajero.descontarRetiro(dineroARetirar); // se actualiza el saldo disponible
			}
		}
		// se muestran los datos en los paneles
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
