/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.figures.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author User
 */
public class TriangleTest {
    public TriangleTest() {
    }
    
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculate Perimeter");
        Triangle instance = new Triangle(2,2);
        double expResult = 6;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of calculateArea method, of class Triangle.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculate Area");
        Triangle instance = new Triangle(2,2);
        double expResult = 2;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
    
    }
}
