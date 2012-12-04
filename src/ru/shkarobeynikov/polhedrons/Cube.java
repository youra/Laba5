
package ru.shkarobeynikov.polhedrons;


/**
 *
 * @author ura
 */

/**
* Класс - куб
*/
public class Cube extends Polihedron{
    
    /**
     *
     * @param d
     */
    public Cube (double d){
        super(d);
        this.setName("Куб");
        this.setTop(8);
        this.setVerge(6);
    }
    
    @Override
    public double getInscribedRadius(){
        return d/2;
    }
    
    @Override
    public double getDescribedRadius(){
        return Math.sqrt(3)*d/2;
    }
    
    @Override
    public double area(){
        return 6*d*d;
    }
    
    @Override
    public double volume(){
        return d*d*d;
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