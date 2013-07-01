package controller;

import java.util.ArrayList;

public class Jogador {

	private int id;
	private int nome;
	private Baralho mao;
	private int daVez;
	private Estoque estoque;
	private ArrayList<Estoque> pilhaDescarte;
	private boolean vencedor;

	/**
	 * 
	 * @param id
	 * @param nome
	 */
	public Jogador(int id, String nome) {
		throw new UnsupportedOperationException();
	}

	public void isDaVez() {
		throw new UnsupportedOperationException();
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
	 * @param mao
	 */
	public void setMao(Baralho mao) {
		this.mao = mao;
	}

	public ArrayList getMao() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param daVez
	 */
	public void setDaVez(int daVez) {
		this.daVez = daVez;
	}

	public void getEstoque() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param estoque
	 */
	public void setEstoque(int estoque) {
		throw new UnsupportedOperationException();
	}

	public void isVencedor() {
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

	public void getPilhaDescarte() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pilhaDescarte
	 */
	public void setPilhaDescarte(int pilhaDescarte) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param vencedor
	 */
	public void setVencedor(int vencedor) {
		throw new UnsupportedOperationException();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setVencedor(boolean vencedor) {
		this.vencedor = vencedor;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public void setPilhaDescarte(ArrayList<Estoque> pilhaDescarte) {
		this.pilhaDescarte = pilhaDescarte;
	}

}