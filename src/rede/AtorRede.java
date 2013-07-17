package rede;

import interface_grafica.AtorJogador;

import java.awt.Rectangle;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


import dominio_do_problema.Mesa;

import br.ufsc.inf.leobr.cliente.Jogada;
import br.ufsc.inf.leobr.cliente.OuvidorProxy;
import br.ufsc.inf.leobr.cliente.Proxy;
import br.ufsc.inf.leobr.cliente.exception.ArquivoMultiplayerException;
import br.ufsc.inf.leobr.cliente.exception.JahConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoJogandoException;
import br.ufsc.inf.leobr.cliente.exception.NaoPossivelConectarException;

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

	public void enviarJogada(Mesa mesa, int destino) {
		try {
			proxy.enviaJogada(mesa);
			if (mesa.getJogadorDaVez().isVencedor()) {
				JOptionPane.showMessageDialog(null, "Você venceu!!");
			}
			ehMinhaVez =false;
		} catch (NaoJogandoException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(atorJogador, e.getMessage());
		}

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
			JOptionPane.showMessageDialog(atorJogador,
					"Partida Iniciada, você começa jogando!");
			ehMinhaVez = true;
		} else {
			JOptionPane.showMessageDialog(atorJogador,
					"Partida Iniciada, aguarde uma jogada");
			ehMinhaVez = false;
		}
		atorJogador.iniciarPartidaRede(ehMinhaVez);
	}

	@Override
	public void finalizarPartidaComErro(String message) {
		JOptionPane.showMessageDialog(atorJogador, message);

	}

	@Override
	public void receberMensagem(String msg) {
		JOptionPane.showMessageDialog(atorJogador,
				"Mensagem recebida do servidor:" + msg);

	}

	@Override
	public void receberJogada(Jogada jogada) {
		Mesa mesa = (Mesa) jogada;
		if(mesa.getJogadorDaVez().isVencedor()){
			JOptionPane.showMessageDialog(null, "Jogador: "+ mesa.getJogadorDaVez().getNome() + " venceu !!");
		}
		if(mesa.getJogadorDaVez() == mesa.getJogadorLocal()){
			mesa.setJogadorDaVez(mesa.getJogadorRemoto());
		}else{
			mesa.setJogadorDaVez(mesa.getJogadorLocal());
		}
		
		atorJogador.efetuarJogadaRede(mesa);
		ehMinhaVez =true;
	}

	@Override
	public void tratarConexaoPerdida() {
		JOptionPane.showMessageDialog(atorJogador,
				"A partida não pode ser iniciada devido ao seguinte erro: A conexão com o servidor foi perdida, por favor tente novamente mais tarde.");

	}

	@Override
	public void tratarPartidaNaoIniciada(String message) {
		JOptionPane.showMessageDialog(atorJogador,
				"A partida não pode ser iniciada devido ao seguinte erro: "
						+ message);

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

	public JMenu getMenuRede() {
		if (menuRede == null) {
			menuRede = new JMenu();
			menuRede.setText("Jogar Online");
			menuRede.setBounds(new Rectangle(1, 0, 57, 21));
			menuRede.add(getJMenuItemConectar());
			menuRede.add(getJMenuItemIniciarPartidaRede());
			menuRede.add(getJMenuItemDesconectar());
		}
		return menuRede;
	}

	private JMenuItem getJMenuItemDesconectar() {
		if (jMenuItemDesconectar == null) {
			jMenuItemDesconectar = new JMenuItem();
			jMenuItemDesconectar.setText("Desconectar");
			jMenuItemDesconectar
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							desconectar();
						}
					});
		}
		return jMenuItemDesconectar;
	}

	private JMenuItem getJMenuItemIniciarPartidaRede() {
		if (jMenuItemIniciarPartidaRede == null) {
			jMenuItemIniciarPartidaRede = new JMenuItem();
			jMenuItemIniciarPartidaRede.setText("Iniciar partida");
			jMenuItemIniciarPartidaRede
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							if (!atorJogador.informarPartidaEmAndamento())
								iniciarPartidaRede();

						}

					});
		}
		return jMenuItemIniciarPartidaRede;
	}

	public String obtemNomeAdversario() {
		return proxy.obterNomeAdversarios().get(0);
	}

}
