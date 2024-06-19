import java.util.Locale;
import java.util.Scanner;

public class operadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double plano = 50;
        System.out.print("Minutos usados: ");
        double minutosUsados = sc.nextDouble();
        if (minutosUsados <= 100) {
            System.out.println("Valor a pagar : R$ " + plano);
        } else if (minutosUsados > 100) {
             plano += (minutosUsados - 100) * 2;
            System.out.printf("Valor a pagar : R$%.2f", plano);
        }
        sc.close();
    }
}
