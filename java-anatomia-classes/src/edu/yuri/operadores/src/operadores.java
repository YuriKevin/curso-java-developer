public class operadores {
    public static void main(String[] args) {
        String nome = "Yuri";
        String sobrenome = "Kevin";
        String nomeCompleto = nome + " " + sobrenome;
        //
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);


        //
        int numero = 5;
        numero = -numero;
        System.out.println(numero);

        numero = +numero;
        System.out.println(numero);

        numero = -numero;
        System.out.println(numero);


        numero = numero * -1;
        System.out.println(numero);

        numero++;
        System.out.println(numero);

        numero--;
        System.out.println(numero);

        //
        boolean variavel = true;
  
        System.out.println(!variavel);

        variavel = !variavel;
        System.out.println(variavel);

        //
        int a = 100;
        int b = 100;
        String resultado = a==b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);

        //
        int num1= 10;
        int num2 = 9;

        boolean simNao = num1==num2;
        System.out.println("Número 1 é igual ao número 2?"+simNao);

        simNao = num1!=num2;
        System.out.println("Número 1 é diferente de número 2?"+simNao);

        simNao = num1>num2;
        System.out.println("Número 1 maior que número 2?"+simNao);

        simNao = num1<num2;
        System.out.println("Número 1 maior que número 2?"+simNao);

        //
        String nomeUm = "Yuri";
        String nomeDois = new String("Yuri");
        System.out.println(nomeUm==nomeDois);
        System.out.println(nomeUm.equals(nomeDois));


        //
        boolean condicao1 = false;
        boolean condicao2 = true;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }
        else if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
        else{
            System.out.println("Nenhuma das condições são verdadeiras");
        }

        if (condicao2 && (7 > 4)) {
            System.out.println("As duas condições são verdadeiras");
        }

        

    }
    
}
