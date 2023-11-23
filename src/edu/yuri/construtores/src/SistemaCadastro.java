public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa yuri = new Pessoa("Yuri", "444-444-44", "Rua kevin");
        System.out.println(yuri.getNome());
        System.out.println(yuri.getCpf());
        System.out.println(yuri.getEndereco());

        Pessoa construtorSemParametro = new Pessoa();
        Pessoa construtorComUmParametro = new Pessoa("Yuri");
    }
}
