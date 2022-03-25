package homework1;

import java.util.Scanner;

public class Ex2_3Ez{
    public static void main(String[] args) throws ExceptionNotInt {

        Scanner s = new Scanner(System.in);

        String t = s.nextLine();
        while (s.hasNextInt()) {
            int a = s.nextInt();
            if (a> 0) {
              for (int i = 0; i < a; i++){
                    System.out.println(t);}
            } else if (a != (int)a){throw new ExceptionNotInt("Ошибка");}
            else {
            throw new ExceptionNotInt("Ошибка");
        }}
    }
    public static class ExceptionNotInt extends Exception{
        public ExceptionNotInt(String message) {
        }
    }
}