package fundamental.optionalTask1;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ShortAndLongNumber {
    public static void main(String[] args) {
        int[] array_numbers = new int[]{25, 1, 235, 489, 1, 25896, 22};

        IntStream intStream1= Arrays.stream(array_numbers);
        OptionalInt optionalIntMax = intStream1.max();
        int maxAsInt = optionalIntMax.getAsInt();
        String string_maxAsInt=String.valueOf(maxAsInt);
        int count=0;
        for(int i=0;i<string_maxAsInt.length();i++){
            count++;
        }
        IntStream intStream2 = Arrays.stream(array_numbers);
        OptionalInt optionalIntMin = intStream2.min();
        int minAsInt = optionalIntMin.getAsInt();
        String string_minAsInt=String.valueOf(minAsInt);
        int count2=0;
        for(int i=0;i<string_minAsInt.length();i++){
            count2++;
        }

        System.out.println("Maximum number = " + maxAsInt);
        System.out.println("long maximum number = "+count);
        System.out.println("Minimum number = " + minAsInt);
        System.out.println("long minimum number = "+count2);
    }
}

//1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.