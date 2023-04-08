package java.practice;

public class Account {
    int a;
    int b;

    public Account(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void showData() {
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }
}
