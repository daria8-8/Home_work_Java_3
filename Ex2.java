import java.util.ArrayList;
import java.util.Random;
public class Ex2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int list2 = rnd.nextInt(0, 100);
            list1.add(list2);
        }
        System.out.printf("Первоначальный список %s\n", list1);
        int i_max = list1.get(0);
        int i_min= list1.get(0);
        int i_sum = 0;
        for (int i : list1) {
            if (i > i_max) {
                i_max = i;
            }
            if (i < i_min) {
                i_min = i;
            }
            i_sum += i;
        }
        float average = (float)i_sum/list1.size();
        System.out.printf("Максимальный элемент %s\n", i_max);
        System.out.printf("Минимальный элемент %s\n", i_min);
        System.out.printf("Среднее арифметическое %s\n", average);
    }
}