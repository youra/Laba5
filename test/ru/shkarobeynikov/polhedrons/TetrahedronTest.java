/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.shkarobeynikov.polhedrons;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author youra
 */
public class TetrahedronTest {
    
   @Test
    public void testGetInscribedRadius() {
        System.out.println("Проверка метода getInscribedRadius()");
        Tetrahedron t = new Tetrahedron(6);
        assertEquals(1.22474, t.getInscribedRadius(),0.00001);
    }
    
    @Test
    public void testArea() {
        System.out.println("Проверка метода area()");
        Tetrahedron t = new Tetrahedron(6);
        assertEquals(62.35382, t.area(),0.00001);
    }
    
    @Test
    public void testVolume() {
        System.out.println("Проверка метода volume()");
        Tetrahedron t = new Tetrahedron(6);
        assertEquals(25.45584, t.volume(),0.00001);
    }
    
    @Test
    public void testGetDescribedRadius() {
        System.out.println("Проверка метода getDescribedRadius()");
        Tetrahedron t = new Tetrahedron(6);
        assertEquals(3.67423, t.getDescribedRadius(),0.00001);
    }
}
