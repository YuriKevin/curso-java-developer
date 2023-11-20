public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void ligar(){
            ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;

    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    public static void main(String[] args) {
        SmartTv televisao = new SmartTv();

        System.out.println("TV ligada?" + televisao.ligada);
        System.out.println("Canal atual: " + televisao.canal);
        System.out.println("Volume: " +televisao.volume);

        televisao.ligar();
        System.out.println("Liguei a TV: " + televisao.ligada);

        televisao.desligar();
        System.out.println("Desliguei a TV: " + televisao.ligada);

        televisao.aumentarVolume();
        System.out.println("Aumentei o volume para: " + televisao.volume);

        televisao.diminuirVolume();
        televisao.diminuirVolume();
        System.out.println("Diminui o volume para: " + televisao.volume);

        televisao.mudarCanal(14);
        System.out.println("Canal alterado para: " + televisao.canal);

        
    }

}
