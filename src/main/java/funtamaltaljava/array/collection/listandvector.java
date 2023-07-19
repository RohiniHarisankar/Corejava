package funtamaltaljava.array.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class listandvector {
    public static void main(String[] args) {
        ArrayList object = new ArrayList<>();
        object.add("name");
        object.add("Rohini");
        object.add(1992);
        System.out.println(object);

        Vector obj = new Vector<>();
        obj.add("rohini");
        obj.add("Hari");
        obj.addAll(object);
        System.out.println(obj);
        object.removeAll(obj);
        System.out.println(obj);
        object.retainAll(object);
        System.out.println(object);
        Iterator<ArrayList> it = object.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}