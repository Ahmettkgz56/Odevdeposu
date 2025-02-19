import java.util.Scanner;

public class RestoranSiparisSistemi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secim;
        double toplamTutar = 0;
        boolean devam = true;

        System.out.println(" Restoran Menüsü:");
        System.out.println("1. Pizza - 120 TL");
        System.out.println("2. Hamburger - 90 TL");
        System.out.println("3. Makarna - 70 TL");
        System.out.println("4. Salata - 50 TL");
        System.out.println("5. Çıkış ve Hesapla");

        do {
            System.out.print("\nLütfen siparişinizi seçiniz (1-5): ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    toplamTutar += 120;
                    System.out.println("Pizza eklendi! (120 TL)");
                    break;
                case 2:
                    toplamTutar += 90;
                    System.out.println("Hamburger eklendi! (90 TL)");
                    break;
                case 3:
                    toplamTutar += 70;
                    System.out.println("Makarna eklendi! (70 TL)");
                    break;
                case 4:
                    toplamTutar += 50;
                    System.out.println("Salata eklendi! (50 TL)");
                    break;
                case 5:
                    devam = false;
                    break;
                default:
                    System.out.println("Geçersiz seçim, lütfen tekrar deneyin.");
            }

        } while (devam);

        System.out.println("\n🧾 Toplam hesap: " + toplamTutar + " TL");
        System.out.println("Afiyet olsun! ");

        scanner.close();
    }
}
