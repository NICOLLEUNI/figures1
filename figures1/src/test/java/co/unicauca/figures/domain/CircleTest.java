package co.unicauca.figures.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author libardo
 */
public class CircleTest {
    
    public CircleTest() {
    }
    
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculate Perimeter");
        Circle instance = new Circle(1);
        double expResult = Math.PI*2;
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
        Circle instance = new Circle(1);
        double expResult = 3.1415;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
    
    }
    
}
