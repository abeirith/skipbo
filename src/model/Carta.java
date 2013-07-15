package model;

import br.ufsc.inf.leobr.cliente.Jogada;


public class Carta implements Jogada{
	
	private static final long serialVersionUID = 1L;
	private int numero;
	private boolean coringa;

	public Carta() {
	}
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

	public void setCoringa(boolean coringa) {
		this.coringa = coringa;
	}

}