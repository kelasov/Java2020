package Ex5;

public class Main {
    public static void main(String[] args) {
        Fact(5);
    }
    public static void Fact(int a) {
        int b=1;
        for (int i=1; i<=a; i++) {
            b=b*i;
        }
        System.out.println(b);
    }
}