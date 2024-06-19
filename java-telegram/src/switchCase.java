import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o dia da semana: ");
        int dia_semana = sc.nextInt();

        switch (dia_semana) {
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quando-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("sexta-Feira");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
            System.out.println("Domingo");

            default:
                System.out.println("Dia inválido");
                break;  
        }
        sc.close();
    }
}
