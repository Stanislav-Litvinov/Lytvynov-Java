package algorithms;

import java.util.StringJoiner;

//Составить алгоритм: на входе есть числовой массив,
// необходимо вывести элементы массива кратные 3

public class MultiplesNumbers {
    public static void main(String[] args) {
        int[] arr = {-3, 0, 1, 2, 3, 4, 5, 6};
        printMultiplesNumbers(arr);
    }

        public static void printMultiplesNumbers(int[] arr){
            StringJoiner stringJoiner = new StringJoiner(",");
            for (int a : arr) {
                if (a > 0 && a % 3 == 0) {
                    stringJoiner.add("" + a);
                }
            }
            System.out.println(stringJoiner);
        }
    }
