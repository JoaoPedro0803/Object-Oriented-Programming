package modelo;

/**
 * Declara��o de atributos e cria��o de m�todo construtor 
 * @author Gabriel Roger e Jo�o Pedro Camargo
 * @version 1.0 (Out 2021)
 */

public class OculosDeSol extends Produto {

	private String formato;
	private String material;
	private String corDaLente;
	private String corDaArmacao;
	private int quantOculosSol;

//M�todo Construtor
	/**
	 * M�todo construtor para gerar os dados de �culos de sol
	 * 
	 * @param marca    par�metro que define a marca
	 * @param cod      par�metro que define o c�digo do produto
	 * @param preco    par�metro que define o pre�o
	 * @param form     par�metro que define o formato
	 * @param material par�metro que define o material
	 * @param qtd      par�metro que define a quantidade em estoque
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
	 * Sobrecarga do m�todo construtor
	 * 
	 * @param marca    par�metro que define a marca
	 * @param cod      par�metro que define o c�digo do produto
	 * @param preco    par�metro que define o pre�o
	 * @param form     par�metro que define o formato
	 * @param material par�metro que define o material
	 * @param corA     par�metro que define a cor da arma��o
	 * @param corL     par�metro que define a cor da lente
	 * @param qtd      par�metro que define a quantidade em estoque
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

	// toString() para printar para o usu�rio as informa��es dos �culos de sol

	@Override
	public String toString() {
		return "�culos de Sol { Marca: " + marca + ", preco: " + preco + ", codigo do produto: " + codigoProd
				+ ", formato: " + formato + ", material=" + material + ", cor da lente: " + corDaLente
				+ ", cor da arma��o: " + corDaArmacao + "}";
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