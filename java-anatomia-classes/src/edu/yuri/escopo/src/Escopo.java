public class Escopo {
    //variável escopo de classe
    double variavel = 100; 

    public void somar(){
        //variavel escopo de método
        double novaVariavel = variavel;

        for(int i=0; i<10; i++){
            //variavel escopo de fluxo
            double variavelFluxo = 1;

            novaVariavel+=variavelFluxo;
        }
    }
}
