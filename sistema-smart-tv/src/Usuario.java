public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();
        System.out.println("TV Ligada?:" + smartTv.ligada);
        System.out.println("TV Esta em qual Canal?: " + smartTv.canal);
        System.out.println("Qual Volume da TV?:  " +smartTv.volume);

        smartTv.ligar();
        System.out.println("TV Ligada?:" + smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV Ligada?:" + smartTv.ligada);


        smartTv.aumentarVolume();
        System.out.println("AumentadoVolume: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("diminuindoVolume: " + smartTv.volume);

        smartTv.mudarCanal(54);
        System.out.println("Canal Atual");
        smartTv.aumentarCanal();

        smartTv.diminuirCanal();
    }

}
