package model;

import java.util.ArrayList;
import java.util.List;


public class Estoque extends Baralho {
	
	private List<Carta> cartasBase = new ArrayList<>();

	/**
	 * 
	 * @param gerar
	 */
	public Estoque(int gerar) {
		throw new UnsupportedOperationException();
	}

	public Carta removerCarta() {
		throw new UnsupportedOperationException();
	}

	public int getTamanhoEstoque() {
		throw new UnsupportedOperationException();
	}

	public Estoque getEstoque() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param cartas
	 */
	public void setEstoque(ArrayList<Carta> cartas) {
		throw new UnsupportedOperationException();
	}

	public Carta entregaCarta() {
		throw new UnsupportedOperationException();
	}

	public List<Carta> getCartasBase() {
		return cartasBase;
	}

	public void setCartasBase(List<Carta> cartasBase) {
		this.cartasBase = cartasBase;
	}

}