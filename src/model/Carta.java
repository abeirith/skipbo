package model;

import controller.Jogada;

public class Carta implements Jogada {

	private int numero;
	private boolean coringa;

	/**
	 * 
	 * @param numero
	 */
	public Carta(int numero) {
		this.setNumero(numero);
	}

	public boolean isCoringa() {
		return this.coringa;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}