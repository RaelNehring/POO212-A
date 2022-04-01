/*@Autores: Rael dos Santos Nehring e Leonardo Gian Pottmayer*/
public class Expressao {
	private String exp;	

	public Expressao(String exp) {
		this.setExp(exp);
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public boolean estaCorretaSintaticamente() {
		int qtdeFechando = 0;
		int qtdeAbrindo = 0;
		for (int i = 0; i < this.exp.length(); i++) {
			if (this.exp.charAt(i) == '(') {
				qtdeAbrindo++;
			} else if (this.exp.charAt(i) == ')') {
				qtdeFechando++;
			}
			if (qtdeFechando > qtdeAbrindo) {
				return false;
			}
		}
		if (qtdeAbrindo == qtdeFechando) {
			return true;
		} else {
			return false;
		}
	}

	public int getQtdeDivisores() {
		int qtdeDivisores = 0;
		for (int i = 0; i < exp.length(); i++) {
			if (exp.charAt(i) == '/') {
				qtdeDivisores++;
			}
		}
		return qtdeDivisores;
	}

	public int getPosicaoOperador() {
		for (int i = 0; i < exp.length(); i++) {
			if (exp.charAt(i) == '+' || exp.charAt(i) == '-' || exp.charAt(i) == '*' || exp.charAt(i) == '/') {
				return i;
			}
		}
		return -1;
	}

}
