package controle;

/**
 * Verifica se os dados fornecidos estão no formato esperado
 * 
 * @author Gabriel Roger e João Pedro Camargo
 * @version 1.0 (Out 2021)
 */

public class ControleTeste {

	/**
	 * Verifica se o email está no formato esperado. São feitas quatro verificações:
	 * (1) se o email passado é uma string vazia 
	 * (2) se o email passado é composto apenas por números 
	 * (3) se o email passado contém "@" 
	 * (4) se o email passado inicia-se com "@"
	 * @param email uma string que contém o email a ser verificadp
	 * @return verdadeiro ou falso, verificando se o email é ou não válido, respectivamente
	 */
	public boolean validaEmail(String email) {

		boolean aux = true;

		if (email.isEmpty())
			aux = false;
		if (email.matches("[0-9]+"))
			aux = false;
		if (!email.contains("@"))
			aux = false;
		if (email.startsWith("@"))
			aux = false;

		return aux;

	}

	/**
	 * Verifica se o cpf está no formato esperado. São feitas duas verificações: 
	 * (1) se o cpf passado é composto apenas por números 
	 * (2) se o cpf passado, quando composto apenas por números, contém 11 dígitos
	 * (3) se o cpf passado contém "." e "-" 
	 * (4) se o cpf passado, quando composto por "." e "-", contém 14 dígitos 
	 * (5) se o cpf contém todos os dígitos iguais
	 * 
	 * @param cpf uma string que contém o cpf a ser verificadp
	 * @return verdadeiro ou falso, verificando se o cpf é ou não válido, espectivamente
	 */
	public boolean validaCpf(String cpf) {

		boolean aux = true;
		if (cpf.matches("[0-9]+")) {
			if (cpf.length() != 11)
				aux = false;
		} else if (cpf.contains("-") && cpf.contains(".")) {
			if (cpf.length() != 14)
				aux = false;
		} else {
			aux = false;
		}
		if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222")
				|| cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555")
				|| cpf.equals("66666666666") || cpf.equals("77777777777") || cpf.equals("88888888888")
				|| cpf.equals("99999999999")) {
			aux = false;
		}

		return aux;
	}

	/**
	 * Verifica se o cpf está no formato esperado. São feitas cinco verificações:
	 * (1) se o salário passado é composto apenas por números ou contém o "." 
	 * (2) se o salário passado é maior que 3500 ou menor que 30000
	 * 
	 * @param salario uma string que contém o salário a ser verificado
	 * @return verdadeiro ou falso, verificando se o salário é ou não válido, respectivamente
	 */
	public boolean validaSalario(String salario) {
		boolean aux = true;
		salario = "a";
		float f;

		if (salario.matches("[0-9]+") || salario.contains(".")) {
			f = Float.parseFloat(salario);

			if (f < 3500f || f > 30000f)
				aux = false;
		} else {
			aux = false;
		}
		return aux;
	}
}
