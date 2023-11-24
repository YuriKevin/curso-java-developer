package Sistemas_de_mensagens.aplicativos;

public abstract class SistemaChat {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    protected void validarConexao(){
        System.out.println("Validando conexão.");
    }
}
