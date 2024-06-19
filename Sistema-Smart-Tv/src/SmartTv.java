/*
 * @author Pedro Vitor
 * @version 1.0
 * @since 02/05/2024
 */

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;


/** 
 * criado para mudar canal
 * @param novoCanal
 */
public void mudarCanal(int novoCanal){
    canal = novoCanal;
}

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }
    public void aumentarCanal(){
        canal ++;
    }
    public void diminuirCanal(){
        canal--;
    }
}
