package poo;

import java.util.HashMap;

public class Telefone {

    private HashMap<String,String> dados;

    public Telefone() {
        this.dados = new HashMap<>();
    }

    public boolean add(String r, String n){
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
