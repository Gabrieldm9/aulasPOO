package poo;

import java.util.HashMap;

public class Telefone {

    private HashMap<String,String> dados;

    public Telefone(HashMap<String, String> dados) {

        this.dados = new HashMap<>(dados);
    }

    public boolean add(){
        return false;
    }
    public boolean remove(){
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
