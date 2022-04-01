
public class VetorDeReais {
	private double[] vetor;

	public VetorDeReais(int tamanho) {
		this.vetor = new double[tamanho];
	}

	// item a
	public void setValor(double valor, int pos) {
		this.vetor[pos] = valor;
	}

	// item b
	public int contarPares() {
		int cont = 0;
		for (int i = 0; i < vetor.length; i++) {
			if ((int) this.vetor[i] % 2 == 0) {
				cont++;
			}
		}
		return cont;
	}

	// item c
	public VetorDeReais divide(VetorDeReais outroVetor) {
		if (this.getTamanho() != outroVetor.getTamanho()) {
			return null;
		}

		VetorDeReais novoVetor = new VetorDeReais(this.getTamanho());
		for (int i = 0; i < this.getTamanho(); i++) {
			novoVetor.setValor(this.getValor(i) / outroVetor.getValor(i), i);
		}
		return novoVetor;
	}

	public int getTamanho() {
		return this.vetor.length;
	}

	public double getValor(int posicao) {
		return this.vetor[posicao];
	}

	// Item d
	public double getMultiplicacao(VetorDeReais outroVetor) {
		if (this.getTamanho() != outroVetor.getTamanho()) {
			return -1;
		}
		double m = 0;
		for (int i = 0; i < this.getTamanho(); i++) {
			m += this.getValor(i) * outroVetor.getValor(this.getTamanho() - i);
		}
		return m;
	}
	// Item e
	public void getInverso() {
		for (int i = 0; i < this.getTamanho(); i++) {
			this.setValor(this.getValor(this.getTamanho() -i -1), i);
		}
	}

	// Item f
	public double getMaiorDiferenca() {
		double maiorDiferenca = 0;
		double diferenca;

		for (int i = 1; i < this.vetor.length; i++) {
			diferenca = Math.abs(this.vetor[i] - this.vetor[i - 1]);
			if (maiorDiferenca < diferenca) {
				maiorDiferenca = diferenca;
			}
		}

		return maiorDiferenca;
	}
	// Exibir
	public String exibir() {
		String exibir = "[";

		for (int i = 0; i < this.vetor.length; i++) {
			exibir += this.vetor[i] + ", ";
		}
		exibir = exibir.substring(0, exibir.length() - 2);
		return exibir + "]";
	}
}
