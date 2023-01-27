import java.util.Random;
import java.util.Arrays;
public class Ex3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(15);
        }
        System.out.println(Arrays.toString(arr));
        int[] result = mergesort(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] mergesort(int[] array1) {
        int[] list1 = Arrays.copyOf(array1, array1.length);
        int[] list2 = new int[array1.length];
        int[] result = mergesort1(list1, list2, 0, array1.length);
        return result;
    }
    public static int[] mergesort1(int[] list1, int[] list2,
            int start, int end) {
        if (start >= end - 1) {
            return list1;
        }
        int middle = start + (end - start) / 2;
        int[] sort = mergesort1(list1, list2, start, middle);
        int[] sort1 = mergesort1(list1, list2, middle, end);
        int index1 = start;
        int index2 = middle;
        int dest = start;
        int[] result = sort == list1 ? list2 : list1;
        while (index1 < middle && index2 < end) {
            result[dest++] = sort[index1] < sort1[index2]
                    ? sort[index1++] : sort1[index2++];
        }
        while (index1 < middle) {
            result[dest++] = sort[index1++];
        }
        while (index2 < end) {
            result[dest++] = sort1[index2++];
        }
        return result;
    }
}