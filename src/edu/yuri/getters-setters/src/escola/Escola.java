package escola;
public class Escola {
    public static void main(String[] args) {
        Aluno yuri = new Aluno();
        yuri.nome = "Yuri";
        yuri.idade = 20;

        System.out.println("O aluno "+ yuri.nome + " possui "+ yuri.idade+ " anos.");

        Aluno kevin = new Aluno();

        kevin.setNome("Kevin");
        kevin.setIdade(20);

        System.out.println("O aluno "+ kevin.getNome() + " possui "+ kevin.getIdade()+ " anos.");

    }
}
