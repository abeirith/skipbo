package controller;

import java.util.ArrayList;

import br.ufsc.inf.leobr.cliente.Jogada;

import model.Jogador;

public class AtorNetGamesNRT implements OuvidorProxy {

	private Proxy proxy;
	private Mesa mesa;
	private int conectado;
	private AtorJogador atorJogador;

	/**
	 * 
	 * @param mesa
	 */
	public AtorNetGamesNRT(Mesa mesa) {
		throw new UnsupportedOperationException();
	}

	public void comunicaEstado() {
		throw new UnsupportedOperationException();
	}

	public void desconectar() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param host
	 * @param nome
	 */
	public void conectar(String host, String nome) {
		throw new UnsupportedOperationException();
	}

	public void isConectado() {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Jogador> getJogadores() {
		throw new UnsupportedOperationException();
	}

	public void iniciarNovaPartida() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param jogada
	 */
	public void efetuaJogada(Lance jogada) {
		throw new UnsupportedOperationException();
	}

	public void tratarConexaoPerdida() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void finalizarPartidaInesperada(String messagem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receberMensagem(String mensagem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receberJogada(Jogada jogada) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tratarConexaoPerdda() {
		// TODO Auto-generated method stub
		
	}

}