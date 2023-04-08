package java.practice;

import java.util.HashMap;

public class Homework {
    public int[] arrayFirstElement(int[] a, int[] b) {
        int[] first = {a[0], b[0]};
        return first;
    }

    public int[] arrayMiddle(int[] a) {
        int middle = a.length / 2;
        int[] middleArray = {a[middle - 1], a[middle]};
        return middleArray;

//    public int[] arrayMiddle(int[] a) {
//        return new int[]{
//                a[a.length/2 -1], a[a.length/2]};
    }













    public int arraySum(int[]a) {
        int totalNumber = 0;
        for(int value: a) {
            totalNumber += value;
        }
        return totalNumber;
    }

    public int total(int[] a) {
        int sum = 0;
        int i;
        for(i = 0; i < a.length; i++) {
            sum+=a[i];}
        return sum;
    }

    public HashMap<String, Integer> word0(String[] strings) {
        HashMap<String, Integer> map = new HashMap<String,Integer>();
        for (String s:strings) {
            map.put(s,0);
        }
        return map;
    }

    public HashMap<String,Integer> length(String[] strings) {
        HashMap<String, Integer> hmap = new HashMap<>();
        for (String s: strings) {
            hmap.put(s,s.length());
        }
        return hmap;
    }


    public int [] fizzArray(int n) {
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public int countHi(String str) {
        char search = 'h';
        int count = 0;
        for (int i = 0; i < str.length();i++) {
            if (str.charAt(i) == search)
                count++;
        }
        return search;
    }
}
