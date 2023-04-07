package lesson_5.hw;

import java.util.Arrays;
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

        String[] array1 = new String[10];
        for (int i = 0; i < 8; i++) {
            array1[i] = scan.next();
        }
        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.println(array1[i]);
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("TASK 2");

        /**
         1.1. Создай массив на 10 чисел
         1.2. Считай с консоли 10 чисел и заполни ими массив
         2. Найти максимальное число из элементов массива.*/

        int[] array2 = new int[10];
        for (int n = 0; n < array2.length; n++) {
            array2[n] = scan.nextInt();
        }
        int high = array2[0];
        for (int n = 0; n < array2.length; n++) {
            if (array2[n] > high) high = array2[n];
        }
        System.out.println(high);

        System.out.println("-----------------------------------------------------");
        System.out.println("TASK 3");

        /**
         1. Создать массив на 10 строк.
         2. Создать массив на 10 чисел.
         3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
         4. В каждую ячейку массива чисел записать длину строки из массива строк,
         индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.*/

        String[] word = new String[10];

        for (int i = 0; i < word.length; i++) {
            word[i] = scan.nextLine();
        }
        int[] number = new int[10];
        for (int i = 0; i < word.length; i++) {
            number[i] = word[i].length();
            System.out.println(" on index  " + number[i] + " set value " + word[i].length());
        }


        System.out.println("-----------------------------------------------------");
        System.out.println("TASK 4");

        /**
         1. Создать массив на 10 чисел.
         2. Ввести с клавиатуры 10 чисел и записать их в массив.
         3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки..*/

        int array3[] = new int[10];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = scan.nextInt();

        }
        for (int i = array3.length - 1; i >= 0; i--) {
            System.out.println(array3[i]);

        }

        System.out.println("-----------------------------------------------------");
        System.out.println("TASK 5");

        /**
         1. Создать массив на 20 чисел.
         2. Ввести в него значения с клавиатуры.
         3. Создать два массива на 10 чисел каждый.
         4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
         5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.*/
        //        int[] all = {5, 4, 3, 2, 1, 6, 7, 8, 9, 11, 12, 13, 65, 34, 23, 19, 98, 76, 64, 81};

        int[] all = new int[20];
        for (int i = 0; i < all.length; i++)
            all[i] = scan.nextInt();

        int[] a = new int[10];
        int[] b = new int[10];
        for (int i = 0; i < 10; i++) {
            if (all[i] != a[i]) a[i] = all[i];
        }
        for (int j = 0; j < 10; j++) {
            if (all[j + 10] != b[j]) b[j] = all[j + 10];
            System.out.println(b[j]);
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("TASK 6");

        /**
         * Создать массив на 20 чисел.
         * Заполнить его числами с клавиатуры.
         * Найти максимальное и минимальное числа в массиве.
         * Вывести на экран максимальное и минимальное числа через пробел.
         */

        int[] x = new int[20];
        for (int i = 0; i < x.length; i++) {
            x[i] = scan.nextInt();
        }

        int max = x[0];
        int min = x[0];

        {
            for (int i = 0; i < x.length; i++) {
                if (x[i] > max) {
                    max = x[i];

                }
            }
            {
                for (int j = 0; j < x.length; j++) {
                    if (x[j] < min) {
                        min = x[j];
                    }
                }
                System.out.println(max + " " + min);
            }
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("TASK 7");

        /**
         * Задача: Написать программу, которая вводит с клавиатуры 20 чисел
         * и выводит их в убывающем порядке.
         */
//        int[] array = {5, 4, 3, 2, 1, 6, 7, 8, 9, 11, 12, 13, 65, 34, 23, 19, 98, 76, 64, 81};

        int[] array4 = new int[20];
        for (int i = 0; i < array4.length; i++) {
            array4[i] = scan.nextInt();
        }
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = array4.length - 1; i > 0; i--) {
                if (array4[i] > array4[i - 1]) {
                    isSorted = false;

                    buf = array4[i];
                    array4[i] = array4[i - 1];
                    array4[i - 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array4));

    }
}