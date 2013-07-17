package interface_grafica;

import java.awt.Color;
import java.awt.Font;
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

import dominio_do_problema.Carta;
import dominio_do_problema.Mesa;

import br.ufsc.inf.leobr.cliente.Proxy;


import rede.AtorRede;

import java.util.List;

public class AtorJogador extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Mesa mesa;
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
	private int verificaOrigemCarta = 99;
	private JLabel quantidadeReserva;
	private JLabel nmJogador;
	private JLabel informaVez;

	private void initialize() {
		setMesa(new Mesa());
		atorRede = new AtorRede(this);
		this.setSize(1350, 830);
		this.setContentPane(getJContentPane());
		this.setTitle("SkipBo");
		this.setResizable(true);
	}

	private JPanel getJContentPane() {
		jContentPane_1 = new TelaPrincipal();
		carta1 = new JLabel("Carta1");
		carta1.setBounds(433, 641, 77, 112);
		carta1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (atorRede.ehMinhaVez()) {
					cartaSelecionada = getMesa().getJogadorDaVez().getMao()
							.get(0);
					cartaVeioDaMao1();
					carta1.setBorder(BorderFactory.createBevelBorder(1));
					carta2.setBorder(null);
					carta3.setBorder(null);
					carta4.setBorder(null);
					carta5.setBorder(null);
				} else {
					informaVezDoAdversario();
				}
			}

			private void cartaVeioDaMao1() {
				cartaSelecionada.setEhMao1(true);
				cartaSelecionada.setEhMao2(false);
				cartaSelecionada.setEhMao3(false);
				cartaSelecionada.setEhMao4(false);
				cartaSelecionada.setEhMao5(false);
				cartaSelecionada.setEhDaReserva(false);
				cartaSelecionada.setEhDoDescarte1(false);
				cartaSelecionada.setEhDoDescarte2(false);
				cartaSelecionada.setEhDoDescarte3(false);
				cartaSelecionada.setEhDoDescarte4(false);
			}
		});

		carta2 = new JLabel("carta2");
		carta2.setBounds(516, 641, 67, 112);
		carta2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (atorRede.ehMinhaVez()) {
					cartaSelecionada = getMesa().getJogadorDaVez().getMao()
							.get(1);
					cartaVeioDaMao2();
					carta1.setBorder(null);
					carta2.setBorder(BorderFactory.createBevelBorder(1));
					carta3.setBorder(null);
					carta4.setBorder(null);
					carta5.setBorder(null);
				} else {
					informaVezDoAdversario();
				}
			}

			private void cartaVeioDaMao2() {
				cartaSelecionada.setEhMao1(false);
				cartaSelecionada.setEhMao2(true);
				cartaSelecionada.setEhMao3(false);
				cartaSelecionada.setEhMao4(false);
				cartaSelecionada.setEhMao5(false);
				cartaSelecionada.setEhDaReserva(false);
				cartaSelecionada.setEhDoDescarte1(false);
				cartaSelecionada.setEhDoDescarte2(false);
				cartaSelecionada.setEhDoDescarte3(false);
				cartaSelecionada.setEhDoDescarte4(false);
			}
		});
		carta3 = new JLabel("carta3");
		carta3.setBounds(595, 642, 67, 111);
		carta3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (atorRede.ehMinhaVez()) {
					cartaSelecionada = getMesa().getJogadorDaVez().getMao()
							.get(2);
					cartaVeioDaMao3();
					carta1.setBorder(null);
					carta2.setBorder(null);
					carta3.setBorder(BorderFactory.createBevelBorder(1));
					carta4.setBorder(null);
					carta5.setBorder(null);
				} else {
					informaVezDoAdversario();
				}
			}

			private void cartaVeioDaMao3() {
				cartaSelecionada.setEhMao1(false);
				cartaSelecionada.setEhMao2(false);
				cartaSelecionada.setEhMao3(true);
				cartaSelecionada.setEhMao4(false);
				cartaSelecionada.setEhMao5(false);
				cartaSelecionada.setEhDaReserva(false);
				cartaSelecionada.setEhDoDescarte1(false);
				cartaSelecionada.setEhDoDescarte2(false);
				cartaSelecionada.setEhDoDescarte3(false);
				cartaSelecionada.setEhDoDescarte4(false);
			}
		});

		carta4 = new JLabel("carta4");
		carta4.setBounds(674, 641, 67, 112);
		carta4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (atorRede.ehMinhaVez()) {
					cartaSelecionada = getMesa().getJogadorDaVez().getMao()
							.get(3);
					cartaVeioDaMao4();
					carta1.setBorder(null);
					carta2.setBorder(null);
					carta3.setBorder(null);
					carta4.setBorder(BorderFactory.createBevelBorder(1));
					carta5.setBorder(null);
				} else {
					informaVezDoAdversario();
				}
			}

			private void cartaVeioDaMao4() {
				cartaSelecionada.setEhMao1(false);
				cartaSelecionada.setEhMao2(false);
				cartaSelecionada.setEhMao3(false);
				cartaSelecionada.setEhMao4(true);
				cartaSelecionada.setEhMao5(false);
				cartaSelecionada.setEhDaReserva(false);
				cartaSelecionada.setEhDoDescarte1(false);
				cartaSelecionada.setEhDoDescarte2(false);
				cartaSelecionada.setEhDoDescarte3(false);
				cartaSelecionada.setEhDoDescarte4(false);
			}
		});

		carta5 = new JLabel("carta5");
		carta5.setBounds(762, 641, 67, 112);
		carta5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (atorRede.ehMinhaVez()) {
					cartaSelecionada = getMesa().getJogadorDaVez().getMao()
							.get(4);
					cartaVeioDaMao5();
					carta1.setBorder(null);
					carta2.setBorder(null);
					carta3.setBorder(null);
					carta4.setBorder(null);
					carta5.setBorder(BorderFactory.createBevelBorder(1));
				} else {
					informaVezDoAdversario();
				}
			}

			private void cartaVeioDaMao5() {
				cartaSelecionada.setEhMao1(false);
				cartaSelecionada.setEhMao2(false);
				cartaSelecionada.setEhMao3(false);
				cartaSelecionada.setEhMao4(false);
				cartaSelecionada.setEhMao5(true);
				cartaSelecionada.setEhDaReserva(false);
				cartaSelecionada.setEhDoDescarte1(false);
				cartaSelecionada.setEhDoDescarte2(false);
				cartaSelecionada.setEhDoDescarte3(false);
				cartaSelecionada.setEhDoDescarte4(false);
			}
		});

		pilhaReserva1Icon = new JLabel("pilhaReserva");
		pilhaReserva1Icon.setBounds(306, 571, 77, 118);
		pilhaReserva1Icon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (atorRede.ehMinhaVez()) {
					cartaSelecionada = getMesa()
							.getJogadorDaVez()
							.getPilhaReserva()
							.get(getMesa().getJogadorDaVez().getPilhaReserva()
									.size() - 1);
					cartaVeioDaReserva();
					carta1.setBorder(null);
					carta2.setBorder(null);
					carta3.setBorder(null);
					carta4.setBorder(null);
					carta5.setBorder(null);
					pilhaReserva1Icon.setBorder(BorderFactory
							.createBevelBorder(1));
				} else {
					informaVezDoAdversario();
				}
			}

			private void cartaVeioDaReserva() {
				cartaSelecionada.setEhMao1(false);
				cartaSelecionada.setEhMao2(false);
				cartaSelecionada.setEhMao3(false);
				cartaSelecionada.setEhMao4(false);
				cartaSelecionada.setEhMao5(false);
				cartaSelecionada.setEhDaReserva(true);
				cartaSelecionada.setEhDoDescarte1(false);
				cartaSelecionada.setEhDoDescarte2(false);
				cartaSelecionada.setEhDoDescarte3(false);
				cartaSelecionada.setEhDoDescarte4(false);
			}
		});

		base1 = new JLabel();
		base1.setBounds(433, 305, 111, 142);
		base1.setBackground(Color.BLACK);
		base1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (atorRede.ehMinhaVez()) {
					boolean ok = getMesa().tratarInsercaoNaMesa(
							cartaSelecionada, 1, false);
					if (ok) {
						base1.setIcon(new ImageIcon(getClass()
								.getResource(
										"/view/view.imagens/carta"
												+ cartaSelecionada.getNumero()
												+ ".png")));
						verificaOrigemCarta = getMesa().getJogadorDaVez()
								.removeCartaSelecionada(cartaSelecionada);
						if (verificaOrigemCarta == 5) {
							atualizaCartasMao(getMesa().getJogadorDaVez()
									.getMao());
						} else if (verificaOrigemCarta == 0) {
							atualizaCartasReserva(getMesa().getJogadorDaVez()
									.getPilhaReserva());
						} else {
							atualizaPilhaDescarte(verificaOrigemCarta);
						}
						cartaSelecionada = null;
					}
				} else {
					informaVezDoAdversario();
				}
			}
		});

		base2 = new JLabel();
		base2.setBounds(547, 305, 110, 142);
		base2.setBackground(Color.BLACK);
		base2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (atorRede.ehMinhaVez()) {
					boolean ok = getMesa().tratarInsercaoNaMesa(
							cartaSelecionada, 2, false);
					if (ok) {
						base2.setIcon(new ImageIcon(getClass()
								.getResource(
										"/view/view.imagens/carta"
												+ cartaSelecionada.getNumero()
												+ ".png")));
						// limpaIconeOrigemDaCarta();

						verificaOrigemCarta = getMesa().getJogadorDaVez()
								.removeCartaSelecionada(cartaSelecionada);
						if (verificaOrigemCarta == 5) {
							atualizaCartasMao(getMesa().getJogadorDaVez()
									.getMao());
						} else if (verificaOrigemCarta == 0) {
							atualizaCartasReserva(getMesa().getJogadorDaVez()
									.getPilhaReserva());
						} else {
							atualizaPilhaDescarte(verificaOrigemCarta);
						}
						// atorRede.enviarJogada(cartaSelecionada, 2);
						cartaSelecionada = null;
					}
				} else {
					informaVezDoAdversario();
				}
			}
		});

		base3 = new JLabel();
		base3.setBounds(661, 305, 103, 142);
		base3.setBackground(Color.BLACK);
		base3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (atorRede.ehMinhaVez()) {
					boolean ok = getMesa().tratarInsercaoNaMesa(
							cartaSelecionada, 3, false);
					if (ok) {
						base3.setIcon(new ImageIcon(getClass()
								.getResource(
										"/view/view.imagens/carta"
												+ cartaSelecionada.getNumero()
												+ ".png")));
						verificaOrigemCarta = getMesa().getJogadorDaVez()
								.removeCartaSelecionada(cartaSelecionada);
						if (verificaOrigemCarta == 5) {
							atualizaCartasMao(getMesa().getJogadorDaVez()
									.getMao());
						} else if (verificaOrigemCarta == 0) {
							atualizaCartasReserva(getMesa().getJogadorDaVez()
									.getPilhaReserva());
						} else {
							atualizaPilhaDescarte(verificaOrigemCarta);
						}
						cartaSelecionada = null;
					}
				} else {
					informaVezDoAdversario();
				}
			}
		});

		base4 = new JLabel();
		base4.setBounds(775, 305, 103, 142);
		base4.setBackground(Color.BLACK);
		base4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (atorRede.ehMinhaVez()) {
					boolean ok = getMesa().tratarInsercaoNaMesa(
							cartaSelecionada, 4, false);
					if (ok) {
						base4.setIcon(new ImageIcon(getClass()
								.getResource(
										"/view/view.imagens/carta"
												+ cartaSelecionada.getNumero()
												+ ".png")));
						verificaOrigemCarta = getMesa().getJogadorDaVez()
								.removeCartaSelecionada(cartaSelecionada);
						if (verificaOrigemCarta == 5) {
							atualizaCartasMao(getMesa().getJogadorDaVez()
									.getMao());
						} else if (verificaOrigemCarta == 0) {
							atualizaCartasReserva(getMesa().getJogadorDaVez()
									.getPilhaReserva());
						} else {
							atualizaPilhaDescarte(verificaOrigemCarta);
						}
						cartaSelecionada = null;
					}
				} else {
					informaVezDoAdversario();
				}
			}
		});

		pilhaDescarte1 = new JLabel();
		pilhaDescarte1.setBounds(441, 503, 94, 131);
		pilhaDescarte1.setBackground(Color.BLACK);
		pilhaDescarte1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (atorRede.ehMinhaVez()) {
					if (cartaSelecionada == null) {
						if (getMesa().getJogadorDaVez().getEstoque()
								.getPilhaDescarte1().size() != 0) {
							cartaSelecionada = getMesa()
									.getJogadorDaVez()
									.getEstoque()
									.getPilhaDescarte1()
									.get(getMesa().getJogadorDaVez()
											.getEstoque().getPilhaDescarte1()
											.size() - 1);
							cartaVeioDoDescarte1();
							clickBordaElevadaDescarte1();
						} else {
							cartaSelecionada = null;
						}
					} else {
						if (mesa.verificaSeCartaNaoVeioDaReserva(cartaSelecionada)) {
							pilhaDescarte1.setIcon(new ImageIcon(getClass()
									.getResource(
											"/view/view.imagens/carta"
													+ cartaSelecionada
															.getNumero()
													+ ".png")));
							getMesa().insereNoDescarte(cartaSelecionada, 1,
									false);
							getMesa().getJogadorDaVez().removeCartaSelecionada(
									cartaSelecionada);
							atualizaCartasMao(getMesa().getJogadorDaVez()
									.getMao());
							atorRede.enviarJogada(getMesa(), 0);
							cartaSelecionada = null;
							informaVez.setText("Não é sua vez");
							informaVez.setForeground(Color.RED);
						}
					}
				} else {
					informaVezDoAdversario();
				}
			}

			private void clickBordaElevadaDescarte1() {
				carta1.setBorder(null);
				carta2.setBorder(null);
				carta3.setBorder(null);
				carta4.setBorder(null);
				carta5.setBorder(null);
				pilhaDescarte1.setBorder(BorderFactory
						.createBevelBorder(1));
				pilhaReserva1Icon.setBorder(null);
				pilhaDescarte2.setBorder(null);
				pilhaDescarte3.setBorder(null);
				pilhaDescarte4.setBorder(null);
			}

			private void cartaVeioDoDescarte1() {
				cartaSelecionada.setEhMao1(false);
				cartaSelecionada.setEhMao2(false);
				cartaSelecionada.setEhMao3(false);
				cartaSelecionada.setEhMao4(false);
				cartaSelecionada.setEhMao5(false);
				cartaSelecionada.setEhDaReserva(false);
				cartaSelecionada.setEhDoDescarte1(true);
				cartaSelecionada.setEhDoDescarte2(false);
				cartaSelecionada.setEhDoDescarte3(false);
				cartaSelecionada.setEhDoDescarte4(false);

			}
		});

		pilhaDescarte2 = new JLabel();
		pilhaDescarte2.setBounds(556, 503, 94, 131);
		pilhaDescarte2.setBackground(Color.BLACK);
		pilhaDescarte2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (atorRede.ehMinhaVez()) {
					if (cartaSelecionada == null) {
						if (getMesa().getJogadorDaVez().getEstoque()
								.getPilhaDescarte2().size() != 0) {
							cartaSelecionada = getMesa()
									.getJogadorDaVez()
									.getEstoque()
									.getPilhaDescarte2()
									.get(getMesa().getJogadorDaVez()
											.getEstoque().getPilhaDescarte2()
											.size() - 1);
							cartaVeioDoDescarte2();
							clickBordaElevadaDescarte2();
						} else {
							cartaSelecionada = null;
						}
					} else {
						if (mesa.verificaSeCartaNaoVeioDaReserva(cartaSelecionada)) {
							pilhaDescarte2.setIcon(new ImageIcon(getClass()
									.getResource(
											"/view/view.imagens/carta"
													+ cartaSelecionada
															.getNumero()
													+ ".png")));
							// atorRede.enviarJogada(cartaSelecionada, 0);
							getMesa().insereNoDescarte(cartaSelecionada, 2,
									false);
							getMesa().getJogadorDaVez().removeCartaSelecionada(
									cartaSelecionada);
							atualizaCartasMao(getMesa().getJogadorDaVez()
									.getMao());
							atorRede.enviarJogada(getMesa(), 0);
							cartaSelecionada = null;
							informaVez.setText("Não é sua vez");
							informaVez.setForeground(Color.RED);
						}
					}
				} else {
					informaVezDoAdversario();
				}
			}

			private void clickBordaElevadaDescarte2() {
				carta1.setBorder(null);
				carta2.setBorder(null);
				carta3.setBorder(null);
				carta4.setBorder(null);
				carta5.setBorder(null);
				pilhaReserva1Icon.setBorder(null);
				pilhaDescarte2.setBorder(BorderFactory
						.createBevelBorder(1));
				pilhaDescarte1.setBorder(null);
				pilhaDescarte3.setBorder(null);
				pilhaDescarte4.setBorder(null);
			}

			private void cartaVeioDoDescarte2() {
				cartaSelecionada.setEhMao1(false);
				cartaSelecionada.setEhMao2(false);
				cartaSelecionada.setEhMao3(false);
				cartaSelecionada.setEhMao4(false);
				cartaSelecionada.setEhMao5(false);
				cartaSelecionada.setEhDaReserva(false);
				cartaSelecionada.setEhDoDescarte1(false);
				cartaSelecionada.setEhDoDescarte2(true);
				cartaSelecionada.setEhDoDescarte3(false);
				cartaSelecionada.setEhDoDescarte4(false);
			}
		});

		pilhaDescarte3 = new JLabel();
		pilhaDescarte3.setBounds(674, 503, 90, 131);
		pilhaDescarte3.setBackground(Color.BLACK);
		pilhaDescarte3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (atorRede.ehMinhaVez()) {
					if (cartaSelecionada == null) {
						if (getMesa().getJogadorDaVez().getEstoque()
								.getPilhaDescarte3().size() != 0) {
							cartaSelecionada = getMesa()
									.getJogadorDaVez()
									.getEstoque()
									.getPilhaDescarte3()
									.get(getMesa().getJogadorDaVez()
											.getEstoque().getPilhaDescarte3()
											.size() - 1);
							cartaVeioDoDescarte3();
							carta1.setBorder(null);
							carta2.setBorder(null);
							carta3.setBorder(null);
							carta4.setBorder(null);
							carta5.setBorder(null);
							pilhaReserva1Icon.setBorder(null);
							pilhaDescarte3.setBorder(BorderFactory
									.createBevelBorder(1));
							pilhaDescarte1.setBorder(null);
							pilhaDescarte2.setBorder(null);
							pilhaDescarte4.setBorder(null);
						} else {
							cartaSelecionada = null;
						}
					} else {
						if (mesa.verificaSeCartaNaoVeioDaReserva(cartaSelecionada)) {
							pilhaDescarte3.setIcon(new ImageIcon(getClass()
									.getResource(
											"/view/view.imagens/carta"
													+ cartaSelecionada
															.getNumero()
													+ ".png")));
							// atorRede.enviarJogada(cartaSelecionada, 0);
							getMesa().insereNoDescarte(cartaSelecionada, 3,
									false);
							getMesa().getJogadorDaVez().removeCartaSelecionada(
									cartaSelecionada);
							atualizaCartasMao(getMesa().getJogadorDaVez()
									.getMao());
							atorRede.enviarJogada(getMesa(), 0);
							cartaSelecionada = null;
							informaVez.setText("Não é sua vez");
							informaVez.setForeground(Color.RED);
						}
					}
				} else {
					informaVezDoAdversario();
				}
			}

			private void cartaVeioDoDescarte3() {
				cartaSelecionada.setEhMao1(false);
				cartaSelecionada.setEhMao2(false);
				cartaSelecionada.setEhMao3(false);
				cartaSelecionada.setEhMao4(false);
				cartaSelecionada.setEhMao5(false);
				cartaSelecionada.setEhDaReserva(false);
				cartaSelecionada.setEhDoDescarte1(false);
				cartaSelecionada.setEhDoDescarte2(false);
				cartaSelecionada.setEhDoDescarte3(true);
				cartaSelecionada.setEhDoDescarte4(false);
			}
		});

		pilhaDescarte4 = new JLabel();
		pilhaDescarte4.setBounds(792, 511, 94, 131);
		pilhaDescarte4.setBackground(Color.BLACK);
		pilhaDescarte4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (atorRede.ehMinhaVez()) {
					if (cartaSelecionada == null) {
						if (getMesa().getJogadorDaVez().getEstoque()
								.getPilhaDescarte4().size() != 0) {

							cartaSelecionada = getMesa()
									.getJogadorDaVez()
									.getEstoque()
									.getPilhaDescarte4()
									.get(getMesa().getJogadorDaVez()
											.getEstoque().getPilhaDescarte4()
											.size() - 1);
							cartaVeioDoDescarte4();
							clickBordaElevadaDescarte4();
						} else {
							cartaSelecionada = null;
						}
					} else {
						if (mesa.verificaSeCartaNaoVeioDaReserva(cartaSelecionada)) {
							pilhaDescarte4.setIcon(new ImageIcon(getClass()
									.getResource(
											"/view/view.imagens/carta"
													+ cartaSelecionada
															.getNumero()
													+ ".png")));
							getMesa().insereNoDescarte(cartaSelecionada, 4,
									false);
							getMesa().getJogadorDaVez().removeCartaSelecionada(
									cartaSelecionada);
							atualizaCartasMao(getMesa().getJogadorDaVez()
									.getMao());
							atorRede.enviarJogada(getMesa(), 0);
							cartaSelecionada = null;
							informaVez.setText("Não é sua vez");
							informaVez.setForeground(Color.RED);
						}
					}
				} else {
					informaVezDoAdversario();
				}
			}

			private void clickBordaElevadaDescarte4() {
				carta1.setBorder(null);
				carta2.setBorder(null);
				carta3.setBorder(null);
				carta4.setBorder(null);
				carta5.setBorder(null);
				pilhaReserva1Icon.setBorder(null);
				pilhaDescarte4.setBorder(BorderFactory
						.createBevelBorder(1));
				pilhaDescarte1.setBorder(null);
				pilhaDescarte2.setBorder(null);
				pilhaDescarte3.setBorder(null);
			}

			private void cartaVeioDoDescarte4() {
				cartaSelecionada.setEhMao1(false);
				cartaSelecionada.setEhMao2(false);
				cartaSelecionada.setEhMao3(false);
				cartaSelecionada.setEhMao4(false);
				cartaSelecionada.setEhMao5(false);
				cartaSelecionada.setEhDaReserva(false);
				cartaSelecionada.setEhDoDescarte1(false);
				cartaSelecionada.setEhDoDescarte2(false);
				cartaSelecionada.setEhDoDescarte3(false);
				cartaSelecionada.setEhDoDescarte4(true);
			}
		});

		JMenu menuSobre = new JMenu("Info. equipe");
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

		Font font = new Font("bold", Font.BOLD, 15);

		quantidadeReserva = new JLabel();
		quantidadeReserva.setFont(font);
		quantidadeReserva.setBounds(306, 528, 77, 22);
		quantidadeReserva.setForeground(Color.GREEN);

		nmJogador = new JLabel();
		nmJogador.setFont(font);
		nmJogador.setBounds(939, 584, 140, 22);
		nmJogador.setForeground(Color.GREEN);

		informaVez = new JLabel();
		informaVez.setBounds(961, 528, 118, 22);
		informaVez.setFont(font);

		jContentPane_1.add(informaVez);
		jContentPane_1.add(nmJogador);
		jContentPane_1.add(quantidadeReserva);
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

	protected void atualizaPilhaDescarte(int verificaOrigemCarta2) {
		switch (verificaOrigemCarta2) {
		case 1:
			if (getMesa().getJogadorDaVez().getEstoque().getPilhaDescarte1()
					.size() != 0) {
				pilhaDescarte1.setIcon(new ImageIcon(getClass()
						.getResource(
								"/view/view.imagens/carta"
										+ getMesa()
												.getJogadorDaVez()
												.getEstoque()
												.getPilhaDescarte1()
												.get(getMesa()
														.getJogadorDaVez()
														.getEstoque()
														.getPilhaDescarte1()
														.size() - 1)
												.getNumero() + ".png")));
			} else {
				pilhaDescarte1.setIcon(null);
			}
			break;
		case 2:
			if (getMesa().getJogadorDaVez().getEstoque().getPilhaDescarte2()
					.size() != 0) {
				pilhaDescarte2.setIcon(new ImageIcon(getClass()
						.getResource(
								"/view/view.imagens/carta"
										+ getMesa()
												.getJogadorDaVez()
												.getEstoque()
												.getPilhaDescarte2()
												.get(getMesa()
														.getJogadorDaVez()
														.getEstoque()
														.getPilhaDescarte2()
														.size() - 1)
												.getNumero() + ".png")));
			} else {
				pilhaDescarte2.setIcon(null);
			}
			break;
		case 3:
			if (getMesa().getJogadorDaVez().getEstoque().getPilhaDescarte3()
					.size() != 0) {
				pilhaDescarte3.setIcon(new ImageIcon(getClass()
						.getResource(
								"/view/view.imagens/carta"
										+ getMesa()
												.getJogadorDaVez()
												.getEstoque()
												.getPilhaDescarte3()
												.get(getMesa()
														.getJogadorDaVez()
														.getEstoque()
														.getPilhaDescarte3()
														.size() - 1)
												.getNumero() + ".png")));
			} else {
				pilhaDescarte3.setIcon(null);
			}
			break;
		case 4:
			if (getMesa().getJogadorDaVez().getEstoque().getPilhaDescarte4()
					.size() != 0) {
				pilhaDescarte4.setIcon(null);
				pilhaDescarte4.setIcon(new ImageIcon(getClass()
						.getResource(
								"/view/view.imagens/carta"
										+ getMesa()
												.getJogadorDaVez()
												.getEstoque()
												.getPilhaDescarte4()
												.get(getMesa()
														.getJogadorDaVez()
														.getEstoque()
														.getPilhaDescarte4()
														.size() - 1)
												.getNumero() + ".png")));
			} else {
				pilhaDescarte4.setIcon(null);
			}
			break;

		default:
			break;
		}

	}

	protected void atualizaCartasReserva(List<Carta> pilhaReserva) {
		if (getMesa().getJogadorDaVez().getPilhaReserva().size() != 0) {
			pilhaReserva1Icon.setIcon(new ImageIcon(getClass().getResource(
					"/view/view.imagens/carta"
							+ getMesa()
									.getJogadorDaVez()
									.getPilhaReserva()
									.get(getMesa().getJogadorDaVez()
											.getPilhaReserva().size() - 1)
									.getNumero() + ".png")));
		} else {
			pilhaReserva1Icon.setIcon(null);
			mesa.getJogadorDaVez().setVencedor(true);
			atorRede.enviarJogada(getMesa(), 0);
		}
		quantidadeReserva.setText("Cartas: "
				+ getMesa().getJogadorDaVez().getPilhaReserva().size());
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
				carta1.setIcon(null);
				carta2.setIcon(null);
				carta3.setIcon(null);
				carta4.setIcon(null);
				carta5.setIcon(null);
				break;
			}
		}
	}

	public AtorJogador() {
		initialize();
	}

	public void iniciarPartidaRede(boolean iniciarComoSolicitante) {
		if (getMesa() == null) {
			setMesa(new Mesa());
		}

		String idJ1;
		idJ1 = Proxy.getInstance().getNomeJogador();

		if (iniciarComoSolicitante) {
			getMesa().criarJogador(idJ1);
		} else {
			getMesa().criarJogador(idJ1);
		}
		String idJ2;
		idJ2 = atorRede.obtemNomeAdversario();

		if (iniciarComoSolicitante) {
			getMesa().criarJogador(idJ2);
		} else {
			getMesa().criarJogador(idJ2);
		}
		if (iniciarComoSolicitante) {
			getMesa().definirOPrimeiro(1);

		} else {
			getMesa().definirOPrimeiro(2);
		}

		nmJogador.setText(getMesa().getJogadorLocal().getNome());
		getMesa().iniciar();
		quantidadeReserva.setText("Cartas: "
				+ getMesa().getJogadorLocal().getPilhaReserva().size());

		if (atorRede.ehMinhaVez()) {
			informaVez.setText("Sua vez");
			informaVez.setForeground(Color.GREEN);
		} else {
			informaVez.setText("Não é sua vez");
			informaVez.setForeground(Color.RED);
		}
		this.exibirEstado();

	}

	private void exibirEstado() {
		carta1.setIcon(new ImageIcon(getClass().getResource(
				"/view/view.imagens/carta"
						+ getMesa().getJogadorLocal().getMao().get(0)
								.getNumero() + ".png")));
		carta2.setIcon(new ImageIcon(getClass().getResource(
				"/view/view.imagens/carta"
						+ getMesa().getJogadorLocal().getMao().get(1)
								.getNumero() + ".png")));
		carta3.setIcon(new ImageIcon(getClass().getResource(
				"/view/view.imagens/carta"
						+ getMesa().getJogadorLocal().getMao().get(2)
								.getNumero() + ".png")));
		carta4.setIcon(new ImageIcon(getClass().getResource(
				"/view/view.imagens/carta"
						+ getMesa().getJogadorLocal().getMao().get(3)
								.getNumero() + ".png")));
		carta5.setIcon(new ImageIcon(getClass().getResource(
				"/view/view.imagens/carta"
						+ getMesa().getJogadorLocal().getMao().get(4)
								.getNumero() + ".png")));
		pilhaReserva1Icon.setIcon(new ImageIcon(getClass().getResource(
				"/view/view.imagens/carta"
						+ getMesa()
								.getJogadorLocal()
								.getPilhaReserva()
								.get(getMesa().getJogadorLocal()
										.getPilhaReserva().size() - 1)
								.getNumero() + ".png")));

	}

	public void terminarPartidaEmAndamento() {
		getMesa().terminarPartidaEmAndamento();

	}

	public boolean informarPartidaEmAndamento() {
		return getMesa().informarPartidaEmAndamento();
	}

	public void efetuarJogadaRede(Mesa mesa) {
		this.setMesa(mesa);
		this.atualizaMesa(mesa);
		informaVez.setText("Sua vez");
		informaVez.setForeground(Color.GREEN);
		List<Carta> mao = mesa.verificaNecessidadeDeCartas(mesa
				.getJogadorDaVez().getMao());
		if (mao != null) {
			atualizaCartasMao(mao);
		}
	}

	private void atualizaMesa(Mesa mesa2) {
		if (!mesa2.getMonte().getCartasBase1().isEmpty()) {
			base1.setIcon(new ImageIcon(getClass().getResource(
					"/view/view.imagens/carta"
							+ mesa2.getMonte()
									.getCartasBase1()
									.get(mesa2.getMonte().getCartasBase1()
											.size() - 1).getNumero() + ".png")));
		} else {
			base1.setIcon(null);
		}
		if (!mesa2.getMonte().getCartasBase2().isEmpty()) {
			base2.setIcon(new ImageIcon(getClass().getResource(
					"/view/view.imagens/carta"
							+ mesa2.getMonte()
									.getCartasBase2()
									.get(mesa2.getMonte().getCartasBase2()
											.size() - 1).getNumero() + ".png")));

		} else {
			base2.setIcon(null);
		}
		if (!mesa2.getMonte().getCartasBase3().isEmpty()) {
			base3.setIcon(new ImageIcon(getClass().getResource(
					"/view/view.imagens/carta"
							+ mesa2.getMonte()
									.getCartasBase3()
									.get(mesa2.getMonte().getCartasBase3()
											.size() - 1).getNumero() + ".png")));

		} else {
			base3.setIcon(null);
		}
		if (!getMesa().getMonte().getCartasBase4().isEmpty()) {
			base4.setIcon(new ImageIcon(getClass().getResource(
					"/view/view.imagens/carta"
							+ getMesa()
									.getMonte()
									.getCartasBase4()
									.get(getMesa().getMonte().getCartasBase4()
											.size() - 1).getNumero() + ".png")));

		} else {
			base4.setIcon(null);
		}

	}

	private void informaVezDoAdversario() {
		JOptionPane.showMessageDialog(null,
				"Não é a sua vez, por favor aguarde.");
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
}