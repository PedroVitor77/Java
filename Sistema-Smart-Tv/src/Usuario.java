public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada?:" + smartTv.ligada);
        System.out.println("Canal atual?:" + smartTv.canal);
        System.out.println("Volume Atual?:" + smartTv.volume);

        smartTv.ligar();
        System.out.println(" novo Tv Ligada?:" + smartTv.ligada);

        smartTv.desligar();
        System.out.println(" novo Tv Ligada?:" + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println(" Aumentar Volume?:" + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println(" Diminuir Volume?:" + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " +smartTv.canal);
    }

}
