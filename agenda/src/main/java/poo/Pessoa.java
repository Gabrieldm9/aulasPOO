package poo;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private Telefone telefones;
    private Email emails;

    public Pessoa(String n, String s, Telefone t, Email e) {
        this.nome = n;
        this.sobrenome = s;

        this.telefones = new Telefone(t);
        this.emails = new Email(e);
    }

    public Pessoa(String n, String s) {
        this.nome = n;
        this.sobrenome = s;
    }
    public boolean addTelefone(String r, String n){
        return false;
    }
    public boolean addEmail(String r, String e){
        return false;
    }
    public boolean removeTelefone(String r){
        return false;
    }
    public boolean removeEmail(String r){
        return false;
    }

    public boolean updateTelefone(String r, String n) {
        return false;
    }

    public void updateEmail(String r, String e) {
        return false;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataNasc=" + dataNasc +
                ", telefones=" + telefones +
                ", emails=" + emails +
                '}';
    }
}
