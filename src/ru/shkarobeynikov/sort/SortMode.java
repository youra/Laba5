
package ru.shkarobeynikov.sort;


import java.util.Comparator;
import ru.shkarobeynikov.polhedrons.Polihedron;

/**
 *
 * @author ura
 */

/**
* Класс - сортировка
* Три вида сортировки:
* по возрастанию(убыванию) идивидуального номера
* по назаниб объекта
* по длине ребра
*/
public class SortMode implements Comparator<Polihedron>{
    private boolean sortUp;
    private int sortMode;
    
    /**
     *
     * @param sortUp
     * @param sortMode
     */
    public SortMode(boolean sortUp, int sortMode) {
       this.sortUp = sortUp;
       this.sortMode = sortMode;
    }

    @Override
    public int compare(Polihedron p1, Polihedron p2) {
        int res=0;
        if (sortMode==0){
            if (p1.getId()>p2.getId()) res=1;
            else if (p1.getId()<p2.getId()) res=-1;
        }
        if (sortMode==1){
        res=p1.getName().compareTo(p2.getName());
        }
        else {
            if (p1.d>p2.d) res=1;
            else if (p1.d<p2.d) res=-1;
        }
        if (sortUp) res*=(-1);
        return res;
    }
}