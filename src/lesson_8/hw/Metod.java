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

    public int vozvedi1(int e) {
        e = scan.nextInt();
        return e * e;
    }

    public int vozvedi2(int f) {
        f = scan.nextInt();
        return f * f;
    }

    public int slozhi(int result4, int result5) {
        return result4 + result5;

    }


}


