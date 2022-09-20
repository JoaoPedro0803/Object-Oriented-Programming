package modelo;

/**
 * Declaração de atributos e criação de método construtor 
 * @author Gabriel Roger e João Pedro Camargo
 * @version 1.0 (Out 2021)
 */

public class Telefone {
	private int ddd;
	private int numero;

// Método Construtor
	/**
	 * Método construtor para gerar os dados de telefone
	 * 
	 * @param ddd parâmetro que define o ddd
	 * @param num parâmetro que define o número
	 */
	public Telefone(int ddd, int num) {

		this.ddd = ddd;
		this.numero = num;
	}

	public Telefone() {

	}

//toString() para printar para o usuário as informações do telefone	
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