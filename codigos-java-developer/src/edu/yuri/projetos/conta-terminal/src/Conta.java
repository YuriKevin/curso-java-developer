import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Conta {
    String nome;
    int numeroConta;
    int numeroAgencia;
    double saldo;

    public Conta(String nome, int numeroConta, int numeroAgencia){
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldo = 1000;
    }

    public void escolherDigito(int digito){
        Scanner sc = new Scanner(System.in);
        switch (digito) {
        case 1:
            this.gerarExtrato();
            break;
        case 2:
            System.out.println("Digite o valor que deseja depositar:");
            double deposito = sc.nextDouble();
            this.depositar(deposito);
            break;
        case 3:
            System.out.println("Digite o valor que deseja sacar:");
            double saque = sc.nextDouble();
            this.sacar(saque);
            break;
        case 4:
            System.out.println("Sessão encerrada.");
            break;
       }
       if (digito!=4) {
        System.out.println("Caso queira realizar alguma ação, digite um dos números abaixo:");
        System.out.println("Digite 1 para verificar o saldo");
        System.out.println("Digite 2 para depositar um valor");
        System.out.println("Digite 3 para sacar");
        System.out.println("Digite 4 para sair");
        digito = sc.nextInt();
        this.escolherDigito(digito);
       }
    }
    public void gerarExtrato(){
        System.out.println(this.nome);
        System.out.println("Conta: "+this.numeroConta+". Agência: "+this.numeroAgencia+".");
        System.out.println("Seu saldo é de R$"+this.saldo);
    }
    public void depositar(double valor){
        this.saldo +=valor;
        System.out.println("Você depositou R$"+valor);
    }
    public void sacar(double valor){
        if(this.saldo>=valor){
            this.saldo-=valor;
            System.out.println("Você sacou R$"+valor);
        }
        else{
            System.out.println("Saldo insuficiente.");
        }
    }
    public static int gerarAgencia(){
        Random aleatorio = new Random();
        int numero = 100;
        int agencia = aleatorio.nextInt(numero);
        return agencia;
    }
    public static int gerarNumeroConta(){
        Random aleatorio = new Random();
        int numero = 1000000000;
        int conta = aleatorio.nextInt(numero);
        return conta;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome completo: ");
        String nome = sc.nextLine();

        int numeroConta = gerarNumeroConta();
        int numeroAgencia = gerarAgencia();

        Conta conta = new Conta(nome, numeroConta, numeroAgencia);

        String nomesDivididos[] = conta.nome.split(" ");
        String primeiroNome = nomesDivididos[0];

        System.out.println("Olá, Sr(a) "+primeiroNome+", sua conta foi criada com sucesso!");
        System.out.println("Digite 1 para verificar o extrato");
        System.out.println("Digite 2 para depositar um valor");
        System.out.println("Digite 3 para sacar um valor");
        System.out.println("Digite 4 para sair");
        int digito = sc.nextInt();
        conta.escolherDigito(digito);

    }
}
