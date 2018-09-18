package poo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelefoneTest {

    @Test
    public void testaAdd() {

        Telefone telefone = new Telefone();

        Assert.assertEquals("rótulo e telefone não podem ser nulos",false,telefone.add(" "," "));
        Assert.assertEquals("telefone não pode ser nulo",false,telefone.add("fixo"," "));
        Assert.assertEquals("rótulo não pode ser nulo",false,telefone.add(" ","48984545665"));
        Assert.assertEquals("XXXXXXX não é um número válido", false, telefone.add("casa", "XXXXXXXXX") );
        Assert.assertEquals("456 não é um número válido", false, telefone.add("fixo", "456") );
        Assert.assertEquals("telefone só deve conter números",false,telefone.add("celular", "(49)98848-1595") );
        Assert.assertEquals("o número de telefone deve conter 11 caracteres", false, telefone.add("celular","489885025959"));




    }

    @Test
    public void testaRemove() {

        Telefone telefone = new Telefone();


        Assert.assertEquals("rótulo nulo é inválido",false,telefone.remove(" "));






    }

    @Test
    public void testaUpdate() {


        


    }


}