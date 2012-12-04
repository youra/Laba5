
package ru.shkarobeynikov.laba5;


import ru.shkarobeynikov.polhedrons.Cube;
import java.io.*;
import java.util.*;
import ru.shkarobeynikov.polhedrons.Icosahedron;
import ru.shkarobeynikov.polhedrons.Octahedron;
import ru.shkarobeynikov.polhedrons.Polihedron;
import ru.shkarobeynikov.sort.SortMode;
import ru.shkarobeynikov.polhedrons.Tetrahedron;

/**
 *
 * @author ura
 */
public class Laba5 {
    private static List<Polihedron> list;
    
    /**
     *
     * @throws IOException
     */
    public static void init()throws IOException{ // создание и заполнение списка
        double q;
        InputStreamReader isk = new InputStreamReader(System.in);
        BufferedReader bk = new BufferedReader(isk);
        System.out.println("-------------------------------");
        System.out.println("1 - Добавить объект");
        System.out.println("2 - Удалить объект");
        String key = bk.readLine();
        if(key.equals("1")){
            InputStreamReader isp = new InputStreamReader(System.in);
            BufferedReader bp = new BufferedReader(isp);
            System.out.println("-------------------------------");
            System.out.println("Выберите объект");
            System.out.println("1 - Куб");
            System.out.println("2 - Икосаэдр");
            System.out.println("3 - Тетраэдр");
            System.out.println("4 - Октаэдр");
            String keyMenu = bp.readLine();
            InputStreamReader isz = new InputStreamReader(System.in);
            BufferedReader bq = new BufferedReader(isz);
            System.out.println("-------------------------------");
            System.out.println("Укажите ребро: ");
            q = Double.parseDouble(bq.readLine());
            switch (keyMenu){
                case "1": list.add(new Cube(q));break;
                case "2": list.add(new Icosahedron(q));break;
                case "3": list.add(new Tetrahedron(q));break;
                case "4": list.add(new Octahedron(q));break;
        }
    }

        else if(key.equals("2")){
            int del;
            System.out.println("----------------------------");
            System.out.println(" Удаление объекта");
            System.out.println("Укажите Id объекта");
            InputStreamReader isp = new InputStreamReader(System.in);
            BufferedReader bp = new BufferedReader(isp);
            del=Integer.parseInt(bp.readLine());
            for(Polihedron p: list){
                if(del==p.id){del=list.indexOf(p);break;}
            }
            
            list.remove(del);
        }
    }
    
    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException{
        list=new ArrayList<>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        for(;;){
            System.out.println();
            System.out.println("Выберите действие:");
            System.out.println("----------------------------------------------");
            System.out.println("0 - добавить/удалить объект");
            System.out.println("1 - сортировка по возраcтанию id");
            System.out.println("2 - сортировка по убыванию id");
            System.out.println("3 - сортировка по возраcтанию имени");
            System.out.println("4 - сортировка по убыванию имени");
            System.out.println("5 - сортировка по возрастанию длины ребра");
            System.out.println("6 - сортировка по убыванию длины ребра");
            System.out.println("----------------------------------------------");
            String mode = br.readLine(); // читаем строку из буфера ввода
            if(mode.equals("0")){
                init();
            }
            else{
                boolean sortUp = mode.equals("2")||mode.equals("4")||mode.equals("6");
                int sortMode=0;
                if (mode.equals("3")||mode.equals("4")) sortMode=1;
                else if (mode.equals("5")||mode.equals("6")) sortMode=2;
                Collections.sort(list,new SortMode(sortUp,sortMode));
                for(Polihedron p: list){
                    System.out.println(p);
                }
            }
        }
    }
}