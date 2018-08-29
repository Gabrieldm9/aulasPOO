package poo;

public class Triangulo {

    public String tipoDoTriangulo(int a, int b, int c){

        if(a <= 0 || b <= 0 || c <= 0) {
            return "não é um triângulo";
        }
        if(a > (b+c) || b > (a+c) || c > (a+b)){
            return  "não é um triângulo";
        }
        if (a == b && a == c && b == c){
            return "é equilátero";

        }else{
            return "é escaleno";
        }
        if (a == b || a == c || b == c){
            return "é isósceles";
        }

    }
}
