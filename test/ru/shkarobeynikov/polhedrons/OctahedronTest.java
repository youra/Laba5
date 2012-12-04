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
public class OctahedronTest {
    
    @Test
    public void testGetInscribedRadius() {
        System.out.println("Проверка метода getInscribedRadius()");
        Octahedron o = new Octahedron(4);
        assertEquals(1.63299, o.getInscribedRadius(),0.00001);
    }
    
    @Test
    public void testArea() {
        System.out.println("Проверка метода area()");
        Octahedron o = new Octahedron(4);
        assertEquals(55.42562, o.area(),0.00001);
    }
    
    @Test
    public void testVolume() {
        System.out.println("Проверка метода volume()");
        Octahedron o = new Octahedron(4);
        assertEquals(30.16988, o.volume(),0.00001);
    }
    
    @Test
    public void testGetDescribedRadius() {
        System.out.println("Проверка метода getDescribedRadius()");
        Octahedron o = new Octahedron(4);
        assertEquals(2.82842, o.getDescribedRadius(),0.00001);
    }
}
