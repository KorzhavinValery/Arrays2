import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int amountOfMoney = 0;
        for (int money : arr) {
            amountOfMoney += money;
        }
        System.out.println("Сумма трат за месяц составила " + amountOfMoney + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int minExpenses = arr[0];
        int maxExpenses = arr[0];
        for (int expenses : arr) {
            if (expenses < minExpenses) {
                minExpenses = expenses;
            } else if (expenses > maxExpenses) {
                maxExpenses = expenses;
            }
        }
        System.out.println("Минимальная трата " + minExpenses + " рублей." +
                " Максимальная сумма трат за день составила " + maxExpenses + " рублей.");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int amountOfMoney = 0;
        int days = 30;
        double averageAmountOfMoney;
        for (int money : arr) {
            amountOfMoney += money;
        }
        averageAmountOfMoney = amountOfMoney / days;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmountOfMoney + " рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        var fullName = "";
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            fullName = fullName + reverseFullName[i];
        }
        System.out.print(fullName);
    }
}