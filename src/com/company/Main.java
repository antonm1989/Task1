package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        System.out.println("task 1: Приветствовать любого пользователя при вводе его имени через командную строку.");
//
        Scanner scanner = new Scanner(System.in);
//        String userName = scanner.nextLine();
//        System.out.println("Hello " + userName + "!");
//
//
//        System.out.println();
//        System.out.println("task 2: Отобразить в окне консоли аргументы командной строки в обратном порядке.");
//
//        for (int i = args.length - 1; i >= 0; i--) {
//            System.out.print(args[i] + " ");
//        }
//
//        for (String arg : args) {
//            System.out.print(String.valueOf(arg) + " ");
//        }
//
//        System.out.println();
//        System.out.println("task 3: Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.");
//
//        int amountOfNumbers = 10;
//        int randomNumber;
//
//        for (int i = 0; i < amountOfNumbers; i++) {
//            randomNumber = (int) (Math.random() * 3);
//            System.out.println(randomNumber);
//        }
//
//        for (int i = 0; i < amountOfNumbers; i++) {
//            randomNumber = (int) (Math.random() * 3);
//            System.out.print(randomNumber + " ");
//        }
//
//        System.out.println();
//        System.out.println();
//        System.out.println("task 4: Ввести пароль из командной строки и сравнить его со строкой-образцом.");
//
//        String correctPassword = "qwerty";
//        Scanner scannerPassword = new Scanner(System.in);
//        String enteredPassword = scannerPassword.nextLine();
//
//        if (correctPassword.equals(enteredPassword)) {
//            System.out.println("The password is correct");
//        } else System.out.println("The password is NOT correct");
//
//        System.out.println();
//        System.out.println("task 5: Ввести целые числа как аргументы командной строки, подсчитать их суммы " +
//                "(произведения) и вывести результат на консоль.");
//
//        Scanner scannerArguments = new Scanner(System.in);
//        String enteredArguments = scannerArguments.nextLine();
//
//        int sumOfNumbers = 0;
//        int multiplicationOfNumbers = 1;
//
//        for (String s : enteredArguments.trim().split("\\s+")) {
//            System.out.println("s = " + s);
//            sumOfNumbers += Integer.parseInt(s);
//            multiplicationOfNumbers *= Integer.parseInt(s);
//        }
//        System.out.println("Sum of numbers = " + sumOfNumbers + " , Multiplication = " + multiplicationOfNumbers);
//
//        System.out.println();
        System.out.println("task 6.1: Ввести с консоли n целых чисел. На консоль вывести: четные и нечетные числа.");

        int numberOfNumbers = 5;

        scanner = new Scanner(System.in);
        System.out.println("Input " + numberOfNumbers + " numbers with spaces: ");
        String enteredNumbersString = scanner.nextLine();

        String enteredNumbersStringArray[] = enteredNumbersString.trim().split("\\s+");
        int enteredNumbersIntegerArray[] = new int[enteredNumbersStringArray.length];

        for (int i = 0; i < enteredNumbersStringArray.length; i++) {
            enteredNumbersIntegerArray[i] = Integer.parseInt(enteredNumbersStringArray[i]);
            //System.out.print(enteredNumbersIntegerArray[i] + " ");
        }

        System.out.print("Четные числа: ");
        for (int n : enteredNumbersIntegerArray
        ) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }

        }
        System.out.println();
        System.out.print("Нечетные числа: ");
        for (int n : enteredNumbersIntegerArray
        ) {
            if (n % 2 == 1) {
                System.out.print(n + " ");
            }

        }
        System.out.println();
        System.out.println("task 6.2: Ввести с консоли n целых чисел. На консоль вывести: Наибольшее и наименьшее число.");

        int maxNumber = enteredNumbersIntegerArray[1], minNumber = enteredNumbersIntegerArray[1];

        for (int n : enteredNumbersIntegerArray
        ) {
            if (n > maxNumber) {
                maxNumber = n;
            }
            if (n < minNumber) {
                minNumber = n;
            }


        }
        System.out.println("Наибольшее число: " +maxNumber + " Наименьшее число: " + minNumber);


    }
}