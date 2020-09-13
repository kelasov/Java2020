package Ex4;

import java.util.Random;

public class Main {

    public static void Sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int b = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = b;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.print("1 Способ: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.print("\n" + "Отсортированный массив: ");
        Sort (array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n" + "2 Способ: ");
        Random rand=new Random(123);
        for (int i = 0; i < array.length; i++) {
            array[i]=rand.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.print("\n" + "Отсортированный массив: ");
        Sort (array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}