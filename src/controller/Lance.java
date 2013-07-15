package controller;


import model.Carta;
import br.ufsc.inf.leobr.cliente.Jogada;

public class Lance implements Jogada {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Carta cartaSelecionada;
	private int baseDestino;

	public Lance() {
	}

	public void setCartaSelecionada(Carta cartaSelecionada) {
		this.cartaSelecionada = cartaSelecionada;
	}

	public int getBaseDestino() {
		return baseDestino;
	}

	public Carta getCartaSelecionada() {
		return cartaSelecionada;
	}

	public void setBaseDestino(int baseDestino) {
		this.baseDestino = baseDestino;
	}
}
