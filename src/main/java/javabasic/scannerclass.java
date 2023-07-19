package javabasic;
import java.util.Scanner;

public class scannerclass
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("what is your name?");
        String name=scan.next();
        System.out.println("what is your weight?");
        float weight=scan.nextFloat();
        System.out.println("your blood level");
        int bloodlevel=scan.nextInt();

    }
}
