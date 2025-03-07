// Arayüz (Interface)
interface Flyable {
    void fly();
}

// Bird (Kuş) sınıfı
class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("The bird is flying!");
    }
}

// Airplane (Uçak) sınıfı
class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("The airplane is flying!");
    }
}

// Main sınıfı
public class Main {
    public static void main(String[] args) {
        Flyable bird = new Bird();
        bird.fly();  // Çıktı: The bird is flying!

        Flyable airplane = new Airplane();
        airplane.fly();  // Çıktı: The airplane is flying!
    }
}
