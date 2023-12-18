import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("ford"));
        listaCarros.add(new Carro("chevrolet"));
        listaCarros.add(new Carro("peugeot"));

        System.out.println(listaCarros.contains(new Carro("ford")));

        System.out.println(listaCarros.get(1));

        System.out.println(listaCarros.indexOf(new Carro("peugeot")));

        System.out.println(listaCarros.remove(2));
        System.out.println(listaCarros);
    }
}
