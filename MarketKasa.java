import java.util.Scanner;

public class MarketKasa {
    public static void main(String[] args) {
        double toplamTutar = 0;
        boolean indirimUygula = false;

        // Scanner'ı try-with-resources ile kullanarak otomatik kapatma sağlıyoruz.
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                // Kullanıcıdan ürün seçimi
                System.out.println("Lütfen bir ürün seçin:");
                System.out.println("1. Elma - 10 TL");
                System.out.println("2. Ekmek - 5 TL");
                System.out.println("3. Süt - 15 TL");
                System.out.println("0. Alışverişi bitir");

                if (!scanner.hasNextInt()) { // Geçersiz giriş kontrolü
                    System.out.println("Geçersiz bir seçim yaptınız. Lütfen bir sayı girin.");
                    scanner.next(); // Hatalı girdiyi temizle
                    continue;
                }

                int secim = scanner.nextInt(); // Kullanıcı seçimini al
                toplamTutar = urunSecimiYap(secim, toplamTutar, scanner); // Ürün seçimi metodu ile işlemleri yönlendir

                if (secim == 0) { // Alışverişi bitir
                    System.out.println("İndirim kuponunuz var mı? (evet/hayır): ");
                    String cevap = scanner.next(); // İndirim sorusu al
                    if (cevap.equalsIgnoreCase("evet")) {
                        indirimUygula = true;
                    }

                    // İndirim hesaplama
                    toplamTutar = indirimHesapla(toplamTutar, indirimUygula);

                    // Toplam tutarı göster ve programdan çık
                    System.out.println("Toplam tutar: " + toplamTutar + " TL");
                    break;
                }
            }
        }
    }

    /**
     * Kullanıcının ürün seçimini işleyen metot.
     *
     * @param secim Kullanıcının yaptığı seçim
     * @param toplamTutar Toplam tutar
     * @param scanner Kullanıcıdan giriş almak için scanner
     * @return Güncellenen toplam tutar
     */
    public static double urunSecimiYap(int secim, double toplamTutar, Scanner scanner) {
        switch (secim) {
            case 1 -> {
                toplamTutar += 10; // Elma
                System.out.println("Elma sepete eklendi! Şu anki toplam: " + toplamTutar + " TL");
            }
            case 2 -> {
                toplamTutar += 5; // Ekmek
                System.out.println("Ekmek sepete eklendi! Şu anki toplam: " + toplamTutar + " TL");
            }
            case 3 -> {
                toplamTutar += 15; // Süt
                System.out.println("Süt sepete eklendi! Şu anki toplam: " + toplamTutar + " TL");
            }
            case 0 -> System.out.println("Alışverişi bitir seçildi."); // Alışveriş bitiyor
            default -> System.out.println("Geçersiz seçim, lütfen tekrar deneyin."); // Geçersiz seçim
        }
        return toplamTutar;
    }

    /**
     * İndirim hesaplayan metot. Eğer indirim varsa toplam tutarı %10 azaltır.
     *
     * @param toplamTutar Toplam tutar
     * @param indirim İndirim uygulanıp uygulanmadığı
     * @return İndirim uygulanmış toplam tutar
     */
    public static double indirimHesapla(double toplamTutar, boolean indirim) {
        if (indirim) {
            System.out.println("%10 indirim uygulanıyor...");
            return toplamTutar * 0.9; // İndirimi uygula
        }
        return toplamTutar; // İndirim yoksa toplam tutarı döndür
    }
}