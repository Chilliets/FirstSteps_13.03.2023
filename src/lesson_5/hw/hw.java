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

//        String[] array = new String[10];
//        for (int i = 0; i < 8; i++) {
//            array[i] = scan.next();
//        }
//        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.println(array[i]);
//        }

        System.out.println("-----------------------------------------------------");
        System.out.println("TASK 2");

        /**
         1.1. Создай массив на 10 чисел
         1.2. Считай с консоли 10 чисел и заполни ими массив
         2. Найти максимальное число из элементов массива.*/

//        int[] array1 = new int[10];
//        for (int n = 0; n < array1.length; n++) {
//            array1[n] = scan.nextInt();
//        }
//        int max = array1[0];
//        for (int n = 0; n < array1.length; n++) {
//            if (array1[n] > max)
//                max = array1[n];
//        }
//        System.out.println(max);

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
            int x = number[i] + word[i];
            System.out.println(" on index  " + number[i] + " set value " + word[i]);
        }


        int[] number = new int[10];

        number[j] = word.length;

        {

            for (int j = 0; j < number.length; j++)
                if ( int a = number[j]);

            number[j] = word.length;

            System.out.println(number[j]);
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("TASK 4");

        /**
         1. Создать массив на 10 чисел.
         2. Ввести с клавиатуры 10 чисел и записать их в массив.
         3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки..*/

//        int array2 [] = new int[10];
//        for (int i = 0; i < array2.length; i++) {
//            array2[i] = scan.nextInt();
//
//        }
//        for (int i = array2.length - 1; i >= 0; i--) {
//            System.out.println(array2[i]);
//
//        }

        System.out.println("-----------------------------------------------------");
        System.out.println("TASK 5");

        /**
         1. Создать массив на 20 чисел.
         2. Ввести в него значения с клавиатуры.
         3. Создать два массива на 10 чисел каждый.
         4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
         5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.*/

//        int[] all = new int[20];
//        for (int i = 0; i < all.length; i++)
//            all[i] = scan.nextInt();
//
//        int[] a = new int[10];
//        int[] b = new int[10];
//        for (int i = 0; i < 10; i++) {
//            if (all[i] != a[i])
//                a[i] = all[i];
//        }
//        for (int j = 0; j <= 10; j++) {
//            if (all[j + 10] != b[j])
//                b[j] = all[j + 10];
//            System.out.println(b[j]);
//        }

        System.out.println("-----------------------------------------------------");
        System.out.println("TASK 6");

        /**
         * Создать массив на 20 чисел.
         * Заполнить его числами с клавиатуры.
         * Найти максимальное и минимальное числа в массиве.
         * Вывести на экран максимальное и минимальное числа через пробел.
         */

//        int[] a = new int[20];
//        for (
//                int i = 0;
//                i < a.length; i++) {
//            a[i] = scan.nextInt();
//        }
//
//        int max = a[0];
//        int min = a[0];
//
//        {
//            for (int i = 0; i < a.length; i++) {
//                if (a[i] > max) {
//                    max = a[i];
//
//                }
//            }
//            {
//                for (int j = 0; j < a.length; j++) {
//                    if (a[j] < min) {
//                        min = a[j];
//                    }
//                }
//                System.out.print(max + " " + min);
//            }
//        }
        System.out.println("-----------------------------------------------------");
        System.out.println("TASK 7");

        /**
         * Задача: Написать программу, которая вводит с клавиатуры 20 чисел
         * и выводит их в убывающем порядке.
         */

//        int[] arr = new int[20];
//        for (
//                int i = 0;
//                i < arr.length; i++) {
//            arr[i] = scan.nextInt();

    }
//        for (int i = arr.; i < arr.length; i++) {
//            if (arr[i] < arr[i+1])
//                int a = arr[i];
//            arr[i] = arr[i+1];
//            arr[i+1] = a;


}


//         word [0] = "q";
//            word [1] = "qq";
//            word [2] = "qqq";
//            word [3] = "qqqq";
//            word [4] = "qqqqq";
//            word [5] = "qqqqqq";
//            word [6] = "qqqqqqq";
//            word [7] = "qqqqqqqq";
//            word [8] = "qqqqqqqqq";
//            word [9] = "qqqqqqqqqq";





