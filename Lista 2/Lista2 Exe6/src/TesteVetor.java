
public class TesteVetor {
	public static void main(String[] args) {
		VetorDeReais vetor1 = new VetorDeReais(3);
		vetor1.setValor(2, 0);
		vetor1.setValor(-1, 1);
		vetor1.setValor(3.5, 2);
		System.out.println(vetor1.exibir());
		vetor1.getInverso();
		System.out.println(vetor1.exibir());

	}
}
