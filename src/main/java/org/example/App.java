package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов последовательности: ");
        int size = scanner.nextInt();
        System.out.println("Введите элементы последовательности (числа от 0 до 9): ");
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println("Результирующий счет: " + game.playGame(list));
        System.out.print("Оставшаяся последовательность: " + list);
    }
}