package Excecao;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
         try{
            //bloco de código executando conforme o esperado
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = sc.nextLine();

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();

        System.out.println("Digite sua altura:");
        float altura = sc.nextFloat();
        }
        catch(InputMismatchException e){//exceção no parametro, para ser manipulada dentro do bloco catch
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }

    }
}
