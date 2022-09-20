package modelo;

/**
 * Declaração de atributos e criação de método construtor 
 * @author Gabriel Roger e João Pedro Camargo
 * @version 1.0 (Out 2021)
 */

public class Endereco {

	private int cep;
	private String complemento;

	// Método Construtor
/**
 * Método construtor para gerar os dados de endereço
 * @param c    parâmetro que define o cep
 * @param comp parâmetro que define o complemento
 */
	
	public Endereco(int c, String comp) {
		this.cep = c;
		this.complemento = comp;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}