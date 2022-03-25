package homework1;

import java.io.*;
import java.util.Scanner;

public class Ex2_2Ez{
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();
        String y = s.nextLine();
        String a = "hello";
        if (x.equals(a))
        {
            System.out.println("Hello " + y + " !");
        }
    }
}