
package ru.shkarobeynikov.polhedrons;


/**
 *
 * @author ura
 */

/**
* Класс - тетраэдр
*/
public class Tetrahedron extends Polihedron {
    
    /**
     *
     * @param d
     */
    public Tetrahedron(double d){
        super(d);
        this.setName("Тетраэдр");
        this.setTop(4);
        this.setVerge(4);
    }
   
    @Override
    public double getInscribedRadius(){
        return d*Math.sqrt(6)/12;
    }
    
    @Override
    public double getDescribedRadius(){
        return d*Math.sqrt(6)/4;
    }
    
    @Override
    public double area(){
        return Math.sqrt(3)*d*d;
    }
    
    @Override
    public double volume(){
        return Math.sqrt(2)*d*d*d/12;
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