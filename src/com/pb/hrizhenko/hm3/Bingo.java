package com.pb.hrizhenko.hm3;

import java.util.Scanner;
import java.util.Random;

//        import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomValue = rand.nextInt(101);
        int attempts = 0;

        System.out.println("Введите загаданное число");
        System.out.println("Что бы выйти, введите - exit");

        Scanner scan = new Scanner(System.in);

        while (true) {
            attempts++;

            String providedString = scan.next();

            if (providedString.equals("exit")) {
                break;
            }

            int providedValue = Integer.parseInt(providedString);

            if (providedValue == randomValue) {
                System.out.println("Вы угадали! количество попыток - " + attempts);
                break;
            }

            if (providedValue < randomValue) {
                System.out.println("Загаданное число больше указанного");
            } else {
                System.out.println("Загаданное число меньше указанного");
            }
        }
    }
}
