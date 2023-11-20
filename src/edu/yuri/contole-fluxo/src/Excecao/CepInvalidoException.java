package Excecao;
public class CepInvalidoException extends Exception{
    public static void main(String[] args) {
        try{
        String cepFormatado = formatarCep("23333333");
        System.out.println(cepFormatado);
        }
        catch(CepInvalidoException e){
            e.printStackTrace();
            System.out.println("CEP não corresponde com as regras de negócio");
        }
    }
    
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length()!=8) {
            throw new CepInvalidoException();
        }
        //simular CEP formatado
        return "222.333.444-11";
    }
}
