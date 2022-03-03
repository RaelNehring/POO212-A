
/**
 * Escreva uma descrição da classe Desenhista aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Desenhista
{
    public void desenharFigura(){
    criaRosto(); 
    criaOlhoDireito(); 
    criaOlhoEsquerdo(); 
    criaNariz(); 
    criaBoca(); 
    }
    
    public void criaRosto() {
        Circle rosto = new Circle();
        rosto.makeVisible();
        rosto.moveHorizontal(65);
        rosto.moveVertical(25);
        rosto.changeSize(150);
    }
    public void criaOlhoDireito() {
        Circle olhoDireito = new Circle();
        olhoDireito.makeVisible();
        olhoDireito.changeColor("green");
        olhoDireito.moveHorizontal(155);
        olhoDireito.moveVertical(45);
    }
    public void criaOlhoEsquerdo() {
        Circle olhoEsquerdo = new Circle();
        olhoEsquerdo.makeVisible();
        olhoEsquerdo.changeColor("green");
        olhoEsquerdo.moveHorizontal(95);
        olhoEsquerdo.moveVertical(45);
    }
    public void criaNariz() {
        Triangle nariz = new Triangle();
        nariz.makeVisible();
        nariz.changeColor("black");
        nariz.moveHorizontal(110);
        nariz.moveVertical(120);
    }
    public void criaBoca() {
        Square boca = new Square();
        boca.makeVisible();
        boca.moveHorizontal(87);
        boca.moveVertical(118);
    }
}
