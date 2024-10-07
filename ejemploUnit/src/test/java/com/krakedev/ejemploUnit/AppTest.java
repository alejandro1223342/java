package com.krakedev.ejemploUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AppTest extends TestBase
{

    @Test void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testSumar() {
    	Calculadora c= new Calculadora();
    	int resultado = c.Sumar(5, 10);
    	assertTrue(resultado==15);
    }
    
    @Test
    public void testRestar() {
    	Calculadora c= new Calculadora();
    	int resultado = c.Restar(5, 5);
    	assertTrue(resultado==5);
    }

}
