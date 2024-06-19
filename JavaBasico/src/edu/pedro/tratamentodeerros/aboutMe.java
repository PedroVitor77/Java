package edu.pedro.tratamentodeerros;
import java.util.InputMismatchException;
import java.util.Scanner;

public class aboutMe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            
            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine();
            System.out.print("Informe seu sobrenome: ");
            String sobrenome = sc.nextLine();
            System.out.print("Informe sua idade: ");
            int idade = sc.nextInt();
            System.out.print("Informe sua altura (utilize ponto como separador decimal): ");
            String alturaStr = sc.next();

            // Substituindo pontos por vírgulas
            alturaStr = alturaStr.replace('.', ',');

            // Convertendo altura para double
            double altura = Double.parseDouble(alturaStr);

            // Imprimindo dados do usuário
            System.out.println("Olá, meu nome é " + nome.toUpperCase() + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + " cm");
        } catch (InputMismatchException | NumberFormatException e) {
            System.err.println("Erro!! Informe os campos 'idade' e 'altura' com valores numéricos válidos.");
        } finally {
            sc.close();
        }
    }
   
}
