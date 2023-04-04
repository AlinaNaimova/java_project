import java.util.Scanner;
public class Calculator {
    public static void calculator(Scanner scanner) {
        int answer = 0;
        System.out.println("Введите число: ");
        int numFirst = scanner.nextInt();
        System.out.println("Введите число: ");
        int numSecond = scanner.nextInt();
        System.out.println("Введите оперцию(+,-,*,/):");
        char operation = scanner.next().charAt(0);
        switch (operation) {
            case '+': answer = numFirst + numSecond;
                break;
            case '-': answer = numFirst - numSecond;
                break;
            case '*': answer = numFirst * numSecond;
                break;
            case '/': answer = numFirst / numSecond;
                break;
            default: System.out.println("Неверная операция!");
        }
        System.out.printf("Результат: " + numFirst + " " + operation + " " + numSecond + " = " + answer);
    }
}
