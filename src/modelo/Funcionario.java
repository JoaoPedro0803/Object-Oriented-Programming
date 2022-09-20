package modelo;

/**
 * Declara��o de atributos e cria��o de m�todo construtor 
 * @author Gabriel Roger e Jo�o Pedro Camargo
 * @version 1.0 (Out 2021)
 */

public class Funcionario extends Pessoa {

	private String salario;
	private String cargo;

//M�todo Construtor
	/**
	 * M�todo construtor para gerar os dados de funcion�rio
	 * 
	 * @param nome    par�metro que define o nome
	 * @param salario par�metro que define o salario
	 * @param cpf     par�metro que define o cpf
	 * @param tel     par�metro que define o telefone
	 */

	public Funcionario(String nome, String salario, String cpf, Telefone tel) {
		this.nome = nome;
		this.salario = salario;
		this.cpf = cpf;
		this.numTel = tel;

	}
	
	/**
	 * Sobrecarga do m�todo construtor
	 * 
	 * @param nome    par�metro que define o nome
	 * @param salario par�metro que define o sal�rio
	 * @param cpf     par�metro que define o cpf
	 * @param end     par�metro que define o endere�o
	 * @param tel     par�metro que define o telefone
	 */

	public Funcionario(String nome, String salario, String cpf, Endereco end, Telefone tel) {
		this.nome = nome;
		this.salario = salario;
		this.cpf = cpf;
		this.endereco = end;
		this.numTel = tel;

	}
	
/**
 * Sobrecarga do m�todo construtor
 * 
 * @param nome    par�metro que define o nome
 * @param salario par�metro que define o sal�rio
 * @param cpf     par�metro que define o cpf
 * @param cargo   par�metro que define o cargo
 * @param tel     par�metro que define o telefone
 * @param end     par�metro que define o endere�o
 */

	public Funcionario(String nome, String salario, String cpf, String cargo, Telefone tel, Endereco end) {
		this.nome = nome;
		this.salario = salario;
		this.cpf = cpf;
		this.cargo = cargo;
		this.numTel = tel;
		this.endereco = end;

	}

//toString() para printar para o usu�rio as informa��es do funcion�rio

	@Override
	public String toString() {
		return "Dados do funcion�rio:Nome: " + this.nome + ", Cargo: " + cargo + ", Telefone: " + numTel;
	}

//gets e sets

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}