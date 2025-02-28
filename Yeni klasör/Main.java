import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 10 elemanlı bir dizi oluşturuyoruz
        int[] numbers = new int[10];
        int sum = 0;

        // Kullanıcıdan 10 adet tam sayı alıyoruz
        System.out.println("Lütfen 10 adet tam sayı girin:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Sayı " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];  // Sayıları topluyoruz
        }

        // Ortalamayı hesaplıyoruz
        double average = (double) sum / numbers.length;
        System.out.println("\nDizinin ortalaması: " + average);

        // 50'den büyük olan sayıları listeliyoruz
        System.out.println("\n50'den büyük olan sayılar:");
        boolean found = false;
        for (int num : numbers) {
            if (num > 50) {
                System.out.println(num);
                found = true;
            }
        }

        if (!found) {
            System.out.println("50'den büyük sayı bulunmamaktadır.");
        }

        scanner.close();
    }
}
