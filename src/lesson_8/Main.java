package lesson_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cat vaso = new Cat();
        vaso.saySome("Vasso", 5);
        vaso.sayBye();
        int five = vaso.giveSum();
        System.out.println(five);
        int result = vaso.multiple(0,0);
        System.out.println(result);
        Cat murka = new Cat("murka", 10, "satlin");
        System.out.println("My name is " + murka.getName());
        murka.setName("murzila");
        System.out.println("My new name is " + murka.getName());

    }
}
