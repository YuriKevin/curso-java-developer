package MSN_Messenger;

public class Msn {
    public void enviarMensagem(){
        validarConexao();
        System.out.println("Mensagem enviada.");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Mensagem recebida.");
        salvarHistoricoMensagem();
    }
    private void validarConexao(){
        System.out.println("Validando conexão.");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Histórico salvo.");
    }
}
