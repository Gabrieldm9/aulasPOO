package poo;

public class Tempo {
    private int hora, minuto, segundo;

    public Tempo(){
        hora = 00;
        minuto = 00;
        segundo = 00;
    }

    public Tempo(int s){
        hora = 0;
        minuto = 0;

        if (s < 0 || s > 59){
            segundo = 0;
        }else {
            segundo = s;
        }
    }


    public Tempo (int s, int m){
        hora = 0;

        if (s < 0 || s > 59){
            segundo = 0;
            minuto = 0;
        }else if (m < 0 || m > 59){
            segundo = 0;
            minuto = 0;
        }else {
            segundo = s;
            minuto = m;
        }

    }
    public Tempo (int s, int m, int h){
        if (s < 0 || s > 59){
            segundo = 0;
            minuto = 0;
            hora = 0;

        }else if(m < 0 || m > 59){
            segundo = 0;
            minuto = 0;
            hora = 0;

        }else if(h < 0 || h > 23){
            segundo = 0;
            minuto = 0;
            hora = 0;
        }else{
            segundo = s;
            minuto = m;
            hora = h;
        }
    }

    public boolean setHora(int hora) {
        if(hora < 0 || hora > 23) {
            return false;
        }else{

            this.hora = hora;
            return true;

        }
    }

    public boolean setMinuto(int minuto) {
        if(minuto < 0 || minuto > 59){
            return false;
        }else {
            this.minuto = minuto;
            return true;
        }
    }

    public boolean setSegundo(int segundo) {
        if(segundo < 0 || segundo > 59){
            return false;
        }else {
            this.segundo = segundo;
            return true;
        }
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public long getSegundo() {
        long emseg;

        emseg = hora * 3600 + minuto * 60 + segundo;

        return emseg;
    }

    @Override
    public String toString() {
        return "Tempo{"+ hora +
                ":" + minuto +
                ":" + segundo +
                '}';
    }
}
