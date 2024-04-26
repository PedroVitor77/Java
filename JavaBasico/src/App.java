public class App {
    public static void main(String[] args) {
        String primeiroNome = "Pedro";
        String segundoNome = " Vitor";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) { /*metodo para Retornar nome completo */
        return primeiroNome.concat(segundoNome);

    };
}
