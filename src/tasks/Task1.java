package tasks;

import java.util.Scanner;

public class Task1 {
    public static void number() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int inputNum = scanner.nextInt();
        if (inputNum > 7) {
            System.out.println("Привет");
        } else if (inputNum == 7) {
            System.out.println("Введенное равно 7");
        } else {
            System.out.println("Введенное число " + inputNum + " меньше 7");
        }
    }
}
