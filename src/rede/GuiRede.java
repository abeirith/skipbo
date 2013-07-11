package rede;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GuiRede implements ActionListener {
	private AtorRede jogo;

	private JFrame viewFrame;

	private JPanel conectarViewPanel = new JPanel(),
			camposViewPanel = new JPanel(), botoesViewPanel = new JPanel();

	private JButton contectarButton = new JButton("Conectar"),
			cancelarButton = new JButton("Cancelar");
	private JTextField nickField = new JTextField(15),
			ipServidorField = new JTextField(15);
	private JLabel nickLabel = new JLabel("Nick"),
			ipServidorLabel = new JLabel("Ip do servidor:");

	public GuiRede(AtorRede jogo) {
		this.jogo = jogo;
		this.ipServidorField.setText("venus.inf.ufsc.br");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void createFront() {

		JFrame.setDefaultLookAndFeelDecorated(true);

		viewFrame = new JFrame("Conectar");
		viewFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		this.createPanel();

		viewFrame.add(conectarViewPanel);

		viewFrame.pack();
		viewFrame.setSize(400, 130);
		viewFrame.setVisible(true);

	}

	public void createPanel() {
		// Insere os elementos de campos e labels no painel de campos
		camposViewPanel.setLayout(new GridLayout(2, 2, 2, 2));

		camposViewPanel.add(nickLabel);
		camposViewPanel.add(nickField);

		camposViewPanel.add(ipServidorLabel);
		camposViewPanel.add(ipServidorField);

		// Define os listeners dos botões
		contectarButton.addActionListener(this);
		cancelarButton.addActionListener(this);

		// Insere os elementos de botões no painel de botões
		botoesViewPanel.add(contectarButton);
		botoesViewPanel.add(cancelarButton);

		conectarViewPanel.add(camposViewPanel);
		conectarViewPanel.add(botoesViewPanel);
	}

}
