package controle;

/**
 * Gera a lista de todas as vendas cadastradas
 * @author Gabriel Roger e Jo�o Pedro Camargo
 * @version 1.0 (Out 2021)
 */

import modelo.*;

public class ControleVenda {
	private Venda[] venda;
	private int qtdVendas;

//M�todo Construtor
	public ControleVenda(ControleDados d) {
		venda = d.getVendas();
		qtdVendas = d.getQtdVendas();
	}

	/**
	 * Cria a lista de vendas de acordo com o c�digo
	 * @return s que � a lista de c�digos
	 */
	
	public String[] getCodVenda() {
		String[] s = new String[qtdVendas];
		for (int i = 0; i < qtdVendas; i++) {

			s[i] = "" + venda[i].getCodVenda();
		}

		return s;
	}

	public int getQtd() {
		return qtdVendas;
	}

	public void setQtd(int qtd) {
		this.qtdVendas = qtd;
	}

	public String getFormaPag(int i) {
		return venda[i].getFormaPag();
	}

	public int getCodVenda(int i) {
		return venda[i].getCodVenda();
	}

	public float getValorFinal(int i) {
		return venda[i].getValorFinal();
	}

	public float getQtdVendas(int i) {
		return venda[i].getQtdVendas();
	}

	public void setQtdVendas(int qtdVendas) {
		this.qtdVendas = qtdVendas;
	}
}