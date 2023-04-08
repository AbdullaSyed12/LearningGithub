package java.practice;

public class LearnException {
    public void testExceptions() {
        try{
            int [] num = {1,2,3,4};
            System.out.println(num[5]);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void addArrayNumbers() {
        int[] numbers = {1,2,3};
        int sum = numbers[0] + numbers[4];
        System.out.println(sum);
    }
}
