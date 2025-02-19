import java.util.Scanner;

public class TrafikCezasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen hızınızı giriniz (km/s): ");
        int hiz = scanner.nextInt();

        if (hiz > 130) {
            System.out.println("Ehliyetinize el konuldu!");
        } else if (hiz > 110) {
            System.out.println("2000 TL ceza aldınız.");
        } else if (hiz > 90) {
            System.out.println("1000 TL ceza aldınız.");
        } else {
            System.out.println("Hız sınırına uygun sürüyorsunuz. İyi yolculuklar!");
        }

        scanner.close();
    }
}
