package controle;

/**
 * Gera a lista de todas as lentes cadastradas
 * @author Gabriel Roger e Jo�o Pedro Camargo
 * @version 1.0 (Out 2021)
 */

import modelo.*;

public class ControleLente {
	private Lente[] len;
	private int qtdLentes;

//M�todo Construtor
	public ControleLente(ControleDados d) {
		len = d.getLentes();
		qtdLentes = d.getQtdLentes();
	}

	/**
	 * Cria a lista de lentes de acordo com o c�digo
	 * @return s que � a lista de c�digos
	 */
	
	public String[] getCodLente() {
		String[] s = new String[qtdLentes];
		for (int i = 0; i < qtdLentes; i++) {

			s[i] = "" + len[i].getCodigoProd();
		}

		return s;
	}

	public int getQtd() {
		return qtdLentes;
	}

	public void setQtd(int qtd) {
		this.qtdLentes = qtd;
	}

	public int getCodigoProd(int i) {
		return len[i].getCodigoProd();
	}

	public String getMarca(int i) {
		return len[i].getMarca();
	}

	public String getGrau(int i) {
		String grau = String.valueOf(len[i].getGrau());
		return grau;
	}

	public float getPreco(int i) {
		return len[i].getPreco();
	}

	public void setQtdLentes(int qtdLentes) {
		this.qtdLentes = qtdLentes;
	}

	public String getEspecificacao(int i) {
		return len[i].getEspecificacao();
	}

	public int getQuantLentes(int i) {
		return len[i].getQuantLente();
	}
}
