public class PassageirosHora {
	private int[][][] matriz = new int[12][30][24]; // 12 mêses -30 dias - 24 horas

	// a
	public void adiciona(int mes, int dia, int horas) {
		this.matriz[mes - 1][dia - 1][horas]++;
	}

	// b
	public int quantosPassageiros(int mes, int dia) {
		int qtde = 0;
		for (int i = 0; i < 24; i++) {
			qtde += matriz[mes][dia][i];
		}
		return qtde;
	}

	// c
	public int mesMenorFluxo() {
		int mesMenor = 1;
		int qtdeMenor = this.quantosPassageiros(1);
		int qtdeMes;
		for (int mes = 2; mes <= 12; mes++) {
			qtdeMes = this.quantosPassageiros(mes);
			if (qtdeMes < qtdeMenor) {
				qtdeMenor = qtdeMes;
				mesMenor = mes;
			}
		}
		return mesMenor;
	}

	public int quantosPassageiros(int mes) {
		int total = 0;

		for (int dia = 1; dia <= 30; dia++) {
			total += this.quantosPassageiros(dia, mes);
		}

		return total;
	}

	// d
	public int[] picoTransporte() {
		int maiorValor, maiorMes, maiorDia, maiorHora;
		maiorValor = maiorMes = maiorDia = maiorHora = 0;

		for (int m = 0; m < matriz.length; m++) {
			for (int d = 0; d < matriz[m].length; d++) {
				for (int h = 0; h < matriz[m][d].length; h++) {
					if (matriz[m][d][h] > maiorValor) {
						maiorValor = matriz[m][d][h];
						maiorMes = m;
						maiorDia = d;
						maiorHora = h;
					}
				}
			}
		}

		int[] retorno = { maiorDia + 1, maiorMes + 1, maiorHora, maiorValor };
		return retorno;
	}
}
