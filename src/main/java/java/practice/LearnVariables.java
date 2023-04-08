package java.practice;

public class LearnVariables {
    public void intVariables() {
        int salary = 1000;
        System.out.println("My salary is:" + salary);
    }

    public void floatVariables() {
        float price = 45.6f;
        System.out.println("Product price is: " + price);
    }

    public void booleanVariables() {
        boolean red = true;
        boolean green = false;
        System.out.println("Red light is " + red + ". Green light is " + green);
    }

    public void characterVariables() {
        char alphabet = 'A';
        System.out.println("Alphabet is " + alphabet);

    }

    public void stringVariables() {
        String name = "Robin";
        String city = "Philadelphia";
        System.out.println("My name is " + name + " I live in " + city);
    }

    public int addNumbers (int a , int b) {
        int sum = a + b;
        return sum;
    }

    public float calcAverage(int a,int b) {
        double avg = 0;
        avg = (a + b)/2.0;
        return (float) avg;


    }
    private float average(int a,int b) {
        double avg= 0;
        avg = (a+b)/2.0;
        return (float) avg;
    }
    
}
