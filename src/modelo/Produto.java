package modelo;

/**
 * Declaração de atributos que serão herdados nas classes filhas
 * @author Gabriel Roger e João Pedro Camargo
 * @version 1.0 (Out 2021)
 */

public abstract class Produto {

	protected String marca;
	protected float preco;
	protected int codigoProd;

//gets e sets

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getCodigoProd() {
		return codigoProd;
	}

	public void setCodigoProd(int codigoProd) {
		this.codigoProd = codigoProd;
	}

}
