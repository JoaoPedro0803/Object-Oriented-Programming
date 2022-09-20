package modelo;

/**
 * Declaração de atributos e criação de método construtor
 * 
 * @author Gabriel Roger e João Pedro Camargo
 * @version 1.0 (Out 2021)
 */

public class Armacao extends Produto {

	private String formato;
	private String material;
	private String cor;
	private int quantArmacao;

//Método Construtor
	/**
	 * Método construtor para gerar os dados de armação
	 * 
	 * @param marca    parâmetro que define a marca
	 * @param cod      parâmetro que define o código do produto
	 * @param preco    parâmetro que define o preço
	 * @param form     parâmetro que define o formato
	 * @param material parâmetro que define o material
	 * @param qtd      parâmetro que define a quantidade em estoque
	 */
	
	public Armacao(String marca, int cod, float preco, String form, String material, int qtd) {
		this.marca = marca;
		this.preco = preco;
		this.codigoProd = cod;
		this.formato = form;
		this.material = material;
		this.quantArmacao = qtd;
	}

	/**
	 * Sobrecarga do método construtor
	 * 
	 * @param marca    parâmetro que define a marca
	 * @param cod      parâmetro que define o código do produto
	 * @param preco    parâmetro que define o preço
	 * @param form     parâmetro que define o formato
	 * @param material parâmetro que define o material
	 * @param cor      parâmetro que define a cor
	 * @param qtd      parâmetro que define a quantidade em estoque
	 */
	
	public Armacao(String marca, int cod, float preco, String form, String material, String cor, int qtd) {
		this.marca = marca;
		this.preco = preco;
		this.codigoProd = cod;
		this.formato = form;
		this.material = material;
		this.cor = cor;
		this.quantArmacao = qtd;
	}

//toString() para printar para o usuário as informações das armações

	@Override
	public String toString() {
		return "Armação { Marca: " + marca + ", Preço: " + preco + ", Código do produto: " + codigoProd + ", Formato: "
				+ formato + ", Material: " + material + ", Cor: " + cor + ", Quantidade em Estoque: " + quantArmacao
				+ "}";
	}

//gets e sets

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQuantArmacao() {
		return quantArmacao;
	}

	public void setQuantArmacao(int quantArmacao) {
		this.quantArmacao = quantArmacao;
	}

}