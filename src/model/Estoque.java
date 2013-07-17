package model;

import java.util.ArrayList;
import java.util.List;

import br.ufsc.inf.leobr.cliente.Jogada;

public class Estoque implements Jogada{
	
	private static final long serialVersionUID = 1L;
	private List<Carta> pilhaDescarte1;
	private List<Carta> pilhaDescarte2;
	private List<Carta> pilhaDescarte3;
	private List<Carta> pilhaDescarte4;

	public Estoque() {
		
		setPilhaDescarte1(new ArrayList<Carta>());
		setPilhaDescarte2(new ArrayList<Carta>());
		setPilhaDescarte3(new ArrayList<Carta>());
		setPilhaDescarte4(new ArrayList<Carta>());
	}

	public List<Carta> getPilhaDescarte1() {
		return pilhaDescarte1;
	}

	public void setPilhaDescarte1(List<Carta> pilhaDescarte1) {
		this.pilhaDescarte1 = pilhaDescarte1;
	}

	public List<Carta> getPilhaDescarte2() {
		return pilhaDescarte2;
	}

	public void setPilhaDescarte2(List<Carta> pilhaDescarte2) {
		this.pilhaDescarte2 = pilhaDescarte2;
	}

	public List<Carta> getPilhaDescarte3() {
		return pilhaDescarte3;
	}

	public void setPilhaDescarte3(List<Carta> pilhaDescarte3) {
		this.pilhaDescarte3 = pilhaDescarte3;
	}

	public List<Carta> getPilhaDescarte4() {
		return pilhaDescarte4;
	}

	public void setPilhaDescarte4(List<Carta> pilhaDescarte4) {
		this.pilhaDescarte4 = pilhaDescarte4;
	}
}