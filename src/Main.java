import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Сложные задачки"); // откуда они взялись-то???
        System.out.println("Урок 3, Условные операторы. Задача 6:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = scanner.nextInt();
        System.out.println("Введите сумму месячного заработка");
        int salary = scanner.nextInt();
        int elevatedCreditAge = 23;
        double credit = 0;
       int minAgeCoefficient = 2;
       int maxAgeCoefficient = 3;
       int minSalaryRub = 50_000;
       int middleSalaryRub = 80_000;
       double minSalaryCoefficient = 1.2;
       double maxSalaryCoefficient = 1.3;
        if (age < 18) {
            System.out.println("Вам нет 18-ти лет, мы не можем выдать вам кредит.");
        }
        if (age > 18 && age < elevatedCreditAge && salary < minSalaryRub) {
            credit = salary * minAgeCoefficient;
        }
        else if (age > elevatedCreditAge && salary < minSalaryRub) {
            credit = salary * maxAgeCoefficient;
        }
        else if (age > 18 && age < elevatedCreditAge && salary > minSalaryRub && salary < middleSalaryRub) {
            credit = salary * minAgeCoefficient * minSalaryCoefficient;
        }
        else if (age > elevatedCreditAge && salary > minSalaryRub && salary < middleSalaryRub) {
            credit = salary * maxAgeCoefficient * minSalaryCoefficient;
        }
        else if (age > 18 && age < elevatedCreditAge && salary > middleSalaryRub) {
            credit = salary * minAgeCoefficient * maxSalaryCoefficient;
        }
        else if (age > elevatedCreditAge && salary > middleSalaryRub) {
            credit = salary * maxAgeCoefficient * maxSalaryCoefficient;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + credit +" рублей.");
        }

        }


