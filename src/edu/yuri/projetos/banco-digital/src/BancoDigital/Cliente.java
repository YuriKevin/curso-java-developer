package BancoDigital;

import java.util.Locale;
import java.util.Scanner;

public class Cliente {
    private String nome;
    private String cpf;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public Cliente() {
     
    }
    public String retornaPrimeiroNome(){
        String nomeDividido[] = this.nome.split(" ");
        return nomeDividido[0];

    }
    public Cliente cadastrar(){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome completo: ");
        String nome = sc.nextLine();

        System.out.println("Digite seu CPF: ");
        String cpf = sc.nextLine();
        
        Cliente cliente = new Cliente(nome, cpf);

        return cliente;
    }

    
}
