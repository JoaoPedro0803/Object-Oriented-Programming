package modelo;

/**
 * Declaração de atributos e criação de método construtor 
 * @author Gabriel Roger e João Pedro Camargo
 * @version 1.0 (Out 2021)
 */

public class Funcionario extends Pessoa {

	private String salario;
	private String cargo;

//Método Construtor
	/**
	 * Método construtor para gerar os dados de funcionário
	 * 
	 * @param nome    parâmetro que define o nome
	 * @param salario parâmetro que define o salario
	 * @param cpf     parâmetro que define o cpf
	 * @param tel     parâmetro que define o telefone
	 */

	public Funcionario(String nome, String salario, String cpf, Telefone tel) {
		this.nome = nome;
		this.salario = salario;
		this.cpf = cpf;
		this.numTel = tel;

	}
	
	/**
	 * Sobrecarga do método construtor
	 * 
	 * @param nome    parâmetro que define o nome
	 * @param salario parâmetro que define o salário
	 * @param cpf     parâmetro que define o cpf
	 * @param end     parâmetro que define o endereço
	 * @param tel     parâmetro que define o telefone
	 */

	public Funcionario(String nome, String salario, String cpf, Endereco end, Telefone tel) {
		this.nome = nome;
		this.salario = salario;
		this.cpf = cpf;
		this.endereco = end;
		this.numTel = tel;

	}
	
/**
 * Sobrecarga do método construtor
 * 
 * @param nome    parâmetro que define o nome
 * @param salario parâmetro que define o salário
 * @param cpf     parâmetro que define o cpf
 * @param cargo   parâmetro que define o cargo
 * @param tel     parâmetro que define o telefone
 * @param end     parâmetro que define o endereço
 */

	public Funcionario(String nome, String salario, String cpf, String cargo, Telefone tel, Endereco end) {
		this.nome = nome;
		this.salario = salario;
		this.cpf = cpf;
		this.cargo = cargo;
		this.numTel = tel;
		this.endereco = end;

	}

//toString() para printar para o usuário as informações do funcionário

	@Override
	public String toString() {
		return "Dados do funcionário:Nome: " + this.nome + ", Cargo: " + cargo + ", Telefone: " + numTel;
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