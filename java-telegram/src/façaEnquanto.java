

import java.util.Locale;
import java.util.Scanner;


public class façaEnquanto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char resposta;
    do {
        
        System.out.print("Digte a temperatura em celsius:");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("A temperatura em fahrenheit é: %.1f \n", fahrenheit);
        System.out.print("Deseja continuar S/N: ");
         resposta = sc.next().charAt(0);
        
    } while (resposta != 'n');
    sc.close();
}}
