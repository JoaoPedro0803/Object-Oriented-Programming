package controle;

/**
 * Gera a lista de todos os �culos de sol cadastrados
 * @author Gabriel Roger e Jo�o Pedro Camargo
 * @version 1.0 (Out 2021)
 */

import modelo.*;

public class ControleOculosSol {
	private OculosDeSol[] oc;
	private int qtdOculosSol;

//M�todo Construtor
	public ControleOculosSol(ControleDados d) {
		oc = d.getOculosSol();
		qtdOculosSol = d.getQtdOculosSol();
	}

	/**
	 * Cria a lista de �culos de sol de acordo com o c�digo
	 * @return s que � a lista de c�digos
	 */
	
	public String[] getCodOculosSol() {
		String[] s = new String[qtdOculosSol];
		for (int i = 0; i < qtdOculosSol; i++) {

			s[i] = "" + oc[i].getCodigoProd();
		}

		return s;
	}

	public int getQtd() {
		return qtdOculosSol;
	}

	public void setQtd(int qtd) {
		this.qtdOculosSol = qtd;
	}

	public int getCodigoProd(int i) {
		return oc[i].getCodigoProd();
	}

	public String getMarca(int i) {
		return oc[i].getMarca();
	}

	public String getCorArm(int i) {
		return oc[i].getCorDaArmacao();
	}

	public String getCorLen(int i) {
		return oc[i].getCorDaLente();
	}

	public String getFormato(int i) {
		return oc[i].getFormato();
	}

	public float getPreco(int i) {
		return oc[i].getPreco();
	}

	public void setQtdOculosSol(int qtdOculosSol) {
		this.qtdOculosSol = qtdOculosSol;
	}

	public String getMaterial(int i) {
		return oc[i].getMaterial();
	}

	public int getQuantOculosSol(int i) {
		return oc[i].getQuantOculosSol();
	}
}