
public class ResultadoEscolar {
    
public static void main(String[] args) {
    float nota = 6.9F;

    if(nota >= 7){
        System.out.println("Aprovado");
    }
    else if (5<=nota && nota<7) {
        System.out.println("Recuperação");  
    }
    else{
        System.out.println("Reprovado");
    }

    nota = 6;
    String resultado = nota>=7 ? "Aprovado" : "Reprovado";
    System.out.println("Segundo teste: "+resultado);

    nota = 6;
    resultado = nota>=7 ? "Aprovado" : nota>=5 && nota<7 ? "Recuperação" : "Reprovado";
    System.out.println("Terceiro teste: "+resultado);

}
    
    
}