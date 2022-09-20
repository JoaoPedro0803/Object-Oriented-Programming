package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controle.ControleTeste;

/**
 * Representa o teste unitário da ControleTeste
 * @author Gabriel Roger e João Pedro Camargo
 * @version 1.0 (Out 2021)
 */

class Testando {
	ControleTeste ct = new ControleTeste();

	@Test
	void testeValidaEmail() {
		assertFalse(ct.validaEmail("joao12233gmail.com"));
		assertFalse(ct.validaEmail("@materiaOO@gmail.com"));
		assertFalse(ct.validaEmail(""));
		assertFalse(ct.validaEmail("2121212121"));
		assertTrue(ct.validaEmail("matheus@gmail.com"));
	}

	@Test
	void testeValidaCpf() {
		assertTrue(ct.validaCpf("060.545.665-56"));
		assertFalse(ct.validaCpf("11111"));
		assertFalse(ct.validaCpf("123456789012"));
		assertFalse(ct.validaCpf("080.797.77-77"));
		assertFalse(ct.validaCpf("080.797.779-779"));
		assertFalse(ct.validaCpf("11111111111"));

	}

	@Test
	void testeValidaSalario() {
		assertFalse(ct.validaSalario("3400"));
		assertFalse(ct.validaSalario("30000.1"));
		assertFalse(ct.validaSalario("22a"));
		assertFalse(ct.validaSalario("3700,1"));
	}
	
	

}
