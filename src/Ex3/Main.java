package Ex3;

public class Main {
    public static void main(String[] args) {
        double num = 0;
        for (int i=1; i<11; i++) {
            num = 1.0/i;
            String str = String.format("%.2f", num);
            System.out.print(str + " ");
        }
    }
}