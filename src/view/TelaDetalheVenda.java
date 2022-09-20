package view;

/**
 * Exibição da tela com detalhes de Venda
 * @author Gabriel Roger e João Pedro Camargo
 * @version 1.0 (Out 2021)
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controle.ControleDados;

public class TelaDetalheVenda implements ActionListener {

	private JFrame janela;
	private JLabel labelFormaPag = new JLabel("Forma de Pagamento: ");
	private JTextField valorFormaPag;
	private JLabel labelCodVenda = new JLabel("Código da Venda: ");
	private JTextField valorCodVenda;
	private JLabel labelValorFinal = new JLabel("Valor Final: ");
	private JTextField valorValorFinal;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;

	/**
	 * Recebe os dados pré-cadastrados, declara e inicializa os botões e a frame
	 * @param op é a opção que relaciona o cadastro de venda e o registro de venda dentro do switch
	 * @param d é a variável que puxa os dados da classe ControleDados, em que foi inserido os dados pre-cadastrados
	 * @param p é a variável que, na tela venda, chama os detalhes da tela venda 
	 * @param pos é a posição da array dos dados da venda
	 */
	
	public void inserirEditar(int op, ControleDados d, TelaVenda p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1)
			s = "Cadastro de Venda";
		if (op == 2)
			s = "Registro de Venda";

		janela = new JFrame(s);

		if (op == 2) { // Preenche dados com dados da venda clicada

			valorFormaPag = new JTextField(dados.getVendas()[pos].getFormaPag(), 200);
			valorCodVenda = new JTextField(String.valueOf(dados.getVendas()[pos].getCodVenda()), 200);
			valorValorFinal = new JTextField(String.valueOf(dados.getVendas()[pos].getValorFinal()), 200);

		} else { // Não preenche com dados

			valorFormaPag = new JTextField(200);
			valorCodVenda = new JTextField(200);
			valorValorFinal = new JTextField(200);

			botaoSalvar.setBounds(265, 240, 115, 30);
		}

		labelFormaPag.setBounds(30, 20, 150, 25);
		valorFormaPag.setBounds(180, 20, 200, 25);
		labelCodVenda.setBounds(30, 50, 150, 25);
		valorCodVenda.setBounds(180, 50, 200, 25);
		labelValorFinal.setBounds(30, 80, 150, 25);
		valorValorFinal.setBounds(180, 80, 200, 25);

		// Coloca botões de excluir e salvar
		if (op == 2) {
			botaoSalvar.setBounds(140, 240, 115, 30);
			botaoExcluir.setBounds(265, 240, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelFormaPag);
		this.janela.add(valorFormaPag);
		this.janela.add(labelCodVenda);
		this.janela.add(valorCodVenda);
		this.janela.add(labelValorFinal);
		this.janela.add(valorValorFinal);
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(450, 330);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == botaoSalvar) {
			try {
				boolean res;
				if (opcao == 1) // cadastro de nova venda
					novoDado[0] = Integer.toString(dados.getQtdVendas());
				else // edição de dado existente
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] = valorFormaPag.getText();
				novoDado[2] = valorCodVenda.getText();
				novoDado[3] = valorValorFinal.getText();

				res = dados.inserirEditarVendas(novoDado);

				if (res) {
					mensagemSucessoCadastro();
				} else
					mensagemErroCadastro();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}

		if (src == botaoExcluir) {
			boolean res = false;

			if (opcao == 2) {// exclui venda
				res = dados.removerVenda(posicao);
				if (res)
					mensagemSucessoExclusao();
				else
					mensagemErroExclusaoCliente();
			}

		}
	}

	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,
				"ERRO AO SALVAR OS DADOS!\n " + "Pode ter ocorrido um dos dois erros a seguir:  \n"
						+ "1. Nem todos os campos foram preenchidos \n"
						+ "2. Código da venda ou valor final não contém apenas números",
				null, JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoCliente() {
		JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se a venda está cadastrada.\n" + "Se sim, cancele\n " + "e tente novamente.", null,
				JOptionPane.ERROR_MESSAGE);
	}
}
