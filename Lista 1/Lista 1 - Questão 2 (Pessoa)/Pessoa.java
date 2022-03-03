public class Pessoa {
    // variáveis de instância | atributos
    private String nome;
    private char sexo;
    private String dataNascimento;
    private String estadoCivil;

    /**
     * Construtor para objetos da classe Pessoa
     */
    public Pessoa(String nome, char sexo, String dataNascimento){
        this.setNome(nome);
        this.setSexo(sexo);
        this.setDataNascimento(dataNascimento);
        this.setEstadoCivil("solteiro");
    }
    
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    
    public char getSexo() {
        return this.sexo;
    }
    public void setSexo(char sexo){
        if (sexo == 'M' || sexo  == 'F') {
            this.sexo = sexo;
        }
        
    }
    
    public String getDataNascimento() {
        return this.dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String getEstadoCivil() {
        return this.estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil){
        this.estadoCivil = estadoCivil;
    }
}
