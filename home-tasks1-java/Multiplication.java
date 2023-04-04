import java.util.Scanner;
public class Multiplication {
    public static void multiplication(Scanner scanner){
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        System.out.println("Введите числа через ENTER, но количество не больше " +n+ ": ");
        int[] arrNumbs = new int[n];
        for (int i = 0; i < n; i++) {
            arrNumbs[i] = scanner.nextInt();
        }
        System.out.println("Введите число, на которое нужно умножить все введённые выше числа: ");
        int multiplier = scanner.nextInt();
        System.out.println("Результат: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arrNumbs[i] * multiplier);
        }
    }
}
