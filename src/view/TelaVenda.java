package view;

/**
 * Exibição da tela com a lista de Venda
 * @author Gabriel Roger e João Pedro Camargo
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
 * método implementa a interpretação do clique nos botões e na lista apresentada
 * ao usuário
 * 
 * @author João Pedro Camargo e Gabriel Roger
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
	 * Lista ao usuário os dados cadastrados de acordo com a opção (nesse caso só há a opção venda)
	 * @param d  é a variável que puxa os dados da classe ControleDados, em que foi inserido os dados pre-cadastrados
	 * @param op é a variável que define qual a opção irá inicializar-se (nesse caso só há a opção venda)
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

			JOptionPane.showMessageDialog(null, "Opção não encontrada!", null, JOptionPane.ERROR_MESSAGE);
		}

	}

	// Captura eventos relacionados aos botões da interface
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		// Cadastro de nova venda
		if (src == cadastroVenda)
			new TelaDetalheVenda().inserirEditar(1, dados, this, 0);

		// Atualiza a lista de códigos de venda mostrada no JList
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
