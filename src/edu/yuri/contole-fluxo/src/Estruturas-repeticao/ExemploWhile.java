import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        int contador = 0;

        while(mesada>0){
            Double valorGasto = valorAleatorio();
            if (mesada>=valorGasto) {
                mesada-=valorGasto;
                System.out.println("Valor: R$"+valorGasto+" Foi gasto na mesada");
            }
            else{
                mesada=0;
            }

            contador++;
        }
        System.out.println("Mesada gasta após "+contador+" tentativas.");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
