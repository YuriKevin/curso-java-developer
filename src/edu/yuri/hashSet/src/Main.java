import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {

        Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("chevrolet"));
        hashSetCarros.add(new Carro("ford"));
        hashSetCarros.add(new Carro("zip"));
        hashSetCarros.add(new Carro("fiat"));
        hashSetCarros.add(new Carro("peugeot"));

        System.out.println(hashSetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        
        treeSetCarros.add(new Carro("ford"));
        treeSetCarros.add(new Carro("zip"));
        treeSetCarros.add(new Carro("chevrolet"));
        treeSetCarros.add(new Carro("fiat"));
        treeSetCarros.add(new Carro("peugeot"));

        System.out.println(treeSetCarros);

        /*Quando você utiliza um TreeSet, ele ordena automaticamente os elementos 
        inseridos com base na lógica de comparação fornecida pela interface Comparable 
        ou por um Comparator. No seu caso, você implementou o método compareTo na classe Carro, 
        o que permite que o TreeSet ordene os carros com base na marca. */

    }
}
