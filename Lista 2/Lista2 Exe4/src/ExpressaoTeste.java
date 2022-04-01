
public class ExpressaoTeste {
	public static void main(String[] args) {
		Expressao exp = new Expressao("(a+10)/(23*(10.5-b)-2.59/(b*a))");
		System.out.println(exp.estaCorretaSintaticamente());// → retorna true
		System.out.println(exp.getQtdeDivisores());// → retorna 2
		System.out.println(exp.getPosicaoOperador());// → retorna 2
	}
}
