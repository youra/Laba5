/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.shkarobeynikov.polhedrons;

import org.junit.Test;
import static org.junit.Assert.*;

public class CubeTest {

    @Test
    public void testGetInscribedRadius() {
        System.out.println("Проверка метода getInscribedRadius()");
        Cube c = new Cube(4);
        assertEquals(2, c.getInscribedRadius(),0.00001);
    }
    
    @Test
    public void testArea() {
        System.out.println("Проверка метода area()");
        Cube c = new Cube(4);
        assertEquals(96, c.area(),0.00001);
    }
    
    @Test
    public void testVolume() {
        System.out.println("Проверка метода volume()");
        Cube c = new Cube(4);
        assertEquals(64, c.volume(),0.00001);
    }
    
    @Test
    public void testGetDescribedRadius() {
        System.out.println("Проверка метода getDescribedRadius()");
        Cube c = new Cube(4);
        assertEquals(3.46410, c.getDescribedRadius(),0.00001);
    }
}
