package kz.home.collections;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class OptionalTask {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("data/info.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            FileWriter writer = new FileWriter("data/out.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String reverse = new StringBuilder(line).reverse().toString();
                bufferedWriter.write(reverse, 0, reverse.length());
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stack stack = new Stack();
        int n = 0;
        System.out.println("Введите число ");
        Scanner sc = new Scanner(System.in);
        try {
            n = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.print("Вы ввели не число." );
        }

        char [] numbers = String.valueOf(n).toCharArray();
        for(char num : numbers) {
            stack.push(num);
        }

        while(!stack.empty()) {
            char stackNum;
            stackNum = (Character)stack.pop();
            System.out.print(stackNum);
        }
    }
}

