package controle;

/**
 * Gera a lista de todas as armações cadastradas
 * @author Gabriel Roger e João Pedro Camargo
 * @version 1.0 (Out 2021)
 */

import modelo.*;

/**
 * Declara o método construtor e os atributos: array do produto armação e a
 * quantidade de armações em estoque.
 * 
 * @author João Pedro Camargo e Gabriel Roger
 * @version 1.0 (Out 2021)
 */
public class ControleArmacao {
	private Armacao[] arm;
	private int qtdArmacoes;

//Método Construtor
	/**
	 * Método construtor dos dados da classe Controle Armação 
	 * @param d parâmetro que puxa os dados da classe Controle de Dados
	 */
	public ControleArmacao(ControleDados d) {
		arm = d.getArmacoes();
		qtdArmacoes = d.getQtdArmacoes();
	}

	/**
	 * Cria a lista de armações de acordo com o código
	 * @return s que é a lista de códigos
	 */

	public String[] getCodArmacao() {
		String[] s = new String[qtdArmacoes];
		for (int i = 0; i < qtdArmacoes; i++) {

			s[i] = "" + arm[i].getCodigoProd();
		}

		return s;
	}

	public int getQtd() {
		return qtdArmacoes;
	}

	public void setQtd(int qtd) {
		this.qtdArmacoes = qtd;
	}

	public int getCodigoProd(int i) {
		return arm[i].getCodigoProd();
	}

	public String getMarca(int i) {
		return arm[i].getMarca();
	}

	public String getFormato(int i) {
		return arm[i].getFormato();
	}

	public float getPreco(int i) {
		return arm[i].getPreco();
	}

	public String getCor(int i) {
		return arm[i].getCor();
	}

	public void setQtdArmacoes(int qtdArmacoes) {
		this.qtdArmacoes = qtdArmacoes;
	}

	public String getMaterial(int i) {
		return arm[i].getMaterial();
	}

	public int getQuantArmacoes(int i) {
		return arm[i].getQuantArmacao();
	}
}
