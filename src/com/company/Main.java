package com.company;

public class Main {

    public static void main(String[] args) {
        double firstValue;
        double secondValue;

        // initialize variables
        firstValue = 22;
        secondValue = 7;
        String operator = "-";
        String minMax = "min";

        System.out.println(doArithmetic(firstValue, secondValue, operator));
        System.out.println(checkTwoNumbers(firstValue, secondValue, minMax));


    }

    public static double doArithmetic(double firstNumber, double secondNumber, String operator) {
        double answer;
        answer = 0;
        switch (operator) {
            case "+":
                answer = firstNumber + secondNumber;
                return answer;
            case "-":
                answer = firstNumber - secondNumber;
//				System.out.println(answer);
                return answer;
            case "*":
                answer = firstNumber * secondNumber;
//				System.out.println(answer);
                return answer;
            case "/":
                answer = firstNumber / secondNumber;
//				System.out.println(answer);
                return answer;
            default:
                System.out.println("Enter a valid operator");
                break;
        }

        return answer;
    }

    // Create a method that checks two numbers and uses a switch to
    // return max, min
    public static double checkTwoNumbers(double firstNumber, double secondNumber, String minMax) {
        double answer;
        answer = 0;
        switch (minMax) {
            case "max":
                answer = Math.max(firstNumber, secondNumber);
                return answer;
            case "min":
                answer = Math.min(firstNumber, secondNumber);
                return answer;
            default:
                System.out.println("Enter a valid operator");
                break;
        }
        return answer;
    }
}

