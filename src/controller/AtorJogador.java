package controller;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import br.ufsc.inf.leobr.cliente.Proxy;

import model.Carta;

import rede.AtorRede;

import view.PainelInformacoes;
import view.TelaPrincipal;
import java.util.ArrayList;
import java.util.List;

public class AtorJogador extends JFrame {

	protected Mesa mesa;
	JLabel pilhaDescarte1;
	JLabel pilhaDescarte2;
	private JPanel jContentPane_1;
	private AtorRede atorRede;
	private PainelInformacoes painelInformacoes;
	private JMenuBar jMenuBar = null;
	Carta cartaSelecionada;

	List<Carta> cartasMao;
	List<Integer> cartasSorteadasMao;
	private JLabel pilhaDescarte3;
	private JLabel pilhaReserva1Icon;
	private JLabel pilhaDescarte4;
	private JLabel base4;
	private JLabel base3;
	private JLabel base2;
	private JLabel base1;
	private JLabel carta5;
	private JLabel carta4;
	private JLabel carta3;
	private JLabel carta2;
	private JLabel carta1;

	private void initialize() {
		mesa = new Mesa();
		atorRede = new AtorRede(this);
		this.setSize(1350, 830);
		this.setContentPane(getJContentPane());
		this.setTitle("SkipBo");
		this.setResizable(true);
	}

	private JPanel getJContentPane() {
		jContentPane_1 = new TelaPrincipal();
		carta1 = new JLabel("Carta1");
		carta1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cartaSelecionada = mesa.getJogadorAtual().getMao().get(0);
				carta1.setBorder(BorderFactory.createBevelBorder(1));
				carta2.setBorder(null);
				carta3.setBorder(null);
				carta4.setBorder(null);
				carta5.setBorder(null);
			}
		});

		carta2 = new JLabel("carta2");
		carta2.setBounds(516, 641, 67, 112);
		carta2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cartaSelecionada = mesa.getJogadorAtual().getMao().get(1);
				carta1.setBorder(null);
				carta2.setBorder(BorderFactory.createBevelBorder(1));
				carta3.setBorder(null);
				carta4.setBorder(null);
				carta5.setBorder(null);
			}
		});

		carta3 = new JLabel("carta3");
		carta3.setBounds(595, 642, 67, 111);
		carta3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cartaSelecionada = mesa.getJogadorAtual().getMao().get(2);
				carta1.setBorder(null);
				carta2.setBorder(null);
				carta3.setBorder(BorderFactory.createBevelBorder(1));
				carta4.setBorder(null);
				carta5.setBorder(null);
			}
		});

		carta4 = new JLabel("carta4");
		carta4.setBounds(674, 641, 67, 112);
		carta4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cartaSelecionada = mesa.getJogadorAtual().getMao().get(3);
				carta1.setBorder(null);
				carta2.setBorder(null);
				carta3.setBorder(null);
				carta4.setBorder(BorderFactory.createBevelBorder(1));
				carta5.setBorder(null);
			}
		});

		carta5 = new JLabel("carta5");
		carta5.setBounds(762, 641, 67, 112);
		carta5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cartaSelecionada = mesa.getJogadorAtual().getMao().get(4);
				carta1.setBorder(null);
				carta2.setBorder(null);
				carta3.setBorder(null);
				carta4.setBorder(null);
				carta5.setBorder(BorderFactory.createBevelBorder(1));
			}
		});

		base1 = new JLabel();
		base1.setBounds(433, 305, 111, 142);
		base1.setBackground(Color.BLACK);
		base1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				boolean ok = mesa.tratarInsercaoNaMesa(cartaSelecionada, 1,
						false);
				if (ok) {
					base1.setIcon(new ImageIcon(getClass().getResource(
							"/view/view.imagens/carta"
									+ cartaSelecionada.getNumero() + ".png")));
					atorRede.enviarJogada(cartaSelecionada, 1);
					mesa.getJogadorAtual().removeCartaSelecionada(
							cartaSelecionada);
					//atualizaCartasMao(mesa.getJogadorAtual().getMao());
				}

			}

		});

		base2 = new JLabel();
		base2.setBounds(547, 305, 110, 142);
		base2.setBackground(Color.BLACK);
		base2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				boolean ok = mesa.tratarInsercaoNaMesa(cartaSelecionada, 2,
						false);
				if (ok) {
					base2.setIcon(new ImageIcon(getClass().getResource(
							"/view/view.imagens/carta"
									+ cartaSelecionada.getNumero() + ".png")));
					atorRede.enviarJogada(cartaSelecionada, 2);
					mesa.getJogadorAtual().removeCartaSelecionada(
							cartaSelecionada);
				}

			}
		});

		base3 = new JLabel();
		base3.setBounds(661, 305, 103, 142);
		base3.setBackground(Color.BLACK);
		base3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				boolean ok = mesa.tratarInsercaoNaMesa(cartaSelecionada, 3,
						false);
				if (ok) {
					base3.setIcon(new ImageIcon(getClass().getResource(
							"/view/view.imagens/carta"
									+ cartaSelecionada.getNumero() + ".png")));
					atorRede.enviarJogada(cartaSelecionada, 3);
					mesa.getJogadorAtual().removeCartaSelecionada(
							cartaSelecionada);
				}
			}
		});

		base4 = new JLabel();
		base4.setBounds(775, 305, 103, 142);
		base4.setBackground(Color.BLACK);
		base4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				boolean ok = mesa.tratarInsercaoNaMesa(cartaSelecionada, 4,
						false);
				if (ok) {
					base4.setIcon(new ImageIcon(getClass().getResource(
							"/view/view.imagens/carta"
									+ cartaSelecionada.getNumero() + ".png")));
					atorRede.enviarJogada(cartaSelecionada, 4);
					mesa.getJogadorAtual().removeCartaSelecionada(
							cartaSelecionada);
				}
			}
		});

		pilhaDescarte1 = new JLabel();
		pilhaDescarte1.setBounds(441, 503, 94, 131);
		pilhaDescarte1.setBackground(Color.BLACK);
		pilhaDescarte1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				pilhaDescarte1.setIcon(new ImageIcon(getClass().getResource(
						"/view/view.imagens/carta"
								+ cartaSelecionada.getNumero() + ".png")));
				mesa.insereNoDescarte(cartaSelecionada, 1, false);

			}
		});

		pilhaDescarte2 = new JLabel();
		pilhaDescarte2.setBounds(556, 503, 94, 131);
		pilhaDescarte2.setBackground(Color.BLACK);
		pilhaDescarte2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				pilhaDescarte2.setIcon(new ImageIcon(getClass().getResource(
						"/view/view.imagens/carta"
								+ cartaSelecionada.getNumero() + ".png")));
				mesa.insereNoDescarte(cartaSelecionada, 2, false);
			}
		});

		pilhaDescarte3 = new JLabel();
		pilhaDescarte3.setBounds(674, 503, 90, 131);
		pilhaDescarte3.setBackground(Color.BLACK);
		pilhaDescarte3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				pilhaDescarte3.setIcon(new ImageIcon(getClass().getResource(
						"/view/view.imagens/carta"
								+ cartaSelecionada.getNumero() + ".png")));
				mesa.insereNoDescarte(cartaSelecionada, 3, false);
			}
		});

		pilhaDescarte4 = new JLabel();
		pilhaDescarte4.setBounds(792, 511, 94, 131);
		pilhaDescarte4.setBackground(Color.BLACK);
		pilhaDescarte4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				pilhaDescarte4.setIcon(new ImageIcon(getClass().getResource(
						"/view/view.imagens/carta"
								+ cartaSelecionada.getNumero() + ".png")));
				mesa.insereNoDescarte(cartaSelecionada, 4, false);
			}
		});

		List<Rectangle> rectangles = new ArrayList<>();
		rectangles.add(pilhaDescarte1.getBounds());
		rectangles.add(pilhaDescarte2.getBounds());
		rectangles.add(pilhaDescarte3.getBounds());
		rectangles.add(pilhaDescarte4.getBounds());
		rectangles.add(base1.getBounds());
		rectangles.add(base2.getBounds());
		rectangles.add(base3.getBounds());
		rectangles.add(base4.getBounds());
		// DragController mouseController = new DragController(rectangles);

		pilhaReserva1Icon = new JLabel("pilhaReserva");
		// pilhaReserva1Icon.addMouseListener(mouseController);
		// pilhaReserva1Icon.addMouseMotionListener(mouseController);

		pilhaReserva1Icon.setBounds(306, 571, 77, 118);
		pilhaReserva1Icon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cartaSelecionada = mesa
						.getJogadorAtual()
						.getPilhaReserva()
						.get(mesa.getJogadorAtual().getPilhaReserva().size() - 1);
				carta1.setBorder(null);
				carta2.setBorder(null);
				carta3.setBorder(null);
				carta4.setBorder(null);
				carta5.setBorder(null);
				pilhaReserva1Icon.setBorder(BorderFactory.createBevelBorder(1));
			}
		});

		carta1.setBounds(433, 641, 77, 112);

		// carta1.addMouseListener(mouseController);
		// carta1.addMouseMotionListener(mouseController);
		// carta2.addMouseListener(mouseController);
		// carta2.addMouseMotionListener(mouseController);
		// carta3.addMouseListener(mouseController);
		// carta3.addMouseMotionListener(mouseController);
		// carta4.addMouseListener(mouseController);
		// carta4.addMouseMotionListener(mouseController);
		// carta5.addMouseListener(mouseController);
		// carta5.addMouseMotionListener(mouseController);
		JMenu menuSobre = new JMenu("Sobre");

		menuSobre.addMouseListener(new java.awt.event.MouseAdapter() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				painelInformacoes = new PainelInformacoes();
				painelInformacoes.setModal(true);
				painelInformacoes.pack();
				painelInformacoes.setVisible(true);
			}
		});

		jMenuBar = new JMenuBar();
		jMenuBar.add(atorRede.getMenuRede());
		jMenuBar.add(menuSobre);
		this.setJMenuBar(jMenuBar);

		jContentPane_1.add(carta2);
		jContentPane_1.add(carta3);
		jContentPane_1.add(carta4);
		jContentPane_1.add(carta5);
		jContentPane_1.add(pilhaDescarte1);
		jContentPane_1.add(pilhaDescarte2);
		jContentPane_1.add(pilhaDescarte3);
		jContentPane_1.add(pilhaDescarte4);
		jContentPane_1.add(base1);
		jContentPane_1.add(base2);
		jContentPane_1.add(base3);
		jContentPane_1.add(base4);
		jContentPane_1.add(pilhaReserva1Icon);
		jContentPane_1.add(carta1);
		jContentPane_1.setLayout(null);
		return jContentPane_1;
	}

	protected void atualizaCartasMao(List<Carta> mao) {
		if (!mao.isEmpty()) {
			int tamanhoMao = mao.size();
			switch (tamanhoMao) {
			case 1:
				if (mao.get(0) != null) {
					carta1.setIcon(new ImageIcon(getClass().getResource(
							"/view/view.imagens/carta" + mao.get(0).getNumero()
									+ ".png")));
				}
				carta2.setIcon(null);
				carta3.setIcon(null);
				carta4.setIcon(null);
				carta5.setIcon(null);
				break;
			case 2:
				if (mao.get(0) != null) {
					carta1.setIcon(new ImageIcon(getClass().getResource(
							"/view/view.imagens/carta" + mao.get(0).getNumero()
									+ ".png")));
				}
				if (mao.get(1) != null) {
					carta2.setIcon(new ImageIcon(getClass().getResource(
							"/view/view.imagens/carta" + mao.get(1).getNumero()
									+ ".png")));
				}
				carta3.setIcon(null);
				carta4.setIcon(null);
				carta5.setIcon(null);
				break;
			case 3:
				if (mao.get(0) != null) {
					carta1.setIcon(new ImageIcon(getClass().getResource(
							"/view/view.imagens/carta" + mao.get(0).getNumero()
									+ ".png")));
				}
				if (mao.get(1) != null) {
					carta2.setIcon(new ImageIcon(getClass().getResource(
							"/view/view.imagens/carta" + mao.get(1).getNumero()
									+ ".png")));
				}
				if (mao.get(2) != null) {
					carta3.setIcon(new ImageIcon(getClass().getResource(
							"/view/view.imagens/carta" + mao.get(2).getNumero()
									+ ".png")));
				}
				carta4.setIcon(null);
				carta5.setIcon(null);
				break;
			case 4:
				if (mao.get(0) != null) {
					carta1.setIcon(new ImageIcon(getClass().getResource(
							"/view/view.imagens/carta" + mao.get(0).getNumero()
									+ ".png")));
				}
				if (mao.get(1) != null) {
					carta2.setIcon(new ImageIcon(getClass().getResource(
							"/view/view.imagens/carta" + mao.get(1).getNumero()
									+ ".png")));
				}
				if (mao.get(2) != null) {
					carta3.setIcon(new ImageIcon(getClass().getResource(
							"/view/view.imagens/carta" + mao.get(2).getNumero()
									+ ".png")));
				}
				if (mao.get(3) != null) {
					carta4.setIcon(new ImageIcon(getClass().getResource(
							"/view/view.imagens/carta" + mao.get(3).getNumero()
									+ ".png")));
				}
				carta5.setIcon(null);
				break;
			case 5:
				if (mao.get(0) != null) {
					carta1.setIcon(new ImageIcon(getClass().getResource(
							"/view/view.imagens/carta" + mao.get(0).getNumero()
									+ ".png")));
				}
				if (mao.get(1) != null) {
					carta2.setIcon(new ImageIcon(getClass().getResource(
							"/view/view.imagens/carta" + mao.get(1).getNumero()
									+ ".png")));
				}
				if (mao.get(2) != null) {
					carta3.setIcon(new ImageIcon(getClass().getResource(
							"/view/view.imagens/carta" + mao.get(2).getNumero()
									+ ".png")));
				}
				if (mao.get(3) != null) {
					carta4.setIcon(new ImageIcon(getClass().getResource(
							"/view/view.imagens/carta" + mao.get(3).getNumero()
									+ ".png")));
				}
				if (mao.get(4) != null) {
					carta5.setIcon(new ImageIcon(getClass().getResource(
							"/view/view.imagens/carta" + mao.get(4).getNumero()
									+ ".png")));
				}
				break;
			default:
				break;
			}

		}
	}

	public AtorJogador() {
		initialize();
	}

	public AtorJogador(InterfaceSkipbo igrafica) {

	}

	/**
	 * 
	 * @param indice
	 */
	public void selecionarDescarte(int indice) {

	}

	public void desconectar() {
	}

	/**
	 * 
	 * @param host
	 * @param nome
	 */
	public void conectar(String host, String nome) {

	}

	/**
	 * 
	 * @param nome
	 */
	public void setNomeJogador(String nome) {

	}

	public String getNomeJogador() {
		return null;
	}

	public void efetuarJogadaRede(int linhaOrigem, int colunaOrigem,
			int linhaDestino, int colunaDestino) {

	}

	/**
	 * 
	 * @param carta
	 */
	public void inserirCartaNaMesa(int carta) {

	}

	public void iniciarPartidaRede(boolean iniciarComoSolicitante) {
		if (mesa == null) {
			mesa = new Mesa();
		}

		String idJ1;
		idJ1 = Proxy.getInstance().getNomeJogador();

		if (iniciarComoSolicitante)
			mesa.criarJogador(idJ1);
		else
			mesa.criarJogador(idJ1);
		String idJ2;
		idJ2 = atorRede.obtemNomeAdversario();

		if (iniciarComoSolicitante)
			mesa.criarJogador(idJ2);
		else
			mesa.criarJogador(idJ2);

		if (iniciarComoSolicitante) {
			mesa.definirOPrimeiro(1);

		} else {
			mesa.definirOPrimeiro(2);
		}
		mesa.iniciar();
		this.exibirEstado();

	}

	private void exibirEstado() {
		carta1.setIcon(new ImageIcon(getClass().getResource(
				"/view/view.imagens/carta"
						+ mesa.getJogadorAtual().getMao().get(0).getNumero()
						+ ".png")));
		carta2.setIcon(new ImageIcon(getClass().getResource(
				"/view/view.imagens/carta"
						+ mesa.getJogadorAtual().getMao().get(1).getNumero()
						+ ".png")));
		carta3.setIcon(new ImageIcon(getClass().getResource(
				"/view/view.imagens/carta"
						+ mesa.getJogadorAtual().getMao().get(2).getNumero()
						+ ".png")));
		carta4.setIcon(new ImageIcon(getClass().getResource(
				"/view/view.imagens/carta"
						+ mesa.getJogadorAtual().getMao().get(3).getNumero()
						+ ".png")));
		carta5.setIcon(new ImageIcon(getClass().getResource(
				"/view/view.imagens/carta"
						+ mesa.getJogadorAtual().getMao().get(4).getNumero()
						+ ".png")));
		pilhaReserva1Icon.setIcon(new ImageIcon(getClass().getResource(
				"/view/view.imagens/carta"
						+ mesa.getJogadorAtual()
								.getPilhaReserva()
								.get(mesa.getJogadorAtual().getPilhaReserva()
										.size() - 1).getNumero() + ".png")));

	}

	public void terminarPartidaEmAndamento() {
		mesa.terminarPartidaEmAndamento();

	}

	public boolean informarPartidaEmAndamento() {
		return mesa.informarPartidaEmAndamento();
	}

	public void efetuarJogadaRede(Carta cartaSelecionada2, int destino) {
		mesa.tratarInsercaoNaMesa(cartaSelecionada2, destino, true);
		switch (destino) {
		case 1:
			base1.setIcon(new ImageIcon(getClass().getResource(
					"/view/view.imagens/carta" + cartaSelecionada2.getNumero()
							+ ".png")));
			break;
		case 2:
			base2.setIcon(new ImageIcon(getClass().getResource(
					"/view/view.imagens/carta" + cartaSelecionada2.getNumero()
							+ ".png")));
			break;
		case 3:
			base3.setIcon(new ImageIcon(getClass().getResource(
					"/view/view.imagens/carta" + cartaSelecionada2.getNumero()
							+ ".png")));
			break;
		case 4:
			base4.setIcon(new ImageIcon(getClass().getResource(
					"/view/view.imagens/carta" + cartaSelecionada2.getNumero()
							+ ".png")));
			break;
		default:
			break;
		}
	}
}