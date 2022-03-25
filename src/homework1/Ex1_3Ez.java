package homework1;

import java.io.*;
import java.util.*;

public class Ex1_3Ez{
    public static void main(String[] args) throws IOException {
        FileReader r = new FileReader("C://Users//Public//SRCtxt//1.txt");
        Scanner s = new Scanner(r);
        LinkedList<Integer> list = new LinkedList<>();
        while (s.hasNext()) {
            int number = s.nextInt();
            if (number == 0){break;
            } else if(number>0) {
                list.add(number);
            }}
        while (list.size() != 0){
            System.out.println(list.peekLast());
        }}}