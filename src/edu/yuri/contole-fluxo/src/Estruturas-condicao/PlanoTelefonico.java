public class PlanoTelefonico {
    public static void main(String[] args) {
        String plano = "turbo";

        switch (plano) {
             case "turbo":
                System.out.println("5GB de Youtube.");

            case "medio":
                System.out.println("Whatsapp e Instagram ilimitado.");

            case "basico":
                System.out.println("100 minutos de ligação.");
                break;

            default:
            System.out.println("Nenhum plano foi escolhido.");
                break;
        }
    }
}
