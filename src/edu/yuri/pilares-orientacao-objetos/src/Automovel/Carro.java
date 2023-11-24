package Automovel;
public class Carro extends Automovel{

    public void ligar(){
        conferirCombustivel();
        conferirCambioemP();
       System.out.println("Ligando o carro");
    }
    private void conferirCombustivel(){
       System.out.println("Conferindo combustível");
    }
    private void conferirCambioemP(){
       System.out.println("Conferindo se o câmbio está em P");
    }
}
