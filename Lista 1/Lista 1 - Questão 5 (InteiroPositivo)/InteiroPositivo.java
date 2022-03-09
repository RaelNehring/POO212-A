//@Autor: Rael dos Santos Nehring
//@Data: 
//@Turma: 
public class InteiroPositivo
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x;

    /**
     * Construtor para objetos da classe InteiroPositivo
     */
    public InteiroPositivo(int x){
        this.setValor(x);
    }

    // GETTERS & SETTERS
    // a
    public void setValor(int x){
        if (x >= 0){
            this.x = x;
        }   
    }
    public int getValor(){
        return this.x;
    }
    
    // b
    public int getValorMultiplicado(InteiroPositivo inteiroPositivo){
        return this.getValor() * inteiroPositivo.getValor();
    }
    // c
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
    // d
    public String getDivisores(){
        int qtdeDivisores = 0;
        String listaDivisores = "";
        for (int i = 1; i < this.getValor(); i++) {
            if (this.getValor() % i == 0) {
                listaDivisores += i + ", ";
                qtdeDivisores++;
            }
        }
        return "Divisores: " + listaDivisores + "totalizando " + qtdeDivisores + " divisores";
    }
    // e
    public int[] fibonacci(){
        int[] fibonacci = new int[this.getValor()];
        if (this.getValor() != 0){
            int anterior = 0;
            int atual = 1;
            fibonacci[0] = 1;
            for(int cont = 1; cont < this.getValor(); cont++){
                fibonacci[cont] = anterior + atual;
                anterior = atual;
                atual = fibonacci[cont];
            }
        }
        return fibonacci;
    }
    // f
    public double getValorH() {
        double valorH = 0;
        for (double cont = 1; cont <= this.getValor(); cont++){
            valorH += 1/cont;
        }
        return valorH;
    }
    // g
    public double getValorI() {
        double valorI = 0;
        double sub = 0;
        for (double numerador = 1; numerador <= this.getValor(); numerador++) {
            valorI += numerador/(this.getValor()-sub);
            sub++;
        }
        return valorI;
    }
    // h
    // i
    public double getValorP() {
        double ValorP = 0;
        int numerador = 0;
        int denominador = 0;
        double fatorial;
        for (int a = 1; a <= this.getValor(); a++) {
            numerador += 1;
            denominador += 2;
            fatorial = denominador;
            for (int i = 1; i < denominador; i++) {
                fatorial *= i;
            }
            if (numerador % 2 == 0) {
                ValorP -= numerador/fatorial;
            } else {
                ValorP+= numerador/fatorial;
            }
     
        }
        return ValorP;
    }
}
