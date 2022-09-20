package modelo;

/**
 * Declaração de atributos e criação de método construtor 
 * @author Gabriel Roger e João Pedro Camargo
 * @version 1.0 (Out 2021)
 */

public class Cliente extends Pessoa {

	private String email;
	private String numID;

//Método Construtor
	/**
	 * Método construtor para gerar os dados de cliente
	 * 
	 * @param nome     parâmetro que define o nome
	 * @param email    parâmetro que define o email
	 * @param registro parâmetro que define o cpf
	 * @param id       parâmetro que define o número da identidade
	 * @param tel      parâmetro que define o telefone
	 * @param ende     parâmetro que define o endereço
	 */

	public Cliente(String nome, String email, String registro, String id, Telefone tel, Endereco ende) {
		this.nome = nome;
		this.numID = id;
		this.cpf = registro;
		this.numTel = tel;
		this.email = email;
		this.endereco = ende;

	}
	
/**
 * Sobrecarga do método construtor
 * 
 * @param nome 	   parâmetro que define o nome
 * @param registro parâmetro que define o cpf
 * @param tel 	   parâmetro que define o telefone
 * @param email    parâmetro que define o email
 * @param end      parâmetro que define o endereço
 */
	
	public Cliente(String nome, String registro, Telefone tel, String email, Endereco end) {
		this.nome = nome;
		this.cpf = registro;
		this.numTel = tel;
		this.email = email;
		this.endereco = end;
	}

//toString() para printar para o usuário as informações do cliente

	@Override
	public String toString() {
		return "Dados do Cliente:\nNome: " + nome + "\nCPF: " + cpf + "\n" + numTel;
	}

//gets e sets

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumID() {
		return numID;
	}

	public void setNumID(String numID) {
		this.numID = numID;
	}

}