import java.util.Scanner;

public class OgrenciYonetimSistemi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notlar = new int[5];
        int toplam = 0;
        int enYuksek = Integer.MIN_VALUE;
        int enDusuk = Integer.MAX_VALUE;
        boolean dusukNotVar = false;

        // 5 dersin notlarını kullanıcıdan al
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". dersin notunu giriniz: ");
            notlar[i] = scanner.nextInt();

            // Toplamı hesapla
            toplam += notlar[i];

            // En yüksek ve en düşük notları bul
            if (notlar[i] > enYuksek) {
                enYuksek = notlar[i];
            }
            if (notlar[i] < enDusuk) {
                enDusuk = notlar[i];
            }

            // 30'un altındaki notları kontrol et
            if (notlar[i] < 30) {
                dusukNotVar = true;
            }
        }

        // Ortalama hesapla
        double ortalama = toplam / 5.0;

        // Sonuçları ekrana yazdır
        System.out.println("\nOrtalamanız: " + ortalama);
        if (ortalama >= 50) {
            System.out.println("Dersi geçtiniz! ");
        } else {
            System.out.println("Dersi geçemediniz. ");
        }

        // Düşük not uyarısı
        if (dusukNotVar) {
            System.out.println("Dikkat! Düşük not aldığınız dersler var!");
        }

        // En yüksek ve en düşük notları göster
        System.out.println("En yüksek not: " + enYuksek);
        System.out.println("En düşük not: " + enDusuk);

        scanner.close();
    }
}
