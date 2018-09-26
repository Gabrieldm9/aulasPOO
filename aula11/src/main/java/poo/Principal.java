package poo;

public class Principal {

    public static void main(String[] args) {

        Object o = new Object();

        Dimensao dim = new Dimensao(2,4,2);

        Telefone tel = new Telefone(1, "255","b45",100, dim);

        Semfio sem = new Semfio(2,"356","b55", 55,dim , 150, 2, 20);

        System.out.println(tel.toString());
        System.out.println(tel.olar());
        System.out.println(sem.olar());

        








    }

}
