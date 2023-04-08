package java.practice;

public class LearnConditionalStatements {
    public void learnIfStatement(int x) {
        //print the value of x if it is less than 20
        if (x < 20) {
            System.out.println("Value of x: " + x);
        }
    }

    public void learnIfElseStatement(int x) {
        if (x < 20) {
            System.out.println("This is the if statement");
        }
        else {
            System.out.println("This is the else statement");
        }
    }

    public void nestedIfStatement() {
        int x = 30;
        int y = 10;
        if (x < 35) {
            if (y < 15) {
                System.out.println("x = "+x+" and y = " + y);
            }
        }
    }

    public void switchStatement(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You passed");
                break;
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is: " + grade);
    }

    public void printGrade(char grade) {
        if(grade == 'A') {
            System.out.println("Excellent");
        } else if(grade == 'B'|| grade == 'C' ) {
            System.out.println("Well done");
        } else if(grade == 'D') {
            System.out.println("You passed");
        } else if(grade == 'F') {
            System.out.println("Better try again");
        } else {
            System.out.println("Invalid grade");
        }
        System.out.println("Your grade is: " + grade);
    }

    public void conditionalOperator() {
        int a,b;
        a = 10;
        b = (a == 1 ? 20:30);
        System.out.println("Value of b is: " + b);
    }


}
