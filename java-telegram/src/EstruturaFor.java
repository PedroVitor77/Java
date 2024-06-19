
import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos numero inteiros deseja somar: ");
        int quantidade = sc.nextInt();
        int soma = 0;

        for (int contador = 0; contador < quantidade; contador++) {
            System.out.print("Digite um numero: ");
            int numero = sc.nextInt();
            soma += numero;
        }
        System.out.println(soma);

        sc.close();
    }
}
