package funtamaltaljava.array.colection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class demoarraylistandvector
{
    public static void main(String[] args)
    {
        ArrayList object=new ArrayList<>();
        object.add("rohini");
        object.add("rohini");
        System.out.println(object);
        object.add(25);
        object.add(true);
        System.out.println(object);
        object.add(253.2);
        object.add(58);
        System.out.println(object);

        Vector obj=new Vector();
        obj.addAll(object);
        obj.add("hari");
        obj.add(90);
        obj.add(320.52);
        System.out.println("print vector value"+obj);
        System.out.println("print arraylist value "+object);


        Iterator<ArrayList> it =object.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
object.removeAll(obj);
        System.out.println(obj);
object.add(2154545466l);
        System.out.println(object);


    }
}
