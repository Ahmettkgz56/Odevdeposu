import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
    }

    private static class ATM {
        private static final int PIN = 1234;
        private static double balance = 1000.0;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Lütfen PIN kodunuzu giriniz: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin != PIN) {
                System.out.println("Hatalı PIN! Program sonlandırılıyor.");
                return;
            }

            while (true) {
                System.out.println("ATM Menü:");
                System.out.println("1. Bakiye Görüntüleme");
                System.out.println("2. Para Yatırma");
                System.out.println("3. Para Çekme");
                System.out.println("4. Çıkış");
                System.out.print("Seçiminizi yapınız: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Mevcut bakiyeniz: " + balance + " TL");
                        break;
                    case 2:
                        System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                        double depositAmount = scanner.nextDouble();
                        if (depositAmount > 0) {
                            balance += depositAmount;
                            System.out.println("Yeni bakiyeniz: " + balance + " TL");
                        } else {
                            System.out.println("Geçersiz tutar!");
                        }
                        break;
                    case 3:
                        System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                        double withdrawAmount = scanner.nextDouble();
                        if (withdrawAmount > 0 && withdrawAmount <= balance) {
                            balance -= withdrawAmount;
                            System.out.println("Yeni bakiyeniz: " + balance + " TL");
                        } else {
                            System.out.println("Yetersiz bakiye veya geçersiz tutar!");
                        }
                        break;
                    case 4:
                        System.out.println("Çıkış yapılıyor. İyi günler!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Geçersiz seçenek, lütfen tekrar deneyin.");
                }
            }
        }
    }
}