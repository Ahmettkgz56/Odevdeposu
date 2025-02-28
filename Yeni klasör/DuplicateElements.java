import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {
        // Örnek dizi
        int[] numbers = {5, 3, 8, 3, 1, 5, 8};

        // Tekrar eden elemanları tutmak için bir Set kullanacağız
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        // Diziyi kontrol ediyoruz ve tekrar eden elemanları buluyoruz
        for (int num : numbers) {
            // Eğer bu sayı daha önce görüldüyse, tekrar edenler set'ine ekle
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                // Eğer ilk kez görüyorsak, seen set'ine ekle
                seen.add(num);
            }
        }

        // Çıktıyı ekrana yazdırma
        if (duplicates.isEmpty()) {
            System.out.println("Tekrar eden sayı yok.");
        } else {
            System.out.print("Tekrar eden sayılar: ");
            for (int duplicate : duplicates) {
                System.out.print(duplicate + " ");
            }
        }
    }
}
