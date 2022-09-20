package modelo;

/**
 * Declaração de atributos e criação de método construtor 
 * @author Gabriel Roger e João Pedro Camargo
 * @version 1.0 (Out 2021)
 */

public class OculosDeSol extends Produto {

	private String formato;
	private String material;
	private String corDaLente;
	private String corDaArmacao;
	private int quantOculosSol;

//Método Construtor
	/**
	 * Método construtor para gerar os dados de óculos de sol
	 * 
	 * @param marca    parâmetro que define a marca
	 * @param cod      parâmetro que define o código do produto
	 * @param preco    parâmetro que define o preço
	 * @param form     parâmetro que define o formato
	 * @param material parâmetro que define o material
	 * @param qtd      parâmetro que define a quantidade em estoque
	 */

	public OculosDeSol(String marca, int cod, float preco, String form, String material, int qtd) {
		this.marca = marca;
		this.preco = preco;
		this.codigoProd = cod;
		this.formato = form;
		this.material = material;
		this.quantOculosSol = qtd;
	}
	
	/**
	 * Sobrecarga do método construtor
	 * 
	 * @param marca    parâmetro que define a marca
	 * @param cod      parâmetro que define o código do produto
	 * @param preco    parâmetro que define o preço
	 * @param form     parâmetro que define o formato
	 * @param material parâmetro que define o material
	 * @param corA     parâmetro que define a cor da armação
	 * @param corL     parâmetro que define a cor da lente
	 * @param qtd      parâmetro que define a quantidade em estoque
	 */

	public OculosDeSol(String marca, int cod, float preco, String form, String material, String corA, String corL,
			int qtd) {
		this.marca = marca;
		this.preco = preco;
		this.codigoProd = cod;
		this.formato = form;
		this.material = material;
		this.corDaArmacao = corA;
		this.corDaLente = corL;
		this.quantOculosSol = qtd;
	}

	// toString() para printar para o usuário as informações dos óculos de sol

	@Override
	public String toString() {
		return "Óculos de Sol { Marca: " + marca + ", preco: " + preco + ", codigo do produto: " + codigoProd
				+ ", formato: " + formato + ", material=" + material + ", cor da lente: " + corDaLente
				+ ", cor da armação: " + corDaArmacao + "}";
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

	public String getCorDaLente() {
		return corDaLente;
	}

	public void setCorDaLente(String corDaLente) {
		this.corDaLente = corDaLente;
	}

	public String getCorDaArmacao() {
		return corDaArmacao;
	}

	public void setCorDaArmacao(String corDaArmacao) {
		this.corDaArmacao = corDaArmacao;
	}

	public int getQuantOculosSol() {
		return quantOculosSol;
	}

	public void setQuantOculosSol(int quantOculosSol) {
		this.quantOculosSol = quantOculosSol;
	}

}