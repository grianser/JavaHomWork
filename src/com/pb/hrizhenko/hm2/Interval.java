package com.pb.hrizhenko.hm2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1;
          System.out.println("Введите число");
          operand1 = scanner.nextInt();
            if (operand1 >= 0 && operand1 <= 14){
                System.out.println("Ваше число находится в диапазоне от 0 до 14" );
            }
            else if (operand1 >= 15 && operand1 <= 35){
                System.out.println("Ваше число находится в диапазоне от 15 до 35" );
            }
            else if (operand1 >= 36 && operand1 <= 50) {
                System.out.println("Ваше число находится в диапазоне от 36 до 50");
            }
            else if (operand1 >= 51 && operand1 <= 100) {
                System.out.println("Ваше число находится в диапазоне от 51 до 100");
            }
            else {
                System.out.println("Ваше число меньше 0 или больше 100");
            }

            }
    }
