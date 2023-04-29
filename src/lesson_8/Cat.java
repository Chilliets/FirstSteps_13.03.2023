package lesson_8;

import java.util.Scanner;

public class Cat {
    String name;
    Integer age;
    String parentName;

    public Cat(String name, Integer age, String parentName){
        this.name = name;
        this.age = age;
        this.parentName = parentName;
    }

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Cat(Integer age) {
        this.age = age;
    }

    public Cat() {
    }

//     kot budet govorit
    // metodi


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void saySome(String name, int age) throws InterruptedException {
        System.out.println("Yo i am a cat madafaka");
        System.out.println("my name is " + name);
        System.out.println("i am is " + age + " old");
        System.out.println("and i love u very much");
        Thread.sleep(1000);
        System.out.println("peace of meat");
    }

    public void sayBye() {
        System.out.println("Ok, i need a go to hunting mouse, Bye Bye");
    }

    public int giveSum() {
        return 5;
    }

    public int multiple(int a, int b) {
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        return a * b;
    }

}


