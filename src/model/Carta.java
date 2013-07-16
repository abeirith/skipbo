package model;

import br.ufsc.inf.leobr.cliente.Jogada;


public class Carta implements Jogada{
	
	private static final long serialVersionUID = 1L;
	private int numero;
	private boolean coringa;
	private boolean ehMao1;
	private boolean ehMao2;
	private boolean ehMao3;
	private boolean ehMao4;
	private boolean ehMao5;
	
	private boolean ehDaReserva;
	private boolean ehDoDescarte1;
	private boolean ehDoDescarte2;
	private boolean ehDoDescarte3;
	private boolean ehDoDescarte4;	

	public Carta() {
	}
	public Carta(int numero) {
		this.setNumero(numero);
	}
	public boolean isEhMao1() {
		return ehMao1;
	}
	public void setEhMao1(boolean ehMao1) {
		this.ehMao1 = ehMao1;
	}
	public boolean isEhMao2() {
		return ehMao2;
	}
	public void setEhMao2(boolean ehMao2) {
		this.ehMao2 = ehMao2;
	}
	public boolean isEhMao3() {
		return ehMao3;
	}
	public void setEhMao3(boolean ehMao3) {
		this.ehMao3 = ehMao3;
	}
	public boolean isEhMao4() {
		return ehMao4;
	}
	public void setEhMao4(boolean ehMao4) {
		this.ehMao4 = ehMao4;
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
	public boolean isEhDaReserva() {
		return ehDaReserva;
	}
	public void setEhDaReserva(boolean ehDaReserva) {
		this.ehDaReserva = ehDaReserva;
	}
	public boolean isEhDoDescarte1() {
		return ehDoDescarte1;
	}
	public void setEhDoDescarte1(boolean ehDoDescarte1) {
		this.ehDoDescarte1 = ehDoDescarte1;
	}
	public boolean isEhDoDescarte2() {
		return ehDoDescarte2;
	}
	public void setEhDoDescarte2(boolean ehDoDescarte2) {
		this.ehDoDescarte2 = ehDoDescarte2;
	}
	public boolean isEhDoDescarte3() {
		return ehDoDescarte3;
	}
	public void setEhDoDescarte3(boolean ehDoDescarte3) {
		this.ehDoDescarte3 = ehDoDescarte3;
	}
	public boolean isEhDoDescarte4() {
		return ehDoDescarte4;
	}
	public void setEhDoDescarte4(boolean ehDoDescarte4) {
		this.ehDoDescarte4 = ehDoDescarte4;
	}
	public boolean isEhMao5() {
		return ehMao5;
	}
	public void setEhMao5(boolean ehMao5) {
		this.ehMao5 = ehMao5;
	}
}