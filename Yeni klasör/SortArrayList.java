import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ArrayList oluşturuyoruz
        ArrayList<Integer> numbers = new ArrayList<>();

        // Kullanıcıdan 10 adet sayı alıyoruz
        System.out.println("Lütfen 10 adet sayı girin:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Sayı " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }

        // Sayıları büyükten küçüğe sıralıyoruz
        Collections.sort(numbers, Collections.reverseOrder());

        // Sıralanmış sayıları ekrana yazdırıyoruz
        System.out.println("\nSıralanmış sayılar (Büyükten küçüğe):");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
