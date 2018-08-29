package poo;


import org.junit.Assert;
import org.junit.Test;

public class TestaTriangulo {

    @Test
    public void testarTriangulo(){

        Triangulo triangulo = new Triangulo();



        Assert.assertEquals("10x1x2 não é um triângulo", "não é um triângulo", triangulo.tipoDoTriangulo(10,1,2));
        Assert.assertEquals("4x5x7 é escaleno", "é escaleno", triangulo.tipoDoTriangulo(4,5,7));
        Assert.assertEquals("5x5x5 é equilátero", "é equilátero", triangulo.tipoDoTriangulo(5,5,5));
        Assert.assertEquals("8x8x9 é isósceles","é isósceles",triangulo.tipoDoTriangulo(8,8,9) );
        Assert.assertEquals("0x0x0 não é um triângulo", "não é um triângulo", triangulo.tipoDoTriangulo(0,0,0));
        Assert.assertEquals("1x2x2 é isóceles", "é isósceles", triangulo.tipoDoTriangulo(1,2,2));
        Assert.assertEquals("25x18x25 é isóceles", "é isósceles", triangulo.tipoDoTriangulo(25,18,25));
        Assert.assertEquals("3x20x4 não é um triângulo", "não é um triângulo", triangulo.tipoDoTriangulo(3,20,4));
        Assert.assertEquals("5x1x15 não é um triângulo", "não é um triângulo", triangulo.tipoDoTriangulo(5,1,15));
        Assert.assertEquals("2x0x3 não é um triângulo", "não é um triângulo", triangulo.tipoDoTriangulo(2,0,3));
        Assert.assertEquals("5x4x0 não é um triângulo", "não é um triângulo", triangulo.tipoDoTriangulo(5,4,0));
        Assert.assertEquals("0x10x10 não é um triângulo", "não é um triângulo", triangulo.tipoDoTriangulo(0,10,10));
        Assert.assertEquals("-2x3x4 não é um triângulo", "não é um triângulo", triangulo.tipoDoTriangulo(-2,3,4));
        Assert.assertEquals("3x4x-6 não é um triângulo", "não é um triângulo", triangulo.tipoDoTriangulo(3,4,-6));
        Assert.assertEquals("-2x-5x-5 não é um triângulo", "não é um triângulo", triangulo.tipoDoTriangulo(-2,-5,-5));


    }

}
