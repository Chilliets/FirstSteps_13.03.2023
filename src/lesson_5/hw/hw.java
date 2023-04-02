package lesson_5.hw;

import java.util.Scanner;

public class hw {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-----------------------------------------------------");
        System.out.println("TASK 1");

        /**
         1. Создать массив на 10 строк.
         2. Ввести с клавиатуры 8 строк и сохранить их в массив.
         3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.*/

        int[] mas = new int[10];
        for (int i = 0; i < 8; i++) {
            mas[i] = scan.nextInt();
        }
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.println(mas[i]);
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("TASK 2");

        /**
         1.1. Создай массив на 10 чисел
         1.2. Считай с консоли 10 чисел и заполни ими массив
         2. Найти максимальное число из элементов массива.*/




    }
}
