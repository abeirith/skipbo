package rede;

import javax.swing.JOptionPane;

import br.ufsc.inf.leobr.cliente.Jogada;
import br.ufsc.inf.leobr.cliente.OuvidorProxy;
import br.ufsc.inf.leobr.cliente.Proxy;
import br.ufsc.inf.leobr.cliente.exception.ArquivoMultiplayerException;
import br.ufsc.inf.leobr.cliente.exception.JahConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoPossivelConectarException;

public class AtorRede implements OuvidorProxy {

	private Proxy proxy;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AtorRede() {
		super();
		//[FIXME] No tutorial é criado um atorChat, aqui seria um atorJogador?
		proxy = Proxy.getInstance();
		proxy.addOuvinte(this);
	}
	
	public void conectar(String nome, String servidor){
		try {
			proxy.conectar(servidor, nome);
		} catch (JahConectadoException e) {
			//[FIXME] Verificar o parametro null, deveria ser a tela aonde sera mostrada a imagem
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		} catch (NaoPossivelConectarException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		} catch (ArquivoMultiplayerException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void iniciarPartidaRede(){
		try {
			proxy.iniciarPartida(2);
		} catch (NaoConectadoException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
	}
	//[FIXME] É necessario pensar num objeto que implemente a interface Jogada e que englobe as informacoes necessarias que devem ser enviadas ao outro jogador quando é realizada uma 
	//Jogada, para poder passo-lo como parametro deste metodo.
	public void enviarJogada(){
		//proxy.enviaJogada(jogada);
		
	}
	public void desconectar(){
		try {
			proxy.desconectar();
		} catch (NaoConectadoException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
	}
	@Override
	public void iniciarNovaPartida(Integer posicao) {
		// TODO Auto-generated method stub

	}

	@Override
	public void finalizarPartidaComErro(String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void receberMensagem(String msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void receberJogada(Jogada jogada) {
		// TODO Auto-generated method stub

	}

	@Override
	public void tratarConexaoPerdida() {
		// TODO Auto-generated method stub

	}

	@Override
	public void tratarPartidaNaoIniciada(String message) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Proxy getProxy() {
		return proxy;
	}
	public void setProxy(Proxy proxy) {
		this.proxy = proxy;
	}

}
