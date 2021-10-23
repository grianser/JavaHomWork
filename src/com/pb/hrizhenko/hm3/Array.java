package com.pb.hrizhenko.hm3;

import java.util.Scanner;
import java.util.*;

public class Array {
    public static void main(String[] args) {
        int itemsLength = 10;
        Vector<Integer> items = new Vector<Integer>();

        Scanner scan = new Scanner(System.in);
        int index = 0;

        while (index < itemsLength) {
            System.out.println("Введите число");
            Integer item = scan.nextInt();
            items.add(item);

            index++;
        }

        System.out.println(items);

        int sum = items.stream().reduce(0, Integer::sum);
        System.out.println("Sum of all items: " + sum);

        int numberOfPositiveItems = items.stream().reduce(0, (acc, value) -> value > 0 ? acc + 1 : acc);
        System.out.println("Sum of positive items: " + numberOfPositiveItems);

        int temp = 0;
        for (int i = 0; i < itemsLength; i++) {
            for (int j = 1; j < (itemsLength - i); j++) {
                if (items.get(j - 1) > items.get(j)) {
                    //Code to swap the elements
                    temp = items.get(j - 1);
                    items.set(j - 1, items.get(j));
                    items.set(j, temp);
                }
            }
        }

        System.out.println("Sorted items: " + items);
    }
}
