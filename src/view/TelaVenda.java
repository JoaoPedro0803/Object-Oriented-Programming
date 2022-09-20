package view;

/**
 * Exibi��o da tela com a lista de Venda
 * @author Gabriel Roger e Jo�o Pedro Camargo
 * @version 1.0 (Out 2021)
 */

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controle.*;

/**
 * m�todo implementa a interpreta��o do clique nos bot�es e na lista apresentada
 * ao usu�rio
 * 
 * @author Jo�o Pedro Camargo e Gabriel Roger
 *
 */
public class TelaVenda implements ActionListener, ListSelectionListener {

	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroVenda;
	private JButton atualizaVenda;
	private static ControleDados dados;
	private JList<String> listaVendasCadastradas;
	private String[] listaCodVendas = new String[50];

	/**
	 * Lista ao usu�rio os dados cadastrados de acordo com a op��o (nesse caso s� h� a op��o venda)
	 * @param d  � a vari�vel que puxa os dados da classe ControleDados, em que foi inserido os dados pre-cadastrados
	 * @param op � a vari�vel que define qual a op��o ir� inicializar-se (nesse caso s� h� a op��o venda)
	 */

	public void mostrarDados(ControleDados d, int op) {
		dados = d;

		if (op == 1) {
			listaCodVendas = new ControleVenda(dados).getCodVenda();
			listaVendasCadastradas = new JList<String>(listaCodVendas);
			janela = new JFrame("Vendas");
			titulo = new JLabel("Vendas Cadastradas");
			cadastroVenda = new JButton("Cadastrar");
			atualizaVenda = new JButton("Atualizar");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaVendasCadastradas.setBounds(20, 50, 350, 120);
			listaVendasCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaVendasCadastradas.setVisibleRowCount(10);

			cadastroVenda.setBounds(70, 177, 100, 30);
			atualizaVenda.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaVendasCadastradas);
			janela.add(cadastroVenda);
			janela.add(atualizaVenda);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroVenda.addActionListener(this);
			atualizaVenda.addActionListener(this);
			listaVendasCadastradas.addListSelectionListener(this);
		} else {

			JOptionPane.showMessageDialog(null, "Op��o n�o encontrada!", null, JOptionPane.ERROR_MESSAGE);
		}

	}

	// Captura eventos relacionados aos bot�es da interface
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		// Cadastro de nova venda
		if (src == cadastroVenda)
			new TelaDetalheVenda().inserirEditar(1, dados, this, 0);

		// Atualiza a lista de c�digos de venda mostrada no JList
		if (src == atualizaVenda) {
			listaVendasCadastradas.setListData(new ControleVenda(dados).getCodVenda());
			listaVendasCadastradas.updateUI();
		}

	}

	// Captura eventos relacionados ao JList
	@Override
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if (e.getValueIsAdjusting() && src == listaVendasCadastradas) {
			new TelaDetalheVenda().inserirEditar(2, dados, this, listaVendasCadastradas.getSelectedIndex());
		}
	}

}
