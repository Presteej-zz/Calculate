package personal.tejaunrichard.calculatorapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;

        char operation;
        int answer = 0;
        boolean input;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number.");
        firstNumber = scanner.nextInt();

        System.out.println("Please enter the second number.");
        secondNumber = scanner.nextInt();

        System.out.println("What's the operation?");
        operation = scanner.next().charAt(0);


        do {
            switch (operation) {
                case '+' -> {
                    input = true;
                    answer = firstNumber + secondNumber;
                }
                case '-' -> {
                    input = true;
                    answer = firstNumber - secondNumber;
                }
                case '*' -> {
                    input = true;
                    answer = firstNumber * secondNumber;
                }
                case '/' -> {
                    input = true;
                    answer = firstNumber / secondNumber;
                }
                default -> {
                    input = false;
                    System.out.println("Invalid operation.");
                    System.out.println("Please enter the /, *, +, or - operator.");
                    operation = scanner.next().charAt(0);
                }
            }
        } while (!input);

        System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + answer);

    }


}


