package edu.yuri.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        String nome = "Yuri";
        String sobrenome = "Kevin";

        String nomeCompleto = (nomeCompleto(nome, sobrenome));
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome)
    {
        return primeiroNome + " " + segundoNome;
    }

}
