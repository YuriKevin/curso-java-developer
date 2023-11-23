public enum EstadosBrasileiros {
    
    //enums são objetos, não variáveis. Objetos constantes.
    SAO_PAULO ("SP", "São Paulo"),
    BAHIA ("BA", "Bahia"),
    MARANHAO ("MA", "Maranhão"),
    ACRE ("AC", "Acre");


    private String sigla;
    private String nome;

    private EstadosBrasileiros(String sigla, String nome){
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNomeMaiusculo() {
        return this.nome.toUpperCase();
    }
    
}
