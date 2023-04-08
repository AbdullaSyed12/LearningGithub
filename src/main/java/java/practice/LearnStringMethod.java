package java.practice;

import java.util.Arrays;

public class LearnStringMethod {
    public void learnIndexOf() {
        String myStr = "Hello planet Earth, you are a great planet.";
        System.out.println(myStr.indexOf("planet"));
        System.out.println(myStr.indexOf("planet",15));
        System.out.println(myStr.indexOf("test"));
    }

    public void learnSubString() {
        String str = "JavaPoint";
        String subStr1 = str.substring(2);
        System.out.println(subStr1);

        String subStr2 = str.substring(0,4);
        System.out.println(subStr2);
    }

    public void learnReplace () {
        String str = "Hello World, hello world #";
        String replacedStr = str.replace('#','&');
        System.out.println(replacedStr);
        String replaceWord = str.replaceAll("World","Florida");
        System.out.println(replaceWord);
    }

    public void learnLength(){
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(txt.length());
    }

    public void learnTrim() {
        String myStr = "        Hello World        ";
        System.out.println(myStr);
        System.out.println(myStr.trim());
    }

    public void learnCharAt() {
        String str = "Hello";
        String reverseWord = " ";
        for(int i = str.length()-1; i >=0; i--) {
            char result = str.charAt(i);
            reverseWord += String.valueOf(result);
        }
        System.out.println(reverseWord);
    }

    public void learnFormat () {
        String name = "Jonathan";
        int age = 20;
        double salary = 40000;
        String y = String.format("My name is %s and I am %d years old, and my salary is $%d yearly" , name,age,salary);
        System.out.println(y);
    }

    public void learnContains () {
        String str = "Hello John";
        System.out.println(str.contains("hn"));
    }

    public void learnSplit() {
        String names = "John,Ali,Mathew,Abraham";
        String[] nameArray = names.split(",");
        System.out.println(Arrays.toString(nameArray));
        for(String name : nameArray) {
            System.out.println("Individual: " + name);
        }
    }

    public void longSubString() {
        String firstName = "John";
        String lastName = "Wick";
        System.out.println("This is the name: " + firstName +" " + lastName);
    }

    public static void printReverse() {
        String st = "Hello, my name is Abdullah";
        String rst = " ";
        for (int i = st.length()-1; i >= 0; i--) {
            char result = st.charAt(i);
            rst += String.valueOf(result);
        }
        System.out.println(rst);
    }
}





