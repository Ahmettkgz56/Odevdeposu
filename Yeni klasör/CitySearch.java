import java.util.ArrayList;
import java.util.Scanner;

public class CitySearch {
    public static void main(String[] args) {
        // 5 farklı şehir ekliyoruz
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Siirt");
        cities.add("Diyarbakır");
        cities.add("Gaziantep");
        cities.add("Van");
        cities.add("Batman");

        // Kullanıcıdan şehir alıyoruz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir şehir girin: ");
        String city = scanner.nextLine();

        // Şehir listede var mı kontrol ediyoruz
        if (cities.contains(city)) {
            int index = cities.indexOf(city);  // Şehri bulduğumuzda indeksini alıyoruz
            System.out.println(city + " şehri listede var. İndeksi: " + index);
        } else {
            System.out.println(city + " şehri listede yok.");
        }

        scanner.close();
    }
}
