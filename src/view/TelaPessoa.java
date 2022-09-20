package view;

/**
 * Exibi��o da tela com a lista de Cliente/Funcion�rio 
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

public class TelaPessoa implements ActionListener, ListSelectionListener {
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroCliente;
	private JButton atualizaCliente;
	private JButton cadastroFunc;
	private JButton atualizaFunc;
	private static ControleDados dados;
	private JList<String> listaClientesCadastrados;
	private JList<String> listaFuncsCadastrados;
	private String[] listaNomes = new String[50];

	/**
	 * Lista ao usu�rio os dados cadastrados de acordo com a op��o (cliente/funcion�rio)
	 * @param d � a vari�vel que puxa os dados da classe ControleDados, em que foi inserido os dados pre-cadastrados
	 * @param op � a vari�vel que define qual a op��o ir� inicializar-se (cliente/funcion�rio)
	 */
	
	public void mostrarDados(ControleDados d, int op) {
		dados = d;

		switch (op) {
		case 1:// Mostrar dados de clientes cadastrados (JList)
			listaNomes = new ControleCliente(dados).getNomeCliente();
			listaClientesCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Clientes");
			titulo = new JLabel("Clientes Cadastrados");
			cadastroCliente = new JButton("Cadastrar");
			atualizaCliente = new JButton("Atualizar");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaClientesCadastrados.setBounds(20, 50, 350, 120);
			listaClientesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaClientesCadastrados.setVisibleRowCount(10);

			cadastroCliente.setBounds(70, 177, 100, 30);
			atualizaCliente.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaClientesCadastrados);
			janela.add(cadastroCliente);
			janela.add(atualizaCliente);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroCliente.addActionListener(this);
			atualizaCliente.addActionListener(this);
			listaClientesCadastrados.addListSelectionListener(this);

			break;

		case 2:// Mostrar dados de funcion�rios cadastrados (JList)
			listaNomes = new ControleFuncionario(dados).getNomeFunc();
			listaFuncsCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Funcion�rios");
			titulo = new JLabel("Funcion�rios Cadastrados");
			cadastroFunc = new JButton("Cadastrar");
			atualizaFunc = new JButton("Atualizar");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaFuncsCadastrados.setBounds(20, 50, 350, 120);
			listaFuncsCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaFuncsCadastrados.setVisibleRowCount(10);

			cadastroFunc.setBounds(70, 177, 100, 30);
			atualizaFunc.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaFuncsCadastrados);
			janela.add(cadastroFunc);
			janela.add(atualizaFunc);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroFunc.addActionListener(this);
			atualizaFunc.addActionListener(this);
			listaFuncsCadastrados.addListSelectionListener(this);
			break;

		default:
			JOptionPane.showMessageDialog(null, "Op��o n�o encontrada!", null, JOptionPane.ERROR_MESSAGE);
		}

	}

	// Captura eventos relacionados aos bot�es da interface
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		// Cadastro de novo cliente
		if (src == cadastroCliente)
			new TelaDetalhePessoa().inserirEditar(1, dados, this, 0);

		// Cadastro de novo funcion�rio
		if (src == cadastroFunc)
			new TelaDetalhePessoa().inserirEditar(2, dados, this, 0);

		// Atualiza a lista de nomes de clientes mostrada no JList
		if (src == atualizaCliente) {
			listaClientesCadastrados.setListData(new ControleCliente(dados).getNomeCliente());
			listaClientesCadastrados.updateUI();
		}

		// Atualiza a lista de nomes de funcion�rios mostrada no JList
		if (src == atualizaFunc) {
			listaFuncsCadastrados.setListData(new ControleFuncionario(dados).getNomeFunc());
			listaFuncsCadastrados.updateUI();
		}

	}

	// Captura eventos relacionados ao JList
	@Override
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if (e.getValueIsAdjusting() && src == listaClientesCadastrados) {
			new TelaDetalhePessoa().inserirEditar(3, dados, this, listaClientesCadastrados.getSelectedIndex());
		}

		if (e.getValueIsAdjusting() && src == listaFuncsCadastrados) {
			new TelaDetalhePessoa().inserirEditar(4, dados, this, listaFuncsCadastrados.getSelectedIndex());
		}
	}

}