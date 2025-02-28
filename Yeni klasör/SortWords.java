import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ArrayList oluşturuyoruz
        ArrayList<String> words = new ArrayList<>();

        // Kullanıcıdan 10 adet kelime alıyoruz
        System.out.println("Lütfen 10 adet kelime girin:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Kelime " + (i + 1) + ": ");
            words.add(scanner.nextLine());  // Kelimeleri ArrayList'e ekliyoruz
        }

        // Kelimeleri alfabetik sıraya göre sıralıyoruz
        Collections.sort(words);

        // Sıralanmış kelimeleri ekrana yazdırıyoruz
        System.out.println("\nSıralanmış kelimeler (Alfabetik sıraya göre):");
        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }
}
