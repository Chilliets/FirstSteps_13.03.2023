package lesson_8.hw;

public class Main {
    public static void main(String[] args) {
        Metod cub = new Metod();
        System.out.println("Операция возведения числа в куб");
        System.out.println("Введите число");
        int result = cub.vozvedi(0);
        System.out.println("Введеное число в кубе будет равно " + result);

        Metod bolsheMenshe = new Metod();
        System.out.println("Операция сравнения");
        System.out.println("Введите числа");
        int result2 = bolsheMenshe.sravni(0, 0);
        System.out.println("Наибольшее введеное число будет " + result2);

        Metod okolo5 = new Metod();
        System.out.println("Введите число, больше 5");
        boolean result3 = okolo5.truFols5(0);
        System.out.println(result3);

        Metod kvadrat1 = new Metod();
        System.out.println("Операция возведения в квадрат, а потом сложения");
        System.out.println("Введите первое число");
        int result4 = kvadrat1.vozvedi1(0);

        Metod kvadrat2 = new Metod();
        System.out.println("Введите второе число");
        int result5 = kvadrat2.vozvedi2(0);

        Metod slozhiIh = new Metod();
        int result6 = slozhiIh.slozhi(result4, result5);
        System.out.println("Сумма чисел, возведенных в квадрат равна " + result6);


    }
}
