public class Generico<T> {
    private T conteudo;
    private Generico<T> proximoNo;

    public Generico(T conteudo) {
        this.conteudo = conteudo;
        this.proximoNo= null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public Generico<T> getProximoNo() {
        return this.proximoNo;
    }

    public void setProximoNo(Generico<T> proximoNo) {
        this.proximoNo = proximoNo;
    }
    

    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + "]";
    }


    public static void main(String[] args) {
        Generico<String> no1 = new Generico<>("Primeiro Nó");
        Generico<String> no2 = new Generico<>("Segundo Nó");
        Generico<String> no3 = new Generico<>("Terceiro Nó");
        Generico<String> no4 = new Generico<>("Quarto Nó");

        no1.setProximoNo(no2);
        no2.setProximoNo(no3);
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2.getProximoNo());
        System.out.println(no3.getProximoNo());

        System.out.println("------------------------");
        
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
    }
}
