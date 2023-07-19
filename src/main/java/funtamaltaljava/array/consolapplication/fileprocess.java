package funtamaltaljava.array.consolapplication;

import java.io.*;
import java.util.ArrayList;

public class fileprocess implements bikecustomerdetails,Runnable {
    File myfile = new File("C:\\Users\\rohin\\IdeaProjects\\java\\src\\main\\java\\funtamaltaljava\\array\\consolapplication\\basic.doc");

    //ArrayList<bikedetails>customer=new ArrayList<bikedetails>();
    ArrayList<bikedetails> customer = null;

    public fileprocess() {
        System.out.println("file process");
        customer = new ArrayList<bikedetails>();
    }

    public void writing() throws IOException {
        FileOutputStream fos = new FileOutputStream(myfile);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(customer);

        oos.close();
        fos.close();
    }

    public void reading() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(myfile);
        ObjectInputStream ois = new ObjectInputStream(fis);

        customer = (ArrayList<bikedetails>) ois.readObject();

        ois.close();
        fis.close();

    }

    @Override
    public String addcustomerdetail(bikedetails bike)
    {
        try {
            reading();
            customer.add(bike);
            writing();
        }
        catch (IOException e)
        {

        }
        catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return bike.getCustomername()+"has been added successfully";
    }



    @Override
    public void listallcustomerdetail() {

    }

    @Override
    public String updatecustomerdetail(String customername)
    {
        return null;
    }

    @Override
    public String deletecustomerdetail(String customername)
    {
        return null;
    }

    @Override
    public void sortingcustomerdetail()
    {

    }

    @Override
    public void run()
    {


    }
}
