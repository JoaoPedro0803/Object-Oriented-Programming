package view;

/**
 * Exibição da tela com detalhes de Cliente/Funcionário 
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

public class TelaDetalhePessoa implements ActionListener {

	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelSalario = new JLabel("Salário: ");
	private JTextField valorSalario;
	private JLabel labelEmail = new JLabel("Email: ");
	private JTextField valorEmail;
	private JLabel labelCPF = new JLabel("CPF: ");
	private JTextField valorCPF;
	private JLabel labelID = new JLabel("Numero da Identidade: ");
	private JTextField valorID;
	private JLabel labelCargo = new JLabel("Cargo: ");
	private JTextField valorCargo;
	private JLabel labelTelefone = new JLabel("Telefone: ");
	private JTextField valorDdd;
	private JTextField valorTelefone;
	private JLabel labelCep = new JLabel("CEP: ");
	private JLabel labelComp = new JLabel("Complemento: ");
	private JTextField valorCep;
	private JTextField valorComp;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;

	/**
	 * Recebe os dados pré-cadastrados, declara e inicializa os botões e a frame
	 * @param op é a opção que relaciona o cadastro de cliente/funcionário e o registro de cliente/funcionário dentro do switch
	 * @param d é a variável que puxa os dados da classe ControleDados, em que foi inserido os dados pre-cadastrados
	 * @param p é a variável que, na tela pessoa, chama os detalhes da tela pessoa
	 * @param pos é a posição da array dos dados de cliente/funcionário
	 */
	
	public void inserirEditar(int op, ControleDados d, TelaPessoa p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1)
			s = "Cadastro de Cliente";
		if (op == 2)
			s = "Cadastro de Funcionario";
		if (op == 3)
			s = "Detalhe de Cliente";
		if (op == 4)
			s = "Detalhe de Funcionário";

		janela = new JFrame(s);

		if (op == 3) { // Preenche dados com dados do cliente clicado
			valorNome = new JTextField(dados.getClientes()[pos].getNome(), 200);
			valorEmail = new JTextField(dados.getClientes()[pos].getEmail(), 200);
			valorSalario = new JTextField(200);
			valorCargo = new JTextField(200);
			valorCPF = new JTextField(String.valueOf(dados.getClientes()[pos].getCpf()), 200);
			valorID = new JTextField(String.valueOf(dados.getClientes()[pos].getNumID()), 200);
			valorDdd = new JTextField(String.valueOf(dados.getClientes()[pos].getNumTel().getDdd()), 3);
			valorTelefone = new JTextField(String.valueOf(dados.getClientes()[pos].getNumTel().getNumero()), 10);
			valorCep = new JTextField(String.valueOf(dados.getClientes()[pos].getEndereco().getCep()), 10);
			valorComp = new JTextField(dados.getClientes()[pos].getEndereco().getComplemento(), 200);

		} else if (op == 4) { // Preenche dados com dados do funcionário clicado

			valorNome = new JTextField(dados.getFuncionarios()[pos].getNome(), 200);
			valorSalario = new JTextField(String.valueOf(dados.getFuncionarios()[pos].getSalario()), 200);
			valorEmail = new JTextField(200);
			valorCPF = new JTextField(String.valueOf(dados.getFuncionarios()[pos].getCpf()), 200);
			valorID = new JTextField(200);
			valorCargo = new JTextField(dados.getFuncionarios()[pos].getCargo(), 200);
			valorDdd = new JTextField(String.valueOf(dados.getFuncionarios()[pos].getNumTel().getDdd()), 3);
			valorTelefone = new JTextField(String.valueOf(dados.getFuncionarios()[pos].getNumTel().getNumero()), 10);
			valorCep = new JTextField(String.valueOf(dados.getFuncionarios()[pos].getEndereco().getCep()), 10);
			valorComp = new JTextField(dados.getFuncionarios()[pos].getEndereco().getComplemento(), 200);

		} else { // Não preenche com dados

			valorNome = new JTextField(200);
			valorEmail = new JTextField(200);
			valorSalario = new JTextField(200);
			valorCPF = new JTextField(200);
			valorID = new JTextField(200);
			valorDdd = new JTextField(3);
			valorTelefone = new JTextField(10);
			valorCep = new JTextField(10);
			valorComp = new JTextField(200);
			valorCargo = new JTextField(200);

			botaoSalvar.setBounds(265, 240, 115, 30);
		}

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 200, 25);
		labelEmail.setBounds(30, 50, 150, 25);
		valorEmail.setBounds(180, 50, 200, 25);
		labelSalario.setBounds(30, 50, 150, 25);
		valorSalario.setBounds(180, 50, 200, 25);
		labelCPF.setBounds(30, 80, 150, 25);
		valorCPF.setBounds(180, 80, 200, 25);
		labelID.setBounds(30, 110, 150, 25);
		valorID.setBounds(180, 110, 200, 25);
		labelCargo.setBounds(30, 110, 150, 25);
		valorCargo.setBounds(180, 110, 200, 25);
		labelTelefone.setBounds(30, 140, 150, 25);
		valorDdd.setBounds(180, 140, 28, 25);
		valorTelefone.setBounds(210, 140, 80, 25);
		labelCep.setBounds(30, 170, 180, 25);
		valorCep.setBounds(180, 170, 200, 25);
		labelComp.setBounds(30, 200, 150, 25);
		valorComp.setBounds(180, 200, 200, 25);

		// Coloca os campos relacionados a email e identidade de cliente
		if (op == 1 || op == 3) {
			this.janela.add(labelEmail);
			this.janela.add(valorEmail);
			this.janela.add(labelID);
			this.janela.add(valorID);
		}

		// Coloca campos relacionados a salário e cargo de funcionário
		if (op == 2 || op == 4) {

			this.janela.add(labelSalario);
			this.janela.add(valorSalario);
			this.janela.add(labelCargo);
			this.janela.add(valorCargo);
		}

		// Coloca botões de excluir e salvar
		if (op == 3 || op == 4) {
			botaoSalvar.setBounds(140, 240, 115, 30);
			botaoExcluir.setBounds(265, 240, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelCPF);
		this.janela.add(valorCPF);
		this.janela.add(labelTelefone);
		this.janela.add(valorDdd);
		this.janela.add(valorTelefone);
		this.janela.add(labelCep);
		this.janela.add(valorCep);
		this.janela.add(labelComp);
		this.janela.add(valorComp);
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
				if (opcao == 1) // cadastro de novo cliente
					novoDado[0] = Integer.toString(dados.getQtdClientes());
				else if (opcao == 2) // cadastro de novo funcionário
					novoDado[0] = Integer.toString(dados.getQtdFuncs());
				else // edição de dado existente
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] = valorNome.getText();
				novoDado[3] = valorCPF.getText();
				novoDado[5] = valorDdd.getText();
				novoDado[6] = valorTelefone.getText();
				novoDado[7] = valorCep.getText();
				novoDado[8] = valorComp.getText();

				if (opcao == 1 || opcao == 3) {
					novoDado[2] = valorEmail.getText();
					res = dados.inserirEditarClientes(novoDado);
					novoDado[4] = valorID.getText();
					res = dados.inserirEditarClientes(novoDado);
				} else {
					novoDado[2] = valorSalario.getText();
					res = dados.inserirEditarFuncs(novoDado);
					novoDado[4] = valorCargo.getText();
					res = dados.inserirEditarFuncs(novoDado);
				}

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

			if (opcao == 3) {// exclui cliente
				res = dados.removerCliente(posicao);
				if (res)
					mensagemSucessoExclusao();
				else
					mensagemErroExclusaoCliente();
			}

			if (opcao == 4) { // exclui funcionário
				res = dados.removerFunc(posicao);
				if (res)
					mensagemSucessoExclusao();
				else
					mensagemErroExclusaoFunc();
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
						+ "2. CPF, CEP, DDD ou telefone não contém apenas números",
				null, JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoCliente() {
		JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o cliente está cadastrado.\n" + "Se sim, cancele\n " + "e tente novamente.", null,
				JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoFunc() {
		JOptionPane
				.showMessageDialog(null,
						"Ocorreu um erro ao excluir o dado.\n " + "Verifique se o funcionário está cadastrado.\n"
								+ "Se sim, substitua\n " + "o funcionário e tente novamente.",
						null, JOptionPane.ERROR_MESSAGE);
	}

}