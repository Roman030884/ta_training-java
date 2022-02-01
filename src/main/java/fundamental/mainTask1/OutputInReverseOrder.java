package fundamental.mainTask1;

import java.util.Scanner;

public class OutputInReverseOrder {
    public static void main(String args[]) {
        Scanner input_arg = new Scanner(System.in);
        System.out.println("input argument");
            StringBuffer revers = new StringBuffer(input_arg.nextLine());
            System.out.println( revers.reverse());
            input_arg.close();
    }
}
//2.Отобразить в окне консоли аргументы командной строки в обратном порядке.