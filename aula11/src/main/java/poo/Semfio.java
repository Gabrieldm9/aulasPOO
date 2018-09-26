package poo;

public class Semfio extends Telefone{
    private float frequencia, distancia;
    private int canais;

    public Semfio(int codigo, String numSerie, String modelo, float peso, Dimensao dim, float frequencia, float distancia, int canais) {
        super(codigo, numSerie, modelo, peso, dim);
        this.frequencia = frequencia;
        this.distancia = distancia;
        this.canais = canais;
    }

    @Override
    public String toString() {
        return  super.toString()+"Semfio{" +
                "frequencia=" + frequencia +
                ", distancia=" + distancia +
                ", canais=" + canais +
                '}';
    }
}
