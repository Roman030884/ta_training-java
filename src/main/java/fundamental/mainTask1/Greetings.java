package fundamental.mainTask1;

import java.util.Scanner;

public class Greetings {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input your name");
        String name = input.next();
        System.out.println("Hello!!!"+" "+name);
        input.close();
    }
}
//1.Приветствовать любого пользователя при вводе его имени через командную строку.