import java.util.Scanner;

public class EstruturasWhile {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int total = 0;
    int numero = 1;
    while (numero != 0) {
      System.out.print("Digite um numero: ");
      numero = sc.nextInt();
      total += numero;
    }
    System.out.println("Total: " + total);
    sc.close();
  }
}
