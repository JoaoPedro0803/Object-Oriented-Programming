package modelo;

/**
 * Declara��o de atributos e cria��o de m�todo construtor 
 * @author Gabriel Roger e Jo�o Pedro Camargo
 * @version 1.0 (Out 2021)
 */

public class Venda {

	private String formaPag;
	private int codVenda;
	private float valorFinal;
	private int qtdVendas;

// M�todo Construtor
	/**
	 * M�todo construtor para gerar dados de venda
	 *  
	 * @param form  par�metro que define o formato
	 * @param cod   par�metro que define o c�digo da venda
	 * @param valor par�metro que define o valor da venda
	 */
	
	public Venda(String form, int cod, float valor) {

		this.formaPag = form;
		this.codVenda = cod;
		this.valorFinal = valor;
	}

//toString() para printar para o usu�rio as informa��es da venda

	@Override
	public String toString() {
		return "Venda ---> Forma de Pagamemto: " + formaPag + ", C�digo da Venda: " + codVenda + "Valor Total: "
				+ valorFinal + "//";
	}

//gets e sets

	public String getFormaPag() {
		return formaPag;
	}

	public void setFormaPag(String formaPag) {
		this.formaPag = formaPag;
	}

	public int getCodVenda() {
		return codVenda;
	}

	public void setCodVenda(int codVenda) {
		this.codVenda = codVenda;
	}

	public float getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(float valorFinal) {
		this.valorFinal = valorFinal;
	}

	public int getQtdVendas() {
		return qtdVendas;
	}

	public void setQtdVendas(int qtdVendas) {
		this.qtdVendas = qtdVendas;
	}

}
