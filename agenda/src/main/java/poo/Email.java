package poo;

import java.util.HashMap;

public class Email {
    private HashMap<String, String> dados;

    public Email(HashMap<String, String> dados) {
        this.dados = new HashMap<>(dados);
    }
    public boolean add(String r, String e){
        return false;
    }
    public boolean remove(String r){
        return false;
    }

    public boolean update(HashMap<String, String> dados) {
        return false;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "dados=" + dados +
                '}';
    }
}
