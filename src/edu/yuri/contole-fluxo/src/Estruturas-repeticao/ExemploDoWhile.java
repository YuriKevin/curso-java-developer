import java.util.Random;
public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Telefone discando...");
        do{
            System.out.println("Tocando...");
        }
        while(tocando());

            System.out.println("Alô?");
        
    }
    public static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? "+atendeu);
        return !atendeu;
    }
}
