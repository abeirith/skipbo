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
		viewFrame.setLocationRelativeTo(null);
		viewFrame.setSize(400, 130);
		viewFrame.setVisible(true);

	}

	public void createPanel() {
		camposViewPanel.setLayout(new GridLayout(2, 2, 2, 2));

		camposViewPanel.add(nickLabel);
		camposViewPanel.add(nickField);

		camposViewPanel.add(ipServidorLabel);
		camposViewPanel.add(ipServidorField);

		contectarButton.addActionListener(this);
		cancelarButton.addActionListener(this);

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

	private void cancelar() {
		viewFrame.setVisible(false);
		viewFrame.dispose();
	}

	private void conectar() {

		String nome = nickField.getText();
		String ipServidor = ipServidorField.getText();

		// validações
		if (nome.equals("")) {
			JOptionPane.showMessageDialog(this.viewFrame,
					"Você deve escolher um nome de usuário", "Erro",
					JOptionPane.ERROR_MESSAGE, null);

			return;
		}
		atorRede.conectar(nome, ipServidor);
		// fecha a janela
		this.cancelar();

	}

}
