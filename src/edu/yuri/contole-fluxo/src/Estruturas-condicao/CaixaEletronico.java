public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        double valorSolicitado = 20.0;

        if (valorSolicitado<=saldo){
            saldo -=valorSolicitado;
            System.out.println("Saque efetuado. Valor atual do saldo: R$"+saldo);
        }
        
        else{
            System.out.println("Valor de saque indisponível");
            System.out.println("Saldo disponível: R$"+ saldo);
        }

        

        
    }
}
