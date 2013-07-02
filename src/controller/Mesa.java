package controller;

import java.util.ArrayList;

public class Mesa {

	private Jogador jogador1;
	private Jogador jogador2;
	private Monte monte;
	private ArrayList<Estoque> base;
	//[FIXME] corrigir diagrama de int para boolean
	private boolean mesaHabilitada;
	private AtorNetGamesNRT comunicaRede;
	private AtorJogador ajogador;

	/**
	 * 
	 * @param ajogador
	 */
	public Mesa(AtorJogador ajogador) {
		throw new UnsupportedOperationException();
	}

	public void limparMesa() {
		throw new UnsupportedOperationException();
	}

	public void desabilitarMesa() {
		throw new UnsupportedOperationException();
	}

	public void habilitarMesa() {
		throw new UnsupportedOperationException();
	}

//	public InterfaceLocal comprarCartaBolo() {
//		throw new UnsupportedOperationException();
//	}

	/**
	 * 
	 * @param indice
	 */
//	public InterfaceLocal selecionaDescarte(int indice) {
//		throw new UnsupportedOperationException();
//	}

	/**
	 * 
	 * @param indice
	 */
	public void tratarDescarte(int indice) {
		throw new UnsupportedOperationException();
	}

	public void verificaInicioRodada() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param host
	 * @param nome
	 */
//	public InterfaceLocal conectar(String host, String nome) {
//		throw new UnsupportedOperationException();
//	}
//
//	public InterfaceLocal desconectar() {
//		throw new UnsupportedOperationException();
//	}

	/**
	 * 
	 * @param mapaRede
	 */
//	public void receberJogada(InterfaceRede mapaRede) {
//		throw new UnsupportedOperationException();
//	}

	/**
	 * 
	 * @param posicao
	 */
	public void iniciaJogo(int posicao) {
		throw new UnsupportedOperationException();
	}

	public void darAsCartas() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nome
	 * @param id
	 */
	public void criarJogador(String nome, int id) {
		throw new UnsupportedOperationException();
	}

	public void getJogador2() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param jogador2
	 */
	public void setJogador2(int jogador2) {
		throw new UnsupportedOperationException();
	}

	public void getJogador1() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param jogador1
	 */
	public void setJogador1(int jogador1) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param indice
	 */
//	public InterfaceLocal insereCartaNaMesa(int indice) {
//		throw new UnsupportedOperationException();
//	}

	public void tratarInsercaoNaMesa() {
		throw new UnsupportedOperationException();
	}

	public void temVencedor() {
		throw new UnsupportedOperationException();
	}

	public void getStatusPartida() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idJog
	 */
	public void setJogadorDaVez(int idJog) {
		throw new UnsupportedOperationException();
	}

	public void getJogadorDaVez() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param msg
	 */
	public void setMensagem(int msg) {
		throw new UnsupportedOperationException();
	}

	public void setJogador1(Jogador jogador1) {
		this.jogador1 = jogador1;
	}

	public void setJogador2(Jogador jogador2) {
		this.jogador2 = jogador2;
	}

	public Monte getMonte() {
		return monte;
	}

	public void setMonte(Monte monte) {
		this.monte = monte;
	}

	public ArrayList<Estoque> getBase() {
		return base;
	}

	public void setBase(ArrayList<Estoque> base) {
		this.base = base;
	}

	public boolean isMesaHabilitada() {
		return mesaHabilitada;
	}

	public void setMesaHabilitada(boolean mesaHabilitada) {
		this.mesaHabilitada = mesaHabilitada;
	}

	public AtorJogador getAjogador() {
		return ajogador;
	}

	public void setAjogador(AtorJogador ajogador) {
		this.ajogador = ajogador;
	}

}