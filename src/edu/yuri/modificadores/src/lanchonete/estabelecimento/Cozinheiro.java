package lanchonete.estabelecimento;

public class Cozinheiro {
    public void prepararPedido(){
        System.out.println("Preparando pedido...");
    }
    private void lavarIngredientes(){
        System.out.println("Lavando ingredientes...");
    }
    void finalizarPedido(){
       System.out.println("Lanche escolhido!");
    }
    void chamarGarcom(){
        System.out.println("Chamando o garçom!");
    }
    protected void irAoBanheiro(){
        System.out.println("Indo ao banheiro.");
    }
    
}
