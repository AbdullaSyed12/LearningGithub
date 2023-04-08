package java.practice;

import java.util.Random;

public class LearnJavaMath {
    public void learnRandomize(){
        Random rand = new Random();
        int rand_num1 = rand.nextInt(1000);
        int rand_num2 = rand.nextInt(1000);
        System.out.println("Random numbers: " +rand_num1);
        System.out.println("Random numbers: " +rand_num2);
    }

    public void learnRound(){
        double num1 = 74.65;
        double num2 = 74.34;
        System.out.println(Math.round(num2));
    }

    public void learnMax() {
        System.out.println(Math.max(12,16));
        System.out.println(Math.max(12.6654,12.3232));
    }
}
