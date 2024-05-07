import java.util.concurrent.ThreadLocalRandom;

public class exemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada) 
                valorDoce = mesada;
                
                System.out.println("Doce do valor" + valorDoce + " Adicionado no carrinho");
                mesada = valorDoce - mesada;
            }
            System.out.println("Mesada: " + mesada);
            System.out.println("Joazinho gastou toda sua mesada em doce");

        } 

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}           
