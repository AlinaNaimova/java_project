import java.util.Scanner;
public class Cubes {
    public static void cubes(Scanner scanner) {
        int[] cubes = new int[1000];
        for(int i = 1; i <= 1000; i++) {
            cubes[i - 1] = i * i * i;
        }
        System.out.println("Введите два числа через ENTER: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int cubeA = cubes[a - 1];
        int cubeB = cubes[b - 1];
        System.out.println("Куб числа  " +a+ " - " +cubeA+ ", а числа " +b+ " - " +cubeB+ " .");
    }
}
