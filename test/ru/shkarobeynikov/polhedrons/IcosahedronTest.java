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
public class IcosahedronTest {
    
    @Test
    public void testGetInscribedRadius() {
        System.out.println("Проверка метода getInscribedRadius()");
        Icosahedron i = new Icosahedron(5);
        assertEquals(11.33641, i.getInscribedRadius(),0.00001);
    }
    
    @Test
    public void testArea() {
        System.out.println("Проверка метода area()");
        Icosahedron i = new Icosahedron(5);
        assertEquals(216.50635, i.area(),0.00001);
    }
    
    @Test
    public void testVolume() {
        System.out.println("Проверка метода volume()");
        Icosahedron i = new Icosahedron(5);
        assertEquals(272.71187, i.volume(),0.00001);
    }
    
    @Test
    public void testGetDescribedRadius() {
        System.out.println("Проверка метода getDescribedRadius()");
        Icosahedron i = new Icosahedron(5);
        assertEquals(4.75528, i.getDescribedRadius(),0.00001);
    }
}
