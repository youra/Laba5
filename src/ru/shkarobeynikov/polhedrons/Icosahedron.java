
package ru.shkarobeynikov.polhedrons;

import ru.shkarobeynikov.polhedrons.Polihedron;


/**
 *
 * @author ura
 */

/**
* Класс - икосаэдр
*/
public class Icosahedron extends Polihedron{
    
    /**
     *
     * @param d
     */
    public Icosahedron(double d){
        super(d);
        this.setName("Икосаэдр");
        this.setTop(12);
        this.setVerge(20);
    }
    
    @Override
    public double getInscribedRadius(){
        return (3+Math.sqrt(5))*d/4*Math.sqrt(3);
    }
    
    @Override
    public double getDescribedRadius(){
        return Math.sqrt(2*(5+Math.sqrt(5)))*d/4;
    }
   
    @Override
    public double area(){
        return 5*d*d*Math.sqrt(3);
    }
    
    @Override
    public double volume(){
        return 5*(3+Math.sqrt(5))*d*d*d/12;
    }

    @Override
    public String toString(){
        System.out.println();
        return "id="+this.getId()+", "+this.getName()+
        ", кол-во вершин: "+this.getTop()+", кол-во граней: "+this.getVerge()+
        ", ребро: "+this.getD()+", r: "+getInscribedRadius()+
        ", R: "+getDescribedRadius()+", S: "+area()+", V: "+volume();
    }
}