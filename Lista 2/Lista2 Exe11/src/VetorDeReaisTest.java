import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VetorDeReaisTest {

	@Test
	void testDivisaoVetoresDiferentes() {
		VetorDeReais v1 = new VetorDeReais(3);
		VetorDeReais v2 = new VetorDeReais(1);
		assertEquals(null, v1.divide(v2));
	}

	@Test
	void testDivisaoVetores() {
		// Arrange
		VetorDeReais vr1 = new VetorDeReais(3);
		vr1.setValor(2, 0);  // 2 , -1, 3.5
		vr1.setValor(-1, 1);
		vr1.setValor(3.5, 2);
		VetorDeReais vr2 = new VetorDeReais(3);
		vr2.setValor(3, 0);
		vr2.setValor(2, 1);
		vr2.setValor(1, 2);
		// Act
		VetorDeReais vr3 = vr1.divide(vr2);
		// Assert
		double[] esperado = {0.66666666, -0.5 , 3.5};
		for (int i=0; i < esperado.length; i++) {
			assertEquals(esperado[i], vr3.getValor(i),0.00001);
		}
	}
}
