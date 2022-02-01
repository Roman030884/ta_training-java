package fundamental.optionalTask2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class IncreasingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int string = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] mass = new int[string][column];

        Random ron = new Random();
        int mx = 100;
        int mn = -100;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                int f = ron.nextInt((mx - mn) + 1) + mn;
                mass[i][j] = f;
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

        int[] f = new int[mass.length * mass.length];
        int c = 0;
        int r = 0;
        int max = 0;
        int h = 0;
        int m = 0;
        int min = 0;
        int h1 = 0;
        for (int[] x :mass) {
            for (int z : x) {
                f[c++] = z;
            }
        }
        for (int g = 0; g < f.length - 1; g++) {
            if (f[g] < f[g + 1]) {
                r += 1;
                if (r > max) {
                    max = r;
                    h = g + 1;
                }
            } else {
                r = 0;
            }
            if (f[g] > f[g + 1]) {
                m += 1;
                if (m > min) {
                    min = m;
                    h1 = g + 1;
                }
            } else {
                m = 0;
            }
        }
        System.out.println("Максимальная последовательность возрастающих чисел:");
        int[]l=new int[max+1];
        System.arraycopy(f,(h-max),l,0,(max+1));//копирую последовательность возр элем в новый массив
        System.out.println(Arrays.toString(l)+" "+(max+1));
        System.out.println("Максимальная последовательность убывающих чисел:");
        int[]t=new int[min+1];
        System.arraycopy(f,(h1-min),t,0,(min+1));//копирую последовательность убыв элем в новый массив
        System.out.println(Arrays.toString(t)+" "+(min+1));
    }
}

//В заднии достаточно выполнить 1-2 пункта.
//Задание. Ввести с консоли n - размерность матрицы a [n] [n]. Задать значения элементов матрицы в интервале значений
// от -M до M с помощью генератора случайных чисел (класс Random).
//2.     Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
