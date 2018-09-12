package poo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelefoneTest {

    @Test
    public void testaAdd() {

        Telefone telefone = new Telefone();

        Assert.assertEquals("XXXXXXX não é um número válido", "número inválido", telefone.add("casa", "XXXXXXXXX") );
        Assert.assertEquals("456 não é um número válido", "número inválido", telefone.add("fixo", "456") );
        Assert.assertEquals("telefone só deve conter números","número inválido",telefone.add("celular", "(49)98848-1595") );





    }

    @Test
    public void testaRemove() {
    }

    @Test
    public void testaUpdate() {
    }

    @Test
    public void testaToString() {
    }
}