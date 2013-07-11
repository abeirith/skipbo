package controller;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
	private Mesa mesa;
	private InterfaceSkipbo igrafica;

	private JPanel jContentPane_1;
	private AtorRede atorRede;
	private PainelInformacoes painelInformacoes;

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
		this.setSize(1220, 750);
		this.setContentPane(getJContentPane());
		
		JLabel lblPilhadescarte = new JLabel("pilhaDescarte1");
		lblPilhadescarte.setBounds(502, 429, 56, 70);
		jContentPane_1.add(lblPilhadescarte);
		
		JLabel lblPilhadescarte_1 = new JLabel("pilhaDescarte2");
		lblPilhadescarte_1.setBounds(553, 429, 67, 70);
		jContentPane_1.add(lblPilhadescarte_1);
		
		JLabel lblPilhadescarte_2 = new JLabel("pilhaDescarte3");
		lblPilhadescarte_2.setBounds(620, 429, 56, 70);
		jContentPane_1.add(lblPilhadescarte_2);
		
		JLabel lblPilhadescarte_3 = new JLabel("pilhaDescarte4");
		lblPilhadescarte_3.setBounds(676, 429, 56, 70);
		jContentPane_1.add(lblPilhadescarte_3);
		
		this.setTitle("SkipBo");
		this.setResizable(true);
		mesa = new Mesa(this);
	}

	private JPanel getJContentPane() {
		jContentPane_1 = new TelaPrincipal();
		List<Integer> cartasSorteadas = new ArrayList<>();
		 sorteiaCartas(cartasSorteadas);
		
		JLabel carta1 = new JLabel("Carta1");
		carta1.setIcon(new ImageIcon(getClass().getResource("/view/view.imagens/carta"+cartasSorteadas.get(0)+".png")));
		carta1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(null, "aaa");
			}
		});
		
		JLabel carta2 = new JLabel("carta2");
		carta2.setIcon(new ImageIcon(getClass().getResource("/view/view.imagens/carta"+cartasSorteadas.get(1)+".png")));
		carta2.setBounds(576, 578, 56, 88);
		jContentPane_1.add(carta2);
		
		JLabel carta3 = new JLabel("carta3");
		carta3.setIcon(new ImageIcon(getClass().getResource("/view/view.imagens/carta"+cartasSorteadas.get(2)+".png")));
		carta3.setBounds(644, 579, 56, 86);
		jContentPane_1.add(carta3);
		
		JLabel carta4 = new JLabel("carta4");
		carta4.setIcon(new ImageIcon(getClass().getResource("/view/view.imagens/carta"+cartasSorteadas.get(3)+".png")));
		carta4.setBounds(719, 578, 56, 88);
		jContentPane_1.add(carta4);
		
		JLabel carta5 = new JLabel("carta5");
		carta5.setIcon(new ImageIcon(getClass().getResource("/view/view.imagens/carta"+cartasSorteadas.get(4)+".png")));
		carta5.setBounds(787, 578, 56, 88);
		jContentPane_1.add(carta5);
		
		JLabel base1 = new JLabel("base1");
		base1.setBounds(481, 307, 47, 74);
		
		JLabel base2 = new JLabel("base2");
		base2.setBounds(553, 307, 47, 74);
		
		JLabel base3 = new JLabel("base3");
		base3.setBounds(629, 309, 47, 70);
		
		JLabel base4 = new JLabel("base4");
		base4.setBounds(705, 307, 47, 74);
		
		JLabel pilhaReserva = new JLabel("pilhaReserva");
		pilhaReserva.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(null, "aaa");
			}
		});
		pilhaReserva.setBounds(364, 549, 57, 76);
		carta1.setBounds(502, 578, 66, 88);
		jContentPane_1.add(base1);
		jContentPane_1.add(base2);
		jContentPane_1.add(base3);
		jContentPane_1.add(base4);
		jContentPane_1.add(pilhaReserva);
		jContentPane_1.add(carta1);
		jContentPane_1.setLayout(null);
		return jContentPane_1;
	}

	private void sorteiaCartas(List<Integer> cartasSorteadas) {
		Integer numero= null;;  
		  for (int i = 0; i < 5;i++) {
			  numero = (int) (1 + (Math.random() * 12)); //sorteia numeros entre 1 e 10  
			  cartasSorteadas.add(numero);
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
}