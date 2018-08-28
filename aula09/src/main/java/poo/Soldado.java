package poo;

public class Soldado {

    private String arma;
    private final int distancia;
    private static int totalSoldados;

    public Soldado(){

        this("fuzil", 10);


    }

    public Soldado(String a, int d){
        this.arma = a;
        this.distancia = d;
        totalSoldados++;

    }

    public String mover(int dist){
        if (dist == 0){
            return "Movimentou " + distancia;
        }else {return "Movimentou " + dist;}


    }
    public String atacar(String arm){
        if (totalSoldados < 10){
            return "ainda não, esperando exército ficar maior";
        }else{
            if (arm.isEmpty()){
                return "Atacando com " + arma;
            }else{
                return "Atacando com " + arm;
            }
        }
    }


    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getDistancia() {
        return distancia;
    }

}

