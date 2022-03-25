package homework1;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Ex1_1Ez {
    public static void main(String[] args) throws Exception {
      //  File f = new File("C://Users//Public//src//homework1//SRCtxt//1.txt");
        FileReader r = new FileReader("C://Users//Public//src//homework1//SRCtxt//1.txt");
        PrintWriter writer = new PrintWriter("C://Users//Public//src//homework1//SRCtxt//2.txt");
        Scanner s = new Scanner(r);
        Stack<Integer> stack = new Stack<>();
        while (s.hasNextInt()) {
            int b = s.nextInt();
            if (b == 0){
                break;
            } else if(b>0) {
                stack.push(b);
            }
        }
        r.close();
        while (stack.size() != 0){
            Integer a = stack.pop();
            writer.println(a);
        }
        writer.close();
    }
}