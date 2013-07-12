package controller;

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.Carta;

import rede.AtorRede;

import view.PainelInformacoes;
import view.TelaPrincipal;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class AtorJogador extends JFrame {

	private int idJogador;
	private String host;
	private String nome;
	protected Mesa mesa;
	private InterfaceSkipbo igrafica;

	private JPanel jContentPane_1;
	private AtorRede atorRede;
	private PainelInformacoes painelInformacoes;
	private JMenuBar jMenuBar = null;

	private JLabel jLabel00 = null;
	private JLabel jLabel01 = null;
	private JLabel jLabel02 = null;
	private JLabel jLabel03 = null;
	private JLabel jLabel04 = null;
	private JLabel jLabel05 = null;
	private JLabel jLabel06 = null;

	private JLabel jLabel10 = null;
	private JLabel jLabel11 = null;
	private JLabel jLabel12 = null;
	private JLabel jLabel13 = null;
	private JLabel jLabel14 = null;
	private JLabel jLabel15 = null;
	private JLabel jLabel16 = null;

	private JLabel jLabel20 = null;
	private JLabel jLabel21 = null;
	private JLabel jLabel22 = null;
	private JLabel jLabel23 = null;
	private JLabel jLabel24 = null;
	private JLabel jLabel25 = null;
	private JLabel jLabel26 = null;

	private JLabel jLabel30 = null;
	private JLabel jLabel31 = null;
	private JLabel jLabel32 = null;
	private JLabel jLabel33 = null;
	private JLabel jLabel34 = null;
	private JLabel jLabel35 = null;
	private JLabel jLabel36 = null;

	/**
	 * 
	 * @param igrafica
	 */

	private void initialize() {
		atorRede = new AtorRede(this);
		this.setSize(1350, 830);
		this.setContentPane(getJContentPane());
		this.setTitle("SkipBo");
		this.setResizable(true);
		mesa = new Mesa(this);
	}

	private JPanel getJContentPane() {
		List<Carta> cartasMao = new ArrayList<>();
		List<Integer> cartasSorteadasMao = sorteiaCartasMao();
		Carta cartaMao = null;
		for (Integer numeroCarta : cartasSorteadasMao) {
			cartaMao = new Carta(numeroCarta);
			cartasMao.add(cartaMao);
		}
		List<Carta> pilhaReserva = new ArrayList<>();
		List<Integer> cartasSorteadasReserva = sorteiaCartasReserva();
		Carta cartaReserva = null;
		for (Integer numeroCarta : cartasSorteadasReserva) {
			cartaReserva = new Carta(numeroCarta);
			pilhaReserva.add(cartaReserva);
		}

		jContentPane_1 = new TelaPrincipal();

		JLabel carta1 = new JLabel("Carta1");
		carta1.setIcon(new ImageIcon(getClass().getResource(
				"/view/view.imagens/carta" + cartasMao.get(0).getNumero()
						+ ".png")));
		// carta1.addMouseListener(new MouseAdapter() {
		// @Override
		// public void mouseClicked(MouseEvent arg0) {
		// JOptionPane.showMessageDialog(null, "aaa");
		// }
		// });

		JLabel carta2 = new JLabel("carta2");
		carta2.setIcon(new ImageIcon(getClass().getResource(
				"/view/view.imagens/carta" + cartasMao.get(1).getNumero()
						+ ".png")));
		carta2.setBounds(516, 641, 67, 112);

		JLabel carta3 = new JLabel("carta3");
		carta3.setIcon(new ImageIcon(getClass().getResource(
				"/view/view.imagens/carta" + cartasMao.get(2).getNumero()
						+ ".png")));
		carta3.setBounds(595, 642, 67, 111);

		JLabel carta4 = new JLabel("carta4");
		carta4.setIcon(new ImageIcon(getClass().getResource(
				"/view/view.imagens/carta" + cartasMao.get(3).getNumero()
						+ ".png")));
		carta4.setBounds(674, 641, 67, 112);

		JLabel carta5 = new JLabel("carta5");
		carta5.setIcon(new ImageIcon(getClass().getResource(
				"/view/view.imagens/carta" + cartasMao.get(4).getNumero()
						+ ".png")));
		carta5.setBounds(762, 641, 67, 112);

		JLabel base1 = new JLabel();
		base1.setBounds(441, 316, 94, 131);
		base1.setBackground(Color.BLACK);

		JLabel base2 = new JLabel();
		base2.setBounds(556, 316, 94, 131);
		base2.setBackground(Color.BLACK);

		JLabel base3 = new JLabel();
		base3.setBounds(665, 316, 89, 131);
		base3.setBackground(Color.BLACK);

		JLabel base4 = new JLabel();
		base4.setBounds(782, 316, 87, 131);
		base4.setBackground(Color.BLACK);


		JLabel pilhaDescarte1 = new JLabel();
		pilhaDescarte1.setBounds(441, 503, 94, 131);
		pilhaDescarte1.setBackground(Color.BLACK);

		JLabel pilhaDescarte2 = new JLabel();
		pilhaDescarte2.setBounds(556, 503, 94, 131);
		pilhaDescarte2.setBackground(Color.BLACK);

		JLabel pilhaDescarte3 = new JLabel();
		pilhaDescarte3.setBounds(674, 503, 90, 131);
		pilhaDescarte3.setBackground(Color.BLACK);

		JLabel pilhaDescarte4 = new JLabel();
		pilhaDescarte4.setBounds(792, 511, 94, 131);
		pilhaDescarte4.setBackground(Color.BLACK);

		List<Rectangle> rectangles = new ArrayList<>();
		rectangles.add(pilhaDescarte1.getBounds());
		rectangles.add(pilhaDescarte2.getBounds());
		rectangles.add(pilhaDescarte3.getBounds());
		rectangles.add(pilhaDescarte4.getBounds());
		rectangles.add(base1.getBounds());
		rectangles.add(base2.getBounds());
		rectangles.add(base3.getBounds());
		rectangles.add(base4.getBounds());
		DragController mouseController = new DragController(rectangles);

		JLabel pilhaReserva1Icon = new JLabel("pilhaReserva");
		pilhaReserva1Icon.setIcon(new ImageIcon(getClass().getResource(
				"/view/view.imagens/carta"
						+ pilhaReserva.get(pilhaReserva.size() - 1).getNumero()
						+ ".png")));
		pilhaReserva1Icon.addMouseListener(mouseController);
		pilhaReserva1Icon.addMouseMotionListener(mouseController);
		// pilhaReserva1Icon.addMouseListener(new MouseAdapter() {
		// @Override
		// public void mouseClicked(MouseEvent arg0) {
		// JOptionPane.showMessageDialog(null, "aaa");
		// }
		// });
		pilhaReserva1Icon.setBounds(308, 573, 77, 118);
		carta1.setBounds(433, 641, 77, 112);

		carta1.addMouseListener(mouseController);
		carta1.addMouseMotionListener(mouseController);
		carta2.addMouseListener(mouseController);
		carta2.addMouseMotionListener(mouseController);
		carta3.addMouseListener(mouseController);
		carta3.addMouseMotionListener(mouseController);
		carta4.addMouseListener(mouseController);
		carta4.addMouseMotionListener(mouseController);
		carta5.addMouseListener(mouseController);
		carta5.addMouseMotionListener(mouseController);
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

	private List<Integer> sorteiaCartasReserva() {
		List<Integer> cartasSorteadasReserva = new ArrayList<>();
		Integer numero = null;
		;
		for (int i = 0; i < 5; i++) {
			numero = (int) (0 + (Math.random() * 12)); // sorteia numeros entre
														// 0 e 12 ( 0 é a
														// skipBo)
			cartasSorteadasReserva.add(numero);
		}

		return cartasSorteadasReserva;
	}

	private List<Integer> sorteiaCartasMao() {
		List<Integer> cartasSorteadasMao = new ArrayList<>();
		Integer numero = null;
		;
		for (int i = 0; i < 5; i++) {
			numero = (int) (0 + (Math.random() * 12)); // sorteia numeros entre
														// 0 e 12(0 é a skipBo)
			cartasSorteadasMao.add(numero);
		}
		return cartasSorteadasMao;
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

	// public InterfaceLocal comprarCartas() {
	//
	// }

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
	 * @param idJog
	 */
	public void setIdJogador(int idJog) {
		this.idJogador = idJog;
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

	public void efetuaJogada() {

	}

	/**
	 * 
	 * @param carta
	 */
	public void inserirCartaNaMesa(int carta) {

	}

	public void iniciarPartidaRede(boolean vez) {
		// TODO Auto-generated method stub

	}

	public void terminarPartidaEmAndamento() {
		// TODO Auto-generated method stub

	}

	public boolean informarPartidaEmAndamento() {
		return mesa.informarPartidaEmAndamento();
	}
}