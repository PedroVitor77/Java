import java.util.Scanner;
public class expressaoTernaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * Sintaxe
         * (condição)? valor_se_verdadeiro : valor_se_falso
         */
        double preco = 34.5;
        double desconto = (preco < 20.0)? preco * 0.1 : preco * 0.05;

        System.out.println(desconto);
        sc.close();
    }
}
