package model;

import java.util.ArrayList;
import java.util.List;

public class Jogador {

	private int id;
	private String nome;
	private List<Carta> mao;
	private boolean daVez;
	private Estoque estoque;
	private ArrayList<Estoque> pilhaDescarte;
	private boolean vencedor;
	private List<Carta> pilhaReserva;
	/**
	 * 
	 * @param id
	 * @param nome
	 */
	public Jogador() {
		// TODO Auto-generated constructor stub
	}

	public Jogador(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	/**
	 * 
	 * @param indice
	 */
	public Carta pegaCarta(int indice) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param indiceCarta
	 */
	public Carta retiraCartaMao(int indiceCarta) {
		throw new UnsupportedOperationException();
	}

	public void getIdJogador() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param carta
	 */
	public void inserirCartaNaMesa(Carta carta) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param carta
	 */
	public void descartarNoLixo(Carta carta) {
		throw new UnsupportedOperationException();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Carta> getMao() {
		return mao;
	}

	public void setMao(List<Carta> cartasMao) {
		this.mao = cartasMao;
	}

	public boolean isDaVez() {
		return daVez;
	}

	public void setDaVez(boolean daVez) {
		this.daVez = daVez;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public ArrayList<Estoque> getPilhaDescarte() {
		return pilhaDescarte;
	}

	public void setPilhaDescarte(ArrayList<Estoque> pilhaDescarte) {
		this.pilhaDescarte = pilhaDescarte;
	}

	public boolean isVencedor() {
		return vencedor;
	}

	public void setVencedor(boolean vencedor) {
		this.vencedor = vencedor;
	}

	public void iniciar(String nome) {
		daVez = false;
		vencedor = false;
		this.nome = nome;
	}

	public void habilitar() {
		daVez = true;
	}
	
	
	public void desabilitar() {
		daVez = false;
	}

	public void reiniciar() {
		daVez = false;
		vencedor = false;
	}


	public List<Carta> getPilhaReserva() {
		return this.pilhaReserva;
	}

	public void setPilhaReserva(List<Carta> pilhaReserva) {
		this.pilhaReserva = pilhaReserva;
	}

	public void removeCartaSelecionada(Carta cartaSelecionada) {
		this.getMao().remove(cartaSelecionada);
		
	}
}