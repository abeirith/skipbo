package controller;

import br.ufsc.inf.leobr.cliente.Jogada;

public interface OuvidorProxy {

	void iniciarNovaPartida();

	/**
	 * 
	 * @param messagem
	 */
	void finalizarPartidaInesperada(String messagem);

	/**
	 * 
	 * @param mensagem
	 */
	void receberMensagem(String mensagem);

	/**
	 * 
	 * @param jogada
	 */
	void receberJogada(Jogada jogada);

	void tratarConexaoPerdda();

}