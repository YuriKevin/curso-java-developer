public class SistemaIBGE {
    public static void main(String[] args) {
        for(EstadosBrasileiros estados : EstadosBrasileiros.values()){
            System.out.println(estados.getSigla() +" - "+estados.getNomeMaiusculo());
        }

        EstadosBrasileiros ba = EstadosBrasileiros.BAHIA;
        System.out.println(ba.getNome());
        System.out.println(ba.getNomeMaiusculo());
        System.out.println(ba.getSigla());
    }
}
