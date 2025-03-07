// Arayüz (Interface)
interface Playable {
    void play();
}

// Game (Oyun) sınıfı
class Game implements Playable {
    @Override
    public void play() {
        System.out.println("Playing a game!");
    }
}

// Music (Müzik) sınıfı
class Music implements Playable {
    @Override
    public void play() {
        System.out.println("Playing music!");
    }
}

// Main sınıfı
public class Main {
    public static void main(String[] args) {
        Playable game = new Game();
        game.play();  // Çıktı: Playing a game!

        Playable music = new Music();
        music.play();  // Çıktı: Playing music!
    }
}
