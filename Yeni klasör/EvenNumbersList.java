import java.util.ArrayList;
import java.util.Random;

public class EvenNumbersList {
    public static void main(String[] args) {
        // ArrayList oluşturuyoruz
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        // Rastgele sayı üretici
        Random random = new Random();

        // 20 rastgele sayı ekliyoruz
        for (int i = 0; i < 20; i++) {
            int number = random.nextInt(100);  // 0 ile 99 arasında rastgele sayı
            numbers.add(number);
        }

        // Çift sayıları kontrol ediyoruz ve ayrı listeye ekliyoruz
        for (int num : numbers) {
            if (num % 2 == 0) {  // Eğer sayı çiftse
                evenNumbers.add(num);
            }
        }

        // Çift sayıları ekrana yazdırıyoruz
        System.out.println("Rastgele sayılar: " + numbers);
        System.out.println("Çift sayılar: " + evenNumbers);
    }
}
