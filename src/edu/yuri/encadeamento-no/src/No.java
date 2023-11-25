public class No {
    private String conteudo;
    private No proximoNo;
    
    public No(String conteudo) {
        this.conteudo = conteudo;
        this.proximoNo= null;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return this.proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }
    

    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + "]";
    }

    public static void main(String[] args) throws Exception {
        No no1 = new No("Primeiro Nó");

        No no2 = new No("Segundo Nó");

        no1.setProximoNo(no2);
        
        No no3 = new No("Terceiro Nó");

        no2.setProximoNo(no3);

        No no4= new No("Quarto Nó");

        no3.setProximoNo(no4);

        //os dois jeitos fazem a mesma coisa
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2.getProximoNo());
        System.out.println(no3.getProximoNo());

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());

    }
}
