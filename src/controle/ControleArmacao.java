package controle;

/**
 * Gera a lista de todas as arma��es cadastradas
 * @author Gabriel Roger e Jo�o Pedro Camargo
 * @version 1.0 (Out 2021)
 */

import modelo.*;

/**
 * Declara o m�todo construtor e os atributos: array do produto arma��o e a
 * quantidade de arma��es em estoque.
 * 
 * @author Jo�o Pedro Camargo e Gabriel Roger
 * @version 1.0 (Out 2021)
 */
public class ControleArmacao {
	private Armacao[] arm;
	private int qtdArmacoes;

//M�todo Construtor
	/**
	 * M�todo construtor dos dados da classe Controle Arma��o 
	 * @param d par�metro que puxa os dados da classe Controle de Dados
	 */
	public ControleArmacao(ControleDados d) {
		arm = d.getArmacoes();
		qtdArmacoes = d.getQtdArmacoes();
	}

	/**
	 * Cria a lista de arma��es de acordo com o c�digo
	 * @return s que � a lista de c�digos
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
