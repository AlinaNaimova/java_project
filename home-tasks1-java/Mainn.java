import java.util.Scanner;
public class Mainn {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 1");
        Cubes.cubes(scanner);
        System.out.println("Task 2");
        Multiplication.multiplication(scanner);
        System.out.println("Task 3");
        Calculator.calculator(scanner);
        scanner.close();
    }
}