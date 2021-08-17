package kz.home.fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class OptionalTask1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        int n = in.nextInt();
        String[] numbers = new String[n];
        System.out.print("Введите целые числа через пробел и нажмите <Enter>: ");
        for (int i=0; i<n; i++) {
            numbers[i] = in.next();
        }

        System.out.println(Arrays.toString(numbers));
        // Task 1.Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        System.out.println("======================================================================");
        System.out.println("Task 1.Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.");
        int max = numbers[0].length(), min = numbers[0].length();
        String maxNum = numbers[0], minNum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i].length()) {
                max = numbers[i].length();
                maxNum = numbers[i];
            }
            if (min > numbers[i].length()) {
                min = numbers[i].length();
                minNum = numbers[i];
            }
        }

        System.out.println("Max = " + maxNum + " Length of digit: " + max);
        System.out.println("Min = " + minNum + " Length of digit: " + min);

        System.out.println("======================================================================");
        //Task 2.Вывести числа в порядке возрастания (убывания) значений их длины.
        System.out.println("Task 2.Вывести числа в порядке возрастания (убывания) значений их длины.");

        for (int i = numbers.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[i].length() > numbers[j].length()) {
                    String temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

        for (int i=0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
        System.out.println("======================================================================");

    }
}
