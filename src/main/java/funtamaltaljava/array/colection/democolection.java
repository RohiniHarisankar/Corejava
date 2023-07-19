package funtamaltaljava.array.colection;

import java.util.LinkedList;


public class democolection

{
    public static void main(String[] args)
    {
        LinkedList<java.io.Serializable> object=new LinkedList<>();
        object.add(21);
        object.add(555555555555555l);
        object.add(55.5);
        object.add(1232545f);
        System.out.println(object);
        object.remove(55.5);
        System.out.println(object);
        object.set(2,454);
        System.out.println(object);
        System.out.println(object.get(1));
        System.out.println(object.getLast());
        LinkedList<Integer> obj=new LinkedList<>();
        object.add(222222222l);
        System.out.println(object.getLast());
        System.out.println(object.getLast());
        System.out.println(object.indexOf(true));
        object.set(1,false);
        System.out.println(object);
    }
}
