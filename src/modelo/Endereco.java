package modelo;

/**
 * Declara��o de atributos e cria��o de m�todo construtor 
 * @author Gabriel Roger e Jo�o Pedro Camargo
 * @version 1.0 (Out 2021)
 */

public class Endereco {

	private int cep;
	private String complemento;

	// M�todo Construtor
/**
 * M�todo construtor para gerar os dados de endere�o
 * @param c    par�metro que define o cep
 * @param comp par�metro que define o complemento
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