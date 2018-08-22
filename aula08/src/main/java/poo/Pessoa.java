package poo;

public class Pessoa {
    private String nome, cpf;
    private int anoNasc;

    // método construtor padrão

    public Pessoa(){
        nome = "";
        cpf = "";
        anoNasc = 0;
    }

    public Pessoa(String no){
        nome = no;
        cpf = "";
        anoNasc = 0;
    }

    public Pessoa(String a, String b, int an){
        nome = a;
        cpf = b;
        anoNasc = an;
    }

}
