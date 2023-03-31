package lesson_3.hw;

import java.util.Scanner;

public class hw {
    public static void main(String[] args) {

        /** 1 Написать программу, чтобы она:
         * - выводил на экран строку "Число меньше 5", если число, которое мы ей подадим меньше 5,
         * - выводил строку "Число больше 5", если число, которое мы ей подадим больше 5,
         * - выводил строку "Число равно 5", если число, которое мы ей подадим равен 5.
         */

//        int need = 5;
//        Scanner scan = new Scanner(System.in);
//        int fromConsole = scan.nextInt();
//        if (fromConsole < need) { System.out.println("Число меньше " + 5);}
//        else if (fromConsole > need) { System.out.println("Число больше " + 5);}
//        else if (fromConsole == need) { System.out.println("Число равно " + 5);}


        /**
         * 2 Напиши программу. которая будет проверять попало ли целое число, которое мы ей подадим
         * в интервал от 50 до 100 и сообщить результат на экран в следующем виде:
         * "Число number не содержится в интервале." или "Число number содержится в интервале.", где number - число, которое мы ей подадим.
         *
         *
         * Пример для числа 112:
         * Число 112 не содержится в интервале.
         *
         * Пример для числа 60:
         * Число 60 содержится в интервале.
         *
         */

//        System.out.println("Веедите число ");
//        Scanner scan = new Scanner(System.in);
//        int fromConsole = scan.nextInt();
//            if (100 == fromConsole) {
//                System.out.println("Число " + fromConsole + " содержится в интервале.");}
//            else if (50 == fromConsole) {
//                System.out.println("Число " + fromConsole + " содержится в интервале.");}
//            else if (50 > fromConsole || 100 < fromConsole) {
//                System.out.println("Число " + fromConsole + "  не содержится в интервале.");}
//            else if (100 > fromConsole && 50 < fromConsole) {
//                System.out.println("Число " + fromConsole + "  содержится в интервале.");}


        /**3 Напиши программу, которая по номеру месяца должна определить время года (зима, весна, лето, осень) и вывести на экран.
         *
         * Пример для номера месяца 2:
         * зима
         *
         * Пример для номера месяца 5:
         * весна
         */

//        Scanner scan = new Scanner(System.in);
//        int fromConsole = scan.nextInt();
//        switch (fromConsole) {
//            case 1:
//                System.out.println("Winter");
//                break;
//            case 2:
//                System.out.println("Winter");
//                break;
//            case 3:
//                System.out.println("Spring");
//                break;
//            case 4:
//                System.out.println("Spring");
//                break;
//            case 5:
//                System.out.println("Spring");
//                break;
//            case 6:
//                System.out.println("Summer");
//                break;
//            case 7:
//                System.out.println("Summer");
//                break;
//            case 8:
//                System.out.println("Summer");
//                break;
//            case 9:
//                System.out.println("Autumn");
//                break;
//            case 10:
//                System.out.println("Autumn");
//                break;
//            case 11:
//                System.out.println("Autumn");
//                break;
//            case 12:
//                System.out.println("Winter");
//                break;
//        }


        /** 4  Написать программу, которая будет проверять число, которое мы подадим ей.
         * Если число положительное, то увеличить его в два раза.
         * Если число отрицательное, то прибавить единицу.
         * Если введенное число равно нулю, необходимо вывести ноль.
         * Вывести результат в консоль.
         */

//        Scanner scan = new Scanner(System.in);
//        int fromConsole = scan.nextInt();
//        if (fromConsole > 0) {
//            System.out.println(fromConsole * 2);
//        } else if (fromConsole < 0) {
//            System.out.println(fromConsole + 1);
//        } else if (fromConsole == 0) {
//            System.out.println(fromConsole);
//
//        }


        /** 6 Написать программу, которая, в зависимости от того числа, которое мы ей подадим (год)
         * , будет определять количество дней в году. Результат вывести на экран в следующем виде:
         * количество дней в этом году: x
         * , где
         * х - 366 для високосного года,
         * х - 365 для обычного года.
         *
         * Подсказка:
         * В високосном году - 366 дней, тогда как в обычном - 365.
         * 1) если год делится без остатка на 400 это високосный год;
         * 2) в оставшихся годах после этого, если год делится без остатка на 100, то это обычный год;
         * 3) в оставшихся годах после этого, если год делится без остатка на 4, то это високосный год;
         * 4) все оставшиеся года невисокосные.
         * Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
         * Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
         * Годы 2100, 2200 и 2300 - не високосные.
         */

//        Scanner scan = new Scanner(System.in);
//        int year = scan.nextInt();
//        if ((year % 400) == 0) {
//            System.out.println("количество дней в этом году: 366");
//        } else if ((year % 100) == 0) {
//            System.out.println("количество дней в этом году: 365");
//        } else if ((year % 4) == 0) {
//            System.out.println("количество дней в этом году: 366");
//        } else {
//            System.out.println("количество дней в этом году: 365");
//
//        }

            /** 7 Объявить три переменных (a, b, c) - стороны предполагаемого треугольника.
             * Определить возможность существования треугольника по сторонам.
             * Результат вывести на экран в следующем виде:
             * "Треугольник существует." - если треугольник с такими сторонами существует.
             * "Треугольник не существует." - если треугольник с такими сторонами не существует.
             *
             * Подсказка:
             * Треугольник существует только тогда, когда сумма двух его сторон больше третьей.
             * Требуется сравнить каждую сторону с суммой двух других.
             * Если хотя бы в одном случае сторона окажется больше либо равна сумме двух других,
             * то треугольника с такими сторонами не существует.
             */


            /** 8 Работа светофора для пешеходов запрограммирована следующим образом:
             * в начале каждого часа в течение трех минут горит зелёный сигнал,
             * затем в течение одной минуты - жёлтый,
             * а потом в течение одной минуты - красный,
             * затем опять зелёный горит три минуты и т. д.
             * Подать программе вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
             * Определить, сигнал какого цвета горит для пешеходов в этот момент.
             * Результат вывести на экран в следующем виде:
             * "зелёный" - если горит зелёный цвет,
             * "жёлтый" - если горит жёлтый цвет,
             * "красный" - если горит красный цвет.
             *
             * Пример для числа 2.5:
             * зелёный
             *
             * Пример для числа 3:
             * жёлтый
             *
             * Пример для числа 4:
             * красный
             *
             * Пример для числа 5:
             * зелёный
             *
             * */

        }

    }
