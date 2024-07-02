import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class main {

    
    public static String removeDuplicates(String input) {
        
        String[] words = input.split("\\s+");
       
        Set<String> uniqueWords = new LinkedHashSet<>();
        
        for (String word : words) {
            uniqueWords.add(word);
        }

       
        return String.join(" ", uniqueWords);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        scanner.close();

        String result = removeDuplicates(input);
        System.out.println("Результат:");
        System.out.println(result);
    }
}
