import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("curso java", "descrição curso java", 76);

        Curso curso2 = new Curso("curso js", "descrição curso js", 1);

        Mentoria mentoria = new Mentoria("mentoria de java", "descrição mentoria java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev("Yuri");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos do Desenvolvedor "+ dev.getNome()+": "+  dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos:" + dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:" + dev.getConteudosConcluidos());
        System.out.println("XP:" + dev.calcularTotalXp());

        System.out.println("-------");

        Dev dev2 = new Dev("Geovana");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos do Desenvolvedor "+ dev2.getNome()+": "+  dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos:" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos:" + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());

    }

}
