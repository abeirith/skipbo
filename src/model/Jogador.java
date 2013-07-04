package model;

import java.util.ArrayList;



public class Jogador {

	private int id;
	private String nome;
	private Baralho mao;
	// [FIXME] alterar modelagem, gerou como int quando deveria ser boolean, 
	//na verdade verificar todos métodos pois muitos geraram com tipo int.
	//
	private boolean daVez;
	private Estoque estoque;
	private ArrayList<Estoque> pilhaDescarte;
	private boolean vencedor;

	/**
	 * 
	 * @param id
	 * @param nome
	 */
	public Jogador(int id, String nome) {
		this.id = id;
		this.nome =  nome;
	}

	

	/**
	 * 
	 * @param indice
	 */
	public Carta pegaCarta(int indice) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param indiceCarta
	 */
	public Carta retiraCartaMao(int indiceCarta) {
		throw new UnsupportedOperationException();
	}

	public void getIdJogador() {
		throw new UnsupportedOperationException();
	}

	
	

	/**
	 * 
	 * @param carta
	 */
	public void inserirCartaNaMesa(Carta carta) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param carta
	 */
	public void descartarNoLixo(Carta carta) {
		throw new UnsupportedOperationException();
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Baralho getMao() {
		return mao;
	}

	public void setMao(Baralho mao) {
		this.mao = mao;
	}



	public boolean isDaVez() {
		return daVez;
	}



	public void setDaVez(boolean daVez) {
		this.daVez = daVez;
	}



	public Estoque getEstoque() {
		return estoque;
	}



	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}



	public ArrayList<Estoque> getPilhaDescarte() {
		return pilhaDescarte;
	}



	public void setPilhaDescarte(ArrayList<Estoque> pilhaDescarte) {
		this.pilhaDescarte = pilhaDescarte;
	}



	public boolean isVencedor() {
		return vencedor;
	}



	public void setVencedor(boolean vencedor) {
		this.vencedor = vencedor;
	}




	

}