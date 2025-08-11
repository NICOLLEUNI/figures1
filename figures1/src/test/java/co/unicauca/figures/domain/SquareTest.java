
package co.unicauca.figures.domain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class SquareTest {
    
      public SquareTest() {
    }
    
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculate Perimeter");
        Square instance = new Square(2);
        double expResult = 8 ;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of calculateArea method, of class Circle.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculate Area");
        Square instance = new Square(2);
        double expResult = 4;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
    
    }
    
}
