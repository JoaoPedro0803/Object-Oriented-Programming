package controle;

/**
 * Gera a lista de todos os funcion�rios cadastrados
 * @author Gabriel Roger e Jo�o Pedro Camargo
 * @version 1.0 (Out 2021)
 */

import modelo.*;

public class ControleFuncionario {
	private Funcionario[] func;
	private int qtdFuncs;
	
//M�todo Construtor
	public ControleFuncionario(ControleDados d) {
		this.func = d.getFuncionarios();
		this.qtdFuncs = d.getQtdFuncs();
	}

	/**
	 * Cria a lista de funcion�rios de acordo com o nome
	 * @return s que � a lista de nomes
	 */
	
	public String[] getNomeFunc() {
		String[] s = new String[qtdFuncs];
		for (int i = 0; i < qtdFuncs; i++) {
			s[i] = func[i].getNome();
		}

		return s;
	}

	public int getQtd() {
		return qtdFuncs;
	}

	public void setQtd(int qtd) {
		this.qtdFuncs = qtd;
	}

	public String getNome(int i) {
		return func[i].getNome();
	}

	public String getCpf(int i) {
		String numCpf = String.valueOf(func[i].getCpf());
		return numCpf;
	}

	public String getCargo(int i) {
		return func[i].getCargo();
	}

	public Telefone getNumTel(int i) {
		return func[i].getNumTel();
	}

	public Endereco getEndereco(int i) {
		return func[i].getEndereco();
	}

	public void setQtdFuncs(int qtdFuncs) {
		this.qtdFuncs = qtdFuncs;
	}

	public String getSalario(int i) {
		return func[i].getSalario();
	}
}