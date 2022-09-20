package view;

/**
 * Exibi��o da tela com a lista de �culos de Sol/Arma��o/Lente
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

public class TelaProduto implements ActionListener, ListSelectionListener {
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroOculosSol;
	private JButton atualizaOculosSol;
	private JButton cadastroLente;
	private JButton atualizaLente;
	private JButton cadastroArmacao;
	private JButton atualizaArmacao;
	private static ControleDados dados;
	private JList<String> listaOculosSolCadastrados;
	private JList<String> listaLentesCadastradas;
	private JList<String> listaArmacoesCadastradas;

	private String[] listaCodigos = new String[50];

	/**
	 * Lista ao usu�rio os dados cadastrados de acordo com a op��o (�culos de sol/arma��o/lente)
	 * @param d � a vari�vel que puxa os dados da classe ControleDados, em que foi inserido os dados pre-cadastrados
	 * @param op � a vari�vel que define qual a op��o ir� inicializar-se (�culos de sol/arma��o/lente)
	 */
	
	public void mostrarDados(ControleDados d, int op) {
		dados = d;

		switch (op) {
		case 1:// Mostrar dados de �culos de sol cadastrados (JList)

			listaCodigos = new ControleOculosSol(dados).getCodOculosSol();
			listaOculosSolCadastrados = new JList<String>(listaCodigos);
			janela = new JFrame("�culos de Sol");
			titulo = new JLabel("�culos de Sol Cadastrados");
			cadastroOculosSol = new JButton("Cadastrar");
			atualizaOculosSol = new JButton("Atualizar");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(70, 10, 300, 30);
			listaOculosSolCadastrados.setBounds(20, 50, 350, 120);
			listaOculosSolCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaOculosSolCadastrados.setVisibleRowCount(10);

			cadastroOculosSol.setBounds(70, 177, 100, 30);
			atualizaOculosSol.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaOculosSolCadastrados);
			janela.add(cadastroOculosSol);
			janela.add(atualizaOculosSol);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroOculosSol.addActionListener(this);
			atualizaOculosSol.addActionListener(this);
			listaOculosSolCadastrados.addListSelectionListener(this);

			break;

		case 2:// Mostrar dados de lentes cadastradas (JList)

			listaCodigos = new ControleLente(dados).getCodLente();
			listaLentesCadastradas = new JList<String>(listaCodigos);
			janela = new JFrame("Lentes");
			titulo = new JLabel("Lentes Cadastradas");
			cadastroLente = new JButton("Cadastrar");
			atualizaLente = new JButton("Atualizar");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaLentesCadastradas.setBounds(20, 50, 350, 120);
			listaLentesCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaLentesCadastradas.setVisibleRowCount(10);

			cadastroLente.setBounds(70, 177, 100, 30);
			atualizaLente.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaLentesCadastradas);
			janela.add(cadastroLente);
			janela.add(atualizaLente);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroLente.addActionListener(this);
			atualizaLente.addActionListener(this);
			listaLentesCadastradas.addListSelectionListener(this);
			break;

		case 3:// Mostrar dados de arma��es cadastradas (JList)
			listaCodigos = new ControleArmacao(dados).getCodArmacao();
			listaArmacoesCadastradas = new JList<String>(listaCodigos);
			janela = new JFrame("Arma��es");
			titulo = new JLabel("Arma��es Cadastradas");
			cadastroArmacao = new JButton("Cadastrar");
			atualizaArmacao = new JButton("Atualizar");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaArmacoesCadastradas.setBounds(20, 50, 350, 120);
			listaArmacoesCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaArmacoesCadastradas.setVisibleRowCount(10);

			cadastroArmacao.setBounds(70, 177, 100, 30);
			atualizaArmacao.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaArmacoesCadastradas);
			janela.add(cadastroArmacao);
			janela.add(atualizaArmacao);
			janela.setSize(400, 250);
			janela.setVisible(true);
			cadastroArmacao.addActionListener(this);
			atualizaArmacao.addActionListener(this);
			listaArmacoesCadastradas.addListSelectionListener(this);
			break;

		default:
			JOptionPane.showMessageDialog(null, "Op��o n�o encontrada!", null, JOptionPane.ERROR_MESSAGE);
		}

	}

	// Captura eventos relacionados aos bot�es da interface
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		// Cadastro de novo �culos de sol
		if (src == cadastroOculosSol)
			new TelaDetalheProduto().inserirEditar(1, dados, this, 0);

		// Cadastro de nova lente
		if (src == cadastroLente)
			new TelaDetalheProduto().inserirEditar(2, dados, this, 0);

		// Cadastro de nova arma��o
		if (src == cadastroArmacao)
			new TelaDetalheProduto().inserirEditar(5, dados, this, 0);

		// Atualiza a lista de c�digos de �culos de sol mostrada no JList
		if (src == atualizaOculosSol) {
			listaOculosSolCadastrados.setListData(new ControleOculosSol(dados).getCodOculosSol());
			listaOculosSolCadastrados.updateUI();
		}

		// Atualiza a lista de c�digos de lentes mostrada no JList
		if (src == atualizaLente) {
			listaLentesCadastradas.setListData(new ControleLente(dados).getCodLente());
			listaLentesCadastradas.updateUI();
		}

		// Atualiza a lista de c�digos de arma��es mostrada no JList
		if (src == atualizaArmacao) {
			listaArmacoesCadastradas.setListData(new ControleArmacao(dados).getCodArmacao());
			listaArmacoesCadastradas.updateUI();
		}

	}

	// Captura eventos relacionados ao JList
	@Override
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if (e.getValueIsAdjusting() && src == listaOculosSolCadastrados) {
			new TelaDetalheProduto().inserirEditar(3, dados, this, listaOculosSolCadastrados.getSelectedIndex());
		}

		if (e.getValueIsAdjusting() && src == listaLentesCadastradas) {
			new TelaDetalheProduto().inserirEditar(4, dados, this, listaLentesCadastradas.getSelectedIndex());
		}

		if (e.getValueIsAdjusting() && src == listaArmacoesCadastradas) {
			new TelaDetalheProduto().inserirEditar(6, dados, this, listaArmacoesCadastradas.getSelectedIndex());
		}
	}
}