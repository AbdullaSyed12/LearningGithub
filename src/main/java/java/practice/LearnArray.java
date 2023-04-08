package java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearnArray {
    public void stringArray() {
        String[] states = {"Florida", "California", "Georgia", "Texas"};
        for (int index = 0; index < states.length; index++) {
            System.out.println("State name is: " + states[index]);
        }
    }

    public void stringArray2() {
        String[] states = {"Florida", "California", "Georgia", "Texas"};
        int index = 0;
        while (index < states.length) {
            System.out.println("State name is: " + states[index]);
            index++;
        }
    }


    public void sortArray() {
        String[] states = {"Florida", "California", "Georgia", "Texas"};
        Arrays.sort(states, Collections.reverseOrder());
        System.out.println(Arrays.toString(states));
    }

    public void listArray() {
        List<String> lists = new ArrayList<>();

        lists.add("One");
        lists.add("Two");
        lists.add("Three");

//        System.out.println(lists);
//        for(String list: lists) {
//            System.out.println("Print value of list is: " + list);
//        }

        lists.remove("Two");
        lists.add("Four");
        System.out.println(lists);
    }

    List<String> list;
    String[] array;

    public void convertArrayToList() {
        array = new String[]{"Java", "Python", "PHP", "C++"};
        System.out.println(Arrays.toString(array));

        //converting array to list
        list = new ArrayList<>(Arrays.asList(array));
//        for (String language : array) {
//            list.add(language);
//        }
        System.out.println(list);

        list.add("Ruby");
        list.add("Visual Basic");
        System.out.println("Printing list after adding new languages: " + list);
    }

    public void convertListToArray() {
        array = list.toArray(new String[list.size()]);
//        array = list.toArray(new String[0]);
        System.out.println("Printing array upon converting from list: " + Arrays.toString(array));
    }

    public int arraySum(int [] a) {
        int totalValue = 0;
        for (int i = 0; i < a.length; i++) {
            totalValue += a[i];
        }
        return totalValue;
    }

    public void arrayMethod() {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
    }

    public void listMethod() {
        List<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
    }

    public void loopArray() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }

    public void listToArray() {
        Integer [] num = {0,1,2,3,4,5};
        List<Integer> numList = new ArrayList<>(Arrays.asList(num));
        System.out.println(numList);
        numList.add(6);
        System.out.println(numList.size());
        Integer [] array = numList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));
    }


    public void createList() {
        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(2);
        nums.add(40);
        Collections.sort(nums);
        System.out.println(nums);


    }

}
