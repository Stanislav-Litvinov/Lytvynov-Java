package algorithms;

import java.util.Scanner;

//Составить алгоритм: если введенное число больше 7, то вывести “Привет”

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number > 7) {
            System.out.println("Привет");
        }
    }
}
