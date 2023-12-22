import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

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
        System.out.println("Conteúdos Inscritos Camila:" + dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + dev.getConteudosConcluidos());
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
