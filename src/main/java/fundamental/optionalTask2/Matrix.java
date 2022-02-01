package fundamental.optionalTask2;

import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int string = scanner.nextInt();
        int column = scanner.nextInt();
        int q = 0;
        int[][] mass = new int[string][column];

        Random ron = new Random();
        int max = 100;
        int min = -100;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                int f = ron.nextInt((max - min) + 1) + min;
                mass[i][j] = f;
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < string * column - 1; i++) {
            for (int j = i; j < column * string; j++) {
                if (mass[(int) i / column][(int) i % column] > mass[(int) j / column][(int) j % column]) {
                    q = mass[(int) i / column][(int) i % column];
                    mass[(int) i / column][(int) i % column] = mass[(int) j / column][(int) j % column];
                    mass[(int) j / column][(int) j % column] = q;
                }
            }
        }
        System.out.println("--------New Matrix--------");
        for (int i = 0; i < string; i++) {
            for (int j = 0; j < string; j++) {
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
//В заднии достаточно выполнить 1-2 пункта.
//Задание. Ввести с консоли n - размерность матрицы a [n] [n]. Задать значения элементов матрицы в интервале значений
// от -M до M с помощью генератора случайных чисел (класс Random).
//1.     Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).