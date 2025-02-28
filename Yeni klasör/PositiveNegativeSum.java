class PositiveNegativeSum {
    public static void main(String[] args) {
        // Örnek dizi
        int[] numbers = {5, -3, 8, -1, -6, 4, 2, -7};

        // Pozitif ve negatif sayıların toplamını tutacak değişkenler
        int positiveSum = 0;
        int negativeSum = 0;

        // Diziyi kontrol ediyoruz ve pozitif ve negatif toplamları hesaplıyoruz
        for (int num : numbers) {
            if (num > 0) {
                positiveSum += num;  // Pozitif sayı ise pozitif toplamına ekle
            } else if (num < 0) {
                negativeSum += num;  // Negatif sayı ise negatif toplamına ekle
            }
        }

        // Sonuçları ekrana yazdırma
        System.out.println("Pozitif sayıların toplamı: " + positiveSum);
        System.out.println("Negatif sayıların toplamı: " + negativeSum);
    }
}
