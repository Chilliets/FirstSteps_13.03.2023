package lesson_8.hw;

import java.util.Scanner;

public class Metod {
    Scanner scan = new Scanner(System.in);

    public int vozvedi(int a) {
        a = scan.nextInt();
        return a * a * a;
    }

    public int sravni(int b, int c) {
        b = scan.nextInt();
        c = scan.nextInt();
        if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    public boolean truFols5(int d) {
        d = scan.nextInt();
        if (d > 5) {
            return true;
        } else {
            return false;
        }
    }

    public int vozvediSlozhi(int e, int f) {
        e=scan.nextInt();
        f=scan.nextInt();
        return
    }


}


