package view;

/**
 * Exibição da tela do menu principal 
 * @author Gabriel Roger e João Pedro Camargo
 * @version 1.0 (Out 2021)
 */

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controle.ControleDados;

public class TelaMenu implements ActionListener {

	private static JFrame janela = new JFrame("Óticas Joger's");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton cliente = new JButton("Cliente");
	private static JButton funcionario = new JButton("Funcionário");
	private static JButton venda = new JButton("Venda");
	private static JButton oculosSol = new JButton("Óculos de Sol");
	private static JButton lente = new JButton("Lente");
	private static JButton armacao = new JButton("Armação");
	public static ControleDados dados = new ControleDados();

	/**
	 * Declara e inicializa os botões e frame e exibe a tela principal ao usuário
	 */

	public TelaMenu() {

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 150, 30);
		cliente.setBounds(130, 50, 120, 30);
		funcionario.setBounds(130, 100, 120, 30);
		venda.setBounds(130, 300, 120, 30);
		oculosSol.setBounds(130, 250, 120, 30);
		lente.setBounds(130, 200, 120, 30);
		armacao.setBounds(130, 150, 120, 30);

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(cliente);
		janela.add(funcionario);
		janela.add(venda);
		janela.add(oculosSol);
		janela.add(lente);
		janela.add(armacao);

		janela.setSize(400, 400);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}

	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu(); // chamada do construtor

		cliente.addActionListener(menu);
		funcionario.addActionListener(menu);
		venda.addActionListener(menu);
		oculosSol.addActionListener(menu);
		lente.addActionListener(menu);
		armacao.addActionListener(menu);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == cliente)
			new TelaPessoa().mostrarDados(dados, 1); // trocar a nova tela que será mostrada

		if (src == funcionario)
			new TelaPessoa().mostrarDados(dados, 2); // trocar a nova tela que será mostrada

		if (src == venda)
			new TelaVenda().mostrarDados(dados, 1); // trocar a nova tela que será mostrada

		if (src == oculosSol)
			new TelaProduto().mostrarDados(dados, 1); // trocar a nova tela que será mostrada

		if (src == lente)
			new TelaProduto().mostrarDados(dados, 2); // trocar a nova tela que será mostrada

		if (src == armacao)
			new TelaProduto().mostrarDados(dados, 3); // trocar a nova tela que será mostrada
	}

}
