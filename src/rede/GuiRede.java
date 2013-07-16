package rede;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GuiRede implements ActionListener {
	private AtorRede atorRede;

	private JFrame viewFrame;

	private JPanel conectarViewPanel = new JPanel(),
			camposViewPanel = new JPanel(), botoesViewPanel = new JPanel();

	private JButton contectarButton = new JButton("Conectar"),
			cancelarButton = new JButton("Cancelar");
	private JTextField nickField = new JTextField(15),
			ipServidorField = new JTextField(15);
	private JLabel nickLabel = new JLabel("Nick"),
			ipServidorLabel = new JLabel("Ip do servidor:");

	public GuiRede(AtorRede atorRede) {
		this.atorRede = atorRede;
		this.ipServidorField.setText("venus.inf.ufsc.br");
	}


	public void createFront() {

		JFrame.setDefaultLookAndFeelDecorated(true);

		viewFrame = new JFrame("Conectar");
		viewFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		this.createPanel();

		viewFrame.add(conectarViewPanel);

		viewFrame.pack();
		//viewFrame.setLocationRelativeTo(null);
		viewFrame.setBounds(600, 362, 400, 130);
		//viewFrame.setSize(400, 130);
		viewFrame.setVisible(true);

	}

	public void createPanel() {
		// Insere os elementos de campos e labels no painel de campos
		camposViewPanel.setLayout(new GridLayout(2, 2, 2, 2));

		camposViewPanel.add(nickLabel);
		camposViewPanel.add(nickField);

		camposViewPanel.add(ipServidorLabel);
		camposViewPanel.add(ipServidorField);

		// Define os listeners dos bot�es
		contectarButton.addActionListener(this);
		cancelarButton.addActionListener(this);

		// Insere os elementos de bot�es no painel de bot�es
		botoesViewPanel.add(contectarButton);
		botoesViewPanel.add(cancelarButton);

		conectarViewPanel.add(camposViewPanel);
		conectarViewPanel.add(botoesViewPanel);
	}
	
	public void actionPerformed(ActionEvent e) {

		Object o = e.getSource();

		if (o != null && o instanceof JButton) {

			JButton item = (JButton) o;

			if (item == this.contectarButton) {
				this.conectar();
			}
			if (item == this.cancelarButton) {
				this.cancelar();
			}

		}

	}

	/**
	 * Retorna para a tela principal
	 */
	private void cancelar() {
		viewFrame.setVisible(false);
		viewFrame.dispose();
	}

	/**
	 * Tenta se conectar com o servidor Caso consigua emite uma mensagem de
	 * afirma��o e retorna para a tela principal Do contrario emite uma mensagem
	 * de erro e continua na mesma tela
	 */
	 
	private void conectar() {

		String nome = nickField.getText();
		String ipServidor = ipServidorField.getText();

		// valida��es
		if (nome.equals("")) {
			JOptionPane.showMessageDialog(this.viewFrame,
					"Voc� deve escolher um nome de usu�rio", "Erro",
					JOptionPane.ERROR_MESSAGE, null);

			return;
		}
		atorRede.conectar(nome, ipServidor);
		// fecha a janela
		this.cancelar();

	}

}
