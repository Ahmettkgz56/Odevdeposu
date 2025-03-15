import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 1. Entity (Varlık) Katmanı
class ProgrammingLanguage {
    int id;
    String name;

    public ProgrammingLanguage(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Technology {
    int id;
    String name;
    ProgrammingLanguage programmingLanguage;

    public Technology(int id, String name, ProgrammingLanguage programmingLanguage) {
        this.id = id;
        this.name = name;
        this.programmingLanguage = programmingLanguage;
    }
}

// 2. Repository (Veri Erişim) Katmanı
interface Repository<T> {
    void add(T entity);
    void delete(int id);
    void update(int id, T entity);
    T getById(int id);
    List<T> getAll();
}

class ProgrammingLanguageRepository implements Repository<ProgrammingLanguage> {
    private final List<ProgrammingLanguage> languages = new ArrayList<>();

    public void add(ProgrammingLanguage entity) {
        languages.add(entity);
    }

    public void delete(int id) {
        languages.removeIf(l -> l.id == id);
    }

    public void update(int id, ProgrammingLanguage entity) {
        for (int i = 0; i < languages.size(); i++) {
            if (languages.get(i).id == id) {
                languages.set(i, entity);
                return;
            }
        }
    }

    public ProgrammingLanguage getById(int id) {
        return languages.stream().filter(l -> l.id == id).findFirst().orElse(null);
    }

    public List<ProgrammingLanguage> getAll() {
        return languages;
    }
}

// 3. Service (İş Mantığı) Katmanı
class ProgrammingLanguageService {
    private final Repository<ProgrammingLanguage> repository;

    public ProgrammingLanguageService(Repository<ProgrammingLanguage> repository) {
        this.repository = repository;
    }

    public void addLanguage(int id, String name) {
        repository.add(new ProgrammingLanguage(id, name));
    }

    public void listLanguages() {
        for (ProgrammingLanguage lang : repository.getAll()) {
            System.out.println(lang.id + ". " + lang.name);
        }
    }
}

// 5. Presentation (Sunum) Katmanı
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProgrammingLanguageRepository languageRepository = new ProgrammingLanguageRepository();
        ProgrammingLanguageService languageService = new ProgrammingLanguageService(languageRepository);

        while (true) {
            System.out.println("1- Programlama Dili Ekle");
            System.out.println("2- Programlama Dillerini Listele");
            System.out.println("3- Çıkış");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("ID girin: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Dil adını girin: ");
                    String name = scanner.nextLine();
                    languageService.addLanguage(id, name);
                    break;
                case 2:
                    languageService.listLanguages();
                    break;
                case 3:
                    System.out.println("Çıkılıyor...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }
}