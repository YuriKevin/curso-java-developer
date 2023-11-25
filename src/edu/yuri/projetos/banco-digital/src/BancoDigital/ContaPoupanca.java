package BancoDigital;

import java.util.Date;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }
    public void imprimirDadosConta() {
        Date dia_hora = new Date();
        System.out.println("Olá Sr(a) "+this.getCliente().retornaPrimeiroNome());
        System.out.println("Seja bem vindo(a) a sua conta poupança.");
        System.out.println("Número da conta: "+this.getNumero());
        System.out.println(dia_hora);
    }
}
