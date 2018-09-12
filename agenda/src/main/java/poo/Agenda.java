package poo;

public class Agenda {

    private ArrayList<Pessoa> contatos;

    public Agenda(ArrayList<Pessoa> contatos) {
        this.contatos = new ArrayList<>(contatos);
    }

    public void addPessoa(Pessoa p){

    }
    public boolean removePessoa(String n, String s){
        return false;
    }
    public boolean addTelefone(String r, String n, int pindex){
        return false;
    }
    public boolean addEmail(String r, String e, int pindex){
        return false;
    }
    public boolean updateTelefone(String r, String n, int pindex){
        return false;
    }
    public boolean updateEmail(String r, String e, int pindex){
        return false;
    }
    public boolean removeTelefone(String r, int pindex){
        return false;
    }
    public boolean removeEmail(String r, int pindex){
        return false;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Agenda{" +
                "contatos=" + contatos +
                '}';
    }
}
