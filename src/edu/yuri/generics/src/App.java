import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    public void imprimeLista(List<?>lista){
        for(Object obj:lista){
            System.out.println(obj);
        }
    }
    public void imprimeLista2(List<? extends Pessoa>listaPessoas){
        for(Pessoa p:listaPessoas){
            System.out.println(p);
        }
    }

    public void imprimeLista3(List<? super Pessoa>listaPessoas){
        for(Object p:listaPessoas){
            System.out.println(p);
        }
    }
}
