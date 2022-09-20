package view;

/**
 * Exibição da tela com detalhes de Óculos de Sol/Armação/Lente
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

public class TelaDetalheProduto implements ActionListener {

	private JFrame janela;
	private JLabel labelMarca = new JLabel("Marca: ");
	private JTextField valorMarca;
	private JLabel labelCodigoProd = new JLabel("Código do Produto: ");
	private JTextField valorCodigoProd;
	private JLabel labelPreco = new JLabel("Preço: ");
	private JTextField valorPreco;
	private JLabel labelFormato = new JLabel("Formato: ");
	private JTextField valorFormato;
	private JLabel labelMaterial = new JLabel("Material: ");
	private JTextField valorMaterial;
	private JLabel labelEspec = new JLabel("Especificação: ");
	private JTextField valorEspec;
	private JLabel labelGrau = new JLabel("Grau: ");
	private JTextField valorGrau;
	private JLabel labelQtd = new JLabel("Quantidade em estoque: ");
	private JTextField valorQtd;
	private JLabel labelCorArm = new JLabel("Cor da Armação: ");
	private JTextField valorCorArm;
	private JLabel labelCorLen = new JLabel("Cor da Lente: ");
	private JTextField valorCorLen;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;

	/**
	 * Recebe os dados pré-cadastrados, declara e inicializa os botões e a frame
	 * @param op é a opção que relaciona o cadastro de óculos de sol/armação/lente e o registro de óculos de sol/armação/lente dentro do switch
	 * @param d é a variável que puxa os dados da classe ControleDados, em que foi inserido os dados pre-cadastrados
	 * @param p é a variável que, na tela produto, chama os detalhes da tela produto
	 * @param pos é a posição da array dos dados de óculos de sol/armação/lente
	 */
	
	public void inserirEditar(int op, ControleDados d, TelaProduto p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1)
			s = "Cadastro de Óculos de Sol";
		if (op == 2)
			s = "Cadastro de Lente";
		if (op == 3)
			s = "Detalhe do Óculos de Sol";
		if (op == 4)
			s = "Detalhe da Lente";
		if (op == 5)
			s = "Cadastro da Armação";
		if (op == 6)
			s = "Detalhe da Armação";

		janela = new JFrame(s);

		if (op == 3) { // Preenche dados com dados do óculos de sol clicado

			valorMarca = new JTextField(dados.getOculosSol()[pos].getMarca(), 200);
			valorCodigoProd = new JTextField(String.valueOf(dados.getOculosSol()[pos].getCodigoProd()), 200);
			valorPreco = new JTextField(String.valueOf(dados.getOculosSol()[pos].getPreco()), 200);
			valorGrau = new JTextField(200);
			valorEspec = new JTextField(200);
			valorFormato = new JTextField(dados.getOculosSol()[pos].getFormato(), 200);
			valorMaterial = new JTextField(dados.getOculosSol()[pos].getMaterial(), 200);
			valorQtd = new JTextField(String.valueOf(dados.getOculosSol()[pos].getQuantOculosSol()), 3);
			valorCorArm = new JTextField(dados.getOculosSol()[pos].getCorDaArmacao(), 200);
			valorCorLen = new JTextField(dados.getOculosSol()[pos].getCorDaLente(), 200);

		} else if (op == 4) { // Preenche dados com dados da lente clicada

			valorMarca = new JTextField(dados.getLentes()[pos].getMarca(), 200);
			valorCodigoProd = new JTextField(String.valueOf(dados.getLentes()[pos].getCodigoProd()), 200);
			valorPreco = new JTextField(String.valueOf(dados.getLentes()[pos].getPreco()), 200);
			valorFormato = new JTextField(200);
			valorMaterial = new JTextField(200);
			valorGrau = new JTextField(String.valueOf(dados.getLentes()[pos].getGrau()), 200);
			valorEspec = new JTextField(dados.getLentes()[pos].getEspecificacao(), 200);
			valorQtd = new JTextField(String.valueOf(dados.getLentes()[pos].getQuantLente()), 3);
			valorCorArm = new JTextField(200);
			valorCorLen = new JTextField(200);

		} else if (op == 6) { // Preenche dados com dados da armação clicada

			valorMarca = new JTextField(dados.getArmacoes()[pos].getMarca(), 200);
			valorCodigoProd = new JTextField(String.valueOf(dados.getArmacoes()[pos].getCodigoProd()), 200);
			valorPreco = new JTextField(String.valueOf(dados.getArmacoes()[pos].getPreco()), 200);
			valorGrau = new JTextField(200);
			valorEspec = new JTextField(200);
			valorFormato = new JTextField(dados.getArmacoes()[pos].getFormato(), 200);
			valorMaterial = new JTextField(dados.getArmacoes()[pos].getMaterial(), 200);
			valorQtd = new JTextField(String.valueOf(dados.getArmacoes()[pos].getQuantArmacao()), 3);
			valorCorArm = new JTextField(dados.getArmacoes()[pos].getCor(), 200);
			valorCorLen = new JTextField(200);

		} else { // Não preenche com dados

			valorMarca = new JTextField(200);
			valorCodigoProd = new JTextField(200);
			valorPreco = new JTextField(200);
			valorFormato = new JTextField(200);
			valorMaterial = new JTextField(200);
			valorGrau = new JTextField(200);
			valorEspec = new JTextField(200);
			valorQtd = new JTextField(3);
			valorCorArm = new JTextField(200);
			valorCorLen = new JTextField(200);

			if (op == 1 || op == 3) {
				botaoSalvar.setBounds(245, 270, 115, 30);
			} else if (op == 2 || op == 4) {
				botaoSalvar.setBounds(245, 210, 115, 30);
			} else {
				botaoSalvar.setBounds(245, 240, 115, 30);
			}
		}

		labelMarca.setBounds(30, 20, 150, 25);
		valorMarca.setBounds(180, 20, 180, 25);
		labelCodigoProd.setBounds(30, 50, 150, 25);
		valorCodigoProd.setBounds(180, 50, 180, 25);
		labelPreco.setBounds(30, 80, 150, 25);
		valorPreco.setBounds(180, 80, 180, 25);
		labelFormato.setBounds(30, 110, 150, 25);
		valorFormato.setBounds(180, 110, 180, 25);
		labelMaterial.setBounds(30, 140, 150, 25);
		valorMaterial.setBounds(180, 140, 180, 25);
		labelGrau.setBounds(30, 110, 150, 25);
		valorGrau.setBounds(180, 110, 180, 25);
		labelEspec.setBounds(30, 140, 150, 25);
		valorEspec.setBounds(180, 140, 180, 25);
		labelQtd.setBounds(30, 170, 150, 25);
		valorQtd.setBounds(180, 170, 180, 25);
		labelCorArm.setBounds(30, 200, 150, 25);
		valorCorArm.setBounds(180, 200, 180, 25);
		labelCorLen.setBounds(30, 230, 150, 25);
		valorCorLen.setBounds(180, 230, 180, 25);

		// Coloca os campos relacionados a formato, material e cores de óculos de sol
		if (op == 1 || op == 3) {
			this.janela.add(labelFormato);
			this.janela.add(valorFormato);
			this.janela.add(labelMaterial);
			this.janela.add(valorMaterial);
			this.janela.add(labelCorArm);
			this.janela.add(valorCorArm);
			this.janela.add(labelCorLen);
			this.janela.add(valorCorLen);
		}

		// Coloca os campos relacionados a formato e material e cor de armação
		if (op == 5 || op == 6) {
			this.janela.add(labelFormato);
			this.janela.add(valorFormato);
			this.janela.add(labelMaterial);
			this.janela.add(valorMaterial);
			this.janela.add(labelCorArm);
			this.janela.add(valorCorArm);
		}

		// Coloca campos relacionados a grau e especificação de lente
		if (op == 2 || op == 4) {

			this.janela.add(labelGrau);
			this.janela.add(valorGrau);
			this.janela.add(labelEspec);
			this.janela.add(valorEspec);
		}

		// Coloca botões de excluir e salvar
		if (op == 3) {
			botaoSalvar.setBounds(120, 270, 115, 30);
			botaoExcluir.setBounds(245, 270, 115, 30);
			this.janela.add(botaoExcluir);
		}
		if (op == 4) {
			botaoSalvar.setBounds(120, 210, 115, 30);
			botaoExcluir.setBounds(245, 210, 115, 30);
			this.janela.add(botaoExcluir);
		}
		if (op == 6) {
			botaoSalvar.setBounds(120, 240, 115, 30);
			botaoExcluir.setBounds(245, 240, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelMarca);
		this.janela.add(valorMarca);
		this.janela.add(labelCodigoProd);
		this.janela.add(valorCodigoProd);
		this.janela.add(labelPreco);
		this.janela.add(valorPreco);
		this.janela.add(labelQtd);
		this.janela.add(valorQtd);
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		if (op == 1 || op == 3) {
			this.janela.setSize(400, 360);
		} else if (op == 2 || op == 4) {
			this.janela.setSize(400, 300);
		} else {
			this.janela.setSize(400, 330);
		}
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
				if (opcao == 1) // cadastro de novo óculos de sol
					novoDado[0] = Integer.toString(dados.getQtdOculosSol());
				else if (opcao == 2) // cadastro de nova lente
					novoDado[0] = Integer.toString(dados.getQtdLentes());
				else if (opcao == 5) // cadastro de nova armação
					novoDado[0] = Integer.toString(dados.getQtdArmacoes());
				else // edição de dado existente
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] = valorMarca.getText();
				novoDado[3] = valorCodigoProd.getText();
				novoDado[4] = valorPreco.getText();
				novoDado[6] = valorQtd.getText();

				if (opcao == 1 || opcao == 3) {
					novoDado[2] = valorFormato.getText();
					res = dados.inserirEditarOculosSol(novoDado);
					novoDado[5] = valorMaterial.getText();
					res = dados.inserirEditarOculosSol(novoDado);
					novoDado[7] = valorCorArm.getText();
					res = dados.inserirEditarOculosSol(novoDado);
					novoDado[8] = valorCorLen.getText();
					res = dados.inserirEditarOculosSol(novoDado);

				} else if (opcao == 2 || opcao == 4) {
					novoDado[2] = valorGrau.getText();
					res = dados.inserirEditarLentes(novoDado);
					novoDado[5] = valorEspec.getText();
					res = dados.inserirEditarLentes(novoDado);
				} else {
					novoDado[2] = valorFormato.getText();
					res = dados.inserirEditarArmacoes(novoDado);
					novoDado[5] = valorMaterial.getText();
					res = dados.inserirEditarArmacoes(novoDado);
					novoDado[7] = valorCorArm.getText();
					res = dados.inserirEditarArmacoes(novoDado);
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

			if (opcao == 3) {// exclui óculos de Sol
				res = dados.removerOculosSol(posicao);
				if (res)
					mensagemSucessoExclusao();
				else
					mensagemErroExclusaoOculosSol();
			}

			if (opcao == 4) { // exclui lente
				res = dados.removerLente(posicao);
				if (res)
					mensagemSucessoExclusao();
				else
					mensagemErroExclusaoLente();
			}

			if (opcao == 6) { // exclui armação
				res = dados.removerArmacao(posicao);
				if (res)
					mensagemSucessoExclusao();
				else
					mensagemErroExclusaoArmacao();
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
						+ "2. Código, preço, quantidade ou grau não contém apenas números",
				null, JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoOculosSol() {
		JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o óculos de sol está cadastrado.\n" + "Se sim, cancele\n " + "e tente novamente.", null,
				JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoLente() {
		JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se a lente está cadastrada.\n" + "Se sim, cancele\n " + "e tente novamente.", null,
				JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoArmacao() {
		JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se a armação está cadastrada.\n" + "Se sim, cancele\n " + "e tente novamente.", null,
				JOptionPane.ERROR_MESSAGE);
	}

}