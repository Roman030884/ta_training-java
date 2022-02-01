package fundamental.optionalTask1;

import java.util.*;

public class AscendingAndDescendingNumbers {
    public static void main(String[] args) {


        String[] sArr = {"17", "8", "22", "0", "21", "75", "15", "25", "6",};
        sortMethod(sArr);
    }

    public static void sortMethod(String[] strArr) {

        List<String> stringList = Arrays.asList(strArr);
        Collections.sort(stringList, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return extractInt(o1) - extractInt(o2);
            }


            int extractInt(String s) {
                String num = s.replaceAll("\\D", "");
                return num.isEmpty() ? 0 : Integer.parseInt(num);
            }
        });
        System.out.println(stringList);

        Collections.reverse(stringList);
        System.out.println(stringList);
    }
}
//2. Вывести числа в порядке возрастания (убывания) значений их длины.