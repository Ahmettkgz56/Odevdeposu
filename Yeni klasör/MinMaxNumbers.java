import java.util.ArrayList;
import java.util.Collections;

public class MinMaxNumbers {
    public static void main(String[] args) {
        // ArrayList oluşturuyoruz
        ArrayList<Integer> numbers = new ArrayList<>();

        // ArrayList içine 10 sayı ekliyoruz
        numbers.add(45);
        numbers.add(21);
        numbers.add(75);
        numbers.add(51);
        numbers.add(56);
        numbers.add(72);
        numbers.add(27);
        numbers.add(34);
        numbers.add(15);
        numbers.add(81);

        // En büyük ve en küçük sayıyı buluyoruz
        int maxNumber = Collections.max(numbers);  // En büyük sayıyı buluyoruz
        int minNumber = Collections.min(numbers);  // En küçük sayıyı buluyoruz

        // Sonuçları ekrana yazdırıyoruz
        System.out.println("ArrayList'teki en büyük sayı: " + maxNumber);
        System.out.println("ArrayList'teki en küçük sayı: " + minNumber);
    }
}
