package controle;

/**
 * Gera a lista de todos os clientes cadastrados
 * @author Gabriel Roger e João Pedro Camargo
 * @version 1.0 (Out 2021)
 */

import modelo.*;

public class ControleCliente {
	private Cliente[] cli;
	private int qtdClientes;

	/**
	 * Método construtor dos dados da classe Controle Cliente
	 * @param d parâmetro que puxa os dados da classe Controle de Dados
	 */
//Método Construtor
	public ControleCliente(ControleDados d) {
		cli = d.getClientes();
		qtdClientes = d.getQtdClientes();

	}

	/**
	 * Cria a lista de clientes de acordo com o nome
	 * @return s é a lista de nomes
	 */
	public String[] getNomeCliente() {
		String[] s = new String[qtdClientes];
		for (int i = 0; i < qtdClientes; i++) {
			s[i] = cli[i].getNome();
		}
		return s;
	}

	public int getQtd() {
		return qtdClientes;
	}

	public void setQtd(int qtd) {
		this.qtdClientes = qtd;
	}

	public String getNome(int i) {
		return cli[i].getNome();
	}

	public String getCpf(int i) {
		String numCpf = String.valueOf(cli[i].getCpf());
		return numCpf;
	}

	public String getID(int i) {
		String numID = String.valueOf(cli[i].getNumID());
		return numID;
	}

	public Telefone getTelefone(int i) {
		return cli[i].getNumTel();
	}

	public Endereco getEndereco(int i) {
		return cli[i].getEndereco();
	}

	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}

	public String getEmail(int i) {
		return cli[i].getEmail();
	}

}