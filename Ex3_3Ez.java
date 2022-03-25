package homework1;

import java.io.*;
import java.util.Scanner;

public class Ex3_3Ez{
    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("C://Users//Public//SRCtxt//3.txt");
        Scanner s = new Scanner(f);
        int a = 0;
        String x ="" ;
        while (s.hasNext())
        {
            String  ex = s.nextLine();
            if (ex.length()>a)  {
                a = ex.length();
                x = ex;
            }}
        System.out.println(x);
    }}