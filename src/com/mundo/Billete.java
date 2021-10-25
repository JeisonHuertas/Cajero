package com.mundo;

public class Billete {
	 private int valor;
	 private int cantidad;
	 
	 public Billete (int valor, int cantidad) {
		 this.valor = valor;
		 this.cantidad = cantidad;
	 }

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public int getValor() {
		return valor;
	}
	 
}
