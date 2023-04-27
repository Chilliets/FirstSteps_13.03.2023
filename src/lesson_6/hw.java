package lesson_6;

import java.util.Scanner;

public class hw {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("-----------------------------------------------------");
        System.out.println("TASK 1");

        /**
         * Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
         Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.*/


        String string = "hello";
        Scanner scan = new Scanner(System.in);
        int a = 0;
        String[] string1 = new String[10000];
        while (!string.isEmpty()) {
            System.out.println("Enter string");
            string = scan.nextLine();
            if (!string.isEmpty()) {
                string1[a] = string;
                a++;
            }
        }
        for (int i = 0; i < a; i++) {
            System.out.println(string1[i].toUpperCase());
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("TASK 2");

        /**Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
         Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
         Программа выводит слова на экран.*/

        String strings = "x";
        while (!strings.isEmpty()) {
            System.out.println("Enter string");
            strings = scan.nextLine();
            if (strings.length() % 2 == 0) {
                System.out.println(strings.concat(strings));
            } else System.out.println(strings.concat(strings).concat(strings));
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("TASK 3");

        /**2
         Ввести 5 строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.*/

        String[] stroki = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter string");
            stroki[i] = scan.nextLine();
        }
        String max = "null";
        String min = stroki[0];
        for (int i = 1; i < stroki.length; i++) {
            if (stroki[i].length() > max.length()) {
                max = stroki[i];
            }
            if (stroki[i].length() < min.length()) {
                min = stroki[i];
            }
        }
        System.out.println("Most long string is " + max + " with length " +  max.length());
        System.out.println("Most short string is " + min + " with length " +  min.length());


        System.out.println("-----------------------------------------------------");
        System.out.println("TASK 4");

        /**5
         1. Считать 6 строк и заполнить ими массив strings.
         2. Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").*/

        String[] masivStrok = new String[6];
        for (int i = 0; i < masivStrok.length; i++) {
            masivStrok[i] = scan.nextLine();
        }
        for (int i = 0; i < masivStrok.length - 1; i++) {
            for (int j = i + 1; j < masivStrok.length; j++)
                if (masivStrok[i] != null && masivStrok[i].equals(masivStrok[j])) {
                    masivStrok[j] = null;
                    masivStrok[i] = null;
                }
        }
        for (int i = 0; i < masivStrok.length; i++) {
            System.out.println(masivStrok[i]);
        }


    }

}













