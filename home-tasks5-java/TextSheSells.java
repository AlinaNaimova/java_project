import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TextSheSells{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] lines = new String[n];
        for(int i = 0; i < n; i++){
            lines[i] = sc.nextLine();
        }
        Set<String> words = new HashSet<>();
        for(String line : lines){
            String[] lineWords = line.trim().split("\\s+");
            for(String word : lineWords){
                words.add(word);
            }
        }
        System.out.println("Kоличество уникальных слов: " + words.size());
    }
}