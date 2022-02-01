package fundamental.mainTask1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        Scanner inputNumberMonth = new Scanner(System.in);
        System.out.println("input number month");
        try {
            int numberMonth = inputNumberMonth.nextInt();
            switch (numberMonth) {
                case 1:
                    System.out.println("january");
                    break;
                case 2:
                    System.out.println("february");
                    break;
                case 3:
                    System.out.println("march");
                    break;
                case 4:
                    System.out.println("april");
                    break;
                case 5:
                    System.out.println("may");
                    break;
                case 6:
                    System.out.println("june");
                    break;
                case 7:
                    System.out.println("july");
                    break;
                case 8:
                    System.out.println("august");
                    break;
                case 9:
                    System.out.println("september");
                    break;
                case 10:
                    System.out.println("october");
                    break;
                case 11:
                    System.out.println("november");
                    break;
                case 12:
                    System.out.println("december");
                default:
                    System.out.println("enter an integer from 1 to 12");
            }
        } catch (InputMismatchException exception) {
            System.out.println("enter an integer from 1 to 12");
        }
    }
}
//5.   Ввести число от 1 до 12. Вывести на консоль название месяца,
// соответствующего данному числу. Осуществить проверку корректности ввода чисел.