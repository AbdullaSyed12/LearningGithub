package java.practice;

public class LearnLoop {
    public void whileLoop() {
//        System.out.println("I live in NYC");
//        System.out.println("I work as an engineer");
        int x = 0;
        while (x <= 10) {
            System.out.println("Value of x: " + x);
            x++;
        }
    }

    public void forLoop() {
        for (int x = 1; x <= 7; x++) {
            System.out.println("Value of x: " + x);
        }
    }

    public void doWhileLoop() {
        int x = 1;
        do {
            System.out.println("Value of x: " + x);
            x++;
        } while(x <= 100);
    }

    public void whileLoop2() {
        int i = 5;
        while(i<=5) {
            System.out.println(i);
            i++;
        }
    }

    public void print1To100 () {
        for (int x = 0; x <= 100; x++ )
            System.out.println(x);
    }
    

}
