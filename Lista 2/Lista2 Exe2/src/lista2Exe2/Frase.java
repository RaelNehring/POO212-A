package lista2Exe2;

public class Frase {
	private String frase;

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}
	
	public String[] dividirFrase() {
		String[] fraseDividida = this.frase.split(" ");
		return fraseDividida;
	}
}
