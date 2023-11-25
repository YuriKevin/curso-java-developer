package BancoDigital;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public abstract class Conta{
    private double saldo;
    private Long numero;
    private Cliente cliente;
    
    public void sacar(double valor){
        if (this.saldo>=valor) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
        else{
            System.out.println("Saldo insuficiente.");
        }
    }
    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
    }
    public void transferir(double valor){
         if (this.saldo>=valor) {
            this.saldo -= valor;
            System.out.println("Transferência realizado com sucesso!");
        }
        else{
            System.out.println("Saldo insuficiente.");
        }
    }
    public void gerarExtrato(){
        System.out.println("Seu saldo é de R$"+this.saldo);
    }
    private Long gerarNumeroConta(){
        Random aleatorio = new Random();
        Long numero = 1000000000L;
        Long conta = aleatorio.nextLong(numero);
        return conta;
    }

    public Conta(Cliente cliente){
        this.cliente = cliente;
        this.numero = gerarNumeroConta();
        this.saldo = 0;
    }

    public abstract void imprimirDadosConta();

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Long getNumero() {
        return numero;
    }
    public void setNumero(Long numero) {
        this.numero = numero;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    

}