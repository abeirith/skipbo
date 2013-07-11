package rede;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import controller.AtorJogador;

import br.ufsc.inf.leobr.cliente.Jogada;
import br.ufsc.inf.leobr.cliente.OuvidorProxy;
import br.ufsc.inf.leobr.cliente.Proxy;
import br.ufsc.inf.leobr.cliente.exception.ArquivoMultiplayerException;
import br.ufsc.inf.leobr.cliente.exception.JahConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoPossivelConectarException;
//ESSA CLASSE REPRESENTA O ATORNETGAMES
public class AtorRede implements OuvidorProxy {

	
	
	
	private Proxy proxy;
	private AtorJogador atorJogador;
	private boolean ehMinhaVez = false;

	private JMenu menuRede = null;

	private JMenuItem jMenuItemConectar = null;
	private JMenuItem jMenuItemIniciarPartidaRede = null;
	private JMenuItem jMenuItemDesconectar = null;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AtorRede(AtorJogador atorJogador) {
		super();
		proxy = Proxy.getInstance();
		proxy.addOuvinte(this);
		this.atorJogador = atorJogador;
	}

	protected void conectar(String nome, String servidor) {
		try {
			proxy.conectar(servidor, nome);
		} catch (JahConectadoException e) {
			// [FIXME] Verificar o parametro null, deveria ser a tela aonde sera
			// mostrada a imagem
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

	public void iniciarPartidaRede() {
		try {
			proxy.iniciarPartida(2);
		} catch (NaoConectadoException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
	}

	// [FIXME] É necessario pensar num objeto que implemente a interface Jogada
	// e que englobe as informacoes necessarias que devem ser enviadas ao outro
	// jogador quando é realizada uma
	// Jogada, para poder passo-lo como parametro deste metodo.
	public void enviarJogada() {
		// proxy.enviaJogada(jogada);

	}

	public void desconectar() {
		try {
			atorJogador.terminarPartidaEmAndamento();
			proxy.desconectar();
		} catch (NaoConectadoException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
	}

	public boolean ehMinhaVez() {
		return ehMinhaVez;
	}

	@Override
	public void iniciarNovaPartida(Integer posicao) {
		if (posicao == 1) {
			// JOptionPane.showMessageDialog(atorJogador,
			// "Partida Iniciada, você começa jogando!");
			ehMinhaVez = true;
			atorJogador.iniciarPartidaRede(ehMinhaVez);
		} else {
			// JOptionPane.showMessageDialog(atorJogador,
			// "Partida Iniciada, aguarde uma jogada");
			ehMinhaVez = false;
			atorJogador.iniciarPartidaRede(ehMinhaVez);
		}
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
		// JOptionPane.showMessageDialog(atorJogador,
		// "A partida não pode ser iniciada devido ao seguinte erro: "
		// + message);

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
	
	private JMenuItem getJMenuItemConectar() {
		if (jMenuItemConectar == null) {
			jMenuItemConectar = new JMenuItem();
			jMenuItemConectar.setText("Conectar");
			jMenuItemConectar
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							conectar();
						}

					});
		}
		return jMenuItemConectar;
	}
	
	protected void conectar() {
		GuiRede ic = new GuiRede(this);
		ic.createFront();
	}

}
