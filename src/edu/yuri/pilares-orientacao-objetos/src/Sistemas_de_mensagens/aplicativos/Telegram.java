package Sistemas_de_mensagens.aplicativos;

public class Telegram extends SistemaChat{
    public void enviarMensagem(){
        validarConexao();
        System.out.println("Mensagem enviada pelo Telegram.");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Mensagem recebida pelo Telegram.");
        salvarHistoricoMensagem();
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Histórico salvo.");
    }
}
