package kz.home.fundamentals;

import java.util.Scanner;

public class MainTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String input = in.next();

        // Task 1.Приветствовать любого пользователя при вводе его имени через командную строку.
        System.out.println("=== Task 1 ===");
        System.out.println("Привет " + input);

        // Task 2.Отобразить в окне консоли аргументы командной строки в обратном порядке.
        System.out.println("=== Task 2 ===");
        StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        // Task 3.Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
        System.out.println("=== Task3 ===");
        int[] a = {1, 2, 3, 4, 5};
        for (int i : a) {
            System.out.println(i);
            System.out.print(i);
        }

        // Task 4.Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение)
        //        и вывести результат на консоль.
        System.out.println("\n=== Task 4 ===");
        int num1, num2;
        System.out.println("Введите два целых числа:");
        num1 = in.nextInt();
        num2 = in.nextInt();
        System.out.println("Сумма чисел равна = " + (num1 + num2));
        System.out.println("Произведение чисел равна = " + (num1 * num2));

        // Task 5.Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному
        //        числу. Осуществить проверку корректности ввода чисел.
        System.out.println("=== Task 5 ===");
        System.out.println("Введите число от 1 до 12: ");
        while (true) {
            int number = in.nextInt();
            if (number > 0 && number < 13) {
                switch (number) {
                    case 1:
                        System.out.println("Январь");
                        break;
                    case 2:
                        System.out.println("Февраль");
                        break;
                    case 3:
                        System.out.println("Март");
                        break;
                    case 4:
                        System.out.println("Апрель");
                        break;
                    case 5:
                        System.out.println("Май");
                        break;
                    case 6:
                        System.out.println("Июнь");
                        break;
                    case 7:
                        System.out.println("Июль");
                        break;
                    case 8:
                        System.out.println("Август");
                        break;
                    case 9:
                        System.out.println("Сентябрь");
                        break;
                    case 10:
                        System.out.println("Октябрь");
                        break;
                    case 11:
                        System.out.println("Ноябрь");
                        break;
                    case 12:
                        System.out.println("Декабрь");
                        break;
                }
                break;
            } else {
                System.out.println("Вы ввели неверное число\nВведите число от 1 до 12:");
            }
        }
    }
}
