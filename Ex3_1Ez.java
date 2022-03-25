package homework1;

import java.io.*;

public class Ex3_1Ez{
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        FileReader f = new FileReader("C://Users//Public//SRCtxt//1.txt");
        String name;
        int c;
        while ((c = f.read()) != -1)
            System.out.print((char) c ); // 222312321
    }}