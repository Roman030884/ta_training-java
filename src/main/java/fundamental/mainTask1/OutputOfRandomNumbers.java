package fundamental.mainTask1;

import java.util.Random;
import java.util.Scanner;

public class OutputOfRandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input size");
        int x = scanner.nextInt();
        int[] mass = new int[x];

        Random ron = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = ron.nextInt(110);
            System.out.print(mass[i] + " ");

        }

        scanner.close();
    }
}
//3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
