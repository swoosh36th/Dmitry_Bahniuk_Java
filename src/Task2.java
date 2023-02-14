import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String inputName = scanner.nextLine();
        if (inputName.equalsIgnoreCase("Вячеслав")) {
            String outputName = inputName.substring(0, 1).toUpperCase() + inputName.substring(1).toLowerCase();
            System.out.println("Привет, " + outputName);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
