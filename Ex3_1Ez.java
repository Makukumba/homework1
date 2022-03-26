package homework1;

import java.io.*;

public class Ex3_1Ez{
    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("C://Users//Public//src//homework1//SRCtxt//1.txt");
        int c;
        while ((c = f.read()) !=-1)
            System.out.print((char) c );
    }}