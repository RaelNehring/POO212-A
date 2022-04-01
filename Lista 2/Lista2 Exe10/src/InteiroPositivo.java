public class InteiroPositivo {
	private int x;

	public void setValor(int x) {
		if (x >= 0) {
			this.x = x;
		}
	}

	public int getValor() {
		return this.x;
	}

	public int getValorMultiplicado(InteiroPositivo inteiroPositivo) {
		return this.getValor() * inteiroPositivo.getValor();
	}

	public long getFatorial() {
		if (this.getValor() == 0) {
			return 1;
		}
		long fatorial = this.getValor();
		for (int cont = 1; cont < this.getValor(); cont++) {
			fatorial *= cont;
		}
		return fatorial;
	}

	public String getDivisores() {
		int qtdeDivisores = 0;
		String listaDivisores = "";
		for (int i = 1; i <= this.getValor(); i++) {
			if (this.getValor() % i == 0) {
				listaDivisores += i + ", ";
				qtdeDivisores++;
			}
		}
		return "Divisores: " + listaDivisores + "totalizando " + qtdeDivisores + " divisores";
	}

	public int[] fibonacci() {
		int[] fibonacci = new int[this.getValor()];
		if (this.getValor() != 0) {
			int anterior = 0;
			int atual = 1;
			fibonacci[0] = 1;
			for (int cont = 1; cont < this.getValor(); cont++) {
				fibonacci[cont] = anterior + atual;
				anterior = atual;
				atual = fibonacci[cont];
			}
		}
		return fibonacci;
	}

	public double valorH() {
		double valorH = 0;
		for (double cont = 1; cont <= this.getValor(); cont++) {
			valorH += 1 / cont;
		}
		return valorH;
	}

	public double valorI() {
		double valorI = 0;
		double sub = 0;
		for (double numerador = 1; numerador <= this.getValor(); numerador++) {
			if (numerador == 1) {
				valorI += (this.getValor() - sub) / numerador;
			} else {
				valorI -= (this.getValor() - sub) / numerador;
			}
			sub++;
		}
		return valorI;
	}

	public double valorP() {
		double valorP = 0;
		int numerador = 0;
		int denominador = 0;
		long fatorial;
		for (int a = 1; a <= this.getValor(); a++) {
			denominador += 1;
			numerador += 2;
			fatorial = numerador;
			for (int i = 1; i < numerador; i++) {
				fatorial *= i;
			}
			if (denominador % 2 == 0 || denominador == 1) {
				valorP += fatorial / denominador;
			} else {
				valorP -= fatorial / denominador;
			}

		}
		return valorP;
	}
}
