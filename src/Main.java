public class Main {
    public static void main(String[] args) {
        System.out.println("Сложные задачки"); // откуда они взялись-то???
        System.out.println("Урок 2, Переменные. Задача 6:");
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        System.out.println(result);
        result = - result;
        System.out.println(result);
        System.out.println("" +
                "");
        System.out.println("Задача 7:");
        int a2 = 5;
        int b2 = 7;
        System.out.println("Дано: a2 = " + a2 +" и " + "b2 = " + b2);
        a2 = a2 * b2 / a2;
        System.out.println("Теперь a2 = " + a2);
        a2 = 5;
        b2 = b2 * a2 / b2;
        System.out.println("Теперь b2 = " + b2);
        System.out.println("" +
                "");
        System.out.println("Задача 8:");
        int a1 = 723;
        int b1 = (a1 - a1 % 10) % 100 / 10;
        System.out.println(b1);


    }
}