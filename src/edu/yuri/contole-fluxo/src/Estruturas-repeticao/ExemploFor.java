public class ExemploFor {
    public static void main(String[] args) {
        for(int contador = 1; contador<=20; contador++){
            System.out.println(contador);
        }


        String cores[] = {"Azul", "Amarelo", "Magenta", "Verde", "Preto"};
        for(int i=0; i<cores.length; i++){
            System.out.println(cores[i]);
        }

        char caracteres[] = {'a', 'b', 'c', 'd', 'e'};
        for(char elemento:caracteres){
            System.out.println(elemento);
        }

    }
}
