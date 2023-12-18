import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        Queue<Carro> filaCarros = new LinkedList<>();

        filaCarros.add(new Carro("ford"));
        filaCarros.add(new Carro("chevrolet"));
        filaCarros.add(new Carro("fiat"));

        System.out.println(filaCarros.add(new Carro("peugeot")));
        System.out.println(filaCarros);

        System.out.println(filaCarros.offer(new Carro("renault")));
        System.out.println(filaCarros);

        System.out.println(filaCarros.peek());
        System.out.println(filaCarros);

        System.out.println(filaCarros.poll());
        System.out.println(filaCarros);

        System.out.println(filaCarros.isEmpty());
        System.out.println(filaCarros.size());
    }
}
