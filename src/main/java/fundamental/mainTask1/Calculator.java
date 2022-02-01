package fundamental.mainTask1;

import java.util.Scanner;

public class Calculator {
    public static void main (String[]args){
        Scanner input_number = new Scanner(System.in);
        int x =input_number.nextInt();
        int y =input_number.nextInt();
        int sum = x+y;
        int multiplications =x*y;
        System.out.println("x+y="+" "+sum);
        System.out.println("x*y="+" "+multiplications);
        input_number.close();
    }
}
//4.     Ввести целые числа как аргументы командной строки,
// подсчитать их сумму (произведение) и вывести результат на консоль.