import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContribuinteTest {
	@Test
	void testSetUfSC() {
		// Arrange
		Contribuinte c = new Contribuinte("Pedro", "123", "PR", 500);
		// Action
		c.setUf("SC");
		// Assert
		assertEquals("SC", c.getUf());
	}

	@Test
	void testSetUfPR() {
		// Arrange
		Contribuinte c = new Contribuinte("Pedro", "123", "SC", 500);
		// Action
		c.setUf("PR");
		// Assert
		assertEquals("PR", c.getUf());
	}

	@Test
	void testSetUfRS() {
		// Arrange
		Contribuinte c = new Contribuinte("Pedro", "123", "PR", 500);
		// Action
		c.setUf("RS");
		// Assert
		assertEquals("RS", c.getUf());
	}

	@Test
	void testSetUfSP() {
		// Arrange
		Contribuinte c = new Contribuinte("Pedro", "123", "PR", 500);
		// Action
		c.setUf("SP");
		// Assert
		assertEquals("PR", c.getUf());
	}

	@Test
	void testSetUfRJ() {
		// Arrange
		Contribuinte c = new Contribuinte("Pedro", "123", "PR", 500);
		// Action
		c.setUf("RJ");
		// Assert
		assertEquals("PR", c.getUf());
	}

	@Test
	void testSetRendaAnual() {
		// Arrange
		Contribuinte c = new Contribuinte("Pedro", "123", "SC", 500);
		// Action
		c.setRendaAnual(-818.50);
		// Arrange
		assertEquals(500, c.getRendaAnual());
	}

	@Test
	void testCalcularImposto3000() {
		// Arrange
		Contribuinte c = new Contribuinte("João", "123", "SC", 3000);
		// Action
		double imposto = c.calcularImposto();
		// Assert
		assertEquals(0.0, imposto);
	}

	@Test
	void testCalcularImposto9000() {
		// Arrange
		Contribuinte c = new Contribuinte("João", "123", "SC", 9000);
		// Action
		double imposto = c.calcularImposto();
		// Assert
		assertEquals(522.0, imposto);
	}

	@Test
	void testCalcularImposto10000() {
		// Arrange
		Contribuinte c = new Contribuinte("João", "123", "SC", 10000);
		// Action
		double imposto = c.calcularImposto();
		// Assert
		assertEquals(1500, imposto);
	}

	@Test
	void testCalcularImposto34911v73() {
		// Arrange
		Contribuinte c = new Contribuinte("João", "123", "SC", 34911.73);
		// Action
		double imposto = c.calcularImposto();
		// Assert
		assertEquals(9600.72, imposto, 0.009);
	}

}
