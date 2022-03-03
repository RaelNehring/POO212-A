
/**
 * Escreva uma descrição da classe Cidade aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Cidade {
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private String uf;
    private int populacaoMasculina;
    private int populacaoFeminina;
    private boolean calculado;
    
    public Cidade() {
        Cidade gaspar = new Cidade();
        gaspar.setNome("Gaspar");
        gaspar.setUf("SC");
        gaspar.setPopulacaoMasculina(28141);
        
        Cidade indaial = new Cidade();
        indaial.setNome("Indaial");
        indaial.setPopulacaoFeminina(25844);
        indaial.setCalculado(true);
        
        Cidade blumenau = new Cidade("Blumenau", 154580, 165420);
    }
    
    public Cidade(String nome, int populacaoMasculina, int populacaoFeminina) {
        this.setNome(nome);
        this.setPopulacaoMasculina(populacaoMasculina);
        this.setPopulacaoFeminina(populacaoFeminina);
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    
    public int getPopulacaoMasculina() {
        return populacaoMasculina;
    }
    public void setPopulacaoMasculina(int populacaoMasculina) {
        this.populacaoMasculina = populacaoMasculina;
    }
    
    public int getPopulacaoFeminina() {
        return populacaoFeminina;
    }
    public void setPopulacaoFeminina(int populacaoFeminina) {
        this.populacaoFeminina = populacaoFeminina;
    }
    
    public boolean isCalculado() {
        return calculado;
    }
    public void setCalculado(boolean calculado) {
        this.calculado = calculado;
    }
}
