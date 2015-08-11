
package calculadora;
import org.junit.After;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculandoTest {
    
    public CalculandoTest() {
    }
    
  
    public static void setUpClass() {
    }
    
   
    public static void tearDownClass() {
    }
    
  
    public void setUp() {
    }
    
    public void tearDown() {
    }

   
    @Test
    public void testAdd() {
        System.out.println("add");
        double number1 = 1.0;
        double number2 = 2.0;
        Calculando instance = new Calculando();
        double expResult = 3.0;
        double result = instance.add(number1, number2);
        assertEquals(expResult, result, 0.0);

    }

  
    @Test  
    public void testSubtract() {
        System.out.println("subtract");
        double number1 = 2.0;
        double number2 = 1.0;
        Calculando instance = new Calculando();
        double expResult = 1.0;
        double result = instance.subtract(number1, number2);
        assertEquals(expResult, result, 0.0);
       
    }

     @Test
   
    public void testMultiply() {
        System.out.println("multiply");
        double number1 = 3.0;
        double number2 = 2.0;
        Calculando instance = new Calculando();
        double expResult = 6.0;
        double result = instance.multiply(number1, number2);
        assertEquals(expResult, result, 0.0);
        
    }

    @Test 
    public void testDivide() {
        System.out.println("divide");
        double number1 = 2.0;
        double number2 = 2.0;
        Calculando instance = new Calculando();
        double expResult = 1.0;
        double result = instance.divide(number1, number2);
        assertEquals(expResult, result, 0.0);
     
    }
    
}
