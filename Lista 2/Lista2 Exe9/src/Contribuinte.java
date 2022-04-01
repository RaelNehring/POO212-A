public class Contribuinte {
	private String nome;
	private String cpf;
	private String uf;
	private double rendaAnual;

	// CONSTRUTOR
	public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setUf(uf);
		this.setRendaAnual(rendaAnual);
	}

	// METODOS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		uf.toUpperCase();
		if (uf.equals("SC") || uf.equals("PR") || uf.equals("RS")) {
			this.uf = uf;
		}
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		if (rendaAnual >= 0) {
			this.rendaAnual = rendaAnual;
		}
	}

	public double getAliquota() {
		double aliquota;
		if (this.getRendaAnual() <= 4000) {
			aliquota = 0;
		} else if (this.getRendaAnual() <= 9000) {
			aliquota = 0.058;
		} else if (this.getRendaAnual() <= 25000) {
			aliquota = 0.15;
		} else if (this.getRendaAnual() <= 35000) {
			aliquota = 0.275;
		} else {
			aliquota = 0.3;
		}
		return aliquota;
	}

	public double calcularImposto() {
		return this.rendaAnual * this.getAliquota();
	}

}
