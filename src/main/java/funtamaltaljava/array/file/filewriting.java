package funtamaltaljava.array.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class filewriting
{
    public static void main(String[] args) throws IOException, FileNotFoundException
    {
        Scanner scans=new Scanner(System.in);
        File myfile=new File("E:\\batch.doc");

        FileOutputStream fos=new FileOutputStream(myfile);

        String mycontent=scans.nextLine();

        fos.write(mycontent.getBytes());

        fos.close();

    }
}
