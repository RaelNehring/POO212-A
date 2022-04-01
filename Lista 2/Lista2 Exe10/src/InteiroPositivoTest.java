import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InteiroPositivoTest {

	@Test
	void testCalculaFatorialValor10() {
		// Arrange
		InteiroPositivo f = new InteiroPositivo();
		// Action
		f.setValor(10);
		// Assert
		assertEquals(3628800, f.getFatorial());
	}

	@Test
	void testCalculaFatorialValor20() {
		// Arrange
		InteiroPositivo f = new InteiroPositivo();
		// Action
		f.setValor(20);
		// Assert
		assertEquals(2432902008176640000L, f.getFatorial());
	}

	@Test
	void testDivisoresInteiros14() {
		// Arrange
		InteiroPositivo d = new InteiroPositivo();
		// Action
		d.setValor(14);
		// Assert
		assertEquals("Divisores: 1, 2, 7, 14, totalizando 4 divisores", d.getDivisores());
	}

	@Test
	void testDivisoresInteiros18() {
		// Arrange
		InteiroPositivo d = new InteiroPositivo();
		// Action
		d.setValor(18);
		// Assert
		assertEquals("Divisores: 1, 2, 3, 6, 9, 18, totalizando 6 divisores", d.getDivisores());
	}
	
	@Test
	void testSerieFibonacci9() {
        InteiroPositivo i = new InteiroPositivo();
        i.setValor(9);
        int[] fib = i.fibonacci();
        int[] esperado = {1, 1, 2, 3, 5, 8, 13, 21, 34};
        assertArrayEquals(esperado, fib);
	}

	@Test
	void testSerieFibonacci15() {
        InteiroPositivo i = new InteiroPositivo();
        i.setValor(15);
        int[] fib = i.fibonacci();
        int[] esperado = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        assertArrayEquals(esperado, fib);
	}
}
