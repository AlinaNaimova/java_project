import java.util.Scanner;
        import java.util.HashMap;
        import java.util.Map;

public class CookBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String[] books = new String[n];
        for (int i = 0; i < n; i++) {
            books[i] = scanner.nextLine();
        }
        int m = Integer.parseInt(scanner.nextLine());
        String[] allergies = new String[m];
        for (int i = 0; i < m; i++) {
            allergies[i] = scanner.nextLine();
        }


        for (String book : books) {
            String changedCookBook = book;
            for (String allergy : allergies) {
                String[] allergiesPairs = allergy.split("[-]");
                changedCookBook = changedCookBook.replace(allergiesPairs[0].trim(), allergiesPairs[1].trim())
                        .replace(allergiesPairs[0].trim().substring(0, 1).toUpperCase() + allergiesPairs[0].trim().substring(1),
                                allergiesPairs[1].trim().substring(0, 1).toUpperCase() + allergiesPairs[1].trim().substring(1));
            }
            System.out.println(changedCookBook);
        }
    }
}
