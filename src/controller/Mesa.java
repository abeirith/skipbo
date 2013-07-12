package controller;

import java.util.ArrayList;
import java.util.List;

import model.Carta;
import model.Estoque;
import model.Jogador;
import model.Monte;

public class Mesa {

	private Jogador jogador1;
	private Jogador jogador2;
	private Monte monte;
	private ArrayList<Estoque> base;
	//[FIXME] corrigir diagrama de int para boolean
	private boolean mesaHabilitada;
	private AtorNetGamesNRT comunicaRede;
	private AtorJogador ajogador;
	protected boolean partidaEmAndamento;

	/**
	 * 
	 * @param ajogador
	 */
	public Mesa(AtorJogador ajogador) {
	}

	public void limparMesa() {
	}

	public void desabilitarMesa() {
	}

	public void habilitarMesa() {
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
	}

	public void darAsCartas() {
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
	}

	/**
	 * 
	 * @param jogador2
	 */
	public void setJogador2(int jogador2) {
	}

	public void getJogador1() {
	}

	/**
	 * 
	 * @param jogador1
	 */
	public void setJogador1(int jogador1) {
	}

	/**
	 * 
	 * @param indice
	 */
//	public InterfaceLocal insereCartaNaMesa(int indice) {
//		throw new UnsupportedOperationException();
//	}

	public void tratarInsercaoNaMesa(Carta carta) {
		
		
//		if(baseSelecionada == 1){
//			List<Carta> cartasBase1 = base.get(0).getCartasBase();
//			if (cartasBase1.get(cartasBase1.size()-1).getNumero()+1 == carta.getNumero()) {
//				
//			}else{
//				throw new Exception("Numero carta inválido exception");
//			}
//			
//			
//		}else if (baseSelecionada == 2) {
//			List<Carta> cartasBase2 = base.get(1).getCartasBase();
//		}else if(baseSelecionada == 3){
//			List<Carta> cartasBase3 = base.get(2).getCartasBase();
//		}else{
//			List<Carta> cartasBase4=  base.get(3).getCartasBase();
//		}
	}

	public void temVencedor() {
	}

	public void getStatusPartida() {
	}

	/**
	 * 
	 * @param idJog
	 */
	public void setJogadorDaVez(int idJog) {
	}

	public void getJogadorDaVez() {
	}
	

	/**
	 * 
	 * @param msg
	 */
	public void setMensagem(int msg) {
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

	public boolean informarPartidaEmAndamento() {
		return partidaEmAndamento;
	}

}