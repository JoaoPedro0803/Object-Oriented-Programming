package modelo;

/**
 * Declara��o de atributos e cria��o de m�todo construtor 
 * @author Gabriel Roger e Jo�o Pedro Camargo
 * @version 1.0 (Out 2021)
 */

public class Telefone {
	private int ddd;
	private int numero;

// M�todo Construtor
	/**
	 * M�todo construtor para gerar os dados de telefone
	 * 
	 * @param ddd par�metro que define o ddd
	 * @param num par�metro que define o n�mero
	 */
	public Telefone(int ddd, int num) {

		this.ddd = ddd;
		this.numero = num;
	}

	public Telefone() {

	}

//toString() para printar para o usu�rio as informa��es do telefone	
	@Override
	public String toString() {
		return "Telefone: (" + ddd + ") " + numero;
	}

//gets e sets
	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}