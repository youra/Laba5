
package ru.shkarobeynikov.polhedrons;

import ru.shkarobeynikov.polhedrons.Polihedron;


/**
 *
 * @author ura
 */

/**
* Класс - октаэдр
*/
public class Octahedron extends Polihedron{
   
    /**
     *
     * @param d
     */
    public Octahedron (double d){
        super(d);
        this.setName("Октаэдр");
        this.setTop(6);
        this.setVerge(8);
    }
    
    @Override
    public double getInscribedRadius(){
        return d*Math.sqrt(6)/6;
    }
    
    @Override
    public double getDescribedRadius(){
        return d*Math.sqrt(2)/2;
    }
    
    @Override
    public double area(){
        return 2*d*d*Math.sqrt(3);
    }
    
    @Override
    public double volume(){
        return Math.sqrt(2)*d*d*d/3;
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