package BancoDigital;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Banco {
    private final String nome = "New Bank";
    private List<Conta> contas;
    
    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
    private void mostrarMenuAcoes(Conta conta){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite 1 para verificar o extrato.");
        System.out.println("Digite 2 para depositar um valor.");
        System.out.println("Digite 3 para sacar um valor.");
        System.out.println("Digite 4 para transferir um valor.");
        System.out.println("Digite 5 para verificar os dados da conta.");
        System.out.println("Digite 6 para sair.");
        int opcao = sc.nextInt();

        if (opcao==1) {
           conta.gerarExtrato();
           mostrarMenuAcoes(conta);
        }
        else if(opcao==2){
            System.out.println("Digite o valor do depósito:");
            double valor = sc.nextDouble();
            conta.depositar(valor);
            System.out.println("Depósito realizado com sucesso!");
            mostrarMenuAcoes(conta);
        }
        else if(opcao==3){
            System.out.println("Digite o valor do saque:");
            double valor = sc.nextDouble();
            conta.sacar(valor);
            mostrarMenuAcoes(conta);
        }
         else if(opcao==4){
            System.out.println("Digite o valor da transferência:");
            double valor = sc.nextDouble();
            conta.transferir(valor);
            mostrarMenuAcoes(conta);
        }
        else if(opcao==5){
            conta.imprimirDadosConta();
            mostrarMenuAcoes(conta);
        }
        else if(opcao==6){
            System.out.println("Sessão encerrada");
        }
        else{
            mostrarMenuAcoes(conta);
        }
    }
    public void iniciar(){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Seja bem vindo(a) ao banco "+this.nome+".");
        
        System.out.println("Digite 1 para abrir uma conta corrente.");
        System.out.println("Digite 2 para abrir uma conta poupança.");
        int digito = sc.nextInt();
        if(digito==1){
            Cliente cliente = new Cliente();
            cliente = cliente.cadastrar();
            Conta conta = new ContaCorrente(cliente);
            mostrarMenuAcoes(conta);
        }
        else if(digito==2){
            Cliente cliente = new Cliente();
            cliente = cliente.cadastrar();
            Conta conta = new ContaPoupanca(cliente);
            mostrarMenuAcoes(conta);
        }
        else{
            iniciar();
        }
        
        

    }
    

    
}
