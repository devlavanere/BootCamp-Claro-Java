package sintaxe_basica_java.metodos;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("Canal Atual : " +smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual : " +smartTv.canal);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual : " + smartTv.volume);

//        System.out.println("TV Ligada ? " + smartTv.ligada);
//        System.out.println("Canal Atual : " + smartTv.canal);
//        System.out.println("Voleme Atual : " + smartTv.volume);
    }
}
