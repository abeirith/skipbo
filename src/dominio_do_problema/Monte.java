package dominio_do_problema;

import java.util.ArrayList;
import java.util.List;


import br.ufsc.inf.leobr.cliente.Jogada;


public class Monte implements Jogada {
	
	
	private static final long serialVersionUID = 1L;
	private List<Carta> cartasBase1;
	private List<Carta> cartasBase2;
	private List<Carta> cartasBase3;
	private List<Carta> cartasBase4;

	public Monte() {
		setCartasBase1(new ArrayList<Carta>());
		setCartasBase2(new ArrayList<Carta>());
		setCartasBase3(new ArrayList<Carta>());
		setCartasBase4(new ArrayList<Carta>());
	}

	public List<Carta> getCartasBase1() {
		return cartasBase1;
	}

	public void setCartasBase1(List<Carta> cartasBase1) {
		this.cartasBase1 = cartasBase1;
	}

	public List<Carta> getCartasBase2() {
		return cartasBase2;
	}

	public void setCartasBase2(List<Carta> cartasBase2) {
		this.cartasBase2 = cartasBase2;
	}

	public List<Carta> getCartasBase3() {
		return cartasBase3;
	}

	public void setCartasBase3(List<Carta> cartasBase3) {
		this.cartasBase3 = cartasBase3;
	}

	public List<Carta> getCartasBase4() {
		return cartasBase4;
	}

	public void setCartasBase4(List<Carta> cartasBase4) {
		this.cartasBase4 = cartasBase4;
	}
}