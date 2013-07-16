package model;

import java.util.ArrayList;
import java.util.List;

import br.ufsc.inf.leobr.cliente.Jogada;

public class Jogador implements Jogada {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nome;
	private List<Carta> mao;
	private boolean daVez;
	private Estoque estoque;
	private boolean vencedor;
	private List<Carta> pilhaReserva;
	private List<Carta> pilhaDescarte1;
	private List<Carta> pilhaDescarte2;
	private List<Carta> pilhaDescarte3;
	private List<Carta> pilhaDescarte4;
	

	
	public Jogador() {
		pilhaDescarte1= new ArrayList<>();
		pilhaDescarte2= new ArrayList<>();
		pilhaDescarte3= new ArrayList<>();
		pilhaDescarte4= new ArrayList<>();
	}

	public Jogador(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public List<Carta> getPilhaDescarte1() {
		return pilhaDescarte1;
	}

	public void setPilhaDescarte1(List<Carta> pilhaDescarte1) {
		this.pilhaDescarte1 = pilhaDescarte1;
	}

	public List<Carta> getPilhaDescarte2() {
		return pilhaDescarte2;
	}

	public void setPilhaDescarte2(List<Carta> pilhaDescarte2) {
		this.pilhaDescarte2 = pilhaDescarte2;
	}

	public List<Carta> getPilhaDescarte3() {
		return pilhaDescarte3;
	}

	public void setPilhaDescarte3(List<Carta> pilhaDescarte3) {
		this.pilhaDescarte3 = pilhaDescarte3;
	}

	public List<Carta> getPilhaDescarte4() {
		return pilhaDescarte4;
	}

	public void setPilhaDescarte4(List<Carta> pilhaDescarte4) {
		this.pilhaDescarte4 = pilhaDescarte4;
	}

	
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
	public void setMao(List<Carta> cartasMao){
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

	public int removeCartaSelecionada(Carta cartaSelecionada) {
		if (cartaSelecionada.isEhDaReserva()) {
			this.getPilhaReserva().remove(cartaSelecionada);
			return 0;
		}else if(cartaSelecionada.isEhDoDescarte1()){
			this.getPilhaDescarte1().remove(cartaSelecionada);
			return 1;
		}else if(cartaSelecionada.isEhDoDescarte2()){
			this.getPilhaDescarte2().remove(cartaSelecionada);
			return 2;
		}else if(cartaSelecionada.isEhDoDescarte3()){
			this.getPilhaDescarte3().remove(cartaSelecionada);
			return 3;
		}else if(cartaSelecionada.isEhDoDescarte4()){
			this.getPilhaDescarte4().remove(cartaSelecionada);
			return 4;
		}else{
			this.getMao().remove(cartaSelecionada);
			return 5;
		}
	}
}