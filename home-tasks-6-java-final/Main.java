import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Set<Laptop> laptops = generateLaptopList();

        //сканер цифры выбора хар-ки
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("Выберите действие:");
            System.out.println("1. Посмотреть весь список ноутбуков.");
            System.out.println("2. Использовать фильтры для поиска.");
            System.out.println("3. Выйти");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Вот список ноутбуков, которые у нас есть:");
                    laptops.forEach(laptop -> System.out.println(laptop));
                    break;
                case 2:
                    System.out.println("Введите ОЗУ:");
                    int searchRam = scanner.nextInt();
                    System.out.println("Введите объём ЖД:");
                    int searchHdd = scanner.nextInt();
                    System.out.println("Введите, какую операционную систему хотите: Windows, или MacOs.");
                    String searchOs = scanner.next();
                    System.out.println("Введите цвет: black, gray, white, или silver:");
                    String searchColor = scanner.next();

                    Set<Laptop> laptopsResult = filterLaptops(laptops, searchRam, searchHdd, searchOs, searchColor);
                    if (laptopsResult.isEmpty()) {
                        System.out.println("Ничего не найдено");
                    } else {
                        System.out.println(laptopsResult);
                    }
                    break;
                case 3:
                    running = false;
                    System.out.println("До свидания!");
                    break;
                default:
                    System.out.println("Неверный выбор, попробуйте еще раз");
            }
        }
    }

    private static Set<Laptop> filterLaptops(Set<Laptop> laptops, int ramFilter, int hddFilter, String osFilter, String colorFilter) {
        Set<Laptop> laptopSet = laptops;
        Set<Laptop> tempSet = new HashSet<>();
        laptopSet.forEach(laptop -> {
            if (laptop.getRam() >= ramFilter) {
                tempSet.add(laptop);
            }
        });
        laptopSet = new HashSet<>(tempSet);
        tempSet.clear();

        laptopSet.forEach(laptop -> {
            if (laptop.getHdd() >= hddFilter) {
                tempSet.add(laptop);
            }
        });
        laptopSet = new HashSet<>(tempSet);;
        tempSet.clear();

        if (osFilter != null && !osFilter.isEmpty()) {
            laptopSet.forEach(laptop -> {
                if (laptop.getOs().toLowerCase().startsWith(osFilter.toLowerCase())) {
                    tempSet.add(laptop);
                }
            });
            laptopSet = new HashSet<>(tempSet);
            tempSet.clear();
        }

        if (colorFilter != null && !colorFilter.isEmpty()) {
            laptopSet.forEach(laptop -> {
                if (laptop.getColour().toLowerCase().startsWith(colorFilter.toLowerCase())) {
                    tempSet.add(laptop);
                }
            });
            laptopSet = new HashSet<>(tempSet);;
        }

        return laptopSet;
    }

    private static Set<Laptop> generateLaptopList() {
        Laptop macBook = new Laptop("Macbook", 16, 256, "MacOs", "silver");
        Laptop asus = new Laptop("Asus", 8, 500, "Windows", "black");
        Laptop acer = new Laptop("Acer", 16, 1000, "Windows", "white");
        Laptop macBookPro = new Laptop("MacbookPro", 16, 512, "MacOs", "gray");

        Set<Laptop> laptops = new HashSet<>();
        laptops.add(macBook);
        laptops.add(macBookPro);
        laptops.add(acer);
        laptops.add(asus);
        return laptops;
    }

}
