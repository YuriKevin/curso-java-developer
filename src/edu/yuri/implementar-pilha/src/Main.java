import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        Stack<Carro> pilhaCarros = new Stack<>();
        pilhaCarros.push(new Carro("ford"));
        pilhaCarros.push(new Carro("chevrolet"));
        pilhaCarros.push(new Carro("fiat"));

        System.out.println(pilhaCarros);
        System.out.println(pilhaCarros.pop());
    }
}
