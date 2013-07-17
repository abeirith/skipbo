package dominio_do_problema;

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
	private boolean vencedor;
	private List<Carta> pilhaReserva;
	private Estoque estoque = new Estoque();



	public Jogador() {
		estoque= new Estoque();
	
	}

	public Jogador(int id, String nome) {
		this.id = id;
		this.nome = nome;
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
			this.getEstoque().getPilhaDescarte1().remove(cartaSelecionada);
			return 1;
		}else if(cartaSelecionada.isEhDoDescarte2()){
			this.getEstoque().getPilhaDescarte2().remove(cartaSelecionada);
			return 2;
		}else if(cartaSelecionada.isEhDoDescarte3()){
			this.getEstoque().getPilhaDescarte3().remove(cartaSelecionada);
			return 3;
		}else if(cartaSelecionada.isEhDoDescarte4()){
			this.getEstoque().getPilhaDescarte4().remove(cartaSelecionada);
			return 4;
		}else{
			this.getMao().remove(cartaSelecionada);
			return 5;
		}
	}
}