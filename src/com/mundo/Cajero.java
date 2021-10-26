package com.mundo;

public class Cajero {
	private int saldoDisponible;
	private Billete[] caja;
	private int[] entregado;
	
	private Billete billete;
	
	public Cajero () {
		entregado = new int[4];
		caja = new Billete[3];
		caja[0] = new Billete(50000,3);
		caja[1] = new Billete(20000,5);
		caja[2] = new Billete(10000,5);
		this.saldoDisponible = (caja[0].getCantidad()*caja[0].getValor()) + (caja[1].getCantidad()*caja[1].getValor()) + (caja[2].getCantidad()*caja[2].getValor()) ;
	}
	
	public int getSaldoDisponible() {
		return saldoDisponible;
	}
	public Billete[] getCaja() {
		return caja;
	}
	public int[] getEntregado() {
		return entregado;
	}
	public void descontarRetiro(int retiro) {
		saldoDisponible -= retiro;
	}
}
