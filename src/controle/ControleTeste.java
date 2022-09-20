package controle;

/**
 * Verifica se os dados fornecidos est�o no formato esperado
 * 
 * @author Gabriel Roger e Jo�o Pedro Camargo
 * @version 1.0 (Out 2021)
 */

public class ControleTeste {

	/**
	 * Verifica se o email est� no formato esperado. S�o feitas quatro verifica��es:
	 * (1) se o email passado � uma string vazia 
	 * (2) se o email passado � composto apenas por n�meros 
	 * (3) se o email passado cont�m "@" 
	 * (4) se o email passado inicia-se com "@"
	 * @param email uma string que cont�m o email a ser verificadp
	 * @return verdadeiro ou falso, verificando se o email � ou n�o v�lido, respectivamente
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
	 * Verifica se o cpf est� no formato esperado. S�o feitas duas verifica��es: 
	 * (1) se o cpf passado � composto apenas por n�meros 
	 * (2) se o cpf passado, quando composto apenas por n�meros, cont�m 11 d�gitos
	 * (3) se o cpf passado cont�m "." e "-" 
	 * (4) se o cpf passado, quando composto por "." e "-", cont�m 14 d�gitos 
	 * (5) se o cpf cont�m todos os d�gitos iguais
	 * 
	 * @param cpf uma string que cont�m o cpf a ser verificadp
	 * @return verdadeiro ou falso, verificando se o cpf � ou n�o v�lido, espectivamente
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
	 * Verifica se o cpf est� no formato esperado. S�o feitas cinco verifica��es:
	 * (1) se o sal�rio passado � composto apenas por n�meros ou cont�m o "." 
	 * (2) se o sal�rio passado � maior que 3500 ou menor que 30000
	 * 
	 * @param salario uma string que cont�m o sal�rio a ser verificado
	 * @return verdadeiro ou falso, verificando se o sal�rio � ou n�o v�lido, respectivamente
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
