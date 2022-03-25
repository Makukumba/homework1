package homework1;

import java.io.*;
import java.util.*;

public class Ex1_3Ez{
    public static void main(String[] args) throws IOException {
        FileReader r = new FileReader("C://Users//Public//src//homework1//SRCtxt//1.txt");
        Scanner s = new Scanner(r);
        LinkedList<Integer> list = new LinkedList<>();
        while (s.hasNextInt()) {
            int a = s.nextInt();
            if (a < 0){break;
            }
            else if (a == 0) {break;}
                else if(a>0) {
                list.add(a);
            }}
        while (list.size() != 0){
            System.out.println(list.pollLast());
        }}}