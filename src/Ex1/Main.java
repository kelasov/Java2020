package Ex1;

public class Main {
    public static void main(String[] args) {
        int sum1 = 0, sum2 = 0, sum3 = 0, b = 0, c = 0;
        int array[] = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            sum1 = sum1 + array[i];
        }
        System.out.println(sum1);
        while (b != array.length) {
            sum2 = sum2 + array[b];
            b++;
        }
        System.out.println(sum2);
        do {
            sum3 = sum3 + array[c];
            c++;
        }
        while (c != array.length);
        System.out.println(sum3);
    }
}
