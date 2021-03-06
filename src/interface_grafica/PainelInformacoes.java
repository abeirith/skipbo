package interface_grafica;

import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class PainelInformacoes extends JDialog {
	
	private static final long serialVersionUID = 1L;

	private JLabel imagem;
	private JLabel lb1;
	private JLabel lb2;
	private JLabel lb3;
	private JLabel lb4;
	private JLabel lb5;
	private JLabel lb6;
	
	public PainelInformacoes(){
		setLayout(null);
		
		Icon ufsc = new ImageIcon(getClass().getResource("/view/view.imagens/ufsc.png"));
		imagem = new JLabel();
		imagem.setBounds(new Rectangle(25, 10, 83, 118));
		imagem.setIcon(ufsc);
		
		lb1 = new JLabel("An�lise e Projeto de Sistemas");
		lb1.setBounds(new Rectangle(150,10,200,25));
		
		lb2 = new JLabel("SkipBo");
		lb2.setBounds(new Rectangle(150,40,200,25));
		
		lb3 = new JLabel("Autores: Fellipe Bratti");
		lb3.setBounds(new Rectangle(150,70,200,25));
		
		lb4 = new JLabel("Marcos Dem�trio");
		lb4.setBounds(new Rectangle(201,85,200,25));
		
		lb5 = new JLabel("Alexandre Beirith");
		lb5.setBounds(new Rectangle(201,100,200,25));
		lb6 = new JLabel("Turma 2013/1");
		lb6.setBounds(new Rectangle(150,122,200,25));
		
		add(imagem);
		add(lb1);
		add(lb2);
		add(lb3);
		add(lb4);
		add(lb5);
		add(lb6);
		setLocationRelativeTo(null);
		setTitle("Info. equipe");
		setPreferredSize(new Dimension(400,200));
	}
}
