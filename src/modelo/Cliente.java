package modelo;

/**
 * Declara��o de atributos e cria��o de m�todo construtor 
 * @author Gabriel Roger e Jo�o Pedro Camargo
 * @version 1.0 (Out 2021)
 */

public class Cliente extends Pessoa {

	private String email;
	private String numID;

//M�todo Construtor
	/**
	 * M�todo construtor para gerar os dados de cliente
	 * 
	 * @param nome     par�metro que define o nome
	 * @param email    par�metro que define o email
	 * @param registro par�metro que define o cpf
	 * @param id       par�metro que define o n�mero da identidade
	 * @param tel      par�metro que define o telefone
	 * @param ende     par�metro que define o endere�o
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
 * Sobrecarga do m�todo construtor
 * 
 * @param nome 	   par�metro que define o nome
 * @param registro par�metro que define o cpf
 * @param tel 	   par�metro que define o telefone
 * @param email    par�metro que define o email
 * @param end      par�metro que define o endere�o
 */
	
	public Cliente(String nome, String registro, Telefone tel, String email, Endereco end) {
		this.nome = nome;
		this.cpf = registro;
		this.numTel = tel;
		this.email = email;
		this.endereco = end;
	}

//toString() para printar para o usu�rio as informa��es do cliente

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