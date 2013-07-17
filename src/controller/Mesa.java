package controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.ufsc.inf.leobr.cliente.Jogada;

import model.Carta;
import model.Estoque;
import model.Jogador;

public class Mesa implements Jogada {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Estoque> base;
	private boolean mesaHabilitada;
	private AtorJogador ajogador;
	private Monte monte ;
	private Jogador jogadorLocal;
	private Jogador jogadorRemoto;
	private Jogador jogadorDaVez;


	protected boolean partidaEmAndamento;

	public Mesa() {
		monte = new Monte();
	}

	public Jogador getJogadorDaVez() {
		return jogadorDaVez;
	}
	private void alternarVez(boolean haVencedor, boolean remetenteServidor) {
		if (haVencedor) {
			getJogadorLocal().desabilitar();
			getJogadorRemoto().desabilitar();
		} else if (remetenteServidor) {
			getJogadorLocal().habilitar();
			getJogadorRemoto().desabilitar();
			setJogadorDaVez(getJogadorLocal());
		} else {
			getJogadorLocal().desabilitar();
			getJogadorRemoto().habilitar();
			setJogadorDaVez(getJogadorRemoto());
		}
	}


	public void darAsCartas() {
			daAsCartasJogadorLocal();
			daAsCartasJogadorRemoto();
	}

	private void daAsCartasJogadorRemoto() {
		List<Integer> cartasSorteadasMaoRemoto;
		List<Integer> cartasSorteadasReservaRemoto;
		List<Carta> cartasMaoRemoto = new ArrayList<>();
		cartasSorteadasMaoRemoto = sorteiaCartasMao(5);
		Carta cartaMaoRemoto = null;
		for (Integer numeroCarta : cartasSorteadasMaoRemoto) {
			cartaMaoRemoto = new Carta(numeroCarta);
			cartasMaoRemoto.add(cartaMaoRemoto);
		}
		getJogadorRemoto().setMao(cartasMaoRemoto);
		List<Carta> pilhaReservaRemoto = new ArrayList<>();
		cartasSorteadasReservaRemoto = sorteiaCartasReserva();
		Carta cartaReservaRemoto = null;
		for (Integer numeroCarta : cartasSorteadasReservaRemoto) {
			cartaReservaRemoto = new Carta(numeroCarta);
			pilhaReservaRemoto.add(cartaReservaRemoto);
		}
		getJogadorRemoto().setPilhaReserva(pilhaReservaRemoto);
	}

	private void daAsCartasJogadorLocal() {
		List<Integer> cartasSorteadasMaoLocal;
		List<Integer> cartasSorteadasReservaLocal;
		List<Carta> cartasMaoLocal = new ArrayList<>();
		cartasSorteadasMaoLocal = sorteiaCartasMao(5);
		Carta cartaMaoLocal = null;
		for (Integer numeroCarta : cartasSorteadasMaoLocal) {
			cartaMaoLocal = new Carta(numeroCarta);
			cartasMaoLocal.add(cartaMaoLocal);
		}
		getJogadorLocal().setMao(cartasMaoLocal);
		List<Carta> pilhaReservaLocal = new ArrayList<>();
		cartasSorteadasReservaLocal = sorteiaCartasReserva();
		Carta cartaReservaLocal = null;
		for (Integer numeroCarta : cartasSorteadasReservaLocal) {
			cartaReservaLocal = new Carta(numeroCarta);
			pilhaReservaLocal.add(cartaReservaLocal);
		}
		getJogadorLocal().setPilhaReserva(pilhaReservaLocal);
	}

	private List<Integer> sorteiaCartasReserva() {
		List<Integer> cartasSorteadasReserva = new ArrayList<>();
		Integer numero = null;
		;
		for (int i = 0; i < 5; i++) {
			numero = (int) (0 + (Math.random() * 13)); // sorteia numeros entre
														// 0 e 12 ( 0 é a
														// skipBo)
			cartasSorteadasReserva.add(numero);
		}

		return cartasSorteadasReserva;
	}

	private List<Integer> sorteiaCartasMao(int qtCartasSortear) {
		List<Integer> cartasSorteadasMao = new ArrayList<>();
		Integer numero = null;
		;
		for (int i = 0; i < qtCartasSortear; i++) {
			numero = (int) (0 + (Math.random() * 13)); // sorteia numeros entre
														// 0 e 12(0 é a skipBo)
			cartasSorteadasMao.add(numero);
		}
		return cartasSorteadasMao;
	}

	public void criarJogador(String nome) {
		if ((getJogadorLocal() != null) && (getJogadorRemoto() != null)) {
			setJogadorRemoto(null);
			setJogadorLocal(new Jogador());
			getJogadorLocal().iniciar(nome);
		} else {
			if (getJogadorLocal() == null) {
				setJogadorLocal(new Jogador());
				getJogadorLocal().iniciar(nome);
			} else {
				setJogadorRemoto(new Jogador());
				getJogadorRemoto().iniciar(nome);
			}

		}

	}

	public boolean tratarInsercaoNaMesa(Carta cartaSelecionada,
			int baseSelecionada, boolean remetenteServidor) {
		boolean ok = false;
		if (cartaSelecionada.getNumero() == 0) {
			cartaSelecionada.setCoringa(true);
		}

		switch (baseSelecionada) {
		case 1:
			ok = validaLance(cartaSelecionada, ok, getMonte().getCartasBase1(),
					remetenteServidor);
			break;
		case 2:
			ok = validaLance(cartaSelecionada, ok, getMonte().getCartasBase2(),
					remetenteServidor);
			break;
		case 3:
			ok = validaLance(cartaSelecionada, ok, getMonte().getCartasBase3(),
					remetenteServidor);
			break;
		case 4:
			ok = validaLance(cartaSelecionada, ok, getMonte().getCartasBase4(),
					remetenteServidor);
			break;
		default:
			break;
		}
		return ok;
	}

	public void insereNoDescarte(Carta cartaSelecionada,
			int descarteSelecionado, boolean remetenteServidor) {

		switch (descarteSelecionado) {
		case 1:
			getJogadorDaVez().getEstoque().getPilhaDescarte1().add(cartaSelecionada);
			//alternarVez(verificarVencedor(remetenteServidor), remetenteServidor);
			break;
		case 2:
			getJogadorDaVez().getEstoque().getPilhaDescarte2().add(cartaSelecionada);
			//alternarVez(verificarVencedor(remetenteServidor), remetenteServidor);
			break;
		case 3:
			getJogadorDaVez().getEstoque().getPilhaDescarte3().add(cartaSelecionada);
			//alternarVez(verificarVencedor(remetenteServidor), remetenteServidor);
			break;
		case 4:
			getJogadorDaVez().getEstoque().getPilhaDescarte4().add(cartaSelecionada);
			//alternarVez(verificarVencedor(remetenteServidor), remetenteServidor);
			break;
		default:
			break;
		}

	}

	private boolean verificarVencedor(boolean remetenteServidor) {
		List<Carta> pilhaReserva;
		boolean retorno = false;
		if (remetenteServidor) {
			pilhaReserva = getJogadorRemoto().getPilhaReserva();
		} else {
			pilhaReserva = getJogadorLocal().getPilhaReserva();
		}
		if (pilhaReserva.isEmpty()) {
			terminarPartidaEmAndamento();
			retorno = true;
		}
		if (retorno) {
			if (remetenteServidor) {
				getJogadorRemoto().setVencedor(true);
			} else {
				getJogadorLocal().setVencedor(true);
			}
		}
		return retorno;
	}

	private boolean validaLance(Carta cartaSelecionada, boolean ok,
			List<Carta> cartasBase, boolean remetenteServidor) {
		if (cartasBase == null || cartasBase.isEmpty()) {
			if (cartaSelecionadEhUmOuSkipBo(cartaSelecionada)) {
				cartasBase.add(cartaSelecionada);
				cartaSelecionada = null;
				ok = true;
			} else {
				printJogadaInvalida();
			}
		} else {
			if (cartaSelecionada.isCoringa()) {
				cartasBase.add(cartaSelecionada);
				cartaBaseChegouADoze(cartasBase);
				ok = true;
				cartaSelecionada = null;
			} else if (cartasBase.get(cartasBase.size() - 1).isCoringa()) {
				cartasBase.add(cartaSelecionada);
				cartaBaseChegouADoze(cartasBase);
				ok = true;
				cartaSelecionada = null;

			} else if (cartaSelecionada.getNumero() == cartasBase.get(
					cartasBase.size() - 1).getNumero() + 1) {
				cartasBase.add(cartaSelecionada);
				cartaBaseChegouADoze(cartasBase);
				ok = true;
				cartaSelecionada = null;

			} else {
				printJogadaInvalida();
			}
		}
		return ok;
	}

	private void printJogadaInvalida() {
		JOptionPane
				.showMessageDialog(null,
						" Jogada inválida");
	}

	private void cartaBaseChegouADoze(List<Carta> cartasBase) {
		if (cartasBase.size() == 12) {
			// completou a base;
			cartasBase.clear();
		}
	}

	private boolean cartaSelecionadEhUmOuSkipBo(Carta cartaSelecionada) {
		return cartaSelecionada.getNumero() == 1
				|| cartaSelecionada.isCoringa();
	}


	public ArrayList<Estoque> getBase() {
		return base;
	}

	public void setBase(ArrayList<Estoque> base) {
		this.base = base;
	}

	public boolean isMesaHabilitada() {
		return mesaHabilitada;
	}

	public void setMesaHabilitada(boolean mesaHabilitada) {
		this.mesaHabilitada = mesaHabilitada;
	}

	public AtorJogador getAjogador() {
		return ajogador;
	}

	public void setAjogador(AtorJogador ajogador) {
		this.ajogador = ajogador;
	}

	public boolean informarPartidaEmAndamento() {
		return partidaEmAndamento;
	}

	public void definirOPrimeiro(int primeiro) {
		partidaEmAndamento = true;
		getJogadorLocal().reiniciar();
		getJogadorRemoto().reiniciar();
		if (primeiro == 1) {
			getJogadorLocal().habilitar();
			setJogadorDaVez(getJogadorLocal());
		} else {
			getJogadorRemoto().habilitar();
			setJogadorDaVez(getJogadorRemoto());
		}

	}
	public void iniciar() {
		darAsCartas();
	}

	public void terminarPartidaEmAndamento() {
		partidaEmAndamento = false;
	}

	public Jogador getJogadorLocal() {
		return jogadorLocal;
	}

	public void setJogadorLocal(Jogador jogadorLocal) {
		this.jogadorLocal = jogadorLocal;
	}

	public Jogador getJogadorRemoto() {
		return jogadorRemoto;
	}

	public void setJogadorRemoto(Jogador jogadorRemoto) {
		this.jogadorRemoto = jogadorRemoto;
	}


	public List<Carta> verificaNecessidadeDeCartas(List<Carta> mao) {
		int tamanhoMao = mao.size();
		List<Integer> cartasSorteadasMaoLocal =null;
		Carta cartaMaoLocal = null;

		switch (tamanhoMao) {
		case 0:
			cartasSorteadasMaoLocal = sorteiaCartasMao(5);
			break;
		case 1:
			cartasSorteadasMaoLocal = sorteiaCartasMao(4);
			break;
		case 2:
			cartasSorteadasMaoLocal = sorteiaCartasMao(3);
			break;
		case 3:
			cartasSorteadasMaoLocal = sorteiaCartasMao(2);
			break;
		case 4:
			cartasSorteadasMaoLocal = sorteiaCartasMao(1);
			break;
		default:
			break;
		}
		if (tamanhoMao !=5) {
			for (Integer numeroCarta : cartasSorteadasMaoLocal) {
				cartaMaoLocal = new Carta(numeroCarta);
					jogadorDaVez.getMao().add(cartaMaoLocal);
			}
			return jogadorDaVez.getMao();
		}
		return null;
	}

	public void setJogadorDaVez(Jogador jogadorDaVez) {
		this.jogadorDaVez = jogadorDaVez;
	}

	public Monte getMonte() {
		return monte;
	}

	public void setMonte(Monte monte) {
		this.monte = monte;
	}

	public boolean verificaSeCartaNaoVeioDaReserva(Carta cartaSelecionada) {
		if(cartaSelecionada.isEhDaReserva()){
			printJogadaInvalida();
			return false;
		}
		return true;
	}
}